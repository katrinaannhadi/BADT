package com.katrinaann.badt.fragments;


import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.katrinaann.badt.MainActivity;

/**
 * The Default Fragment will be used to set up common behavior features common to all fragments.
 * The default fragment will also enforce us to implement common methods necessary to all fragments.
 * The default Fragment is also used so we avoid errors when trying to inflate a fragment that has already been inflated.
 * All our other Fragments will extend DefaultFragment
 */
public abstract class DefaultFragment extends Fragment implements FragmentManager.OnBackStackChangedListener {

    private static String LOG_TAG = DefaultFragment.class.getCanonicalName();
    private MainActivity mainActivity;

    @Override
    public void onInflate(Activity activity, AttributeSet attrs, Bundle savedInstanceState) {

        FragmentManager fm = getFragmentManager();
        if (fm != null) {
            fm.beginTransaction().remove(this).commit();
        }
        super.onInflate(activity, attrs, savedInstanceState);
    }


    /**
     * Called to have the fragment instantiate its user interface view.
     * This is optional, and non-graphical fragments can return null (which
     * is the default implementation).  This will be called between
     * {@link #onCreate(android.os.Bundle)} and {@link #onActivityCreated(android.os.Bundle)}.
     * <p/>
     * <p>If you return a View from here, you will later be called in
     * {@link #onDestroyView} when the view is being released.
     *
     * @param inflater           The LayoutInflater object that can be used to inflate
     *                           any views in the fragment,
     * @param container          If non-null, this is the parent view that the fragment's
     *                           UI should be attached to.  The fragment should not add the view itself,
     *                           but this can be used to generate the LayoutParams of the view.
     * @param savedInstanceState If non-null, this fragment is being re-constructed
     *                           from a previous saved state as given here.
     * @return Return the View for the fragment's UI, or null.
     */
    @Override
    public abstract View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState);

    /**
     * Called immediately after {@link #onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)}
     * has returned, but before any saved state has been restored in to the view.
     * This gives subclasses a chance to initialize themselves once
     * they know their view hierarchy has been completely created.  The fragment's
     * view hierarchy is not however attached to its parent at this point.
     *
     * @param view               The View returned by {@link #onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)}.
     * @param savedInstanceState If non-null, this fragment is being re-constructed
     */
    @Override
    public abstract void onViewCreated(View view, Bundle savedInstanceState);

    /**
     *
     * This method will only be called once when the retained
     * Fragment is first created.
     *
     * @param savedInstanceState
     *         If the fragment is being re-created from
     *         a previous saved state, this is the state.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setHasOptionsMenu(true);
        mainActivity = (MainActivity) getActivity();
        getFragmentManager().addOnBackStackChangedListener(this);
        // Retain this fragment across configuration changes.
        setRetainInstance(true);
        shouldDisplayHomeUp();
    }


    /**
     * @param menu
     *         The options menu in which you place your items.
     * @param inflater
     *         The inflater for this menu
     * @see #setHasOptionsMenu
     * @see #onPrepareOptionsMenu
     * @see #onOptionsItemSelected
     */
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
    }

    /**
     *
     * @param item
     *         The menu item that was selected.
     * @return boolean Return false to allow normal menu processing to
     * proceed, true to consume it here.
     *
     * @see #onCreateOptionsMenu
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(shouldDisplayHomeUp()) {
            switch (item.getItemId()) {
                case android.R.id.home:
                    mainActivity.onBackPressed();
                    return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackStackChanged() {
        shouldDisplayHomeUp();
    }

    /**
     * Handles if we should display the Drawer hamburger icon or if we should display the back navigation button.
     */
    public boolean shouldDisplayHomeUp() {
        //Enable Up button only  if there are entries in the back stack
        boolean canback = false;
        try {
            canback = getFragmentManager().getBackStackEntryCount() > 0;
        } catch (Exception ex) {};
        if (canback) {
            mainActivity.getDrawerToggle().setDrawerIndicatorEnabled(false);
        } else {
            mainActivity.getDrawerToggle().setDrawerIndicatorEnabled(true);
        }
        return canback;
    }
}
