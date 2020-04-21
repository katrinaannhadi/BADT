package com.katrinaann.badt.asynctasks;

import com.katrinaann.badt.models.Flashcard;

import java.util.List;

public interface FlashcardCategoryAsyncTaskDelegate {
    void handleFlashcardListReturned(List<Flashcard> flashcardList);
}
