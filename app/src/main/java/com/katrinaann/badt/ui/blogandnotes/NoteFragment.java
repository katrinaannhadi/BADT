package com.katrinaann.badt.ui.blogandnotes;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.katrinaann.badt.R;


public class NoteFragment extends Fragment {

    private Button btnSave;
    private Button btnDelete;
    private EditText etNoteName;
    private EditText etNoteContent;
    private String previousNoteName;
    public static final String ARG_ITEM_ID = "item_id";
    private Notes mNotes;

    public NoteFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println(getArguments().getString(ARG_ITEM_ID));
        if(getArguments().containsKey(ARG_ITEM_ID)) {
            for(int i = 0; i < Notes.getNoteList().size(); i++) {
                if (Notes.getNoteList().get(i).getNoteName().equals(getArguments().getString(ARG_ITEM_ID))) {
                    mNotes = Notes.getNoteList().get(i);
                    break;
                }
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_note, container, false);
        btnSave = v.findViewById(R.id.btnSave);
        btnDelete = v.findViewById(R.id.btnDelete);
        etNoteName = v.findViewById(R.id.etNoteName);
        etNoteContent = v.findViewById(R.id.etNoteContent);

        etNoteName.setText(mNotes.getNoteName());
        etNoteContent.setText(mNotes.getNoteContent());

        previousNoteName = etNoteName.getText().toString();

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < Notes.getNoteList().size(); i++) {
                    if (previousNoteName.equals(Notes.getNoteList().get(i).getNoteName())) {
                        System.out.println(etNoteName.getText().toString());
                        System.out.println(etNoteContent.getText().toString());
                        System.out.println();
                        Notes.getNoteList().get(i).setNoteName(etNoteName.getText().toString());
                        Notes.getNoteList().get(i).setNoteContent(etNoteContent.getText().toString());
                        System.out.println("Saved changes");
                        System.out.println(Notes.getNoteList().get(i).getNoteName());
                        System.out.println(Notes.getNoteList().get(i).getNoteContent());
                        break;
                    }
                    else {
                        System.out.println("No save");
                    }
                }
                returnToList(v);
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < Notes.getNoteList().size(); i++) {
                    if (previousNoteName.equals(Notes.getNoteList().get(i).getNoteName())) {
                        Notes.removeNote(previousNoteName);
                        System.out.println("Removed");
                        break;
                    } else {
                        System.out.println("Failed");
                    }
                }
                returnToList(v);
            }
        });

        return v;
    }

    public void returnToList(View v) {
        Context context = v.getContext();
        Intent intent = new Intent(context, NoteListActivity.class);
        context.startActivity(intent);
    }
}
