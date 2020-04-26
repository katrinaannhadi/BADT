package com.katrinaann.badt.ui.video;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.google.android.youtube.player.YouTubeStandalonePlayer;
import com.katrinaann.badt.R;

public class VideoFragment extends Fragment implements View.OnClickListener {


    static final String GOOGLE_API_KEY = "AIzaSyBGLD7OOCSXgfn5E1nKG2NNBj7XfJ28Rkc";
    static final String YOUTUBE_VIDEO_ID_1 = "XsKdzHVEXig";
    static final String YOUTUBE_VIDEO_ID_2 = "5On4Iso_Tf8";
    static final String YOUTUBE_VIDEO_ID_3 = "kCJFBmAAvV4";
    static final String YOUTUBE_VIDEO_ID_4 = "kQPTB0ygYfY";
    static final String YOUTUBE_VIDEO_ID_5 = "6-GbY4Asgf8";
    static final String YOUTUBE_PLAYLIST_6 = "PLhxFuaI_pG0HjklS6iFXPuzCQnyqWxhT-";
    static final String YOUTUBE_VIDEO_ID_7 = "mfQIjf2TPdk";
    static final String YOUTUBE_VIDEO_ID_8 = "_a3s0IXSuxY";


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_video, container, false);

        // Initialising UI elements and variables which will be accessed through onclicklisteners.
        // Connecting UI elements to variables.
        ImageView imageView1 = root.findViewById(R.id.playlist1);
        ImageView imageView2 = root.findViewById(R.id.playlist2);
        ImageView imageView3 = root.findViewById(R.id.playlist3);
        ImageView imageView4 = root.findViewById(R.id.playlist4);
        ImageView imageView5 = root.findViewById(R.id.playlist5);
        ImageView imageView6 = root.findViewById(R.id.playlist6);
        ImageView imageView7 = root.findViewById(R.id.playlist7);
        ImageView imageView8 = root.findViewById(R.id.playlist8);

        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
        imageView6.setOnClickListener(this);
        imageView7.setOnClickListener(this);
        imageView8.setOnClickListener(this);

        return root;
    }

    public void onClick(View view) {
        Intent intent = null;

        // Utilising YoutubeStandalonePlayer
        switch (view.getId()) {
            case R.id.playlist1:
                intent = YouTubeStandalonePlayer.createVideoIntent(this.getActivity(), YoutubePlayerActivity.GOOGLE_API_KEY, YoutubePlayerActivity.YOUTUBE_VIDEO_ID_1, 0, true, false);
                break;

            case R.id.playlist2:
                intent = YouTubeStandalonePlayer.createVideoIntent(this.getActivity(), YoutubePlayerActivity.GOOGLE_API_KEY, YoutubePlayerActivity.YOUTUBE_VIDEO_ID_2, 0, true, false);
                break;
            case R.id.playlist3:
                intent = YouTubeStandalonePlayer.createVideoIntent(this.getActivity(), YoutubePlayerActivity.GOOGLE_API_KEY, YoutubePlayerActivity.YOUTUBE_VIDEO_ID_3, 0, true, false);
                break;

            case R.id.playlist4:
                intent = YouTubeStandalonePlayer.createVideoIntent(this.getActivity(), YoutubePlayerActivity.GOOGLE_API_KEY, YoutubePlayerActivity.YOUTUBE_VIDEO_ID_4, 0, true, false);
                break;
            case R.id.playlist5:
                intent = YouTubeStandalonePlayer.createVideoIntent(this.getActivity(), YoutubePlayerActivity.GOOGLE_API_KEY, YoutubePlayerActivity.YOUTUBE_VIDEO_ID_5, 0, true, false);
                break;

            case R.id.playlist6:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this.getActivity(), YoutubePlayerActivity.GOOGLE_API_KEY, YoutubePlayerActivity.YOUTUBE_PLAYLIST_6, 0, 0, true, true);
                break;
            case R.id.playlist7:
                intent = YouTubeStandalonePlayer.createVideoIntent(this.getActivity(), YoutubePlayerActivity.GOOGLE_API_KEY, YoutubePlayerActivity.YOUTUBE_VIDEO_ID_7, 0, true, false);
                break;

            case R.id.playlist8:
                intent = YouTubeStandalonePlayer.createVideoIntent(this.getActivity(), YoutubePlayerActivity.GOOGLE_API_KEY, YoutubePlayerActivity.YOUTUBE_VIDEO_ID_8, 0, true, false);
                break;


            default:

        }
        // Starts the intent
        if (intent != null) {
            startActivity(intent);
        }

    }
}
