package com.katrinaann.badt.ui.flashcards.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Flashcard {

    @PrimaryKey
    private int id;
    private String flashcard;
    private String optionA;
    private String optionB;
    private String optionC;
    private String answer;
    private int category; //can be switched out for difficulty or difficulty can be added?

    public Flashcard(int id, String flashcard, String optionA, String optionB, String optionC, String answer, int category){
        this.id = id;
        this.flashcard = flashcard;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.answer = answer;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlashcard() {
        return flashcard;
    }

    public void setFlashcard(String flashcard) {
        this.flashcard = flashcard;
    }


    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
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
}

