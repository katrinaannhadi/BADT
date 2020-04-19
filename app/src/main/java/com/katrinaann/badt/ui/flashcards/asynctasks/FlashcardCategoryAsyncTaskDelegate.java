package com.katrinaann.badt.ui.flashcards.asynctasks;

import com.katrinaann.badt.ui.flashcards.models.Flashcard;

import java.util.List;

public interface FlashcardCategoryAsyncTaskDelegate {
    void handleFlashcardListReturned(List<Flashcard> flashcardList);
}
