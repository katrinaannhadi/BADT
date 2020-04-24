package com.katrinaann.badt.asynctasks;

import android.os.AsyncTask;

import com.katrinaann.badt.database.FlashcardDatabase;
import com.katrinaann.badt.models.Flashcard;

import java.util.List;

public class FlashcardCategoryRetrieveAsyncTask extends AsyncTask<Integer, Integer, List<Flashcard>> {

    private FlashcardCategoryAsyncTaskDelegate delegate;
    private FlashcardDatabase mFlashcardDatabase;

    public void setDelegate(FlashcardCategoryAsyncTaskDelegate delegate){this.delegate = delegate;}
    public void setFlashcardDatabase(FlashcardDatabase flashcardDatabase){this.mFlashcardDatabase = flashcardDatabase;}

    @Override
    protected List<Flashcard> doInBackground(Integer... integers) {
        return mFlashcardDatabase.flashcardDao().getFlashcardCategory(integers[0]);
    }

    protected void onPostExecute(List<Flashcard> flashcardList){
        delegate.handleFlashcardListReturned(flashcardList);
    }

}
