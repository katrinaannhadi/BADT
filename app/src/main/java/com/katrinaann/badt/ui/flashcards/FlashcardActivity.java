package com.katrinaann.badt.ui.flashcards;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.katrinaann.badt.R;
import com.katrinaann.badt.ui.flashcards.asynctasks.FlashcardAsyncTaskDelegate;
import com.katrinaann.badt.ui.flashcards.asynctasks.FlashcardCategoryAsyncTaskDelegate;
import com.katrinaann.badt.ui.flashcards.asynctasks.FlashcardCategoryRetrieveAsyncTask;
import com.katrinaann.badt.ui.flashcards.asynctasks.FlashcardInsertAsyncTask;
import com.katrinaann.badt.ui.flashcards.database.FlashcardDatabase;
import com.katrinaann.badt.ui.flashcards.models.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class FlashcardActivity extends AppCompatActivity implements FlashcardCategoryAsyncTaskDelegate, FlashcardAsyncTaskDelegate {

    private Button continueBtn;
    private TextView flashcardText;
    private RadioButton optionA;
    private RadioButton optionB;
    private RadioButton optionC;
    private TextView scoreText;
    // private QuizActivity quizActivity = this;

    private String TAG = "QuizActivity";
    private FlashcardDatabase db;

    private int score = 0;
    private int flashcardNum = 0;
    private Flashcard mCurrentFlashcard;
    private List<Flashcard> mFlashcardList;
    private FlashcardActivity mFlashcardActivity = this;

    public static ArrayList<Integer> scoreHistoryList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Log.d(TAG, "QuizActivity: SUCCESS");

        ConstraintLayout flashcardConstraintLayout = findViewById(R.id.flashcard_constraint_layout);

        flashcardText = flashcardConstraintLayout.findViewById(R.id.text_flashcard_title);
        scoreText = flashcardConstraintLayout.findViewById(R.id.text_score);

        optionA = flashcardConstraintLayout.findViewById(R.id.radio_quiz_a);
        optionB = flashcardConstraintLayout.findViewById(R.id.radio_quiz_b);
        optionC = flashcardConstraintLayout.findViewById(R.id.radio_quiz_c);

        continueBtn = flashcardConstraintLayout.findViewById(R.id.button_continue);
        continueBtn.setText("Continue");

        //TODO:: change to category
        Intent quizIntent = getIntent();
        int difficulty = quizIntent.getIntExtra("Difficulty", 1);

        db = db.getInstance(this);

        insertFlashcardListInDatabase(getFlashcardList());
        retrieveFlashcardListFromDatabase(difficulty);



    }

    public void setFlashcard(Flashcard flashcard, int score){

        scoreText.setText("Score: " + score);
        flashcardText.setText(" " + flashcard.getFlashcard()+ " ");
        optionA.setText(flashcard.getOptionA());
        optionB.setText(flashcard.getOptionB());
        optionC.setText(flashcard.getOptionC());
    }



    @Override
    public void handleFlashcardListReturned(List<Flashcard> flashcardList) {
        mCurrentFlashcard = flashcardList.get(0);
        setFlashcard(mCurrentFlashcard, score);
        final List<Flashcard> flashcards = flashcardList;


        continueBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                RadioGroup radioGroup = findViewById(R.id.options_quiz);
                if (radioGroup.getCheckedRadioButtonId() == -1) {
                } else {
                    RadioButton answer = findViewById(radioGroup.getCheckedRadioButtonId());
                    if (mCurrentFlashcard.getAnswer().equals(answer.getText())) {

                        score++;
                    } else {
                        //TODO://get rid of this

                    }
                    answer.setChecked(false);
                    Toast.makeText(getApplicationContext(), Integer.toString(flashcardNum), Toast.LENGTH_LONG).show();

                    // Below code is to make sure that the button text changes to finish flashcard on final flashcard, and to
                    // record the final score in an ArrayList
                    if (flashcardNum < flashcards.size() - 2) {
                        flashcardNum++;

                        setFlashcard(flashcards.get(flashcardNum),score);

                    } else if (flashcardNum == flashcards.size() - 2) {
                        flashcardNum++;
                        setFlashcard(flashcards.get(flashcardNum),score);

                        continueBtn.setText("Finish Quiz");
                    } else {
                        //scoreHistoryList.add(score);
                        //Toast to check for score at the end
                        Toast.makeText(getApplicationContext(), Integer.toString(score), Toast.LENGTH_LONG).show();
                        finish();
                    }

                }
            }
        });

    }

    //to prevent errors, need to do clean up
    @Override
    public void handleFlashcardReturned(Flashcard flashcard){
        int num = flashcard.getId();
        System.out.println(num);
    }


    public void insertFlashcardListInDatabase(List<Flashcard> flashcardList){
        FlashcardInsertAsyncTask insertAsyncTask = new FlashcardInsertAsyncTask();
        insertAsyncTask.setFlashcardDatabase(db);
        insertAsyncTask.setDelegate(mFlashcardActivity);
        insertAsyncTask.execute(flashcardList);

    }

    public void retrieveFlashcardListFromDatabase(int flashcardCategory){
        FlashcardCategoryRetrieveAsyncTask flashcardRetrieveAsyncTask = new FlashcardCategoryRetrieveAsyncTask();
        flashcardRetrieveAsyncTask.setFlashcardDatabase(db);
        flashcardRetrieveAsyncTask.setDelegate(mFlashcardActivity);
        flashcardRetrieveAsyncTask.execute(flashcardCategory);
    }




    public static List<Flashcard> getFlashcardList(){
        //TODO:: to put this somewhere that's not here
        //TODO:: add url from api, not sure we can find relevant data in our APIs for these flashcards?
        //questions and answers from https://www.sageadvice.eu/2017/11/27/trivia-quiz-on-5th-edition-dd-rules/
        List<Flashcard> flashcardList = new ArrayList<>();
        flashcardList.add(0, new Flashcard(0,
                "Can you cast underwater?",
                "No",
                "Yes, but fire spells deal no damage.",
                "Yes",
                "Yes",
                3));
        flashcardList.add(1, new Flashcard(1,
                "Is there alignment restriction for classes in Player's Handbook?",
                "Yes, Paladin must be Lawful Good, Druid must be Neutral and Assassin must be evil.",
                "No",
                "Yes, Paladin must be Good and Monk Lawful.",
                "No",
                1));
        flashcardList.add(2, new Flashcard(2,
                "Can you knock a creature out with a melee spell attack?",
                "Only with Spell Sniper feat.",
                "No, only with a melee weapon.",
                "Yes",
                "Yes",
                2));
        flashcardList.add(3, new Flashcard(3,
                "Can you use a shield with Mage Armor spell?",
                "Only with a light shield or buckler shield.",
                "Yes, Mage Armor spell works with a shield",
                "Nope, they do not stack.",
                "Yes, Mage Armor spell works with a shield.",
                3));
        flashcardList.add(4, new Flashcard(4,
                "A monster is immune to damage from nonmagical bludgeoning weapons. Does he still take damage from falling?",
                "Yes, but has resistance to damage.",
                "No, fall is a bludgeoning damage.",
                "Yes, fall is not a weapon.",
                "Yes, fall is not a weapon.",
                1));
        flashcardList.add(5, new Flashcard(5,
                "If a 5th level wizard casts a Fireball during surprise, do the enemies get disadvantage on their saving throw?",
                "No",
                "Only if wizard has with War Caster feat.",
                "Yes",
                "No",
                1));
        flashcardList.add(6, new Flashcard(6,
                "Is a 1 on an ability check an automatic failure?",
                "No",
                "Yes.",
                "Yes and roll a d10 on Fumble table.",
                "No",
                2));
        flashcardList.add(7, new Flashcard(7,
                "Can rogue get sneak attack damage against undead?",
                "Yes, Sneak Attack works against Undead.",
                "No, undeads have resistance to sneak attack.",
                "Only if you use a bludgeoning weapon.",
                "Yes, Sneak Attack works against Undead.",
                1));
        flashcardList.add(8, new Flashcard(8,
                "If you have a creature between you and the target...",
                "Target has cover +4 bonus to AC.",
                "Target has half-cover +2 bonus to AC.",
                "You have disadvantage.",
                "Target has half-cover +2 bonus to AC.",
                2));
        flashcardList.add(9, new Flashcard(9,
                "Can you make an attack action from Prone condition?",
                "Yes, but you have disadvantage on attack rolls.",
                "No, you must stand up (half movement) and attack.",
                "Only with a weapon with reach property.",
                "Yes, but you have disadvantage on attack rolls.",
                3));

        return flashcardList;
    }
}

