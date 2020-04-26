package com.katrinaann.badt.ui.flashcards;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.katrinaann.badt.R;
import com.katrinaann.badt.adapters.FlashcardAdapter;
import com.katrinaann.badt.models.Flashcard;
import com.katrinaann.badt.ui.drawerFragments.FlashcardSelectionFragment;

import java.util.ArrayList;
import java.util.Collections;

public class FlashcardActivity extends AppCompatActivity {

    private String TAG = "FlashcardActivity";

    // Initialising UI elements and variables
    private String category;
    private String user;
    private TextView categoryName;
    private int flashcardCategory = 0;
    private int flashcardArrayListSize = 0;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView mRecyclerView;
    private String currentUser = "";
    private boolean mTwoPane;
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
        user = intent.getStringExtra("currentUser");

        // Log tags to check that data has passed through intents
        Log.d(TAG, "Category is: " + flashcardCategory);
        Log.d(TAG, "Title is: " + category);
        Log.d(TAG, "User is: " + user);

        // Matching UI elements to variables
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);

        // Setting the recycler view to run horizontally to mimic a flashcard scrolling list effect
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        // Initialising layout to set colours for different topics
        ConstraintLayout layout = findViewById(R.id.layoutFlashcards);

        // Determining if this is a different sized device
        // Setting a fragment to load in it's place
        mTwoPane = findViewById(R.id.detail_container) != null;
        Log.d(TAG, "Two Pane is = " + mTwoPane);
        if (mTwoPane) {
            final FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            Bundle bundle = new Bundle();
            bundle.putBoolean("wideScreen",mTwoPane);
            FlashcardSelectionFragment fragment = new FlashcardSelectionFragment();
            fragment.setArguments(bundle);
            transaction.replace(R.id.detail_container, fragment);
            transaction.commit();
        } else {
            // no further activity here, this is not needed
        }

        // Setting up what the intent number is and setting the appropriate flashcard deck
        if (flashcardCategory == 1) {
            // Determining the size of the category and logging output
            flashcardArrayListSize = Flashcard.getCategory1().size();
            Log.d(TAG, "Category size is: " + flashcardArrayListSize);

            // Sets the layout colour to be the same as the category
            layout.setBackgroundColor(Color.parseColor("#ffc000"));

            // Connecting Widgets to Variables to set the category textView
            categoryName = findViewById(R.id.category);
            categoryName.setText(category);

            // Gets the method from the object class flashcards
            flashcards = Flashcard.getCategory1();
            Log.d(TAG, "Category 1 is " + flashcards);

           // Creates a new adapter
            mAdapter = new FlashcardAdapter(flashcards);
            Log.d(TAG, "Category 1 adapter is " + flashcards);

            // Adapts the arrays in the arraylist to the recyclerview
            mRecyclerView.setAdapter(mAdapter);
            Log.d(TAG, "Category 1 adapter is " + flashcards);


        } else if (flashcardCategory == 2) {
            flashcardArrayListSize = Flashcard.getCategory2().size();
            layout.setBackgroundColor(Color.parseColor("#DE0000"));
            categoryName = findViewById(R.id.category);
            categoryName.setText(category);
            flashcards = Flashcard.getCategory2();
            mAdapter = new FlashcardAdapter(flashcards);
            mRecyclerView.setAdapter(mAdapter);

        } else if (flashcardCategory == 3) {
            flashcardArrayListSize = Flashcard.getCategory3().size();
            layout.setBackgroundColor(Color.parseColor("#FE622D"));
            categoryName = findViewById(R.id.category);
            categoryName.setText(category);
            flashcards = Flashcard.getCategory3();
            mAdapter = new FlashcardAdapter(flashcards);
            mRecyclerView.setAdapter(mAdapter);

        } else if (flashcardCategory == 4) {
            flashcardArrayListSize = Flashcard.getCategory4().size();
            layout.setBackgroundColor(Color.parseColor("#ffc000"));
            categoryName = findViewById(R.id.category);
            categoryName.setText(category);
            flashcards = Flashcard.getCategory4();
            mAdapter = new FlashcardAdapter(flashcards);
            mRecyclerView.setAdapter(mAdapter);

        } else if (flashcardCategory == 5) {
            flashcardArrayListSize = Flashcard.getCategory5().size();
            layout.setBackgroundColor(Color.parseColor("#00BD00"));
            categoryName = findViewById(R.id.category);
            categoryName.setText(category);
            flashcards = Flashcard.getCategory5();
            mAdapter = new FlashcardAdapter(flashcards);
            mRecyclerView.setAdapter(mAdapter);

        } else if (flashcardCategory == 6) {
            flashcardArrayListSize = Flashcard.getCategory6().size();
            layout.setBackgroundColor(Color.parseColor("#009CFE"));
            categoryName = findViewById(R.id.category);
            categoryName.setText(category);
            flashcards = Flashcard.getCategory6();
            mAdapter = new FlashcardAdapter(flashcards);
            mRecyclerView.setAdapter(mAdapter);

        } else if (flashcardCategory == 7) {
            flashcardArrayListSize = Flashcard.getCategory7().size();
            layout.setBackgroundColor(Color.parseColor("#000084"));
            categoryName = findViewById(R.id.category);
            categoryName.setText(category);
            flashcards = Flashcard.getCategory7();
            mAdapter = new FlashcardAdapter(flashcards);
            mRecyclerView.setAdapter(mAdapter);

        } else if (flashcardCategory == 8) {
            flashcardArrayListSize = Flashcard.getCategory8().size();
            layout.setBackgroundColor(Color.parseColor("#6D33A6"));
            categoryName = findViewById(R.id.category);
            categoryName.setText(category);
            flashcards = Flashcard.getCategory8();
            mAdapter = new FlashcardAdapter(flashcards);
            mRecyclerView.setAdapter(mAdapter);

        // Sets the order for the flashcards to come up - in order of their Ids
        for (int i = 1; i < flashcardArrayListSize; i++){
            flashcardCategoryList.add(i);
        }
        // Shuffles the flashcards to come up in a different order
        Collections.shuffle(flashcardCategoryList);

        }
    }
}

