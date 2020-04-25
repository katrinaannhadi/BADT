package com.katrinaann.badt.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.katrinaann.badt.dao.UserDaoScores;
import com.katrinaann.badt.models.QuizScores;

// This database holds the data surrounding the quiz results.
@Database(entities = {QuizScores.class}, version = 1)
public abstract class ScoresDatabase extends RoomDatabase {
    public abstract UserDaoScores userDaoScores();
}
