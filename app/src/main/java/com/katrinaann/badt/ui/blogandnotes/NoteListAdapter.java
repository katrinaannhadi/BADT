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
            System.out.println(note.getNoteName());
            System.out.println(v.getTag());
            if (wideScreen) {
                Bundle arguments = new Bundle();
                arguments.putInt(NoteFragment.ARG_ITEM_ID, note.getNoteId());
                //System.out.println(note.getNoteName());
                NoteFragment fragment = new NoteFragment();
                fragment.setArguments(arguments);
                mParentActivity.getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.detail_container, fragment)
                        .commit();
            } else {
                Context context = v.getContext();
                Intent intent = new Intent(context, NoteActivity.class);
                intent.putExtra(NoteFragment.ARG_ITEM_ID, note.getNoteId());
                context.startActivity(intent);
            }
        };
    };
    private String TAG = "NoteListAdapter";

    public NoteListAdapter (NoteListActivity mParentActivity, ArrayList<Notes> mNotes, boolean wideScreen ) {
        this.mParentActivity = mParentActivity;
        this.mNotes = mNotes;
        this.wideScreen = wideScreen;
    }

    public class NoteListViewHolder extends RecyclerView.ViewHolder {
        private TextView tvNoteTitle;

        public NoteListViewHolder(View v) {
            super(v);
            tvNoteTitle = (TextView) v.findViewById(R.id.tvNoteTitle);
        }
    }

    @Override
    public NoteListAdapter.NoteListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_list_row, parent, false);
        return new NoteListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(NoteListViewHolder holder, int position) {
        Notes note = mNotes.get(position);
        holder.tvNoteTitle.setText(note.getNoteName());
        holder.itemView.setTag(note);
        holder.itemView.setOnClickListener(mOnClickListener);
    }

    @Override
    public int getItemCount() {
        return mNotes.size();
    }

    public void setNotes (List<Notes> notes) {
        mNotes = notes;
        notifyDataSetChanged();
        Log.d(TAG, "setNotes: Success");
    }
}
