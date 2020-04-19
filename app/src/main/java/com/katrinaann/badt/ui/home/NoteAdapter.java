package com.katrinaann.badt.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.katrinaann.badt.R;
import com.katrinaann.badt.ui.note.Note;

import java.util.ArrayList;


public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.RestaurantViewHolder> {
    private ArrayList<Note> mNotes;
    private RecyclerViewClickListener mListener;

    public NoteAdapter(ArrayList<Note> notes, RecyclerViewClickListener listener) {
        mNotes = notes;
        mListener = listener;
    }

    public interface RecyclerViewClickListener {
        void onClick(View view, int position);
    }

    public static class RestaurantViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView name, cuisineType, location, rating;
        public ImageView image;
        private RecyclerViewClickListener mListener;

        public RestaurantViewHolder(View v, RecyclerViewClickListener listener) {
            super(v);
            mListener = listener;
            v.setOnClickListener(this);
            name = v.findViewById(R.id.restaurant_name);
            cuisineType = v.findViewById(R.id.restaurant_cuisineType);
            location = v.findViewById(R.id.restaurant_location);
            rating = v.findViewById(R.id.restaurant_rating);
            image = v.findViewById(R.id.restaurant_image);
        }

        @Override
        public void onClick(View view) {
            mListener.onClick(view, getAdapterPosition());
        }
    }

    @Override
    public NoteAdapter.RestaurantViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_note_list, parent, false);
        return new RestaurantViewHolder(v, mListener);
    }


    //Replace the contents of a view (invoked by the layout manager
    @Override
    public void onBindViewHolder(RestaurantViewHolder holder, int position){
        Note note = mNotes.get(position);
        holder.name.setText(note.getTopic());
        holder.cuisineType.setText(note.getSubTopic());
        holder.location.setText(note.getLevelOfDifficulty());
        holder.image.setImageResource(note.getImageID());
    }
    //Return the size of our dataset
    @Override
    public int getItemCount() {
        return mNotes.size();
    }
}


