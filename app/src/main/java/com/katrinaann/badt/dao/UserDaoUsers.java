package com.katrinaann.badt.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.katrinaann.badt.models.AccountUsers;

// DAO translator between UsersDatabase and related functions.
@Dao
public interface UserDaoUsers {
    // Query to show the details of a certain user.
    @Query("SELECT username, password FROM AccountUsers WHERE username = :tempUsername")
    AccountUsers getUsernameByString(String tempUsername);

    // Insert to add new user.
    @Insert
    void insertUsers(AccountUsers user);
}