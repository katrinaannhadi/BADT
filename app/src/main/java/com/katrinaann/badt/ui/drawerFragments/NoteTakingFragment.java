package com.katrinaann.badt.ui.drawerFragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.katrinaann.badt.R;
import com.katrinaann.badt.ui.notes.NoteListActivity;


public class NoteTakingFragment extends Fragment {

    private Button mButton;
    private View view;
    private Context context;
    private String currentUser;
    private String TAG = "Note Taking Fragment";
    private TextView username;

    public NoteTakingFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle bundle = getArguments();
        if (bundle != null) {
            currentUser = bundle.getString("currentUser");
        }
        Log.d(TAG, "User is: " + currentUser);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_note, container, false);

        mButton = view.findViewById(R.id.button);
        username = view.findViewById(R.id.username);

        Log.d(TAG, "User is: " + currentUser);

        username.setText(currentUser);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context c = view.getContext();
                Intent intent = new Intent(c, NoteListActivity.class);
                c.startActivity(intent);
            }
        });

        return view;

    }
}

