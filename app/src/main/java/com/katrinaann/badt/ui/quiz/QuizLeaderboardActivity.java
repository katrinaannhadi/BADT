package com.katrinaann.badt.ui.quiz;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.katrinaann.badt.R;
import com.katrinaann.badt.database.ScoresDatabase;
import com.katrinaann.badt.models.quizScores;

import java.util.List;

public class QuizLeaderboardActivity extends AppCompatActivity {

    // Initalising UI elements and variables which will go through onclicklisteners.
    private TextView first_TV;
    private TextView second_TV;
    private TextView third_TV;
    private TextView fourth_TV;
    private TextView fifth_TV;

    private TextView firstUser_TV;
    private TextView secondUser_TV;
    private TextView thirdUser_TV;
    private TextView fourthUser_TV;
    private TextView fifthUser_TV;

    private TextView firstScore_TV;
    private TextView secondScore_TV;
    private TextView thirdScore_TV;
    private TextView fourthScore_TV;
    private TextView fifthScore_TV;

    private TextView quizName_TV;
    private Button returnToSelectionButton;

    private String quizName = "";
    private String currentUser = "";
    private int totalquestions = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_scores_table);

        // Matching UI elements to variables.
        first_TV = findViewById(R.id.first_TV);
        second_TV = findViewById(R.id.second_TV);
        third_TV = findViewById(R.id.third_TV);
        fourth_TV = findViewById(R.id.fourth_TV);
        fifth_TV = findViewById(R.id.fifth_TV);

        firstUser_TV = findViewById(R.id.firstUser_TV);
        secondUser_TV = findViewById(R.id.secondUser_TV);
        thirdUser_TV = findViewById(R.id.thirdUser_TV);
        fourthUser_TV = findViewById(R.id.fourthUser_TV);
        fifthUser_TV = findViewById(R.id.fifthUser_TV);

        firstScore_TV = findViewById(R.id.firstScore_TV);
        secondScore_TV = findViewById(R.id.secondScore_TV);
        thirdScore_TV = findViewById(R.id.thirdScore_TV);
        fourthScore_TV = findViewById(R.id.fourthScore_TV);
        fifthScore_TV = findViewById(R.id.fifthScore_TV);

        quizName_TV = findViewById(R.id.quizName_TV);
        returnToSelectionButton = findViewById(R.id.returnToSelectionButton);

        // Receiving information from the quiz.
        Intent intent = getIntent();
        quizName = intent.getStringExtra("quizName");
        quizName_TV.setText(quizName);
        currentUser = intent.getStringExtra("currentUser");
        totalquestions = intent.getIntExtra("totalQuestions", 0);

        // If the user wants to go back to the quiz selection page.
        returnToSelectionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToQuizSelection();
            }
        });

        // Get the top 5 quiz results.
        new getTopFiveQuizScoresTask().execute();
    }

    // Disabling the back button (for some Android devices).
    @Override
    public void onBackPressed() {
    }

    // An AsyncTask which queries the top 5 quis results, and their respective user (in the ROOM database).
    private class getTopFiveQuizScoresTask extends AsyncTask<Void, Void, List<quizScores>> {
        @Override
        protected List<quizScores> doInBackground(Void... voids) {
            ScoresDatabase scoreDB = Room.databaseBuilder(getApplicationContext(), ScoresDatabase.class, "scores-database").build();
            return scoreDB.userDaoScores().getTopFiveQuizScores(quizName);
        }

        // Updating the leaderboard.
        @Override
        protected void onPostExecute(List<quizScores> quizScores) {
            if (quizScores.size() >= 1) {
                firstUser_TV.setText(quizScores.get(0).username);
                firstScore_TV.setText(Integer.toString(quizScores.get(0).score) + "/" + Integer.toString(totalquestions));
            }

            if (quizScores.size() >= 2) {
                secondUser_TV.setText(quizScores.get(1).username);
                secondScore_TV.setText(Integer.toString(quizScores.get(1).score) + "/" + Integer.toString(totalquestions));
            }

            if (quizScores.size() >= 3) {
                thirdUser_TV.setText(quizScores.get(2).username);
                thirdScore_TV.setText(Integer.toString(quizScores.get(2).score) + "/" + Integer.toString(totalquestions));
            }

            if (quizScores.size() >= 4) {
                fourthUser_TV.setText(quizScores.get(3).username);
                fourthScore_TV.setText(Integer.toString(quizScores.get(3).score) + "/" + Integer.toString(totalquestions));
            }

            if (quizScores.size() >= 5) {
                fifthUser_TV.setText(quizScores.get(4).username);
                fifthScore_TV.setText(Integer.toString(quizScores.get(4).score) + "/" + Integer.toString(totalquestions));
            }
        }
    }

    // Go back to quiz selection page.
    public void backToQuizSelection() {
        Intent intent = new Intent(this, QuizSelectionPageActivity.class);
        intent.putExtra("currentUser", currentUser);
        startActivity(intent);
    }
}
