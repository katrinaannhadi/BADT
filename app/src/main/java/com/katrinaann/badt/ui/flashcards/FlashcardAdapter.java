package com.katrinaann.badt.ui.flashcards;


import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.katrinaann.badt.R;
import com.katrinaann.badt.models.Flashcard;
import com.wajahatkarim3.easyflipview.EasyFlipView;

import java.util.ArrayList;

public class FlashcardAdapter extends RecyclerView.Adapter<FlashcardAdapter.FlashcardViewHolder> {


    private ArrayList<Flashcard> mFlashcards;
    public static final String TAG = "Flashcard Adapter";

    public FlashcardAdapter(ArrayList<Flashcard> flashcards){
        mFlashcards = flashcards;
    }


    public static class FlashcardViewHolder extends RecyclerView.ViewHolder {
        EasyFlipView flipView;
        TextView title, desc;
        ImageView imageFront, imageBack;

        FlashcardViewHolder(View view) {
            super(view);
            flipView = view.findViewById(R.id.flipView);
            title = view.findViewById(R.id.title);
            desc = view.findViewById(R.id.answer);
            imageFront = view.findViewById(R.id.image_front);
            imageBack = view.findViewById(R.id.image);
        }
    }

//    FlashcardAdapter(FlashcardActivity flashcardActivity, ArrayList<Flashcard> mFlashcards) {
//        this.mFlashcards = mFlashcards;
//    }

    @Override
    public FlashcardAdapter.FlashcardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_flashcard_recyclerview, parent, false);
        return new FlashcardViewHolder(itemView);
    }
    //replace the contents of the view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(final FlashcardViewHolder holder, final int position) {
        final Flashcard flashcard = mFlashcards.get(position);
        holder.title.setText(flashcard.getTitle());
        holder.imageFront.setImageResource(flashcard.getImageCategory());
        Log.d(TAG, "Title is " + flashcard.getTitle());


        if (holder.flipView.getCurrentFlipState() == EasyFlipView.FlipState.FRONT_SIDE && mFlashcards.get(
                position).isFlipped) {
            holder.flipView.setFlipDuration(0);
            holder.flipView.flipTheView();
            holder.desc.setText(flashcard.getAnswer());
            Log.d(TAG, "I am number 1");
        } else if (holder.flipView.getCurrentFlipState() == EasyFlipView.FlipState.BACK_SIDE
                && !mFlashcards.get(position).isFlipped) {
            holder.flipView.setFlipDuration(0);
            holder.flipView.flipTheView();
            holder.desc.setText(flashcard.getAnswer());
            Log.d(TAG, "I am number 2");

        }
        holder.flipView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mFlashcards.get(position).isFlipped) {
                    mFlashcards.get(position).isFlipped = false;
//                    holder.desc.setText(flashcard.getAnswer());
                    Log.d(TAG, "I am number 3");
                    holder.flipView.setFlipDuration(700);
                    holder.flipView.flipTheView();

                } else {
                    mFlashcards.get(position).isFlipped = true;
//                    holder.desc.setText(flashcard.getAnswer());
                    holder.flipView.setFlipDuration(700);
                    holder.flipView.flipTheView();
                    Log.d(TAG, "4 Title is  " + flashcard.getTitle());
                    Log.d(TAG, "I am number 4.1");
                    holder.title.setText(flashcard.getTitle());
                    Log.d(TAG, "I am number 4.1");
                    holder.imageBack.setImageResource(flashcard.getImageAnswer());
                    Log.d(TAG, "I am number 4.2");
                    holder.desc.setText(flashcard.getAnswer());
                    Log.d(TAG, "I am number 4.3");
                    Glide.with(holder.imageBack)
                            .load(flashcard.getImageURL())
                            .placeholder(flashcard.getImageAnswer())
                            .centerCrop()
                            .into(holder.imageBack);


                }
                Log.d(TAG, "I am number 5");
            }
        });
        Log.d(TAG, "I am number 6");

    }
    // Return the size of your data set (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mFlashcards.size();
    }
}



