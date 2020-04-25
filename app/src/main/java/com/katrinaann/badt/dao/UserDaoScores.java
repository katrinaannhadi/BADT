package com.katrinaann.badt.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.katrinaann.badt.models.QuizScores;

import java.util.List;

// DAO translator between UsersDatabase and related functions.
@Dao
public interface UserDaoScores {
    // Query to ger the top 5 quiz scores for the leaderboard.
    @Query("SELECT username, id, score FROM QuizScores WHERE type =:name ORDER BY score DESC LIMIT 5")
    List<QuizScores> getTopFiveQuizScores(String name);

    // Insert to add new score.
    @Insert
    void insertScores(QuizScores scores);
}

