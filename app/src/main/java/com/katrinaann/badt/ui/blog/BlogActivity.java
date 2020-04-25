package com.katrinaann.badt.ui.blog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.katrinaann.badt.R;
import com.katrinaann.badt.models.Blog;

public class BlogActivity extends AppCompatActivity {

    private TextView tvInformation;
    private TextView tvPage;
    private TextView tvTitle;
    private ImageView ivPicture;
    private Button btnBack;
    private Button btnNext;
    private int page = 1;
    private String topic;
    private int maxPages;
    private ConstraintLayout layout;
    public static final String TAG = "BlogActivity";
    private FloatingActionButton search;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Get intent from the 'previous screen' and pass in the topic that was selected
        Intent intent = getIntent();
        topic = intent.getStringExtra("Blog");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content2);

        //Match the variables in the fragment to the views in the layout file
        tvTitle = findViewById(R.id.tvTitle);
        tvInformation = findViewById(R.id.tvInformation);
        tvPage = findViewById(R.id.tvPage);
        btnBack = findViewById(R.id.btnBack);
        btnNext = findViewById(R.id.btnNext);
        ivPicture = findViewById(R.id.ivPicture);
        layout = findViewById(R.id.layoutBlog);
        search = findViewById(R.id.ivSearch);

        //Run the method to display the UI elements of the page based on the topic
        displayPage();

        //Set the page number to the number specified by the page integer variable
        tvPage.setText(Integer.toString(page));

        //Set the back button to invisble on default (will be set to visible later)
        btnBack.setVisibility(View.INVISIBLE);

        //Set listener for "Next Button" to let the user move to the next page
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextPage(v);
            }
        });

        //Set listener for "Back Button" to let user move to the previous page
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previousPage(v);
            }
        });

    }

    //Method to "move onto a next page" by updating the content in the view
    public void nextPage(View v) {

        //If the current page is 1, the next page will be 2 and the back button will be (and remain) visible
        if (page == 1) {
            btnBack.setVisibility(View.VISIBLE);
        }

        //If the current page is the last second last page, change the text of the "Next" button to "Take Quiz" when loading the next page
        if (page == (maxPages - 1)) {
            btnNext.setText("TAKE QUIZ");
        }

        //If the current page is not the last page, display the next page on click and increase the page number by 1
        if (page != maxPages) {
            page++;
            displayPage();
            tvPage.setText(Integer.toString(page));
        }

        //If the current page is the last page, run the new activity/quiz on click
        else {
            //Run the quiz
        }

        Log.d(TAG,"nextPage: Success");
    }

    //Method to "move onto the previous page" by updating the content in the view
    public void previousPage(View v) {
        //If the current page is 2, the previous page is 1 and the "Back" button should be invisible
        if (page == 2) {
            btnBack.setVisibility(View.INVISIBLE);
        }

        //If the current page is the last page, change the "Take Quiz" button back to "Next" when going back
        if (page == maxPages) {
            btnNext.setText("NEXT");
        }

        //Decrease the page number by 1 and display the page
        page--;
        displayPage();
        tvPage.setText(Integer.toString(page));


        Log.d(TAG,"previousPage: Success");
    }

    //Method to update the UI of the page based on what extra (String that represents topic) was passed in
    public void displayPage() {

        //Switch statement to determine different actions for different topics
        switch (topic) {

            //If the topic is design thinking, set the views to display design thinking
            case "Introduction to Business Analysis":
                tvInformation.setText(Blog.getIntroductiontoBA().get(page - 1).getInformation());
                maxPages = Blog.getIntroductiontoBA().size();
                setTitle(Blog.getIntroductiontoBA().get(page - 1).getTopic());
                tvTitle.setText(Blog.getIntroductiontoBA().get(page - 1).getSubTopic());
                ivPicture.setImageResource(Blog.getIntroductiontoBA().get(page - 1).getSupTopicImage());
                layout.setBackgroundColor(Color.parseColor("#ffc000"));
                break;
            case "Project Management":
                tvInformation.setText(Blog.getProjectManagement().get(page - 1).getInformation());
                maxPages = Blog.getProjectManagement().size();
                setTitle(Blog.getProjectManagement().get(page - 1).getTopic());
                tvTitle.setText(Blog.getProjectManagement().get(page - 1).getSubTopic());
                ivPicture.setImageResource(Blog.getProjectManagement().get(page - 1).getSupTopicImage());
                layout.setBackgroundColor(Color.parseColor("#DE0000"));
                break;
            case "Requirements Gathering And Modelling":
                tvInformation.setText(Blog.getReqGatheringAndModelling().get(page - 1).getInformation());
                maxPages = Blog.getReqGatheringAndModelling().size();
                setTitle(Blog.getReqGatheringAndModelling().get(page - 1).getTopic());
                tvTitle.setText(Blog.getReqGatheringAndModelling().get(page - 1).getSubTopic());
                ivPicture.setImageResource(Blog.getReqGatheringAndModelling().get(page - 1).getSupTopicImage());
                layout.setBackgroundColor(Color.parseColor("#FE622D"));
                break;
            case "Systems Development Life Cycle":
                tvInformation.setText(Blog.getSDLC().get(page - 1).getInformation());
                maxPages = Blog.getSDLC().size();
                setTitle(Blog.getSDLC().get(page - 1).getTopic());
                tvTitle.setText(Blog.getSDLC().get(page - 1).getSubTopic());
                ivPicture.setImageResource(Blog.getSDLC().get(page - 1).getSupTopicImage());
                layout.setBackgroundColor(Color.parseColor("#ffc000"));
                break;
            case "Systems Development Methodologies":
                tvInformation.setText(Blog.getSystemsDevelopmentMethodologies().get(page - 1).getInformation());
                maxPages = Blog.getSystemsDevelopmentMethodologies().size();
                setTitle(Blog.getSystemsDevelopmentMethodologies().get(page - 1).getTopic());
                tvTitle.setText(Blog.getSystemsDevelopmentMethodologies().get(page - 1).getSubTopic());
                ivPicture.setImageResource(Blog.getSystemsDevelopmentMethodologies().get(page - 1).getSupTopicImage());
                layout.setBackgroundColor(Color.parseColor("#00BD00"));
                break;
            case "Design Thinking":
                //Set the content body (tvInformation) to the information of the Design Thinking topic
                //get(page-1) is because page starts at 1 and index starts at 0.
                tvInformation.setText(Blog.getDesignThinking().get(page - 1).getInformation());
                //Set the maximum number of pages to the size of the array
                maxPages = Blog.getDesignThinking().size();
                //Set the title of the activity to the topic name
                setTitle(Blog.getDesignThinking().get(page - 1).getTopic());
                //Set the title in the title textview to the subtopic name
                tvTitle.setText(Blog.getDesignThinking().get(page - 1).getSubTopic());
                //Set the image to the subtopic image provided in the array
                ivPicture.setImageResource(Blog.getDesignThinking().get(page - 1).getSupTopicImage());
                //Set the colour of the background to equal to the topic colour
                layout.setBackgroundColor(Color.parseColor("#009CFE"));
                break;
            case "Agile SCRUM":
                tvInformation.setText(Blog.getAgileSCRUM().get(page - 1).getInformation());
                maxPages = Blog.getAgileSCRUM().size();
                setTitle(Blog.getAgileSCRUM().get(page - 1).getTopic());
                tvTitle.setText(Blog.getAgileSCRUM().get(page - 1).getSubTopic());
                ivPicture.setImageResource(Blog.getAgileSCRUM().get(page - 1).getSupTopicImage());
                layout.setBackgroundColor(Color.parseColor("#000084"));
                break;

            case "Lean Startup":
                tvInformation.setText(Blog.getLeanStartup().get(page - 1).getInformation());
                maxPages = Blog.getLeanStartup().size();
                setTitle(Blog.getLeanStartup().get(page - 1).getTopic());
                tvTitle.setText(Blog.getLeanStartup().get(page - 1).getSubTopic());
                ivPicture.setImageResource(Blog.getLeanStartup().get(page - 1).getSupTopicImage());
                layout.setBackgroundColor(Color.parseColor("#6D33A6"));
                break;

//            search.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    searchBlog(Blog.getTopic());
//
//                }
//            });
        }
//        public void searchBlog(String blog) {
//            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=" + blog ));
//            startActivity(intent);
//        }

        Log.d(TAG,"displayPage: Success");
    }
}


//TODO DELETE THIS
//        btnNote.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View v) {
//        newActivity2(v, "Note");
//        }
//        });
//        }
//
//public void newActivity(View v, String topic) {
//        Intent intent = new Intent(this, ContentActivity.class);
//        intent.putExtra("Topic",topic);
//        startActivity(intent);
//        }