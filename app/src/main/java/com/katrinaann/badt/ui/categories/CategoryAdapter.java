package com.katrinaann.badt.ui.categories;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.katrinaann.badt.R;
import com.katrinaann.badt.ui.home.HomeActivity;

import java.util.List;

public class CategoryAdapter extends PagerAdapter {

    private List<Category> mCategories;
    private LayoutInflater layoutInflater;
    private Context context;

    public CategoryAdapter(List<Category> categories, Context context) {
        this.mCategories = categories;
        this.context = context;
    }

    @Override
    public int getCount() {
        return mCategories.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.categories_item, container, false);

        ImageView imageView;
        TextView title, desc;

        imageView = view.findViewById(R.id.image);
        title = view.findViewById(R.id.title);
        desc = view.findViewById(R.id.desc);

        imageView.setImageResource(mCategories.get(position).getImage());
        title.setText(mCategories.get(position).getTitle());
        desc.setText(mCategories.get(position).getDesc());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, HomeActivity.class);
//                intent.putExtra("param", mCategories.get(position).getTitle());
                context.startActivity(intent);
                // finish();
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
