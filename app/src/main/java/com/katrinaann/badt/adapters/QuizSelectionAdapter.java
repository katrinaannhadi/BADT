package com.katrinaann.badt.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import com.katrinaann.badt.R;
import com.katrinaann.badt.models.Model;
import com.katrinaann.badt.ui.drawerFragments.QuizSelectionFragment;
import com.katrinaann.badt.ui.quiz.QuizActivity;

import java.util.List;

public class QuizSelectionAdapter extends PagerAdapter {
    //  Initialisation
    private List<Model> models;
    private LayoutInflater layoutInflater;
    private QuizSelectionFragment context;

    // Creating the adapter
    public QuizSelectionAdapter(List<Model> models, QuizSelectionFragment context) {
        this.models = models;
        this.context = context;
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layoutInflater = LayoutInflater.from(context.getActivity());
        View view = layoutInflater.inflate(R.layout.item_categories, container, false);

        // Initialising and connecting UI elements and variables which will be accessed by onclicklisteners.
        ImageView imageView = view.findViewById(R.id.image);
        TextView title = view.findViewById(R.id.title);

        imageView.setImageResource(models.get(position).getImage());
        title.setText(models.get(position).getTitle());
        // sets on click listener to start next activity - with a bundle of information
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context.getActivity(), QuizActivity.class);
                intent.putExtra("quizIndex", models.get(position).getId());
                intent.putExtra("currentUser", models.get(position).getUser());
                context.startActivity(intent);
            }
        });

        container.addView(view, 0);
        return view;
    }
    //when activity is complete - remove the view
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
