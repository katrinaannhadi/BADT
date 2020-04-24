package com.katrinaann.badt.ui.flashcards;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.katrinaann.badt.R;


public class FlashcardSelectionFragment extends Fragment {
    private String TAG = "FlashcardActivity";

    //TODO CHANGE TO RECYCLER VIEW

    private FlashcardViewModel flashcardViewModel;
    private View view;
    private Button categoryOne;
    private Button categoryTwo;
    private Button categoryThree;
    private Button categoryFour;
    private Button categoryFive;
    private Button categorySix;
    private Button categorySeven;

    private int value;

    public FlashcardSelectionFragment(){
        //required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        flashcardViewModel =
                ViewModelProviders.of(this).get(FlashcardViewModel.class);
        view = inflater.inflate(R.layout.fragment_flashcard_selection, container, false);
        Log.d(TAG, "Flashcard Fragment: SUCCESS");


        categoryOne = view.findViewById(R.id.button_category_one);
        categoryTwo = view.findViewById(R.id.button_category_two);
        categoryThree = view.findViewById(R.id.button_category_three);
        categoryFour = view.findViewById(R.id.button_category_four);
        categoryFive = view.findViewById(R.id.button_category_five);
        categorySix = view.findViewById(R.id.button_category_six);
        categorySeven = view.findViewById(R.id.button_category_seven);

        categoryOne.setText("Introduction to Business Analysis");
        categoryTwo.setText("Project Management");
        categoryThree.setText("Requirements Gathering and Modelling");
        categoryFour.setText("System Development Life Cycle");
        categoryFive.setText("Design Thinking");
        categorySix.setText("Agile Scrum");
        categorySeven.setText("Lean Start Up");


        categoryOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startFlashcard(1);
            }
        });

        categoryTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startFlashcard(2);
            }
        });

        categoryThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startFlashcard(3);
            }
        });
        categoryFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startFlashcard(4);
            }
        });
        categoryFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startFlashcard(5);
            }
        });
        categorySix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startFlashcard(6);
            }
        });
        categorySeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startFlashcard(7);
            }
        });


        final TextView textView = view.findViewById(R.id.text_quiz);
        flashcardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return view;
    }
    private void startFlashcard(int number){
        Context c = view.getContext();
        Intent intent = new Intent(c, FlashcardActivity.class);
        intent.putExtra("Category", number);
        c.startActivity(intent);

//        public void onClick(View view, int position) {
//            FlashcardActivity flashcardActivity = (FlashcardActivity) getActivity();
//            flashcardActivity.addFlashCardPosition(position);

        }


//            Bundle arguments = new Bundle();
//            arguments.putInt("position", position);
//            detailFragment.setArguments(arguments);
//            transaction.add(R.id.detail_container, detailFragment);
//            transaction.commit();
    }
