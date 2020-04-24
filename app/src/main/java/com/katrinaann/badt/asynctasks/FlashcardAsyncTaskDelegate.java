package com.katrinaann.badt.asynctasks;

import com.katrinaann.badt.models.Flashcard;

public interface FlashcardAsyncTaskDelegate {

    void handleFlashcardReturned(Flashcard flashcard);
}
