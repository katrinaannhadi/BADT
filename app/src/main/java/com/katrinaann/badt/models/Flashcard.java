package com.katrinaann.badt.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.katrinaann.badt.R;

import java.util.ArrayList;

@Entity
public class Flashcard {
    //boolean value to check whether flashcard has flipped or not
    public boolean isFlipped;
    @PrimaryKey
    private int id;
    private int category;
    private String categoryName;
    private String title;
    private String answer;
    private int imageCategory;
    private int imageAnswer;
    private String imageURL;

    // Constructor to call Flashcard object

    public Flashcard(int id, int category, String categoryName, String title, String answer, int imageCategory, int imageAnswer, String imageURL) {
        this.id = id;
        this.category = category;
        this.categoryName = categoryName;
        this.title = title;
        this.answer = answer;
        this.imageCategory = imageCategory;
        this.imageAnswer = imageAnswer;
        this.imageURL = imageURL;
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

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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

    public int getImageCategory() {
        return imageCategory;
    }

    public void setImageCategory(int imageCategory) {
        this.imageCategory = imageCategory;
    }

    public int getImageAnswer() {
        return imageAnswer;
    }

    public void setImageAnswer(int imageAnswer) {
        this.imageAnswer = imageAnswer;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
    //    public Flashcard(int id, int category, String categoryName, String title, String answer, int imageCategory, int imageAnswer) {
//        this.id = id;
//        this.category = category;
//        this.categoryName = categoryName;
//        this.title = title;
//        this.answer = answer;
//        this.imageCategory = imageCategory;
//        this.imageAnswer = imageAnswer;
//    }
//
//    public Flashcard() {
//
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public int getCategory() {
//        return category;
//    }
//
//    public void setCategory(int category) {
//        this.category = category;
//    }
//
//    public String getCategoryName() {
//        return categoryName;
//    }
//
//    public void setCategoryName(String categoryName) {
//        this.categoryName = categoryName;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getAnswer() {
//        return answer;
//    }
//
//    public void setAnswer(String answer) {
//        this.answer = answer;
//    }
//
//    public int getImageCategory() {
//        return imageCategory;
//    }
//
//    public void setImageCategory(int imageCategory) {
//        this.imageCategory = imageCategory;
//    }
//
//    public int getImageAnswer() {
//        return imageAnswer;
//    }
//
//    public void setImageAnswer(int imageAnswer) {
//        this.imageAnswer = imageAnswer;
//    }

    public static ArrayList<Flashcard> getCategory1() {
        ArrayList<Flashcard> flashcards = new ArrayList<>();
            flashcards.add(new Flashcard(0
                    , 1
                    , "Introduction to Business Analysis"
                    , "What is an information system?"
                    , "A system that collects, stores, processes and retrieves information and turns raw data into business insight"
                    , R.drawable.ic_ba
                    , R.drawable.ic_itba_f1
                    ,""));
            flashcards.add(new Flashcard(1
                    , 1, "Introduction to Business Analysis"
                    , "What is business analysis?"
                    , "“The practice of enabling change in an organizational context by defining needs and recommending (digitally-enabled) solutions that delivers value to stakeholders” (International Institute of Business Analysis, BABOK v3)"
                    , R.drawable.ic_ba
                    , R.drawable.ic_ba
                    , "https://source.unsplash.com/Oalh2MojUuk"));
            flashcards.add(new Flashcard(2
                    , 1
                    , "Introduction to Business Analysis"
                    , "What does a business analyst do?"
                    , "A business analyst (often referred to as a BA) is a person who conducts business analysis and has various roles"
                    , R.drawable.ic_ba
                    , R.drawable.ic_ba
                    , "https://source.unsplash.com/npxXWgQ33ZQ/1600x900"));
            flashcards.add(new Flashcard(3
                    , 1
                    , "Introduction to Business Analysis"
                    , "What are a BA's roles?"
                    , "•Understanding enterprise problems and goals\n" +
                    "\t•Analyzing needs and solutions\n" +
                    "\t•Devising strategies\n" +
                    "\t•Driving change\n" +
                    "\t•Facilitating stakeholder collaboration\n"
                    , R.drawable.ic_ba
                    , R.drawable.ic_ba
                    , "https://source.unsplash.com/QckxruozjRg/1600x900"));
            flashcards.add(new Flashcard(4
                    , 1
                    , "Introduction to Business Analysis"
                    , "What are the Key Concepts?\n" +
                    "\n"+
                    "\t Hint: There are 6"
                    , "Change, Need, Solution,\n" +
                    " Stakeholder, Value, Context\n " +
                    "\n" +
                    "Acronym CNSSVA \n" +
                    "\tCharlie Needs a Solution! \n" +
                    "\tSend Valuable Coffee!"
                    , R.drawable.ic_ba
                    , R.drawable.bakeyconcepts
                    , ""));
            flashcards.add(new Flashcard(4
                    , 1
                    , "Introduction to Business Analysis"
                    , "What is change in Business Analysis?"
                    , "The act of transformation in response to a need"
                    , R.drawable.ic_ba
                    , R.drawable.ic_ba
                    , "https://source.unsplash.com/mG28olYFgHI/1600x900"));
            flashcards.add(new Flashcard(5
                    , 1
                    , "Introduction to Business Analysis"
                    , "What is need in Business Analysis?"
                    , "A problem or opportunity to be addressed"
                    , R.drawable.ic_ba
                    , R.drawable.ic_ba
                    , "https://source.unsplash.com/M6tN7AZ_bNs/1600x900"));
            flashcards.add(new Flashcard(6
                    , 1
                    , "Introduction to Business Analysis"
                    , "What is solution in Business Analysis?"
                    , "A specific way of satisfying one or more needs in a context"
                    , R.drawable.ic_ba
                    , R.drawable.ic_ba
                    , "https://source.unsplash.com/7e2pe9wjL9M/1600x900"));
            flashcards.add(new Flashcard(7
                    , 1
                    , "Introduction to Business Analysis"
                    , "What is stakeholder in Business Analysis?"
                    , "A group or individual with a relationship to the change, the need, or the solution"
                    , R.drawable.ic_ba
                    , R.drawable.ic_ba
                    , "https://source.unsplash.com/MYbhN8KaaEc/1600x900"));
            flashcards.add(new Flashcard(8
                    , 1
                    , "Introduction to Business Analysis"
                    , "What is value in Business Analysis?"
                    , "The worth, importance, or usefulness of something to a stakeholder within a context"
                    , R.drawable.ic_ba
                    , R.drawable.ic_ba
                    , "https://source.unsplash.com/JW6r_0CPYec/1600x900"));
            flashcards.add(new Flashcard(9
                    , 1
                    , "Introduction to Business Analysis"
                    , "What is context in Business Analysis?"
                    , "The circumstances that influence, are influenced by, and provide understanding of the change"
                    , R.drawable.ic_ba
                    , R.drawable.ic_ba
                    , "https://source.unsplash.com/uMWPrcRsrto/1600x900"));
            flashcards.add(new Flashcard(10
                    , 1
                    , "Introduction to Business Analysis"
                    , "What are the 3 main types of organisations?"
                    , "Conservative, progressive and avant-garde"
                    , R.drawable.ic_ba
                    , R.drawable.ic_ba
                    , "https://source.unsplash.com/mk7D-4UCfmg/1600x900"));
            flashcards.add(new Flashcard(11
                    , 1
                    , "Introduction to Business Analysis"
                    , "Type of organisation: \n" +
                    "\n" +
                    "\tConservative"
                    , "Hierarchical organisational structure and very procedural methods of project management (such as waterfall).\n" +
                    "\n E.g. Governmental Organisations"
                    , R.drawable.ic_ba
                    , R.drawable.ic_ba
                    , "https://source.unsplash.com/o0kbc907i20/1600x900"));
            flashcards.add(new Flashcard(12
                    , 1
                    , "Introduction to Business Analysis"
                    , "Type of organisation: \n" +
                    "\n" +
                    "\tProgressive"
                    , "Fairly flat and are the most responsive to changes and new trends. Adopt change-based strategies such as Agile.\n" +
                    "\n E.g. Banks, Professional Service Firms, Insurance Companies"
                    , R.drawable.ic_ba
                    , R.drawable.ic_ba
                    , "https://source.unsplash.com/ZGjbiukp_-A/1600x900"));
            flashcards.add(new Flashcard(13
                    , 1
                    , "Introduction to Business Analysis"
                    , "Type of organisation: \n" +
                    "\n" +
                    "\tAvant-Garde"
                    , "Often new companies that are extremely welcoming to risk seek to exploit as many opportunities as possible\n" +
                    "\n Eg. StartUps, Spotify, Uber"
                    , R.drawable.ic_ba
                    , R.drawable.ic_ba
                    , "https://source.unsplash.com/H4fYXZ1hyco/1600x900"));
            return flashcards;
        }

    public static ArrayList<Flashcard> getCategory2() {
        ArrayList<Flashcard> flashcards = new ArrayList<>();
        flashcards.add(new Flashcard(0
                , 2
                , "Project Management"
                , "Type of organisation: \n" +
                "\n" +
                "\tAvant-Garde"
                , "Often new companies that are extremely welcoming to risk seek to exploit as many opportunities as possible\n" +
                "\n Eg. StartUps, Spotify, Uber"
                , R.drawable.ic_ba
                , R.drawable.ic_ba
                , "https://source.unsplash.com/H4fYXZ1hyco/1600x900"));
        return flashcards;
    }
//    public static ArrayList<Flashcard> getCategory3() {
//        ArrayList<Flashcard> flashcards = new ArrayList<>();
//        flashcards.add(new Flashcard(0, 3, "Systems Development Methodologies", "What is an information system?", "A system that collects, stores, processes and retrieves information and turns raw data into business insight", R.drawable.ic_scrum, R.drawable.baintro));
//        return flashcards;
//    }
//    public static ArrayList<Flashcard> getCategory4() {
//        ArrayList<Flashcard> flashcards = new ArrayList<>();
//            flashcards.add(new Flashcard(0, 4, "Project Management", "What is an information system?", "A system that collects, stores, processes and retrieves information and turns raw data into business insight", R.drawable.ic_scrum, R.drawable.baintro));
//        return flashcards;
//    }
//    public static ArrayList<Flashcard> getCategory5() {
//        ArrayList<Flashcard> flashcards = new ArrayList<>();
//            flashcards.add(new Flashcard(0, 5, "Requirements Determination", "What is an information system?", "A system that collects, stores, processes and retrieves information and turns raw data into business insight", R.drawable.ic_scrum, R.drawable.baintro));
//            return flashcards;
//        }
//    public static ArrayList<Flashcard> getCategory6() {
//        ArrayList<Flashcard> flashcards = new ArrayList<>();
//        flashcards.add(new Flashcard(0, 6, "Agile Scrum", "What is an information system?", "A system that collects, stores, processes and retrieves information and turns raw data into business insight", R.drawable.ic_scrum, R.drawable.baintro));
//        return flashcards;
//    }
//    public static ArrayList<Flashcard> getCategory7() {
//        ArrayList<Flashcard> flashcards = new ArrayList<>();
//        flashcards.add(new Flashcard(0, 7, "Lean Start Up", "What is an information system?", "A system that collects, stores, processes and retrieves information and turns raw data into business insight", R.drawable.ic_scrum, R.drawable.baintro));
//        return flashcards;
//    }
//
//    public static ArrayList<Flashcard> getCategory8() {
//        ArrayList<Flashcard> flashcards = new ArrayList<>();
//        flashcards.add(new Flashcard(0, 8, "Design Thinking", "What is an information system?", "A system that collects, stores, processes and retrieves information and turns raw data into business insight", R.drawable.ic_scrum, R.drawable.baintro));
//        return flashcards;
//    }

}

