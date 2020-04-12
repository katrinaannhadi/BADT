package com.katrinaann.badt.ui.blogandnotes;

import java.util.ArrayList;
import java.util.List;

public class Notes {

    private String noteName;
    private String noteContent;
    private static ArrayList<Notes> noteList = new ArrayList<>();
    private static ArrayList<Notes> savedList;
    //private static boolean noteListExists;

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

    public Notes(String noteName, String noteContent) {
        this.noteName = noteName;
        this.noteContent = noteContent;
    }

    public void createNoteList() {
        noteList = new ArrayList<>();
        //noteListExists = true;
    }

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
        //saveList();
        return noteList;
    }

    /*
    public static ArrayList<Notes> testNoteList() {
        ArrayList<Notes> testNoteList = new ArrayList<>();
        testNoteList.add(new Notes("test","test"));
        return testNoteList;
    } */

    /*
    public static void saveList() {
        //System.out.println(noteListExists);
        if (NotesSingleton.getInstance().getNoteListExists() == true) {
            noteList = savedList;
            System.out.println("Saved List Loaded");
        } else {
            savedList = noteList;
            NotesSingleton.getInstance().setNoteListExists(true);
            System.out.println("New List Saved");
        }
    } */

}
