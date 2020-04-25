package com.katrinaann.badt.ui.notes;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

//@Entity to connect with Room
@Entity
public class Notes {

    //Attributes
    @PrimaryKey (autoGenerate = true) //Set noteId as primary key of a row in database and autoincrement
    private int noteId;
    private String noteName;
    private String noteContent;

    //Getters and Setters
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

    //Constructor
    public Notes(int noteId, String noteName, String noteContent) {
        this.noteId = noteId;
        this.noteName = noteName;
        this.noteContent = noteContent;
    }
}
