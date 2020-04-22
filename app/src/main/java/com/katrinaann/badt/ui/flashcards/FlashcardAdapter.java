package com.katrinaann.badt.ui.flashcards;


import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.katrinaann.badt.R;
import com.katrinaann.badt.models.Flashcard;
import com.wajahatkarim3.easyflipview.EasyFlipView;

import java.util.ArrayList;

public class FlashcardAdapter extends RecyclerView.Adapter<FlashcardAdapter.FlashcardViewHolder> {

    private ArrayList<Flashcard> mFlashcards;

    public FlashcardAdapter(ArrayList<Flashcard> flashcards){
        mFlashcards = flashcards;
    }


    public static class FlashcardViewHolder extends RecyclerView.ViewHolder {
        EasyFlipView flipView;
        TextView title, desc;
        ImageView image;

        FlashcardViewHolder(View view) {
            super(view);
            flipView = view.findViewById(R.id.flipView);
            title = view.findViewById(R.id.title);
            desc = view.findViewById(R.id.desc);
            image = view.findViewById(R.id.image);
        }
    }

//    FlashcardAdapter(FlashcardActivity flashcardActivity, ArrayList<Flashcard> mFlashcards) {
//        this.mFlashcards = mFlashcards;
//    }

    @Override
    public FlashcardAdapter.FlashcardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview, parent, false);
        return new FlashcardViewHolder(itemView);
    }
    //replace the contents of the view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(final FlashcardViewHolder holder, final int position) {
        Flashcard flashcard = mFlashcards.get(position);
        holder.title.setText(flashcard.getTitle());
        holder.image.setImageResource(flashcard.getImageID());
//        holder.desc.setText(flashcard.getAnswer());

        if (holder.flipView.getCurrentFlipState() == EasyFlipView.FlipState.FRONT_SIDE && mFlashcards.get(
                position).isFlipped) {
            holder.flipView.setFlipDuration(0);
            holder.flipView.flipTheView();
        } else if (holder.flipView.getCurrentFlipState() == EasyFlipView.FlipState.BACK_SIDE
                && !mFlashcards.get(position).isFlipped) {
            holder.flipView.setFlipDuration(0);
            holder.flipView.flipTheView();
        }
        holder.flipView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mFlashcards.get(position).isFlipped) {
                    mFlashcards.get(position).isFlipped = false;
                } else {
                    mFlashcards.get(position).isFlipped = true;
                }
                holder.flipView.setFlipDuration(700);
                holder.flipView.flipTheView();
            }
        });
    }
    // Return the size of your data set (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mFlashcards.size();
    }
}



