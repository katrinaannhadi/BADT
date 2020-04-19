package com.katrinaann.badt;

import android.animation.ArgbEvaluator;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.katrinaann.badt.ui.categories.CategoryAdapter;
import com.katrinaann.badt.ui.categories.Category;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    CategoryAdapter mCategoryAdapter;
    List<Category> mCategories;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCategories = new ArrayList<>();
        mCategories.add(new Category(R.drawable.ic_blog, "Learn", "Enhance your learning on different business analysis frameworks and methodologies - systems development lifecycle, agile scrum, design thinking and lean"));
        mCategories.add(new Category(R.drawable.ic_flashcard, "Flashcards", "Flashcards help you engage in active recall which teaches your brain to remember a term, concept or process without context clues, forming stronger neuron connections and making it more likely that you will remember the information in the future."));
        mCategories.add(new Category(R.drawable.ic_quiz, "Quiz", "According to Dr. Henry L. Roediger III, a psychologist, “testing not only measures knowledge but changes it in the direction of more certainty, not less.”."));
        mCategories.add(new Category(R.drawable.ic_video, "Videos", "Visual learners? We got you. Watch the materials being taught through video explanations from reputed sources. ."));

        mCategoryAdapter = new CategoryAdapter(mCategories, this);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(mCategoryAdapter);
        viewPager.setPadding(130, 0, 130, 0);

        //temp to change the background colour of the viewpager for the categories blurb
        Integer[] colors_temp = {
                getResources().getColor(R.color.owl_pink_500),
                getResources().getColor(R.color.owl_blue_700),
                getResources().getColor(R.color.owl_yellow_400),
                getResources().getColor(R.color.owl_pink_500)
        };
        //setting these colors
        colors = colors_temp;

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                if (position < (mCategoryAdapter.getCount() -1) && position < (colors.length - 1)) {
                    viewPager.setBackgroundColor(
                            //add one to the color position to iterate through colours
                            (Integer) argbEvaluator.evaluate(
                                    positionOffset,
                                    colors[position],
                                    colors[position + 1]
                            )
                    );
                }

                else {
                    //otherwise just set to last colour
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

    }

}
