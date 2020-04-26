package com.katrinaann.badt.ui.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.katrinaann.badt.R;
import com.katrinaann.badt.ui.drawerFragments.QuizSelectionFragment;
import com.katrinaann.badt.ui.home.HomeActivity;

public class QuizAfterPageActivity extends AppCompatActivity {

    // Initialising UI elements
    private TextView username_TV;
    private TextView title;
    private TextView quizName;
    private TextView quizMark;
    private TextView quizPercentage;
    private TextView mark;
    private TextView percentage;
    private TextView feedback;
    private Button leaderboardButton;
    private Button returnTitleButton;
    private Button returnHomeButton;

    // Initialising variables.
    private int amountCorrect = 0;
    private double percentCorrect = 0;
    private int questionNumber = 0;
    private String quizNameStr = "";
    private String currentUser = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_page);

        // Connecting views to variables
        username_TV = findViewById((R.id.username_TV));
        title = findViewById(R.id.title_TV);
        quizName = findViewById((R.id.quizName_TV));
        quizMark = findViewById(R.id.quizMark_TV);
        quizPercentage = findViewById(R.id.quizPercentage_TV);
        mark = findViewById(R.id.mark_TV);
        percentage = findViewById((R.id.percentage_TV));
        feedback = findViewById(R.id.quizFeedback_TV);
        leaderboardButton = findViewById(R.id.leaderboardButton);
        returnTitleButton = findViewById(R.id.returnTitleButton);
        returnHomeButton = findViewById(R.id.returnHomeButton);

        // Receiving information from the main activity.
        Bundle bundle = getIntent().getExtras();
        amountCorrect = bundle.getInt("amountCorrect", 0);
        questionNumber = bundle.getInt("questionNumber", 0);
        quizNameStr = bundle.getString("quizName");
        currentUser = bundle.getString("currentUser");

        // Calculating the percentage of correct answers.
        percentCorrect = Math.round(((double) amountCorrect / (double) questionNumber * 100) * 10) / 10.0;

        // Updating UI elements to match the results of the quiz.
        quizName.setText(String.valueOf(quizNameStr));
        mark.setText(String.valueOf(amountCorrect) + "/" + String.valueOf(questionNumber));
        percentage.setText(String.valueOf(percentCorrect) + "%");

        // Tailoring feedback based on mark (according to UNSW grade definitons).
        if (percentCorrect < 50) {
            feedback.setText("Fail... \uD83D\uDE1E \n Revise harder and come back stronger!");
        } else if (percentCorrect >= 50 && percentCorrect < 65) {
            feedback.setText("Pass. \uD83D\uDE07 \n Let's work on consolidating! ");
        } else if (percentCorrect >= 65 && percentCorrect < 75) {
            feedback.setText("Credit. \uD83D\uDE1B \n You know the content well! Now it's time to practice it more!");
        } else if (percentCorrect >= 75 && percentCorrect < 85) {
            feedback.setText("Distinction! \uD83E\uDD2F \n You have a thorough knowledge of the topic. Now it's time to master it!");
        } else if (percentCorrect >= 85 && percentCorrect < 100) {
            feedback.setText("High Distinction!! \uD83E\uDD29 \n You have nearly mastered this topic! Let's aim for 100%");
        } else if (percentCorrect == 100) {
            feedback.setText("Full Marks! \uD83D\uDE0E \n You have mastered this topic!");
        }

            // If the user wants to see the leaderboard.
        leaderboardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toGoLeaderboard();
            }
        });

        // If the user wants to return to the title.
        returnTitleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnTitle();
            }
        });
        //TODO ADD RETURN TO HOME BUTTON
        returnHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnHome();
            }
        });
    }



    // Disabling the back button (for some Android devices).
    @Override
    public void onBackPressed() {
    }

    // Goes to leaderboard.
    public void toGoLeaderboard() {
        Intent intent = new Intent(this, QuizLeaderboardActivity.class);
        intent.putExtra("quizName", quizNameStr);
        intent.putExtra("currentUser", currentUser);
        intent.putExtra("totalQuestions", questionNumber);
        startActivity(intent);
    }

    // Goes to title.
    public void returnTitle() {
        Intent intent = new Intent(this, HomeActivity.class);
        intent.putExtra("currentUser", currentUser);
        startActivity(intent);
    }
    // Goes to home
    public void returnHome(){
        Intent intent = new Intent(this, HomeActivity.class);
        intent.putExtra("currentUser", currentUser);
        startActivity(intent);

    }
}