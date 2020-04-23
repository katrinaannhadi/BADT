package com.katrinaann.badt.ui.blogandnotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.katrinaann.badt.R;

public class NoteActivity extends AppCompatActivity {

    private String note;
    private Button btnSave;
    private Button btnDelete;
    private EditText etNoteName;
    private EditText etNoteContent;
    private String previousNoteName;
    private String previousNoteContent;
    private Boolean noteExists;
    public static final String ARG_ITEM_ID = "note_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        Intent intent = getIntent();

        int noteId = intent.getIntExtra(NoteFragment.ARG_ITEM_ID,0);
        System.out.println(noteId);

        Bundle arguments = new Bundle();
        arguments.putInt(NoteFragment.ARG_ITEM_ID, noteId);
        Fragment fragment = new NoteFragment();
        fragment.setArguments(arguments);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.scrollDetailActivity, fragment)
                .commit();
    }
}
