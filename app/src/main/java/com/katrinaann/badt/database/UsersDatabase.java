package com.katrinaann.badt.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.katrinaann.badt.dao.UserDaoUsers;
import com.katrinaann.badt.models.accountUsers;

// This database holds the data surrounding the quiz results.
@Database(entities = {accountUsers.class}, version = 1, exportSchema = true)
public abstract class UsersDatabase extends RoomDatabase {
    public abstract UserDaoUsers userDaoUsers();
}
