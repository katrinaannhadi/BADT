package com.katrinaann.badt.ui.blogandnotes;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.katrinaann.badt.R;

import java.util.ArrayList;
import java.util.List;

public class NoteListAdapter extends RecyclerView.Adapter<NoteListAdapter.NoteListViewHolder>{

    private boolean wideScreen;
    private NoteListActivity mParentActivity;
    private List<Notes> mNotes;
    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Notes note = (Notes) v.getTag();
            if (wideScreen) {
                //If the user is using a wide-screen device, initialise the fragment on the same activity
                Log.d(TAG, "User clicked on row with a wide-screen device");
                Bundle arguments = new Bundle();
                arguments.putInt(NoteFragment.ARG_ITEM_ID, note.getNoteId());
                NoteFragment fragment = new NoteFragment();
                fragment.setArguments(arguments);
                mParentActivity.getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.detail_container, fragment)
                        .commit();
            } else {
                //If the user is not using a wide-screen device, run the NoteActivity class and initialise fragment there
                Log.d(TAG, "User clicked on row with a non-wide-screen device");
                Context context = v.getContext();
                Intent intent = new Intent(context, NoteActivity.class);
                intent.putExtra(NoteFragment.ARG_ITEM_ID, note.getNoteId());
                context.startActivity(intent);
            }
        };
    };
    private String TAG = "NoteListAdapter";

    //Constructor for NoteListAdapter
    public NoteListAdapter (NoteListActivity mParentActivity, ArrayList<Notes> mNotes, boolean wideScreen ) {
        this.mParentActivity = mParentActivity;
        this.mNotes = mNotes;
        this.wideScreen = wideScreen;
    }

    //Create NoteListViewHolder class to represent object of each row
    public class NoteListViewHolder extends RecyclerView.ViewHolder {
        private TextView tvNoteTitle;

        //Constructor for NoteListViewHolder
        public NoteListViewHolder(View v) {
            super(v);
            tvNoteTitle = (TextView) v.findViewById(R.id.tvNoteTitle);
        }
    }

    //Override the onCreateViewHolder() to define the list item layout inflated into the RecyclerView
    @Override
    public NoteListAdapter.NoteListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_list_row, parent, false);
        return new NoteListViewHolder(v);
    }

    //Override the onBindViewHolder() to populate the individual views inside the list item layout with data from the object
    @Override
    public void onBindViewHolder(NoteListViewHolder holder, int position) {
        Notes note = mNotes.get(position);
        holder.tvNoteTitle.setText(note.getNoteName());
        holder.itemView.setTag(note);
        holder.itemView.setOnClickListener(mOnClickListener);
        Log.d(TAG, "onBindViewHolder: Success");
    }

    //Override the getItemCount() to get the number of items to be displayed in the recyclerview
    @Override
    public int getItemCount() {
        return mNotes.size();
    }

    //Method to set list of notes (mNotes) in the adapter to the list obtained from the database
    //This method is called in the NoteListActivity when a new note is created
    public void setNotes (List<Notes> notes) {
        mNotes = notes;
        notifyDataSetChanged();
        Log.d(TAG, "setNotes: Success");
    }
}
