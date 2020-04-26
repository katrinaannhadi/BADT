package com.katrinaann.badt.ui.drawerFragments;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.katrinaann.badt.R;
import com.katrinaann.badt.models.Model;

import java.util.ArrayList;
import java.util.List;

public class BlogSelectionFragment extends Fragment {

    private View view;
    private Context context;

    ViewPager viewPager;
    BlogSelectionAdapter mTopicAdapter;
    List<Model> mTopics;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();
    private String TAG = "Blog Selection Fragment";
    private String currentUser;


    public BlogSelectionFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null) {
            currentUser = bundle.getString("currentUser");
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_article_selection_viewpager, container, false);
        context = view.getContext();

        Log.d(TAG, "User is: " + currentUser);

        // Setting the titles and images for the view pager
        mTopics = new ArrayList<>();
        mTopics.add(new Model(R.drawable.ic_introductiontobusinessanalysis, "Introduction to Business Analysis", 1, currentUser));
        mTopics.add(new Model(R.drawable.ic_projectmanagement, "Project Management", 2, currentUser));
        mTopics.add(new Model(R.drawable.ic_requirementsgatheringandmodelling, "Requirements Determination",3, currentUser));
        mTopics.add(new Model(R.drawable.ic_sdlc, "Systems Development Life Cycle", 4, currentUser));
        mTopics.add(new Model(R.drawable.ic_systemsdevelopmentmethodologies, "Systems Development Methodologies",5, currentUser));
        mTopics.add(new Model(R.drawable.ic_designthinkinglist,"Design Thinking", 6, currentUser));
        mTopics.add(new Model(R.drawable.ic_agile, "Agile SCRUM", 7, currentUser));
        mTopics.add(new Model(R.drawable.ic_leanstartup, "Lean Start Up",  8, currentUser));
        mTopicAdapter = new BlogSelectionAdapter(mTopics, this);

        viewPager = view.findViewById(R.id.viewPager);
        viewPager.setAdapter(mTopicAdapter);
        viewPager.setPadding(130, 0, 130, 0);

        // Setting the color of the background for each topic
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

        //Changes the colour with the page change
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




