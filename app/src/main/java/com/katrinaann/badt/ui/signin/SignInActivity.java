package com.katrinaann.badt.ui.signin;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.katrinaann.badt.R;
import com.katrinaann.badt.database.UsersDatabase;
import com.katrinaann.badt.models.AccountUsers;
import com.katrinaann.badt.ui.home.HomeActivity;

public class SignInActivity extends AppCompatActivity {


    // Initialising UI elements and variables which will be accessed through onclicklisteners.
    private TextView username_TV;
    private TextView password_TV;
    private EditText userUsername_TV;
    private EditText userPassword_TV;
    private Button login_BT;
    private Button signup_BT;
    private TextView errorMessage_TV;

    String tempUsername = "";
    String tempPassword = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);




        // Matching UI elements to variables.
        username_TV = findViewById(R.id.username_TV);
        password_TV = findViewById(R.id.password_TV);
        userUsername_TV = findViewById(R.id.userUsername_ET);
        userPassword_TV = findViewById(R.id.userPassword_ET);
        login_BT = findViewById(R.id.signUp_BT);
        signup_BT = findViewById(R.id.signup_BT);
        errorMessage_TV = findViewById(R.id.errorMessage_TV);
        errorMessage_TV.setVisibility(View.INVISIBLE);

        // If the user wants to login.
        login_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempUsername = userUsername_TV.getText().toString();
                tempPassword = userPassword_TV.getText().toString();
                new getUserDetailsTask().execute();
            }
        });

        // If the user wants to signup.
        signup_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempUsername = userUsername_TV.getText().toString();
                tempPassword = userPassword_TV.getText().toString();
                signup();
            }
        });
    }

    // Disabling the back button (for some Android devices).
    @Override
    public void onBackPressed() {
    }

    // An AsyncTask which queries a user (in the ROOM database) which has the same username as tempUsername (the username used to login).
    // This is essentially to check whether the login username exists.
    private class getUserDetailsTask extends AsyncTask<Void, Void, AccountUsers> {
        @Override
        protected AccountUsers doInBackground(Void... voids) {
            UsersDatabase usersDB = Room.databaseBuilder(getApplicationContext(), UsersDatabase.class, "users-database").build();
            return usersDB.userDaoUsers().getUsernameByString(tempUsername);
        }

        // Checking whether the login details are correct.
        @Override
        protected void onPostExecute(AccountUsers tempUser) {
            // If no user was returned, then the username was wrong to begin with.
            // This has to go first since if the user doesn't exist, its (nonexistent) attributes cannot be part of any comparison statements.
            if (tempUser == null) {
                errorMessage_TV.setVisibility(View.VISIBLE);

                // User exists, and the username/password match - this is a valid user.
            } else if ((tempUser.username.equals(tempUsername)) && (tempUser.password.equals(tempPassword))) {
                login();

                // By elimination; Username is correct, but password is wrong.
            } else {
                errorMessage_TV.setVisibility(View.VISIBLE);
            }
        }
    }

    // User goes to signup page.
    public void signup() {
        Intent intent = new Intent(this, signupPageActivity.class);
        startActivity(intent);
    }

    // User is logged in and goes to quiz selection page.
    public void login() {
        Intent intent = new Intent(this, HomeActivity.class);
        intent.putExtra("currentUser", tempUsername);
        startActivity(intent);
    }
}