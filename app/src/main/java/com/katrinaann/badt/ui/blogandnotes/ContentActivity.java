package com.katrinaann.badt.ui.blogandnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.katrinaann.badt.R;

import java.util.ArrayList;

public class ContentActivity extends AppCompatActivity {

    private TextView tvInformation;
    private TextView tvPage;
    private Button btnBack;
    private Button btnNext;
    private int page = 1;
    private String topic;
    private TextView tvTitle;
    private int maxPages;
    private ImageView ivPicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Intent intent = getIntent();
        topic = intent.getStringExtra("Topic");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        tvTitle = findViewById(R.id.tvTitle);
        tvInformation = findViewById(R.id.tvInformation);
        tvPage = findViewById(R.id.tvPage);
        btnBack = findViewById(R.id.btnBack);
        btnNext = findViewById(R.id.btnNext);
        ivPicture = findViewById(R.id.ivPicture);

        displayPage();

        tvPage.setText(Integer.toString(page));
        btnBack.setVisibility(View.INVISIBLE);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextPage(v);
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previousPage(v);
            }
        });

    }

    public void nextPage(View v) {
        if (page == 1) {
            btnBack.setVisibility(View.VISIBLE);
        }

        if (page == (maxPages - 1)) {
            btnNext.setText("TAKE QUIZ");
        }

        if (page != maxPages) { //If this page is not the last page, display next page
            page++;
            displayPage();
            tvPage.setText(Integer.toString(page));
        } else {//If this page is the last page, run the new activity/quiz
            //Run the quiz
        }
    }

    public void previousPage(View v) {
        if (page == 2) {
            btnBack.setVisibility(View.INVISIBLE);
        }

        if (page == maxPages) {
            btnNext.setText("NEXT");
        }

        page--;
        displayPage();
        tvPage.setText(Integer.toString(page));
    }

    //To adjust for recyclerview - Change the cases to positions on the recyclerview or leave it and make the recyclerview pass an argument that contains these topics (e.g. via textview)
    public void displayPage() {
        switch (topic) {
            case "Design Thinking":
                tvInformation.setText(Topic.getDesignThinking().get(page - 1).getInformation());
                maxPages = Topic.getDesignThinking().size();
                setTitle(Topic.getDesignThinking().get(page - 1).getTopic());
                tvTitle.setText(Topic.getDesignThinking().get(page - 1).getSubTopic());
                ivPicture.setImageResource(Topic.getDesignThinking().get(page - 1).getSupTopicImage());
                break;
            case "Agile SCRUM":
                tvInformation.setText(Topic.getAgileSCRUM().get(page - 1).getInformation());
                maxPages = Topic.getAgileSCRUM().size();
                setTitle(Topic.getAgileSCRUM().get(page - 1).getTopic());
                tvTitle.setText(Topic.getAgileSCRUM().get(page - 1).getSubTopic());
                ivPicture.setImageResource(Topic.getAgileSCRUM().get(page - 1).getSupTopicImage());
                break;
            case "Systems Development Lifecycle":
                tvInformation.setText(Topic.getSDLC().get(page - 1).getInformation());
                maxPages = Topic.getSDLC().size();
                setTitle(Topic.getSDLC().get(page - 1).getTopic());
                tvTitle.setText(Topic.getSDLC().get(page - 1).getSubTopic());
                ivPicture.setImageResource(Topic.getSDLC().get(page - 1).getSupTopicImage());
                break;
            case "Lean Startup":
                tvInformation.setText(Topic.getLeanStartup().get(page - 1).getInformation());
                maxPages = Topic.getLeanStartup().size();
                setTitle(Topic.getLeanStartup().get(page - 1).getTopic());
                tvTitle.setText(Topic.getLeanStartup().get(page - 1).getSubTopic());
                ivPicture.setImageResource(Topic.getLeanStartup().get(page - 1).getSupTopicImage());
                break;
            case "Systems Development Methodologies":
                tvInformation.setText(Topic.getSystemsDevelopmentMethodologies().get(page - 1).getInformation());
                maxPages = Topic.getSystemsDevelopmentMethodologies().size();
                setTitle(Topic.getSystemsDevelopmentMethodologies().get(page - 1).getTopic());
                tvTitle.setText(Topic.getSystemsDevelopmentMethodologies().get(page - 1).getSubTopic());
                ivPicture.setImageResource(Topic.getSystemsDevelopmentMethodologies().get(page - 1).getSupTopicImage());
                break;
            case "Introduction to Business Analysis":
                tvInformation.setText(Topic.getIntroductiontoBA().get(page - 1).getInformation());
                maxPages = Topic.getIntroductiontoBA().size();
                setTitle(Topic.getIntroductiontoBA().get(page - 1).getTopic());
                tvTitle.setText(Topic.getIntroductiontoBA().get(page - 1).getSubTopic());
                ivPicture.setImageResource(Topic.getIntroductiontoBA().get(page - 1).getSupTopicImage());
                break;
            case "Project Management":
                tvInformation.setText(Topic.getProjectManagement().get(page - 1).getInformation());
                maxPages = Topic.getProjectManagement().size();
                setTitle(Topic.getProjectManagement().get(page - 1).getTopic());
                tvTitle.setText(Topic.getProjectManagement().get(page - 1).getSubTopic());
                ivPicture.setImageResource(Topic.getProjectManagement().get(page - 1).getSupTopicImage());
                break;
            case "Requirements Gathering And Modelling":
                tvInformation.setText(Topic.getReqGatheringAndModelling().get(page - 1).getInformation());
                maxPages = Topic.getReqGatheringAndModelling().size();
                setTitle(Topic.getReqGatheringAndModelling().get(page - 1).getTopic());
                tvTitle.setText(Topic.getReqGatheringAndModelling().get(page - 1).getSubTopic());
                ivPicture.setImageResource(Topic.getReqGatheringAndModelling().get(page - 1).getSupTopicImage());
                break;
        }
    }
}
