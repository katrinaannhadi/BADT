package com.katrinaann.badt.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.katrinaann.badt.models.Notes;

import java.util.List;

@Dao
public interface NoteDao {

    @Query("SELECT * FROM notes")
    List<Notes> getNotes();

    @Query("SELECT * FROM notes WHERE noteId = :noteId")
    Notes getNote(int noteId);

    @Insert
    void insertNote(Notes notes);

    @Delete
    void deleteNote(Notes notes);

    @Update
    void updateNotes(Notes notes);
}
