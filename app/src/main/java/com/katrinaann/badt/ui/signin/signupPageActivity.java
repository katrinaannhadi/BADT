package com.katrinaann.badt.ui.signin;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.katrinaann.badt.R;
import com.katrinaann.badt.database.UsersDatabase;
import com.katrinaann.badt.models.AccountUsers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

public class signupPageActivity extends AppCompatActivity {

    // Initialising UI elements and variables which will be through onclicklisteners.
    private EditText userFullname_ET;
    private EditText userEmail_ET;
    private EditText userUsername_ET;
    private EditText userPassword_ET;
    private EditText userConfirmPassword_ET;
    private TextView errorMessage_TV;
    private Button signup_BT;

    private String fullname;
    private String email;
    private String username;
    private String password;
    private String passwordConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);

        // Connecting UI elements to variables.
        userFullname_ET = findViewById(R.id.userFullname_ET);
        userEmail_ET = findViewById(R.id.userEmail_ET);
        userUsername_ET = findViewById(R.id.userUsername_ET);
        userPassword_ET = findViewById(R.id.userPassword_ET);
        userConfirmPassword_ET = findViewById(R.id.userConfirmPassword_ET);
        signup_BT = findViewById(R.id.signUp_BT);
        errorMessage_TV = findViewById(R.id.errorMessage_TV);
        errorMessage_TV.setVisibility(View.INVISIBLE);

        // If the user wants to confirm their signup details.
        signup_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUp();
            }
        });
    }

    // Disabling the back button (for some Android devices).
    @Override
    public void onBackPressed() {
    }

    // User signing up.
    public void signUp() {
        fullname = userFullname_ET.getText().toString();
        email = userEmail_ET.getText().toString();
        username = userUsername_ET.getText().toString();
        password = userPassword_ET.getText().toString();
        passwordConfirm = userConfirmPassword_ET.getText().toString();

        // Checking that the signup details are valid.
        // Add details are filled out.
        if (fullname.equals("") || email.equals("") || username.equals("") || password.equals("") || passwordConfirm.equals("")) {
            errorMessage_TV.setText("Make sure all details are filled out");
            errorMessage_TV.setVisibility(View.VISIBLE);

            // Confirm Password doesn't match.
        } else if (password.equals(passwordConfirm) == false) {
            errorMessage_TV.setText("Make sure your passwords match");
            errorMessage_TV.setVisibility(View.VISIBLE);

            // All is good - add new user to the database and go back to title screen.
        } else {
            new insertNewUser().execute();
            Intent intent = new Intent(this, SignInActivity.class);
            startActivity(intent);
        }
    }

    // Adding user to the database.
    private class insertNewUser extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... voids) {
            UsersDatabase userDB = Room.databaseBuilder(getApplicationContext(), UsersDatabase.class, "users-database").build();
            userDB.userDaoUsers().insertUsers(new AccountUsers(username, fullname, email, password));
            return null;
        }
    }
}