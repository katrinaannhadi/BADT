package com.katrinaann.badt.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

// This object is an entity, meaning that it is a row in the database.
@Entity
public class quizScores {
    // Id is primary key as its always unique.
    @PrimaryKey(autoGenerate = true)
    @NonNull
    public int id;
    public String username;
    public int score;
    public String type;

    // Constructors.
    public quizScores() {
    }

    public quizScores(String username, int score, String type) {
        //this.id = id;
        this.username = username;
        this.score = score;
        this.type = type;
    }
}

