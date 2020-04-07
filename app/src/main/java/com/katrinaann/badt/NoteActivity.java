package com.example.infs3634groupassignmentlocal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NoteActivity extends AppCompatActivity {

    private String note;
    private Button btnSave;
    private EditText etNoteName;
    private EditText etNoteContent;
    private String previousNoteName;
    private String previousNoteContent;
    private Boolean noteExists;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Intent intent = getIntent();
        note = intent.getStringExtra("note");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        btnSave = findViewById(R.id.btnSave);
        etNoteName = findViewById(R.id.etNoteName);
        etNoteContent = findViewById(R.id.etNoteContent);

        previousNoteName = etNoteName.getText().toString();
        noteExists = false;

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < Notes.noteList.size(); i++) {
                    if (previousNoteName == Notes.noteList.get(i).getNoteName()) {
                        Notes.noteList.get(i).setNoteName(etNoteName.toString());
                        Notes.noteList.get(i).setNoteContent(etNoteContent.toString());
                        noteExists = true;
                        break;
                    }
                }
                if (noteExists == false) {
                    Notes.noteList.add(new Notes(etNoteName.toString(),etNoteContent.toString()));
                }
            }
        });
    }
}
