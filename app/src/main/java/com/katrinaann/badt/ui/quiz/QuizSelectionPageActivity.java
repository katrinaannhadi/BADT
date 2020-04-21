package com.katrinaann.badt.ui.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.katrinaann.badt.R;

public class QuizSelectionPageActivity extends AppCompatActivity {

    // Initialising UI elements.
    private Button introductionQuiz_BT;
    private Button projectManagementQuiz_BT;
    private Button requirementsQuiz_BT;
    private Button designThinkingQuizButton;
    private Button agileScrumQuizButton;

    private String currentUser = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_selection);

        // Connecting UI elements to variables.
        introductionQuiz_BT = findViewById(R.id.introductionQuiz_BT);
        projectManagementQuiz_BT = findViewById(R.id.projectManagementQuiz_BT);
        requirementsQuiz_BT = findViewById(R.id.requirementsQuiz_BT);
        designThinkingQuizButton = findViewById(R.id.designThinkingQuiz_BT);
        agileScrumQuizButton = findViewById(R.id.agileScrumQuiz_BT);

        // Users deciding which quiz they want to attempt.
        introductionQuiz_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectQuiz(1);
            }
        });
        projectManagementQuiz_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectQuiz(2);
            }
        });
        requirementsQuiz_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectQuiz(3);
            }
        });
        designThinkingQuizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectQuiz(4);
            }
        });
        agileScrumQuizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectQuiz(5);
            }
        });

        // Receiving the username - if it exists.
        Intent intent = getIntent();
        if (intent == null) {
            // Nothing
        } else {
            currentUser = intent.getStringExtra("currentUser");
        }
    }


    // Go to respective quiz.
    public void selectQuiz(int quizIndex) {
        Intent intent = new Intent(this, QuizActivity.class);
        intent.putExtra("quizIndex", quizIndex);
        intent.putExtra("currentUser", currentUser);
        startActivity(intent);
    }
}