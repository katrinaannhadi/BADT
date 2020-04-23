package com.katrinaann.badt.ui.blogandnotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.katrinaann.badt.R;

import java.util.ArrayList;
import java.util.List;

public class NoteListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private NoteListAdapter mAdapter;
    private Boolean wideScreen;
    private FloatingActionButton fabNewNote;
    private NoteDatabase mDb;
    private String TAG = "NoteListActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_list);

        recyclerView = (RecyclerView) findViewById(R.id.rvList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        wideScreen = findViewById(R.id.detail_container) != null;

        mAdapter = new NoteListAdapter(this, new ArrayList<Notes>(), wideScreen);
        recyclerView.setAdapter(mAdapter);

        setTitle("Your Notes");

        //Create Database
        mDb = Room.databaseBuilder(getApplicationContext(),NoteDatabase.class,"noteDB").build();
        new GetNoteTask().execute();

        fabNewNote = findViewById(R.id.fabNewNote);
        fabNewNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CreateNoteTask().execute();
            }
        });
    }

    public class GetNoteTask extends AsyncTask <Void, Void, List<Notes>> {
        @Override
        protected List<Notes> doInBackground(Void... voids) {
            return mDb.noteDao().getNotes();
        }

        @Override
        protected void onPostExecute(List<Notes> notes) {
            mAdapter.setNotes(notes);
        }
    }

    public class CreateNoteTask extends AsyncTask<Void, Void, List<Notes>> {
        @Override
        protected List<Notes> doInBackground(Void... voids) {
            Notes newNote = new Notes(0,"New Note", "New Note");
            Log.d(TAG, newNote.getNoteName());
            mDb.noteDao().insertNote(newNote);
            Log.d(TAG, "createNoteTask doInBackground: SUCCESS");
            return mDb.noteDao().getNotes();
        }

        @Override
        protected void onPostExecute(List<Notes> notes) {
            mAdapter.setNotes(notes);
            Log.d(TAG, "createNoteTask onPostExecute: SUCCESS");
        }
    }
}
