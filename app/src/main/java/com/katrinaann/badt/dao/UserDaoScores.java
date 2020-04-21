package com.katrinaann.badt.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.katrinaann.badt.models.quizScores;

import java.util.List;

// DAO translator between UsersDatabase and related functions.
@Dao
public interface UserDaoScores {
    // Query to ger the top 5 quiz scores for the leaderboard.
    @Query("SELECT username, id, score FROM quizScores WHERE type =:name ORDER BY score DESC LIMIT 5")
    List<quizScores> getTopFiveQuizScores(String name);

    // Insert to add new score.
    @Insert
    void insertScores(quizScores scores);
}

