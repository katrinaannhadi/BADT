package com.katrinaann.badt.ui.flashcards;


import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.katrinaann.badt.R;
import com.katrinaann.badt.ui.flashcards.models.Flashcard;
import com.wajahatkarim3.easyflipview.EasyFlipView;

import java.util.ArrayList;
import java.util.List;

public class FlashcardAdapter extends RecyclerView.Adapter<FlashcardAdapter.MyViewHolder> {

    private ArrayList<Flashcard> list;

    class MyViewHolder extends RecyclerView.ViewHolder {
        EasyFlipView flipView;
        TextView title, desc;
        ImageView image;

        MyViewHolder(View view) {
            super(view);
            flipView = view.findViewById(R.id.flipView);
            title = view.findViewById(R.id.title);
            desc = view.findViewById(R.id.desc);
            image = view.findViewById(R.id.image);
        }
    }

    FlashcardAdapter(
            ArrayList<Flashcard> list
    ) {
        this.list = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        Flashcard flashcard = list.get(position);
        holder.title.setText(flashcard.getTitle());
//        holder.desc.setText(flashcard.getAnswer());
        holder.image.setImageResource(flashcard.getImageID());

        if (holder.flipView.getCurrentFlipState() == EasyFlipView.FlipState.FRONT_SIDE && list.get(
                position).isFlipped) {
            holder.flipView.setFlipDuration(0);
            holder.flipView.flipTheView();
        } else if (holder.flipView.getCurrentFlipState() == EasyFlipView.FlipState.BACK_SIDE
                && !list.get(position).isFlipped) {
            holder.flipView.setFlipDuration(0);
            holder.flipView.flipTheView();
        }
        holder.flipView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (list.get(position).isFlipped) {
                    list.get(position).isFlipped = false;
                } else {
                    list.get(position).isFlipped = true;
                }
                holder.flipView.setFlipDuration(700);
                holder.flipView.flipTheView();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}



