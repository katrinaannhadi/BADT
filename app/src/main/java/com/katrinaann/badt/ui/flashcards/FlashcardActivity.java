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
import java.util.List;

public class FlashcardActivity extends AppCompatActivity  {
    public static final String EXTRA_MESSAGE = "com.katrinaann.flashcards.MESSAGE";
    private Flashcard mFlashcard;
    TextView category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_flip);


//        mFlashcard = Flashcard.getFlashcardList().get(getIntent().getInt("position"));


        ArrayList<Flashcard> list = new ArrayList<>();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        for (int i = 0; i < 20; i++) {
            Flashcard flashcard = new Flashcard();
            flashcard.isFlipped = false;
            list.add(flashcard);
        }
        recyclerView.setAdapter(new FlashcardAdapter(list));
    }

    public void addFlashCardPosition(int position) {
        category = findViewById(R.id.category);
        category.setText(position);
    }
}

