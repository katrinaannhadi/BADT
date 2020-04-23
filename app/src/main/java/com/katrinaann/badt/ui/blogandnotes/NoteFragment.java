package com.katrinaann.badt.ui.blogandnotes;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.room.Room;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.katrinaann.badt.R;

import java.util.List;


public class NoteFragment extends Fragment {

    private Button btnSave;
    private Button btnDelete;
    private EditText etNoteName;
    private EditText etNoteContent;
    public static final String ARG_ITEM_ID = "note_id";
    private Notes mNotes;
    private NoteDatabase mDb;
    private String TAG = "NoteFragment";

    public NoteFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mDb = Room.databaseBuilder(getContext(),NoteDatabase.class,"noteDB").build();

        System.out.println(getArguments().getInt(ARG_ITEM_ID));
        if(getArguments().containsKey(ARG_ITEM_ID)) {

            new GetNoteTask().execute(getArguments().getInt(ARG_ITEM_ID));

            /*for(int i = 0; i < Notes.getNoteList().size(); i++) {
                if (Notes.getNoteList().get(i).getNoteName().equals(getArguments().getString(ARG_ITEM_ID))) {
                    mNotes = Notes.getNoteList().get(i);
                    break;
                }
            }*/
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_note, container, false);

        updateUi();

        return v;
    }

    public void returnToList(View v) {
        Context context = v.getContext();
        Intent intent = new Intent(context, NoteListActivity.class);
        context.startActivity(intent);
    }

    public class GetNoteTask extends AsyncTask <Integer, Void, Notes> {
        @Override
        protected Notes doInBackground(Integer... ids) {
            return mDb.noteDao().getNote(ids[0]);
        }

        @Override
        protected void onPostExecute(Notes notes) {
            mNotes = notes;
            updateUi();
        }
    }


    public void updateUi () {
        View v = getView();
        if (mNotes != null) {
            btnSave = v.findViewById(R.id.btnSave);
            btnDelete = v.findViewById(R.id.btnDelete);
            etNoteName = v.findViewById(R.id.etNoteName);
            etNoteContent = v.findViewById(R.id.etNoteContent);

            etNoteName.setText(mNotes.getNoteName());
            //etNoteContent.setText(mNotes.getNoteContent());
            //System.out.println("content = " + mNotes.getNoteContent());
            //etNoteContent.setText("TESTINGTESTINGTESTING");
            etNoteContent.setText(mNotes.getNoteContent());

            getActivity().setTitle(mNotes.getNoteName());
            //previousNoteName = etNoteName.getText().toString();

            btnSave.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    new UpdateNoteTask().execute();
                    mNotes.setNoteName(etNoteName.getText().toString());
                    mNotes.setNoteContent(etNoteContent.getText().toString());
                    Log.d(TAG, "Update Note: Success");
                    returnToList(v);
                }
            });

            btnDelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    new DeleteNoteTask().execute();
                    Log.d(TAG, "Delete Note: Success");
                    returnToList(v);
                }
            });
        }
    }

    public class DeleteNoteTask extends AsyncTask<Void, Void, List<Notes>> {
        @Override
        protected List<Notes> doInBackground(Void... voids) {
            mDb.noteDao().deleteNote(mNotes);
            return mDb.noteDao().getNotes();
        }
    }

    public class UpdateNoteTask extends AsyncTask<Void, Void, List<Notes>> {
        @Override
        protected List<Notes> doInBackground(Void... voids) {
            mDb.noteDao().updateNotes(mNotes);
            return mDb.noteDao().getNotes();
        }
    }
}
