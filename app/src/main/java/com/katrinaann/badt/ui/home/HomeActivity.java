package com.katrinaann.badt.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;
import com.katrinaann.badt.R;
import com.katrinaann.badt.ui.drawerFragments.FlashcardSelectionFragment;
import com.katrinaann.badt.ui.drawerFragments.BlogSelectionFragment;
import com.katrinaann.badt.ui.drawerFragments.NoteTakingFragment;
import com.katrinaann.badt.ui.drawerFragments.QuizSelectionFragment;
import com.katrinaann.badt.ui.video.VideoFragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    public static final String EXTRA_MESSAGE = "com.katrinaann.badt.MESSAGE";
    private AppBarConfiguration mAppBarConfiguration;
    private String TAG = "HomeActivity";

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private NavigationView mNavigationView;

    private String currentUser = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


            // Receiving the username - if it exists.
            Intent intent = getIntent();
            if (intent == null) {
                // Nothing
            } else {
                currentUser = intent.getStringExtra("currentUser");
            }
            Log.d(TAG, "User is: " + currentUser);

            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

            mDrawerLayout = findViewById(R.id.drawer_layout);
            NavigationView mNavigationView = findViewById(R.id.nav_view);
            mNavigationView.setNavigationItemSelectedListener(this);

            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar,
                    R.string.navigation_drawer_open, R.string.navigation_drawer_close);
            mDrawerLayout.addDrawerListener(toggle);
            toggle.syncState();

            if (savedInstanceState == null) {
                getSupportFragmentManager().beginTransaction().replace(R.id.detail_container,
                        new HomeFragment()).commit();
                mNavigationView.setCheckedItem(R.id.nav_home);
            }
        }

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.nav_home:
                    HomeFragment homeFragment = new HomeFragment();
                    Bundle homeBundle = new Bundle();
                    homeBundle.putString("currentUser", currentUser);
                    homeFragment.setArguments(homeBundle);
                    getSupportFragmentManager()
                            .beginTransaction()
                            .add(R.id.detail_container, homeFragment)
                            .commit();
                    break;
                case R.id.nav_blog:
                    BlogSelectionFragment blogSelectionFragment = new BlogSelectionFragment();
                    Bundle blogBundle = new Bundle();
                    blogBundle.putString("currentUser", currentUser);
                    blogSelectionFragment.setArguments(blogBundle);
                    getSupportFragmentManager()
                            .beginTransaction()
                            .add(R.id.detail_container, blogSelectionFragment)
                            .commit();
                    break;
                case R.id.nav_note:
                    NoteTakingFragment noteTakingFragment = new NoteTakingFragment();
                    Bundle noteTakingBundle = new Bundle();
                    noteTakingBundle.putString("currentUser", currentUser);
                    noteTakingFragment.setArguments(noteTakingBundle);
                    getSupportFragmentManager()
                            .beginTransaction()
                            .add(R.id.detail_container, noteTakingFragment)
                            .commit();

                    break;
                case R.id.nav_flashcard:
                    FlashcardSelectionFragment flashcardFragment = new FlashcardSelectionFragment();
                    Bundle flashcardBundle = new Bundle();
                    flashcardBundle.putString("currentUser", currentUser);
                    flashcardFragment.setArguments(flashcardBundle);
                    getSupportFragmentManager()
                            .beginTransaction()
                            .add(R.id.detail_container, flashcardFragment)
                            .commit();

                    break;
                case R.id.nav_quiz:
                    QuizSelectionFragment fragment = new QuizSelectionFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("currentUser", currentUser);
                    fragment.setArguments(bundle);
                    getSupportFragmentManager()
                            .beginTransaction()
                            .add(R.id.detail_container, fragment)
                            .commit();
                    break;
                case R.id.nav_video:
                    VideoFragment videoFragment = new VideoFragment();
                    Bundle videoBundle = new Bundle();
                    videoBundle.putString("currentUser", currentUser);
                    videoFragment.setArguments(videoBundle);
                    getSupportFragmentManager()
                            .beginTransaction()
                            .add(R.id.detail_container, videoFragment)
                            .commit();
                    break;
            }

            mDrawerLayout.closeDrawer(GravityCompat.START);
            return true;
        }

        @Override
        public void onBackPressed() {
            if (mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
                mDrawerLayout.closeDrawer(GravityCompat.START);
            } else {
                super.onBackPressed();
            }
        }
        private void sentUsername(){

        }



//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                int id = item.getItemId();
//                switch (id) {
//                    case R.id.nav_home:
//                        Toast.makeText(HomeActivity.this, "Learn", Toast.LENGTH_SHORT).show();
//
//                        break;
//                    case R.id.nav_note:
//                        Toast.makeText(HomeActivity.this, "Note", Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.nav_quiz:
//                        Toast.makeText(HomeActivity.this, "Quiz", Toast.LENGTH_SHORT).show();
//                        Intent intent = new Intent(HomeActivity.this, QuizSelectionFragment.class);
//                        startActivity(intent);
//                        break;
//                    case R.id.nav_flashcard:
//                        Toast.makeText(HomeActivity.this, "Flashcard", Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.nav_video:
//                        Toast.makeText(HomeActivity.this, "Video", Toast.LENGTH_SHORT).show();
//                        break;
//
//                    default:
//                        return true;
//                }
//
//
//                return true;
//
//            }
//        });

    }



////
////        // Passing each menu ID as a set of Ids because each
////        // menu should be considered as top level destinations.
////        mAppBarConfiguration = new AppBarConfiguration.Builder(
////                R.id.nav_home, R.id.nav_note,R.id.nav_quiz,R.id.nav_flashcard, R.id.nav_video)
////                .setDrawerLayout(drawer)
////                .build();
////
////        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
////        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
////        NavigationUI.setupWithNavController(navigationView, navController);
//

//
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onSupportNavigateUp() {
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
//                || super.onSupportNavigateUp();
//    }
//
//    // Method to get the position from home fragment recycler view and sending argument to note detail fragment
////    public void addNotePosition(int position) {
////        FragmentManager manager = getSupportFragmentManager();
////        FragmentTransaction transaction = manager.beginTransaction();
////        NoteDetailFragment detailFragment = new NoteDetailFragment();
////        Bundle arguments = new Bundle();
////        arguments.putInt("position", position);
////        detailFragment.setArguments(arguments);
////        transaction.add(R.id.detail_container, detailFragment);
////        transaction.commit();
//
////    }
//    // Disabling the back button (for some Android devices).
//    @Override
//    public void onBackPressed() {
//    }
//
//}