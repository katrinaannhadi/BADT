package com.katrinaann.badt.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.katrinaann.badt.R;

import java.util.ArrayList;

@Entity
public class Flashcard {

    public boolean isFlipped;
    @PrimaryKey
    private int id;
    private int category;
    private String title;
    private String answer;
    //can be switched out for difficulty or difficulty can be added?
    private int imageID;

    public Flashcard(int id, int category, String title, String answer, int imageID) {
        this.id = id;
        this.category = category;
        this.title = title;
        this.answer = answer;
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

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
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

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public static ArrayList<Flashcard> getCategory1() {
        ArrayList<Flashcard> flashcards = new ArrayList<>();
            flashcards.add(new Flashcard(0, 1, "QuizName", "Introduction to Business Analysis", R.drawable.ic_scrum));
            flashcards.add(new Flashcard(1, 1, "QuizName", "Introduction to Business Analysis", R.drawable.ic_scrum));
            flashcards.add(new Flashcard(2, 1, "QuizName", "Introduction to Business Analysis", R.drawable.ic_scrum));
            flashcards.add(new Flashcard(3, 1, "QuizName", "Introduction to Business Analysis", R.drawable.ic_scrum));
            flashcards.add(new Flashcard(4, 1, "QuizName", "Introduction to Business Analysis", R.drawable.ic_scrum));
            flashcards.add(new Flashcard(5, 1, "QuizName", "Introduction to Business Analysis", R.drawable.ic_scrum));
            flashcards.add(new Flashcard(6, 1, "QuizName", "Introduction to Business Analysis", R.drawable.ic_scrum));
            flashcards.add(new Flashcard(7, 1, "QuizName", "Introduction to Business Analysis", R.drawable.ic_scrum));
            flashcards.add(new Flashcard(8, 1, "QuizName", "Introduction to Business Analysis", R.drawable.ic_scrum));
            return flashcards;
        }

        public static ArrayList<Flashcard> getCategory2() {
        ArrayList<Flashcard> flashcards = new ArrayList<>();
            flashcards.add(new Flashcard(0, 2,"2", "Test 2", R.drawable.ic_lean));
            flashcards.add(new Flashcard(1, 2,"QuizName", "Introduction to Business Analysis", R.drawable.ic_lean));
            flashcards.add(new Flashcard(2, 2,"QuizName", "Introduction to Business Analysis", R.drawable.ic_lean));
            flashcards.add(new Flashcard(3, 2,"QuizName", "Introduction to Business Analysis", R.drawable.ic_lean));
            flashcards.add(new Flashcard(4, 2,"QuizName", "Introduction to Business Analysis", R.drawable.ic_lean));
            flashcards.add(new Flashcard(5, 2,"QuizName", "Introduction to Business Analysis", R.drawable.ic_lean));
            flashcards.add(new Flashcard(6, 2,"QuizName", "Introduction to Business Analysis", R.drawable.ic_lean));
            flashcards.add(new Flashcard(7, 2,"QuizName", "Introduction to Business Analysis", R.drawable.ic_lean));
            flashcards.add(new Flashcard(8, 2,"QuizName", "Introduction to Business Analysis", R.drawable.ic_lean));
            flashcards.add(new Flashcard(9, 2,"QuizName", "Introduction to Business Analysis", R.drawable.ic_lean));
        return flashcards;
    }
        public static ArrayList<Flashcard> getCategory3() {
            ArrayList<Flashcard> flashcards = new ArrayList<>();
            flashcards.add(new Flashcard(0, 3,"3", "Test 3", R.drawable.ic_designthinking));
            flashcards.add(new Flashcard(1, 3,"QuizName", "Introduction to Business Analysis", R.drawable.ic_designthinking));
            flashcards.add(new Flashcard(2, 3,"QuizName", "Introduction to Business Analysis", R.drawable.ic_designthinking));
            flashcards.add(new Flashcard(3, 3,"QuizName", "Introduction to Business Analysis", R.drawable.ic_designthinking));
            flashcards.add(new Flashcard(4, 3,"QuizName", "Introduction to Business Analysis", R.drawable.ic_designthinking));
            flashcards.add(new Flashcard(5, 3,"QuizName", "Introduction to Business Analysis", R.drawable.ic_designthinking));
            flashcards.add(new Flashcard(6, 3,"QuizName", "Introduction to Business Analysis", R.drawable.ic_designthinking));
            flashcards.add(new Flashcard(7, 3,"QuizName", "Introduction to Business Analysis", R.drawable.ic_designthinking));
            flashcards.add(new Flashcard(8, 3,"QuizName", "Introduction to Business Analysis", R.drawable.ic_designthinking));
            flashcards.add(new Flashcard(9, 3,"QuizName", "Introduction to Business Analysis", R.drawable.ic_designthinking));
            return flashcards;
        }

        public static ArrayList<Flashcard> getCategory4() {
            ArrayList<Flashcard> Flashcards = new ArrayList<>();
            Flashcards.add(new Flashcard(0, 4,"QuizName", "Introduction to Business Analysis", R.drawable.ic_systems));
            Flashcards.add(new Flashcard(1, 4,"QuizName", "Introduction to Business Analysis", R.drawable.ic_systems));
            Flashcards.add(new Flashcard(2, 4,"QuizName", "Introduction to Business Analysis", R.drawable.ic_systems));
            Flashcards.add(new Flashcard(3, 4,"QuizName", "Introduction to Business Analysis", R.drawable.ic_systems));
            Flashcards.add(new Flashcard(4, 4,"QuizName", "Introduction to Business Analysis", R.drawable.ic_systems));
            Flashcards.add(new Flashcard(5, 4,"QuizName", "Introduction to Business Analysis", R.drawable.ic_systems));
            Flashcards.add(new Flashcard(6, 4,"QuizName", "Introduction to Business Analysis", R.drawable.ic_systems));
            Flashcards.add(new Flashcard(7, 4,"QuizName", "Introduction to Business Analysis", R.drawable.ic_systems));

            return Flashcards;
        }
        public static ArrayList<Flashcard> getCategory5() {
            ArrayList<Flashcard> flashcards = new ArrayList<>();
            flashcards.add(new Flashcard(0, 5,"5", "Test 5", R.drawable.ic_systems));
            flashcards.add(new Flashcard(1, 5,"QuizName", "Introduction to Business Analysis", R.drawable.ic_systems));
            flashcards.add(new Flashcard(2, 5,"QuizName", "Introduction to Business Analysis", R.drawable.ic_systems));
            flashcards.add(new Flashcard(3, 5,"QuizName", "Introduction to Business Analysis", R.drawable.ic_systems));
            flashcards.add(new Flashcard(4, 5,"QuizName", "Introduction to Business Analysis", R.drawable.ic_systems));
            flashcards.add(new Flashcard(5, 5,"QuizName", "Introduction to Business Analysis", R.drawable.ic_systems));
            flashcards.add(new Flashcard(6, 5,"QuizName", "Introduction to Business Analysis", R.drawable.ic_systems));
            flashcards.add(new Flashcard(7, 5,"QuizName", "Introduction to Business Analysis", R.drawable.ic_systems));
            flashcards.add(new Flashcard(8, 5,"QuizName", "Introduction to Business Analysis", R.drawable.ic_systems));
            return flashcards;
        }

}

