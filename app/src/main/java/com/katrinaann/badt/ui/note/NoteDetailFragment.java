package com.katrinaann.badt.ui.note;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.katrinaann.badt.MainActivity;
import com.katrinaann.badt.R;

public class NoteDetailFragment extends Fragment {

    private Note mNote;

    public NoteDetailFragment(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_note_detail, container, false);
        int position = 0;


        //Initialising views
        TextView name = v.findViewById(R.id.restaurant_name);
        TextView cuisineType = v.findViewById(R.id.tvCuisineTypeField);
        TextView location = v.findViewById(R.id.tvLocationField);
        TextView rating = v.findViewById(R.id.tvRatingField);
        TextView about = v.findViewById(R.id.tvAboutField);
        ImageView image = v.findViewById(R.id.imageView);
        ImageView search = v.findViewById(R.id.ivSearch);

//        Intent intent = getActivity().getIntent();
//        position = intent.getIntExtra(MainActivity.EXTRA_MESSAGE,0);

        Bundle bundle = getArguments();
        if (bundle != null){
            mNote = Note.getRestaurant().get(getArguments().getInt("position"));
//            mNote = Note.getRestaurant().get(position);

            name.setText(mNote.getName());
            cuisineType.setText((mNote.getCuisineType()));
            location.setText(mNote.getLocation());
            rating.setText(String.valueOf(mNote.getRating()));
            about.setText(String.valueOf(mNote.getAbout()));
            image.setImageResource(mNote.getImageID());

        }


        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchRestaurant(mNote.getName(), mNote.getLocation());
            }

        });
        return v;
    }
    private void searchRestaurant(String name, String location){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=" + name + " " + location));
        startActivity(intent);
        
    }
    private void setImage(String url, final View view){

    }
}
