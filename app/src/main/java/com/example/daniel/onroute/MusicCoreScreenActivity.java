package com.example.daniel.onroute;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by STT on 14.4.2016.
 */
public class MusicCoreScreenActivity extends Activity {

    ListView mListView;
    String[] songs = new String[]{"Avicii - Looking for love", "Avicii - The Nights", "Avicii - Levels",
            "Avicii - Looking for love", "Avicii - The Nights", "Avicii - Levels",
            "Avicii - Looking for love", "Avicii - The Nights", "Avicii - Levels"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_music_core);

        mListView = (ListView) findViewById(R.id.song_playlist);
        mListView.setAdapter(new ListAdapter(this, R.layout.layout_music_playlist_row, songs));
        Log.i("Dan", "Count is: " + mListView.getAdapter().getCount());

    }

    public class ListAdapter extends ArrayAdapter<String> {

        public ListAdapter(Context context, int resource, String[] items) {
            super(context, resource, items);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.layout_music_playlist_row, null);
            }
            TextView mText = (TextView) convertView.findViewById(R.id.music_row_songname);
            mText.setText(getItem(position));

            return convertView;
        }

    }

}
