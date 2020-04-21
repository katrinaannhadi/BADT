package com.katrinaann.badt.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.katrinaann.badt.models.accountUsers;

// DAO translator between UsersDatabase and related functions.
@Dao
public interface UserDaoUsers {
    // Query to show the details of a certain user.
    @Query("SELECT username, password FROM accountUsers WHERE username = :tempUsername")
    accountUsers getUsernameByString(String tempUsername);

    // Insert to add new user.
    @Insert
    void insertUsers(accountUsers user);
}