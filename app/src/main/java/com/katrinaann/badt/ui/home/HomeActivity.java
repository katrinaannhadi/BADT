package com.katrinaann.badt.ui.home;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;
import com.katrinaann.badt.R;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class HomeActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.katrinaann.badt.MESSAGE";
    private AppBarConfiguration mAppBarConfiguration;

    private String currentUser = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Configuration config = getResources().getConfiguration();


//        if (config.orientation == Configuration.ORIENTATION_LANDSCAPE) {

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_note,R.id.nav_quiz,R.id.nav_video)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        // Receiving the username - if it exists.
        Intent intent = getIntent();
        if (intent == null) {
            // Nothing
        } else {
            currentUser = intent.getStringExtra("currentUser");
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    // Method to get the position from home fragment recycler view and sending argument to note detail fragment
//    public void addNotePosition(int position) {
//        FragmentManager manager = getSupportFragmentManager();
//        FragmentTransaction transaction = manager.beginTransaction();
//        NoteDetailFragment detailFragment = new NoteDetailFragment();
//        Bundle arguments = new Bundle();
//        arguments.putInt("position", position);
//        detailFragment.setArguments(arguments);
//        transaction.add(R.id.detail_container, detailFragment);
//        transaction.commit();

//    }
    // Disabling the back button (for some Android devices).
    @Override
    public void onBackPressed() {
    }

}