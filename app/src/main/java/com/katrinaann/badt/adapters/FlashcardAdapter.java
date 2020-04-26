package com.katrinaann.badt.adapters;


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
        // Initialising variables
        EasyFlipView flipView;
        TextView title, desc;
        ImageView imageFront, imageBack;

        FlashcardViewHolder(View view) {
            super(view);
            // Connecting UI widgets to variables.
            flipView = view.findViewById(R.id.flipView);
            title = view.findViewById(R.id.title);
            desc = view.findViewById(R.id.answer);
            imageFront = view.findViewById(R.id.image_front);
            imageBack = view.findViewById(R.id.image);
        }
    }

    @Override
    public FlashcardAdapter.FlashcardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_flashcard_recyclerview, parent, false);
        return new FlashcardViewHolder(itemView);
    }
    // Replace the contents of the view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(final FlashcardViewHolder holder, final int position) {
        // Gets the index of the flashcard from the flashcard deck
        final Flashcard flashcard = mFlashcards.get(position);

        // Sets the flashcard information to a holder - in the view
        holder.title.setText(flashcard.getTitle());
        holder.imageFront.setImageResource(flashcard.getImageCategory());
        Log.d(TAG, "Title is " + flashcard.getTitle());

        // Checks if the current state of the card is showing the front side and whether it is flipped
        if (holder.flipView.getCurrentFlipState() == EasyFlipView.FlipState.FRONT_SIDE && mFlashcards.get(
                position).isFlipped) {
            // Then do not start animation (card is stationary)
            holder.flipView.setFlipDuration(0);
            holder.flipView.flipTheView();
            // Set the Text in the TextView with information from the Flashcard Model
            holder.desc.setText(flashcard.getAnswer());

        // Checks if the current state of the card is showing the back and whether it is flipped
        } else if (holder.flipView.getCurrentFlipState() == EasyFlipView.FlipState.BACK_SIDE
                && !mFlashcards.get(position).isFlipped) {

            holder.flipView.setFlipDuration(0);
            holder.flipView.flipTheView();
            // Set the Text in the TextView with information from the Flashcard Model
            holder.desc.setText(flashcard.getAnswer());

        }
        // Sets a method to listen for a tap
        holder.flipView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mFlashcards.get(position).isFlipped) {
                    mFlashcards.get(position).isFlipped = false;
                    // sets to flip the card, starts the animation and starts flipTheView() method from the library to swap the front_card layout to back
                    holder.flipView.setFlipDuration(700);
                    holder.flipView.flipTheView();

                } else {
                    mFlashcards.get(position).isFlipped = true;

                    holder.flipView.setFlipDuration(700);
                    holder.flipView.flipTheView();


                    // Set the Text in the TextView with information from the Flashcard Model
                    holder.title.setText(flashcard.getTitle());
                    holder.imageBack.setImageResource(flashcard.getImageAnswer());
                    holder.desc.setText(flashcard.getAnswer());


                    // Using glide library to send a request to the internet for a drawable and sets that into the placeholder of an ImageView
                    Glide.with(holder.imageBack)
                            .load(flashcard.getImageURL())
                            .placeholder(flashcard.getImageAnswer())
                            .centerCrop()
                            .into(holder.imageBack);
                }
            }
        });

    }
    // Return the size of your data set (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mFlashcards.size();
    }
}



