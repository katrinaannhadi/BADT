package com.katrinaann.badt.ui.flashcards;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.katrinaann.badt.R;

public class FlashcardFragment extends Fragment {

    private FlashcardViewModel flashcardViewModel;
    private AnimatorSet mSetRightOut;
    private AnimatorSet mSetLeftIn;
    private boolean mIsBackVisible = false;
    private View mCardFrontLayout;
    private View mCardBackLayout;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        flashcardViewModel =
                ViewModelProviders.of(this).get(FlashcardViewModel.class);

        View root = inflater.inflate(R.layout.fragment_flashcard, container, false);
        final TextView textView = root.findViewById(R.id.text_flashcard);
        final View mCardBackLayout = root.findViewById(R.id.card_back);
        final View mCardFrontLayout = root.findViewById(R.id.card_front);
        final ConstraintLayout mConstraintLayout = root.findViewById(R.id.card);

        int distance = 8000;
        float scale = getResources().getDisplayMetrics().density * distance;
        mCardFrontLayout.setCameraDistance(scale);
        mCardBackLayout.setCameraDistance(scale);

        loadAnimations();

        mSetRightOut = (AnimatorSet) AnimatorInflater.loadAnimator(this.getActivity(), R.animator.card_flip_left_out);
        mSetLeftIn = (AnimatorSet) AnimatorInflater.loadAnimator(this.getActivity(), R.animator.card_flip_left_in);




        flashcardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    private void loadAnimations() {

    }
    public void flipCard(View view) {
        if (!mIsBackVisible) {
            mSetRightOut.setTarget(mCardFrontLayout);
            mSetLeftIn.setTarget(mCardBackLayout);
            mSetRightOut.start();
            mSetLeftIn.start();
            mIsBackVisible = true;
        } else {
            mSetRightOut.setTarget(mCardBackLayout);
            mSetLeftIn.setTarget(mCardFrontLayout);
            mSetRightOut.start();
            mSetLeftIn.start();
            mIsBackVisible = false;
        }
    }


}
