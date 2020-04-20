package com.katrinaann.badt.ui.flashcards.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.katrinaann.badt.R;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Flashcard {

    public boolean isFlipped;
    @PrimaryKey
    private int id;
    private String title;
    private String answer;
    private int category; //can be switched out for difficulty or difficulty can be added?
    private int imageID;

    public Flashcard(int id, String title, String answer, int category, int imageID) {
        this.id = id;
        this.title = title;
        this.answer = answer;
        this.category = category;
        this.imageID = imageID;
    }

    public Flashcard() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public static List<Flashcard> getFlashcardList(){
        //TODO:: to put this somewhere that's not here
        //TODO:: add url from api, not sure we can find relevant data in our APIs for these flashcards?
        //questions and answers from https://www.sageadvice.eu/2017/11/27/trivia-quiz-on-5th-edition-dd-rules/
        List<Flashcard> flashcardList = new ArrayList<>();
        flashcardList.add(0, new Flashcard(0,
                "One word flashcards",
                "This is the answer",
                1,
                R.drawable.ic_flashcard));
        flashcardList.add(1, new Flashcard(1,
                "One word flashcards",
                "This is the answer",
                1,
                R.drawable.ic_flashcard));
        flashcardList.add(2, new Flashcard(2,
                "One word flashcards",
                "This is the answer",
                1,
                R.drawable.ic_flashcard));
        flashcardList.add(0, new Flashcard(3,
                "One word flashcards",
                "This is the answer",
                1,
                R.drawable.ic_flashcard));

        return flashcardList;
    }
}

