package com.katrinaann.badt.ui.blogandnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.katrinaann.badt.R;

public class TemporaryActivity extends AppCompatActivity {

    private Button btnDesignThinking;
    private Button btnAgile;
    private Button btnNote;
    private Button btnSdlc;
    private Button btnLeanStartup;
    private Button btnSysDevMethods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //getIntent();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temporary);

        btnDesignThinking = findViewById(R.id.btnDesignThinking);
        btnAgile = findViewById(R.id.btnAgile);
        btnNote = findViewById(R.id.btnNote);
        btnSdlc = findViewById(R.id.btnSdlc);
        btnLeanStartup = findViewById(R.id.btnLeanStartup);
        btnSysDevMethods = findViewById(R.id.btnSysDevMethods);

        btnDesignThinking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newActivity(v, "Design Thinking");
            }
        });

        btnAgile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newActivity(v, "Agile SCRUM");
            }
        });

        btnSdlc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newActivity(v, "Systems Development Lifecycle");
            }
        });

        btnLeanStartup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newActivity(v, "Lean Startup");
            }
        });

        btnSysDevMethods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newActivity(v, "Systems Development Methodologies");
            }
        });

        btnNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newActivity2(v, "Note");
            }
        });
    }

    public void newActivity(View v, String topic) {
        Intent intent = new Intent(this, ContentActivity.class);
        intent.putExtra("Topic",topic);
        startActivity(intent);
    }

    public void newActivity2(View v, String topic) {
        Intent intent = new Intent(this, NoteListActivity.class);
        intent.putExtra("Note",topic);
        startActivity(intent);
    }
}
