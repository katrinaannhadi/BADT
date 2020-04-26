package com.katrinaann.badt.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.katrinaann.badt.R;

public class HomeFragment extends Fragment {


    public static final String EXTRA_MESSAGE = "com.katrinaann.top10restaurants.MESSAGE";
    //    private HomeViewModel homeViewModel;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private HomeFragmentListener listener;
    private String TAG = "HomeFragment";
    private String currentUser;

    public interface HomeFragmentListener {
        void onHomeInputSent(int position);
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

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);


        return root;
    }
}


