package com.katrinaann.badt.ui.flashcards;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.katrinaann.badt.R;
import com.katrinaann.badt.ui.flashcards.FlashcardViewModel;

public class FlashcardFragment extends Fragment {

    private FlashcardViewModel flashcardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        flashcardViewModel =
                ViewModelProviders.of(this).get(FlashcardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_flashcard, container, false);
        final TextView textView = root.findViewById(R.id.text_flashcard);
        flashcardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
