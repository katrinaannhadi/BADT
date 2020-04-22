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
    public static final String ARG_ITEM_ID = "item_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        Intent intent = getIntent();

        String noteName = intent.getStringExtra(NoteFragment.ARG_ITEM_ID);

        Bundle arguments = new Bundle();
        arguments.putString(NoteFragment.ARG_ITEM_ID, noteName);
        Fragment fragment = new NoteFragment();
        fragment.setArguments(arguments);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.scrollDetailActivity, fragment)
                .commit();
    }
}
