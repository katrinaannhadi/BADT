package com.katrinaann.badt.asynctasks;

import android.os.AsyncTask;

import com.katrinaann.badt.database.FlashcardDatabase;
import com.katrinaann.badt.models.Flashcard;

import java.util.List;

public class FlashcardInsertAsyncTask extends AsyncTask<List<Flashcard>, Integer, String> {

    private FlashcardAsyncTaskDelegate delegate;
    private FlashcardDatabase mFlashcardDatabase;

    public void setDelegate(FlashcardAsyncTaskDelegate delegate) {this.delegate = delegate;}
    public void setFlashcardDatabase(FlashcardDatabase flashcardDatabase) {this.mFlashcardDatabase = flashcardDatabase;}

    @Override
    protected String doInBackground(List<Flashcard>... lists){
        mFlashcardDatabase.flashcardDao().insertAll(lists[0]);
        return null;
    }
}
