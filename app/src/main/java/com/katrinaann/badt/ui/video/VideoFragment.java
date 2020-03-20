package com.katrinaann.badt.ui.video;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.google.android.youtube.player.YouTubeStandalonePlayer;
import com.katrinaann.badt.R;

public class VideoFragment extends Fragment implements View.OnClickListener {

    private VideoViewModel videoViewModel;
    static final String GOOGLE_API_KEY = "AIzaSyBGLD7OOCSXgfn5E1nKG2NNBj7XfJ28Rkc";
    static final String YOUTUBE_VIDEO_ID = "gnWj97CEjeo";
    static final String YOUTUBE_PLAYLIST = "PLhxFuaI_pG0HjklS6iFXPuzCQnyqWxhT-";


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        videoViewModel =
                ViewModelProviders.of(this).get(VideoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_video, container, false);
        final TextView textView = root.findViewById(R.id.text_video);
        videoViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        Button btnPlayVideo = root.findViewById(R.id.buttonVideo);
        Button btnPlaylist = root.findViewById(R.id.buttonPlaylist);

        btnPlayVideo.setOnClickListener(this);
        btnPlaylist.setOnClickListener(this);

//        btnPlayVideo.setOnClickListener(new View.OnClickListener(){
//           @Override
//           public void onClick(View v){
//               openVideo();
//           }
//        });
//        btnPlaylist.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                openPlaylist();
//            }
//        });


        return root;
    }
//    public void openVideo(){
//        Intent intent =
//    }

    public void onClick(View view) {
        Intent intent = null;

        //Utilising YoutubeStandalonePlayer
        switch (view.getId()) {
            case R.id.buttonVideo:
                intent = YouTubeStandalonePlayer.createVideoIntent(this.getActivity(), YoutubePlayerActivity.GOOGLE_API_KEY, YoutubePlayerActivity.YOUTUBE_VIDEO_ID, 0, true, false);
                break;

            case R.id.buttonPlaylist:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this.getActivity(), YoutubePlayerActivity.GOOGLE_API_KEY, YoutubePlayerActivity.YOUTUBE_PLAYLIST, 0, 0, true, true);
                break;

            default:

        }

        if (intent != null) {
            startActivity(intent);
        }


    }
}
