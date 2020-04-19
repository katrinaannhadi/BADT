package com.katrinaann.badt.ui.flashcards.asynctasks;

import android.os.AsyncTask;

import com.katrinaann.badt.ui.flashcards.database.FlashcardDatabase;
import com.katrinaann.badt.ui.flashcards.models.Flashcard;

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
