package com.katrinaann.badt.ui.notes;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Notes.class}, version = 1)
public abstract class NoteDatabase extends RoomDatabase {
    public abstract NoteDao noteDao();

}
