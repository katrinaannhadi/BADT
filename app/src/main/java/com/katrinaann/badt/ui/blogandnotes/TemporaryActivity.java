package com.katrinaann.badt.ui.blogandnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.katrinaann.badt.R;

public class TemporaryActivity extends AppCompatActivity {

    private Button tvDesignThinking;
    private Button tvAgile;
    private Button tvNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //getIntent();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temporary);

        tvDesignThinking = findViewById(R.id.tvDesignThinking);
        tvAgile = findViewById(R.id.tvAgile);
        tvNote = findViewById(R.id.tvNote);

        tvDesignThinking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newActivity(v, "Design Thinking");
            }
        });

        tvAgile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newActivity(v, "Agile SCRUM");
            }
        });

        tvNote.setOnClickListener(new View.OnClickListener() {
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
