package com.katrinaann.badt.ui.flashcards.asynctasks;

import com.katrinaann.badt.ui.flashcards.models.Flashcard;

public interface FlashcardAsyncTaskDelegate {

    void handleFlashcardReturned(Flashcard flashcard);
}
