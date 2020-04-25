package com.katrinaann.badt.ui.drawerFragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.katrinaann.badt.R;
import com.katrinaann.badt.ui.notes.NoteActivity;
import com.katrinaann.badt.ui.notes.NoteListActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NoteTakingFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NoteTakingFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Button mButton;
    private View view;
    private Context context;

    public NoteTakingFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NoteTakingFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NoteTakingFragment newInstance(String param1, String param2) {
        NoteTakingFragment fragment = new NoteTakingFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_note_taking, container, false);

        mButton = view.findViewById(R.id.button);


        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context c = view.getContext();
                Intent intent = new Intent(c, NoteActivity.class);
                c.startActivity(intent);
                //TODO JEFF TO CHECK -
                // Intent intent = new Intent(this, NoteListActivity.class);
                //        intent.putExtra("Note",topic);
                //        startActivity(intent);
            }
        });



        return view;

    }
}

