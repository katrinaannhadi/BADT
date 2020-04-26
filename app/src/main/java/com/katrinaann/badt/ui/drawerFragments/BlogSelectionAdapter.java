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
import com.katrinaann.badt.ui.blog.BlogActivity;

import java.util.List;

public class BlogSelectionAdapter extends PagerAdapter {

    private List<Model> models;
    private LayoutInflater layoutInflater;
    private BlogSelectionFragment context;

    public BlogSelectionAdapter(List<Model> models, BlogSelectionFragment context) {
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

        imageView.setImageResource(models.get(position).getImage());
        title.setText(models.get(position).getTitle());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context.getActivity(), BlogActivity.class);
                intent.putExtra("Blog", models.get(position).getTitle());
                intent.putExtra("currentUser", models.get(position).getUser());
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
