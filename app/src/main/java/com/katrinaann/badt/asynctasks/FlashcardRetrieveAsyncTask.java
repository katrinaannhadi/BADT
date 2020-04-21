package com.katrinaann.badt.asynctasks;

import android.os.AsyncTask;

import com.katrinaann.badt.database.FlashcardDatabase;
import com.katrinaann.badt.models.Flashcard;

public class FlashcardRetrieveAsyncTask extends AsyncTask<Integer, Integer, Flashcard> {

    private FlashcardAsyncTaskDelegate delegate;
    private FlashcardDatabase mFlashcardDatabase;

    public void setDelegate(FlashcardAsyncTaskDelegate delegate){this.delegate = delegate;}
    public void setFlashcardDatabase(FlashcardDatabase flashcardDatabase){this.mFlashcardDatabase = flashcardDatabase;}

    @Override
    protected Flashcard doInBackground(Integer... integers) {
        return mFlashcardDatabase.flashcardDao().getFlashcard(integers[0]);
    }

    protected void onPostExecute(Flashcard flashcard){
        delegate.handleFlashcardReturned(flashcard);
    }
}
