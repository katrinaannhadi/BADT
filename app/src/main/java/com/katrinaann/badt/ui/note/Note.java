package com.katrinaann.badt.ui.note;

import android.graphics.drawable.Drawable;
import android.os.Parcel;

import com.katrinaann.badt.R;

import java.util.ArrayList;

//class for objects to classify restaurants
public class Note {

    //unique ID for Restaurant object
    private int categoryID;
    //name, type of cuisine, location, rating
    private String topic;
    private String subTopic;
    private String levelOfDifficulty;
    private int imageID;
    private String about;

    public Note() {
    }

    public Note(int categoryID, String topic, String subTopic, String levelOfDifficulty, int imageID, String about) {
        this.categoryID = categoryID;
        this.topic = topic;
        this.subTopic = subTopic;
        this.levelOfDifficulty = levelOfDifficulty;
        this.imageID = imageID;
        this.about = about;
    }

    public Note(Parcel source) {
        categoryID = source.readInt();
        topic = source.readString();
        subTopic = source.readString();
        levelOfDifficulty = source.readString();
        this.imageID = imageID;
        about = source.readString();

    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getSubTopic() {
        return subTopic;
    }

    public void setSubTopic(String subTopic) {
        this.subTopic = subTopic;
    }

    public String getLevelOfDifficulty() {
        return levelOfDifficulty;
    }

    public void setLevelOfDifficulty(String levelOfDifficulty) {
        this.levelOfDifficulty = levelOfDifficulty;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public static ArrayList<Note> getNote() {
        ArrayList<Note> notes = new ArrayList<>();

        notes.add(new Note(1, "Design Thinking", "Empathise", "1", R.drawable.yellow, "This is the first step of Design Thinking"));
        notes.add(new Note(1, "Design Thinking", "Ceremonies", "1", R.drawable.yellow, "This is the second step of Design Thinking"));
        notes.add(new Note(1, "Design Thinking", "Artifacts", "1", R.drawable.yellow, "This is the third step of Design Thinking"));
        notes.add(new Note(1, "Design Thinking", "Artifacts", "1", R.drawable.yellow, "This is the fourth step of Design Thinking"));
        notes.add(new Note(1, "Design Thinking", "Testing", "1", R.drawable.yellow, "This is the fifth step of Design Thinking"));

        notes.add(new Note(2, "Agile Scrum", "Roles", "1", R.drawable.yellow, "This is the first topic of Agile"));
        notes.add(new Note(2, "Agile Scrum", "Ceremonies", "1", R.drawable.yellow, "This is the first topic of Agile"));
        
        return notes;
    }
}
