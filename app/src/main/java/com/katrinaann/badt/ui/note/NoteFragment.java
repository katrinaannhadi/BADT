package com.katrinaann.badt.ui.note;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.katrinaann.badt.R;
import com.katrinaann.badt.ui.home.HomeActivity;
import com.katrinaann.badt.ui.home.NoteAdapter;

public class NoteFragment extends Fragment {


    public static final String EXTRA_MESSAGE = "com.katrinaann.top10restaurants.MESSAGE";
    //    private HomeViewModel homeViewModel;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_note, container, false);


        mRecyclerView = root.findViewById(R.id.rvList);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        NoteAdapter.RecyclerViewClickListener listener = new NoteAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                HomeActivity home = (HomeActivity) getActivity();
                home.addNotePosition(position);
            }
        };
        mAdapter = new NoteAdapter(Note.getNote(), listener);
        mRecyclerView.setAdapter(mAdapter);

        return root;
    }

//    private void launchDetailActivity(int position) {
//        IntroActivity mn = (IntroActivity) getActivity();
//        mn.addNotePosition(position);
//        Intent intent = new Intent(this.getActivity(), NoteDetailActivity.class);
//        intent.putExtra(EXTRA_MESSAGE, position);
//        startActivity(intent);
//    }
}