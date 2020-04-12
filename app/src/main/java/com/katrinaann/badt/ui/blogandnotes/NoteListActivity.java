package com.katrinaann.badt.ui.blogandnotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.katrinaann.badt.R;

import java.util.ArrayList;

public class NoteListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private NoteListAdapter mAdapter;
    private Boolean wideScreen;
    private FloatingActionButton fabNewNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_list);

        recyclerView = (RecyclerView) findViewById(R.id.rvList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        wideScreen = findViewById(R.id.detail_container) != null;

        setAdapter();

        setTitle("Your Notes");

        fabNewNote = findViewById(R.id.fabNewNote);
        fabNewNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Notes.addNote("New Note", "New Note");
                setAdapter();
            }
        });
    }

    public void setAdapter() {
        mAdapter = new NoteListAdapter(this, Notes.getNoteList(), wideScreen);
        recyclerView.setAdapter(mAdapter);
    }
}
