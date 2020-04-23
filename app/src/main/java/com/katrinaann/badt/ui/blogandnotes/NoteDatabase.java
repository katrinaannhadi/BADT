package com.katrinaann.badt.ui.blogandnotes;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Notes.class}, version = 1)
public abstract class NoteDatabase extends RoomDatabase {
    public abstract NoteDao noteDao();

}
