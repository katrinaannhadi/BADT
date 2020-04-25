package com.katrinaann.badt.ui.flashcards;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.katrinaann.badt.R;
import com.katrinaann.badt.models.Flashcard;

import java.util.ArrayList;
import java.util.Collections;

public class FlashcardActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.katrinaann.flashcards.MESSAGE";
    private String TAG = "FlashcardActivity";

    // Initialising UI elements and variables t
    private Flashcard mFlashcard;
    private String category;
    private TextView categoryName;

    private int flashcardCategory = 0;
    private int flashcardArrayListSize = 0;

    private RecyclerView.Adapter mAdapter;
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;

    // Set the ArrayLists
    ArrayList<Integer> flashcardCategoryList = new ArrayList<Integer>();
    private ArrayList<Flashcard> flashcards;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_flip);
        Log.d(TAG, "Flashcard Activity: SUCCESS");

        // Receive data object from the flashcard fragment
        Intent intent = getIntent();
        flashcardCategory = intent.getIntExtra("Category", 1);
        category = intent.getStringExtra("Title");
        Log.d(TAG, "Category is: " + flashcardCategory);
        Log.d(TAG, "Title is: " + category);

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ConstraintLayout layout = findViewById(R.id.layoutFlashcards);
//        mLayoutManager = new LinearLayoutManager(this);
//        mRecyclerView.setLayoutManager(mLayoutManager);

        // Setting up what the intent number is and setting the appropriate flashcard deck
        if (flashcardCategory == 1) {
            flashcardArrayListSize = Flashcard.getCategory1().size();
            layout.setBackgroundColor(Color.parseColor("#ffc000"));
            Log.d(TAG, "Category size is: " + flashcardArrayListSize);
            // Connecting Widgets to Variables
            categoryName = findViewById(R.id.category);
            categoryName.setText(category);

            flashcards = Flashcard.getCategory1();
            Log.d(TAG, "Category 1 is " + flashcards);

            mAdapter = new FlashcardAdapter(flashcards);
            Log.d(TAG, "Category 1 adapter is " + flashcards);

            mRecyclerView.setAdapter(mAdapter);
            Log.d(TAG, "Category 1 adapter is " + flashcards);
        //TODO TURN BACK ON

        } else if (flashcardCategory == 2) {
            flashcardArrayListSize = Flashcard.getCategory2().size();
            layout.setBackgroundColor(Color.parseColor("#DE0000"));
            // Connecting Widgets to Variables
            categoryName = findViewById(R.id.category);
            categoryName.setText(category);
            flashcards = Flashcard.getCategory2();
            mAdapter = new FlashcardAdapter(flashcards);
            mRecyclerView.setAdapter(mAdapter);

        } else if (flashcardCategory == 3) {
            flashcardArrayListSize = Flashcard.getCategory3().size();
            layout.setBackgroundColor(Color.parseColor("#FE622D"));
            // Connecting Widgets to Variables
            categoryName = findViewById(R.id.category);
            categoryName.setText(category);
            flashcards = Flashcard.getCategory3();
            mAdapter = new FlashcardAdapter(flashcards);
            mRecyclerView.setAdapter(mAdapter);

        } else if (flashcardCategory == 4) {
            flashcardArrayListSize = Flashcard.getCategory4().size();
            layout.setBackgroundColor(Color.parseColor("#ffc000"));
            // Connecting Widgets to Variables
            categoryName = findViewById(R.id.category);
            categoryName.setText(category);
            flashcards = Flashcard.getCategory4();
            mAdapter = new FlashcardAdapter(flashcards);
            mRecyclerView.setAdapter(mAdapter);

        } else if (flashcardCategory == 5) {
            flashcardArrayListSize = Flashcard.getCategory5().size();
            layout.setBackgroundColor(Color.parseColor("#00BD00"));
            // Connecting Widgets to Variables
            categoryName = findViewById(R.id.category);
            categoryName.setText(category);
            flashcards = Flashcard.getCategory5();
            mAdapter = new FlashcardAdapter(flashcards);
            mRecyclerView.setAdapter(mAdapter);

        } else if (flashcardCategory == 6) {
            flashcardArrayListSize = Flashcard.getCategory6().size();
            layout.setBackgroundColor(Color.parseColor("#009CFE"));
            // Connecting Widgets to Variables
            categoryName = findViewById(R.id.category);
            categoryName.setText(category);
            flashcards = Flashcard.getCategory6();
            mAdapter = new FlashcardAdapter(flashcards);
            mRecyclerView.setAdapter(mAdapter);

        } else if (flashcardCategory == 7) {
            flashcardArrayListSize = Flashcard.getCategory7().size();
            layout.setBackgroundColor(Color.parseColor("#000084"));
            // Connecting Widgets to Variables
            categoryName = findViewById(R.id.category);
            categoryName.setText(category);
            flashcards = Flashcard.getCategory7();
            mAdapter = new FlashcardAdapter(flashcards);
            mRecyclerView.setAdapter(mAdapter);

        } else if (flashcardCategory == 8) {
            flashcardArrayListSize = Flashcard.getCategory8().size();
            layout.setBackgroundColor(Color.parseColor("#6D33A6"));
            // Connecting Widgets to Variables
            categoryName = findViewById(R.id.category);
            categoryName.setText(category);
            flashcards = Flashcard.getCategory8();
            mAdapter = new FlashcardAdapter(flashcards);
            mRecyclerView.setAdapter(mAdapter);


            // Sets the order for the flashcards to come up
//        for (int i = 1; i < flashcardArrayListSize; i++){
//            flashcardCategoryList.add(i);
////            Flashcard flashcard = new Flashcard();
////            flashcard.isFlipped = false;
////            flashcardCategoryList.add(i);
////            list.add(flashcard);
//        }
//        Collections.shuffle(flashcardCategoryList);

            // Fill the Recycler View with flashcard content


//        new GetFlashcardTask().execute();


//        for (int i = 0; i < 20; i++) {
//            Flashcard flashcard = new Flashcard();
//            flashcard.isFlipped = false;
//            list.add(flashcard);
//        }

        }

//    public void addFlashCardPosition(int position) {
//        category = findViewById(R.id.category);
//        category.setText(position);
//    }
    }
}

