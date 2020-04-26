package com.katrinaann.badt.ui.notes;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.katrinaann.badt.dao.NoteDao;
import com.katrinaann.badt.models.Notes;

@Database(entities = {Notes.class}, version = 1)
public abstract class NoteDatabase extends RoomDatabase {
    public abstract NoteDao noteDao();

}
