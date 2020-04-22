package com.katrinaann.badt.ui.flashcards;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
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
    private TextView category;

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

        // Connecting Widgets to Variables
        category = findViewById(R.id.category);

        // Receive data object from the flashcard fragment
        Intent intent = getIntent();
        flashcardCategory = intent.getIntExtra("Category", 1);
        Log.d(TAG, "Category is: " + flashcardCategory);

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 1));
//        mLayoutManager = new LinearLayoutManager(this);
//        mRecyclerView.setLayoutManager(mLayoutManager);

        // Setting up what the intent number is and setting the appropriate flashcard deck
        if (flashcardCategory == 1) {
            flashcardArrayListSize = Flashcard.getCategory1().size();
            Log.d(TAG, "Category size is: " + flashcardArrayListSize);

            flashcards = Flashcard.getCategory1();
            Log.d(TAG, "Category 1 is " + flashcards);

            mAdapter = new FlashcardAdapter(flashcards);
            Log.d(TAG, "Category 1 adapter is " + flashcards);

            mRecyclerView.setAdapter(mAdapter);
            Log.d(TAG, "Category 1 adapter is " + flashcards);

        } else if (flashcardCategory == 2) {
            flashcardArrayListSize = Flashcard.getCategory2().size();
            flashcards = Flashcard.getCategory2();
            mAdapter = new FlashcardAdapter(flashcards);
            mRecyclerView.setAdapter(mAdapter);

        } else if (flashcardCategory == 3) {
            flashcardArrayListSize = Flashcard.getCategory3().size();
            flashcards = Flashcard.getCategory3();
            mAdapter = new FlashcardAdapter(flashcards);
            mRecyclerView.setAdapter(mAdapter);
        } else if (flashcardCategory == 4) {
            flashcardArrayListSize = Flashcard.getCategory4().size();
            flashcards = Flashcard.getCategory4();
            mAdapter = new FlashcardAdapter(flashcards);
            mRecyclerView.setAdapter(mAdapter);
        } else if (flashcardCategory == 5) {
            flashcardArrayListSize = Flashcard.getCategory5().size();
            flashcards = Flashcard.getCategory5();
            mAdapter = new FlashcardAdapter(flashcards);
            mRecyclerView.setAdapter(mAdapter);
        } else if (flashcardCategory == 6) {
            flashcardArrayListSize = Flashcard.getCategory5().size();
            flashcards = Flashcard.getCategory5();
            mAdapter = new FlashcardAdapter(flashcards);
            mRecyclerView.setAdapter(mAdapter);

        } else if (flashcardCategory == 7) {
            flashcardArrayListSize = Flashcard.getCategory5().size();
            flashcards = Flashcard.getCategory5();
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

