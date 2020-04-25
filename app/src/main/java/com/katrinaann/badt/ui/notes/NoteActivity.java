package com.katrinaann.badt.ui.notes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.katrinaann.badt.R;

public class NoteActivity extends AppCompatActivity {

    public static final String TAG = "NoteActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        //Get intent from the NoteListAdapter and get the noteId that was passed from it
        Intent intent = getIntent();
        int noteId = intent.getIntExtra(NoteFragment.ARG_ITEM_ID,0);
        Log.d(TAG, "noteId = " + noteId);

        //Initalise a new fragment, passing on the noteId that was passed in from NoteListAdapter
        Bundle arguments = new Bundle();
        arguments.putInt(NoteFragment.ARG_ITEM_ID, noteId);
        Fragment fragment = new NoteFragment();
        fragment.setArguments(arguments);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.scrollDetailActivity, fragment) //Replace the scrollDetailActivity with BlogFragment
                .commit();
    }
}
