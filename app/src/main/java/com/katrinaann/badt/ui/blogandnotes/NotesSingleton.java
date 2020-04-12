package com.katrinaann.badt.ui.blogandnotes;

public class NotesSingleton {

    private boolean noteListExists;

    private static NotesSingleton instance = new NotesSingleton();

    private NotesSingleton() {

    }

    public static NotesSingleton getInstance() {
        return instance;
    }

    public boolean getNoteListExists() {
        return noteListExists;
    }

    public void setNoteListExists(boolean noteListExists) {
        this.noteListExists = noteListExists;
    }

}
