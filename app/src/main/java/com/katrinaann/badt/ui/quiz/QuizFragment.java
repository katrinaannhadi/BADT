package com.katrinaann.badt.ui.quiz;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.katrinaann.badt.R;
import com.katrinaann.badt.ui.home.HomeActivity;

public class QuizFragment extends Fragment {

    private QuizViewModel quizViewModel;
    private String currentUser = "";

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        quizViewModel =
                ViewModelProviders.of(this).get(QuizViewModel.class);

        View root = inflater.inflate(R.layout.fragment_quiz, container, false);

        final TextView textView = root.findViewById(R.id.text_quiz);
        final ImageView quizButton = root.findViewById(R.id.image_quiz);


        quizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context, QuizSelectionPageActivity.class);
                context.startActivity(intent);
            }
        });

          return root;
    }
}
