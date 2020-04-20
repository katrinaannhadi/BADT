package com.katrinaann.badt.ui.flashcards;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.katrinaann.badt.R;
import com.katrinaann.badt.ui.flashcards.models.Flashcard;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlashcardActivity extends AppCompatActivity  {
    public static final String EXTRA_MESSAGE = "com.katrinaann.flashcards.MESSAGE";

    private Flashcard mFlashcard;
    TextView category;

    private int flashcardCategory = 0;
    private ArrayList<Flashcard> flashcards;
    private int flashcardArrayListSize = 0;

    //Set the ArrayListS
    ArrayList<Integer> flashcardCategoryList = new ArrayList<Integer>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_flip);

        //gets the intent from the flashcard fragment
        Intent intent = getIntent();
        flashcardCategory = intent.getIntExtra("category", 1);




        ArrayList<Flashcard> list = new ArrayList<>();

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        //setting up what the intent number is and setting the appropriate flashcard deck
        if (flashcardCategory == 1) {
            flashcardArrayListSize = Flashcard.getCategory1().size();
            flashcards = Flashcard.getCategory1();
        } else if (flashcardCategory == 2) {
            flashcardArrayListSize = Flashcard.getCategory2().size();
            flashcards = Flashcard.getCategory2();
        } else if (flashcardCategory == 3) {
            flashcardArrayListSize = Flashcard.getCategory3().size();
            flashcards = Flashcard.getCategory3();
        } else if (flashcardCategory == 4) {
            flashcardArrayListSize = Flashcard.getCategory4().size();
            flashcards = Flashcard.getCategory4();
        } else if (flashcardCategory == 5) {
            flashcardArrayListSize = Flashcard.getCategory5().size();
            flashcards = Flashcard.getCategory5();
        }
        //Sets the order for the flashcards to come up
        for (int i =1; i < flashcardArrayListSize; i++){
            Flashcard flashcard = new Flashcard();
            flashcard.isFlipped = false;
            flashcardCategoryList.add(i);
            list.add(flashcard);
        }
        Collections.shuffle(flashcardCategoryList);

//        for (int i = 0; i < 20; i++) {
//            Flashcard flashcard = new Flashcard();
//            flashcard.isFlipped = false;
//            list.add(flashcard);
//        }
        recyclerView.setAdapter(new FlashcardAdapter(list));
    }

//    public void addFlashCardPosition(int position) {
//        category = findViewById(R.id.category);
//        category.setText(position);
//    }
}

