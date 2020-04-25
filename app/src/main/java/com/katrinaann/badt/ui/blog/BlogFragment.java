package com.katrinaann.badt.ui.blog;

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
import com.katrinaann.badt.ui.notes.NoteDatabase;
import com.katrinaann.badt.ui.notes.NoteListActivity;
import com.katrinaann.badt.ui.notes.Notes;

import java.util.List;


public class BlogFragment extends Fragment {

    private Button btnSave;
    private Button btnDelete;
    private EditText etNoteName;
    private EditText etNoteContent;
    private Notes mNotes;
    private NoteDatabase mDb;
    public static final String ARG_ITEM_ID = "note_id";
    private static final String TAG = "BlogFragment";

    public BlogFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Initialise the database
        mDb = Room.databaseBuilder(getContext(),NoteDatabase.class,"noteDB").build();

        //Set the note in this class to the note passed in from the NoteListActivity
        if(getArguments().containsKey(ARG_ITEM_ID)) {

            //Execute the GetNoteTask, passing in the arguments from the NoteListActivity (The ID of the note clicked in the RecyclerView)
            new GetNoteTask().execute(getArguments().getInt(ARG_ITEM_ID));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_note_jeff, container, false);

        //Generate UI
        updateUi();

        return v;
    }

    //Method to update the UI of the Fragment, separated in method for re-usability
    public void updateUi () {
        View v = getView();
        if (mNotes != null) {

            //Match the variables in the fragment to the views in the layout file
            btnSave = v.findViewById(R.id.btnSave);
            btnDelete = v.findViewById(R.id.btnDelete);
            etNoteName = v.findViewById(R.id.etNoteName);
            etNoteContent = v.findViewById(R.id.etNoteContent);

            //Set the textfields to the values of the Note
            etNoteName.setText(mNotes.getNoteName());
            etNoteContent.setText(mNotes.getNoteContent());
            Log.d(TAG, mNotes.getNoteContent());

            //Set title to the name of the note
            getActivity().setTitle(mNotes.getNoteName());

            //Set listener on the "Save" button to let it update the note in the database when clicked
            btnSave.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    //Set the NoteName and NoteContent of mNote to the values entered into the editText
                    mNotes.setNoteName(etNoteName.getText().toString());
                    mNotes.setNoteContent(etNoteContent.getText().toString());

                    //Execute UpdateNoteTask (AsyncTask) to update the note that is currently shown (mNote)
                    new UpdateNoteTask().execute();

                    //Return to the NoteListActivity
                    returnToList(v);
                }
            });

            //Set listener on the "Delete" button to let it delete the note in the database when clicked
            btnDelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Execute DeleteNoteTask (AsyncTask) to delete the note that is currently shown (mNote)
                    new DeleteNoteTask().execute();

                    ////Return to the NoteListActivity
                    returnToList(v);
                }
            });

            Log.d(TAG, "Update UI: Success");
        }
    }

    //Method to return back to the NoteListActivity after the user clicks Delete or Save
    public void returnToList(View v) {
        Context context = v.getContext();

        //Create a new intent that leads back to to the NoteListActivity when run
        Intent intent = new Intent(context, NoteListActivity.class);
        context.startActivity(intent);
    }

    //AsyncTask to get the note corresponding to the noteId specified by the argument passed from the NoteAdapter
    public class GetNoteTask extends AsyncTask <Integer, Void, Notes> {
        @Override
        protected Notes doInBackground(Integer... ids) {

            //Return the note corresponding to the noteId specified by the argument passed from the NoteAdapter/NoteListActivity RecyclerView
            return mDb.noteDao().getNote(ids[0]);

        }

        @Override
        protected void onPostExecute(Notes notes) {

            //Set the current note (mNote) with the note that was passed into the fragment
            mNotes = notes;

            //Update the UI with the information from the mNote
            updateUi();

            Log.d(TAG, "Get Note: Success");
        }
    }

    //AsyncTask to process the deletion of a note in the background
    public class DeleteNoteTask extends AsyncTask<Void, Void, List<Notes>> {
        @Override
        protected List<Notes> doInBackground(Void... voids) {

            //Call the Dao to delete the note currently displayed (mNote)
            mDb.noteDao().deleteNote(mNotes);
            Log.d(TAG, "Delete Note: Success");
            return mDb.noteDao().getNotes();
        }
    }

    //AsyncTask to process the update of a note in the background
    public class UpdateNoteTask extends AsyncTask<Void, Void, List<Notes>> {
        @Override
        protected List<Notes> doInBackground(Void... voids) {

            //Call the Dao to update the note currently displayed (mNote)
            mDb.noteDao().updateNotes(mNotes);
            Log.d(TAG, "Update Note: Success");
            return mDb.noteDao().getNotes();
        }
    }
}
