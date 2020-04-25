package com.katrinaann.badt.ui.drawerFragments;

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
import com.katrinaann.badt.ui.blogandnotes.ContentActivity;
import com.katrinaann.badt.ui.flashcards.FlashcardActivity;

import java.util.List;

public class NoteSelectionAdapter extends PagerAdapter {

    private List<Model> models;
    private LayoutInflater layoutInflater;
    private NoteSelectionFragment context;

    public NoteSelectionAdapter(List<Model> models, NoteSelectionFragment context) {
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

        ImageView imageView;
        final TextView title, desc;

        imageView = view.findViewById(R.id.image);
        title = view.findViewById(R.id.title);
        desc = view.findViewById(R.id.desc);

        imageView.setImageResource(models.get(position).getImage());
        title.setText(models.get(position).getTitle());
        desc.setText(models.get(position).getDesc());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context.getActivity(), ContentActivity.class);
                intent.putExtra("Topic", models.get(position).getTitle());
                context.startActivity(intent);
//                finish();
            }
        });

        container.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
