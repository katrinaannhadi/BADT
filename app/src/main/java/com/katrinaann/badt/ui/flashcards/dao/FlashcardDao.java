package com.katrinaann.badt.ui.flashcards.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;


import com.katrinaann.badt.ui.flashcards.models.Flashcard;

import java.util.List;

@Dao
public interface FlashcardDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<Flashcard> flashcard);

    @Update
    public void update(Flashcard... flashcards);

    @Delete
    public void delete(Flashcard flashcard);

    @Query("SELECT * FROM Flashcard")
    List<Flashcard> getAllFlashcards();

    @Query("SELECT * FROM Flashcard WHERE id = :number")

    public Flashcard getFlashcard(int number);

    @Query("SELECT * FROM Flashcard WHERE category = :number")
    public List<Flashcard> getFlashcardCategory(int number);
}
