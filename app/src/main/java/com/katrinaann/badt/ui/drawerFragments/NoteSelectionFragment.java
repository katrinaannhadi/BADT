package com.katrinaann.badt.ui.drawerFragments;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.katrinaann.badt.R;
import com.katrinaann.badt.models.Model;

import java.util.ArrayList;
import java.util.List;

public class NoteSelectionFragment extends Fragment {

    private View view;
    private Context context;

    ViewPager viewPager;
    NoteSelectionAdapter mTopicAdapter;
    List<Model> mTopics;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();
    private static final String TAG = " 2 ARTICLE SELECTION ";


    public NoteSelectionFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_article_selection_viewpager, container, false);
        context = view.getContext();

        mTopics = new ArrayList<>();
        mTopics.add(new Model(R.drawable.ic_scrum, "Introduction to Business Analysis", "Finance shouldn't be hard! Read on for hot tips and trendy articles.", 1));
        mTopics.add(new Model(R.drawable.ic_scrum, "Project Management", "Have some fun and test yourself with our quiz!", 2));
        mTopics.add(new Model(R.drawable.ic_scrum, "Requirements Gathering And Modelling", "We got your back. Sit back and watch informational videos on finance curated by the team!", 3));
        mTopics.add(new Model(R.drawable.ic_scrum, "Systems Development Life Cycle", "We got your back. Sit back and watch informational videos on finance curated by the team!", 4));
        mTopics.add(new Model(R.drawable.ic_scrum, "Systems Development Methodologies", "We got your back. Sit back and watch informational videos on finance curated by the team!", 5));
        mTopics.add(new Model(R.drawable.ic_scrum, "Design Thinking", "We got your back. Sit back and watch informational videos on finance curated by the team!", 6));
        mTopics.add(new Model(R.drawable.ic_scrum, "Agile SCRUM", "We got your back. Sit back and watch informational videos on finance curated by the team!", 7));
        mTopics.add(new Model(R.drawable.ic_scrum, "Lean Start Up", "We got your back. Sit back and watch informational videos on finance curated by the team!", 8));
        mTopicAdapter = new NoteSelectionAdapter(mTopics, this);

        viewPager = view.findViewById(R.id.viewPager);
        viewPager.setAdapter(mTopicAdapter);
        viewPager.setPadding(130, 0, 130, 0);

        Integer[] colors_temp = {
                getResources().getColor(R.color.rainbow8),
                getResources().getColor(R.color.rainbow1),
                getResources().getColor(R.color.rainbow2),
                getResources().getColor(R.color.rainbow3),
                getResources().getColor(R.color.rainbow4),
                getResources().getColor(R.color.rainbow5),
                getResources().getColor(R.color.rainbow6),
                getResources().getColor(R.color.rainbow7),


        };

        colors = colors_temp;


        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                if (position < (mTopicAdapter.getCount() - 1) && position < (colors.length - 1)) {
                    viewPager.setBackgroundColor(

                            (Integer) argbEvaluator.evaluate(
                                    positionOffset,
                                    colors[position],
                                    colors[position + 1]
                            )
                    );
                } else {
                    viewPager.setBackgroundColor(colors[colors.length - 1]);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        return view;
    }
}




