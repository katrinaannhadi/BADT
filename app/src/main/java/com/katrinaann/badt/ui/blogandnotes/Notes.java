package com.katrinaann.badt.ui.blogandnotes;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Notes {

    @PrimaryKey (autoGenerate = true)
    private int noteId;
    private String noteName;
    private String noteContent;
    //private static ArrayList<Notes> noteList = new ArrayList<>();

    public int getNoteId() {
        return noteId;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }

    public String getNoteName() {
        return noteName;
    }

    public void setNoteName(String noteName) {
        this.noteName = noteName;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    public Notes(int noteId, String noteName, String noteContent) {
        this.noteId = noteId;
        this.noteName = noteName;
        this.noteContent = noteContent;
    }

    /*
    public static void addNote (String noteName, String noteContent) {

        Notes newNote = new Notes(noteName,noteContent);
        noteList.add(newNote);
    }

    public static void removeNote (String noteName) {
        for (int i = 0; i < noteList.size(); i++) {
            if (noteList.get(i).getNoteName().equals(noteName)) {
                noteList.remove(i);
                break;
            }
        }
    }

    public static ArrayList<Notes> getNoteList () {
        return noteList;
    } */
}
