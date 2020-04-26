package com.katrinaann.badt.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

// This object is an entity, meaning that it is a row in the database
@Entity
public class accountUsers {
    // The username is the PK because all usernames will be unique. Additionally, it's non-nullable since usernames can't be empty.
    @PrimaryKey
    @NonNull
    public String username;
    public String fullName;
    public String email;
    public String password;

    // Constructors since they are object. Additionally, there will be instances of the accountUsers Object
    public accountUsers() {
    }

    public accountUsers(String username, String fullName, String email, String password) {
        this.username = username;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
    }
}
