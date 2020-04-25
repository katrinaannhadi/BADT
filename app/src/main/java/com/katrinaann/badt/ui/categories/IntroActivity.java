package com.katrinaann.badt.ui.categories;

import android.animation.ArgbEvaluator;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.katrinaann.badt.R;
import com.katrinaann.badt.ui.home.HomeActivity;
import com.katrinaann.badt.ui.signin.SignInActivity;

import java.util.ArrayList;
import java.util.List;

public class IntroActivity extends AppCompatActivity {

    ViewPager viewPager;
    CategoryAdapter mCategoryAdapter;
    List<Category> mCategories;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Saving a boolean variable in the sharedPreferences of the Activity with initial value as true
        // If it is the first time the app is run, pass the intent to the introActivity to be run, and set the boolean value of the variable to be false
        Boolean isFirstRun = getSharedPreferences("PREFERENCE", MODE_PRIVATE)
                .getBoolean("isFirstRun", true);

        if (isFirstRun) {
            // Show intro activity
            //TODO CHANGE BACK TO SIGN IN ACTIVITY
            startActivity(new Intent(IntroActivity.this, HomeActivity.class));
            Toast.makeText(IntroActivity.this, "Run only once", Toast.LENGTH_LONG)
                    .show();
        }
        // Otherwise show sign in activity
        getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit()
                .putBoolean("isFirstRun", false).commit();

        //setting values to the intro activity array list
        mCategories = new ArrayList<>();
        mCategories.add(new Category(R.drawable.ic_blog, "Learn", "Enhance your learning on different business analysis frameworks and methodologies - systems development lifecycle, agile scrum, design thinking and lean"));
        mCategories.add(new Category(R.drawable.ic_flashcard, "Flashcards", "Flashcards help you engage in active recall which teaches your brain to remember a term, concept or process without context clues, forming stronger neuron connections and making it more likely that you will remember the information in the future."));
        mCategories.add(new Category(R.drawable.ic_quiz, "Quiz", "According to Dr. Henry L. Roediger III, a psychologist, “testing not only measures knowledge but changes it in the direction of more certainty, not less.”."));
        mCategories.add(new Category(R.drawable.ic_video, "Videos", "Visual learners? We got you. Watch the materials being taught through video explanations from reputed sources. ."));


        mCategoryAdapter = new CategoryAdapter(mCategories, this);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(mCategoryAdapter);
        viewPager.setPadding(130, 0, 130, 0);

        // To change the background colours
        Integer[] colors_temp = {
                getResources().getColor(R.color.owl_pink_500),
                getResources().getColor(R.color.rainbow6),
                getResources().getColor(R.color.rainbow2),
                getResources().getColor(R.color.rainbow7)
        };
        // TODO

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
