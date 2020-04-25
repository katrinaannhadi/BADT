package com.katrinaann.badt.ui.quiz;

import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.room.Room;

import com.katrinaann.badt.R;
import com.katrinaann.badt.models.QA;
import com.katrinaann.badt.database.ScoresDatabase;
import com.katrinaann.badt.models.QuizScores;

import java.util.ArrayList;
import java.util.Collections;

public class QuizActivity extends AppCompatActivity {

    // Initialising UI elements and variables which will be accessed by onclicklisteners.
    private TextView username_TV;
    private TextView question;
    private TextView quizScore;
    private RadioGroup radioGroup;
    private RadioButton answers;
    private TextView questionNo;
    private Button confirmButton;
    private Button resultsPageButton;
    private ImageView background;

    private int qaArrayListSize = 0;
    private int questionNumber = 0;
    private int questionsOrderIndex = 0;
    private int amountCorrect = 0;
    private String quizName = "";
    private int quizIndex = 0;
    private String currentUser = "";
    private ConstraintLayout layout;

    // Setting up arraylists.
    private ArrayList<Integer> questionsOrderList = new ArrayList<Integer>();
    private ArrayList<QA> qaArrayRoot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);

        // Connecting UI widgets to variables.
        username_TV = findViewById(R.id.username_TV);
        question = findViewById(R.id.question_TV);
        radioGroup = findViewById(R.id.answers_RG);
        questionNo = findViewById(R.id.questionNumber_TV);
        confirmButton = findViewById(R.id.confirm_BT);
        resultsPageButton = findViewById(R.id.resultsPage_BT);
        resultsPageButton.setVisibility(View.GONE);
        quizScore = findViewById((R.id.quizScore_TV));
        background = findViewById(R.id.bg_light2);
        background.setVisibility(View.GONE);
        layout = findViewById(R.id.quiz_constraint_layout);


        // Receive data from the quizSelectionPage.
        Intent intent = getIntent();
        quizIndex = intent.getIntExtra("quizIndex", 1);
        currentUser = intent.getStringExtra("currentUser");


        // Selecting the quiz which the user selected.
        if (quizIndex == 1) {
            qaArrayListSize = QA.getQAs1().size();
            qaArrayRoot = QA.getQAs1();
            layout.setBackgroundColor(Color.parseColor("#ffc000"));
        } else if (quizIndex == 2) {
            qaArrayListSize = QA.getQAs2().size();
            qaArrayRoot = QA.getQAs2();
            layout.setBackgroundColor(Color.parseColor("#DE0000"));
        } else if (quizIndex == 3) {
            qaArrayListSize = QA.getQAs3().size();
            qaArrayRoot = QA.getQAs3();
            layout.setBackgroundColor(Color.parseColor("#FE622D"));
        } else if (quizIndex == 4) {
            qaArrayListSize = QA.getQAs4().size();
            qaArrayRoot = QA.getQAs4();
            layout.setBackgroundColor(Color.parseColor("#ffc000"));
        } else if (quizIndex == 5) {
            qaArrayListSize = QA.getQAs5().size();
            qaArrayRoot = QA.getQAs5();
            layout.setBackgroundColor(Color.parseColor("#00BD00"));
        } else if (quizIndex == 6) {
            qaArrayListSize = QA.getQAs6().size();
            qaArrayRoot = QA.getQAs6();
            layout.setBackgroundColor(Color.parseColor("#009CFE"));
        } else if (quizIndex == 7) {
            qaArrayListSize = QA.getQAs7().size();
            qaArrayRoot = QA.getQAs7();
            layout.setBackgroundColor(Color.parseColor("#000084"));
        } else if (quizIndex == 8) {
            qaArrayListSize = QA.getQAs8().size();
            qaArrayRoot = QA.getQAs8();
            layout.setBackgroundColor(Color.parseColor("#6D33A6"));
        }

        // Initialising the name of the quiz - for the intent.
        quizName = qaArrayRoot.get(0).getAnswer();

        // Setting the order in which the questions will be asked. This is through the order of their IDs.
        for (int i = 1; i < qaArrayListSize; i++) {
            questionsOrderList.add(i);
        }
        Collections.shuffle(questionsOrderList);

        // Asks the question.
        askQuestionAnswer();

        // When the user clicks the button to confirm their answer.
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                confirmAnswer();
            }
        });

        // When the user clicks the button to go to the results page.
        resultsPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToResultsPage();
            }
        });
    }

    // Disabling the back button (for some Android devices).
    @Override
    public void onBackPressed() {
    }

    // When the users click the confirm answer button.
    private void confirmAnswer() {
        int radioID = radioGroup.getCheckedRadioButtonId();
        boolean noMoreQuestions = false;
        // Seeing whether the answer is correct or not.
        boolean answerResult = checkAnswer(radioID);

        // Giving marks based on the result.
        if (noMoreQuestions == false && (answerResult == true)) {
            questionNumber++;
            amountCorrect++;
        } else if (noMoreQuestions == false && (answerResult == false)) {
            questionNumber++;
        }

        // Stopping everything when all questions have been answered.
        // This includes removing the radio buttons and questions, and adjusting the scores on the UI.
        if (questionNumber >= qaArrayListSize - 1) {
            noMoreQuestions = true;
            questionNo.setVisibility(View.GONE);
            question.setVisibility(View.GONE);
            radioGroup.setVisibility(View.GONE);
            confirmButton.setVisibility(View.GONE);
            quizScore.setVisibility(View.GONE);

            adjustScores(amountCorrect, questionNumber);
            resultsPageButton.setVisibility(View.VISIBLE);
            background.setVisibility(View.VISIBLE);
        } else {
            adjustScores(amountCorrect, questionNumber);
            askQuestionAnswer();
        }
    }

    // Displaying the question and answers on the UI.
    public void askQuestionAnswer() {

        // Asking the question
        questionNo.setText("Question " + (questionNumber + 1) * 1);
        String questionText = (qaArrayRoot.get(questionsOrderList.get(questionsOrderIndex)).getQuestion());
        question.setText((questionText));

        // Randomly selecting the answers (first three which aren't the actual answer will be picked).
        ArrayList<Integer> answerOrderlist = new ArrayList<Integer>();
        for (int i = 1; i < qaArrayListSize - 1; i++) {
            answerOrderlist.add(i);
        }
        Collections.shuffle(answerOrderlist);

        // Randomly selecting the display order of the answers.
        ArrayList<Integer> radioOrderList = new ArrayList<Integer>();
        for (int i = 0; i < 4; i++) {
            radioOrderList.add(i);
        }
        Collections.shuffle(radioOrderList);

        // Displaying the answers. They must be unique and not the same as the actual answer.
        int answerOrderIndex = 0;
        boolean questionsClear = false;
        int x = 0;
        while (questionsClear == false) {
            if (qaArrayRoot.get(questionsOrderList.get(questionsOrderIndex)).getID() != qaArrayRoot.get(answerOrderlist.get(answerOrderIndex)).getID()) {
                ((RadioButton) radioGroup.getChildAt(radioOrderList.get(x))).setText(String.valueOf(qaArrayRoot.get(answerOrderlist.get(answerOrderIndex)).getAnswer()));
                x++;
            }
            answerOrderIndex++;
            if (x == 3) {
                questionsClear = true;
            }
        }

        // Displaying the correct answer.
        ((RadioButton) radioGroup.getChildAt(radioOrderList.get(x))).setText(String.valueOf(qaArrayRoot.get(questionsOrderList.get(questionsOrderIndex)).getAnswer()));

        // Updating the scores on the UI.
        questionsOrderIndex++;
        adjustScores(amountCorrect, questionNumber);
    }

    // Adjusting scores on the UI.
    public void adjustScores(int amountCorrect, int questionNumber) {
        if (questionNumber == 0) {
            quizScore.setText(amountCorrect + "/" + String.valueOf(questionNumber) + "     --%");
        } else {
            double percentCorrect = Math.round(((double) amountCorrect / (double) questionNumber * 100) * 10) / 10.0;
            quizScore.setText(amountCorrect + "/" + String.valueOf(questionNumber) + "     " + String.valueOf(percentCorrect) + "%");
        }
    }

    // When the user wants to go to the results page.
    public void goToResultsPage() {
        Intent intent = new Intent(this, QuizAfterPageActivity.class);
        intent.putExtra("amountCorrect", amountCorrect);
        intent.putExtra("questionNumber", questionNumber);
        intent.putExtra("quizName", quizName);
        intent.putExtra("currentUser", currentUser);

        // Insert the new score to the leaderboard, then leave.
        new insertNewScore().execute();
        startActivity(intent);
    }

    // Checking whether the user's answer is correct or not.
    public boolean checkAnswer(int radioID) {
        answers = findViewById(radioID);

        // Returning whether the user's answer is correct or not.
        return answers.getText().equals(qaArrayRoot.get(questionsOrderList.get(questionsOrderIndex - 1)).getAnswer());
    }

    // Inserting the new score to the leaderboard
    private class insertNewScore extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... voids) {
            ScoresDatabase scoresDB = Room.databaseBuilder(getApplicationContext(), ScoresDatabase.class, "scores-database").build();
            scoresDB.userDaoScores().insertScores(new QuizScores(currentUser, amountCorrect, quizName));
            return null;
        }
    }

}
