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
    //private ArrayList<Topic> temp;
    private Spinner mSpinner;
    private int maxPages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Intent intent = getIntent();
        topic = intent.getStringExtra("Topic");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        tvInformation = findViewById(R.id.tvInformation);
        tvPage = findViewById(R.id.tvPage);
        btnBack = findViewById(R.id.btnBack);
        btnNext = findViewById(R.id.btnNext);
        mSpinner = (Spinner) findViewById(R.id.mSpinner);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.BATopics, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        mSpinner.setAdapter(adapter);

        //Implement listener for when an item is selected: https://www.youtube.com/watch?v=mrcrFY-5c-c

        /* mSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    //Do something
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        }); */

        /*
        mSpinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    displayPage("Design Thinking");
                }
                else if (position == 1) {
                    displayPage("Agile Methodology");
                }
            }
        }); */


        /* for (int i = 0; i < Topic.getTopics().size(); i++) {
            if (Topic.getTopics().get(i).getTopic().equals(topic)) {
                temp = Topic.getTopics().get(i).getData();
            }
        } */

        /*switch (topic) {
            case "Design Thinking" : tvInformation.setText(DesignThinking.getDesignThinking().get(page-1).getInformation());
            break;
            case "Agile Methodology" : tvInformation.setText("Agile Methodology");
            break;
            } */

        //tvInformation.setText(topic);

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

        //Spannable String example for highlighting - https://www.dev2qa.com/android-spannablestring-example/
        /*SpannableString spannableStr = new SpannableString("Hello SpannableString Example.");
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(Color.GREEN);
        spannableStr.setSpan(backgroundColorSpan, 15, 30, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tvInformation.setText(spannableStr); */

    }

    public void nextPage(View v) {
        if (page == 1) {
            btnBack.setVisibility(View.VISIBLE);
        }

        if (page == (maxPages - 1)) {
            btnNext.setText("TAKE QUIZ");
        }

        if (page != maxPages) { //If this page is not the last page, display next page
            //tvInformation.setText("Next Page");
            page++;
            //tvInformation.setText(DesignThinking.getDesignThinking().get(page-1).getInformation());
            displayPage();
            //tvInformation.setText(temp);
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
        //tvInformation.setText("Previous Page");
        //tvInformation.setText(DesignThinking.getDesignThinking().get(page-1).getInformation());
        displayPage();
        tvPage.setText(Integer.toString(page));
    }

    public void displayPage() {
        switch (topic) {
            case "Design Thinking":
                //tvInformation.setText(DesignThinking.getDesignThinking().get(page - 1).getInformation());
                tvInformation.setText(Topic.getDesignThinking().get(page - 1).getInformation());
                maxPages = Topic.getDesignThinking().size();
                setTitle(Topic.getDesignThinking().get(page - 1).getTopic() + " - " + Topic.getDesignThinking().get(page - 1).getSubTopic());
                break;
            case "Agile SCRUM":
                //tvInformation.setText("Agile Methodology");
                tvInformation.setText(Topic.getAgileSCRUM().get(page - 1).getInformation());
                maxPages = Topic.getAgileSCRUM().size();
                setTitle(Topic.getAgileSCRUM().get(page - 1).getTopic() + " - " + Topic.getAgileSCRUM().get(page - 1).getSubTopic());
                break;
            case "Systems Development Life Cycle":
                tvInformation.setText(Topic.getSDLC().get(page - 1).getInformation());
                maxPages = Topic.getSDLC().size();
                setTitle(Topic.getSDLC().get(page - 1).getTopic() + " - " + Topic.getSDLC().get(page - 1).getSubTopic());
                break;
            case "Lean Startup":
                tvInformation.setText(Topic.getLeanStartup().get(page - 1).getInformation());
                maxPages = Topic.getLeanStartup().size();
                setTitle(Topic.getLeanStartup().get(page - 1).getTopic() + " - " + Topic.getLeanStartup().get(page - 1).getSubTopic());
                break;
        }
    }

    /*
    public void displayPage(String topic) {
        switch (topic) {
            case "Design Thinking":
                //tvInformation.setText(DesignThinking.getDesignThinking().get(page - 1).getInformation());
                tvInformation.setText(Topic.getDesignThinking().get(page - 1).getInformation());
                maxPages = Topic.getDesignThinking().size();
                setTitle(Topic.getDesignThinking().get(page - 1).getTopic() + " - " + Topic.getDesignThinking().get(page - 1).getSubTopic());
                break;
            case "Agile SCRUM":
                //tvInformation.setText("Agile Methodology");
                tvInformation.setText(Topic.getAgileSCRUM().get(page - 1).getInformation());
                maxPages = Topic.getAgileSCRUM().size();
                setTitle(Topic.getAgileSCRUM().get(page - 1).getTopic() + " - " + Topic.getAgileSCRUM().get(page - 1).getSubTopic());
                break;
        }
    } */
}
