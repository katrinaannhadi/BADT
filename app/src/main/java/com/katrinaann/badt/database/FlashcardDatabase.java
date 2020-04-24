package com.katrinaann.badt.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.katrinaann.badt.dao.FlashcardDao;
import com.katrinaann.badt.models.Flashcard;

@Database(entities = {Flashcard.class}, version = 1)
public abstract class FlashcardDatabase extends RoomDatabase {
    public abstract FlashcardDao flashcardDao();

    private static FlashcardDatabase instance;
    public static FlashcardDatabase getInstance(Context context){

        //TODO: change to asynctask
        if(instance == null){
            instance = Room.databaseBuilder(context, FlashcardDatabase.class, "questDB").build();
        }
        return instance;
    }

}

