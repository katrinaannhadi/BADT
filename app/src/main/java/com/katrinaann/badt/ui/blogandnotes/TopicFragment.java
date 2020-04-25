package com.katrinaann.badt.ui.blogandnotes;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.katrinaann.badt.R;
import com.katrinaann.badt.ui.quiz.QuizSelectionPageActivity;
import com.katrinaann.badt.ui.quiz.QuizViewModel;

public class TopicFragment extends Fragment {

    private QuizViewModel quizViewModel;
    private String currentUser = "";

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        quizViewModel =
                ViewModelProviders.of(this).get(QuizViewModel.class);

        View root = inflater.inflate(R.layout.fragment_topic, container, false);

        final TextView textView = root.findViewById(R.id.text_topic);
        final ImageView quizButton = root.findViewById(R.id.image_topic);


        quizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context, TemporaryActivity.class);
                context.startActivity(intent);
            }
        });

          return root;
    }
}
