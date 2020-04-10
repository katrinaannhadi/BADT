package com.katrinaann.badt.ui.blogandnotes;

import java.util.ArrayList;

public class Notes {

    private String NoteName;
    private String NoteContent;
    public static ArrayList<Notes> noteList = new ArrayList<>();

    public String getNoteName() {
        return NoteName;
    }

    public void setNoteName(String noteName) {
        NoteName = noteName;
    }

    public String getNoteContent() {
        return NoteContent;
    }

    public void setNoteContent(String noteContent) {
        NoteContent = noteContent;
    }

    public Notes(String noteName, String noteContent) {
        NoteName = noteName;
        NoteContent = noteContent;
    }

}
