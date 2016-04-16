package com.example.daniel.onroute;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by STT on 15.4.2016.
 */
public class SportsCoreScreenActivity extends Activity {

    ListView mList;
    ListView mTickerList;
    ArrayList<String> eventNames = new ArrayList<>();
    ArrayList<String> tickerEntries = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_sport_core);

        eventNames.add("England vs SA");
        eventNames.add("India vs Australia");
        eventNames.add("England vs SA");
        eventNames.add("India vs Australia");
        eventNames.add("England vs SA");
        eventNames.add("India vs Australia");

        tickerEntries.add("Tendulkar on Strike.");
        tickerEntries.add("The umpires signal a no-ball. He has to settle for a single");
        tickerEntries.add("Tendulkar on Strike.");
        tickerEntries.add("The umpires signal a no-ball. He has to settle for a single");
        tickerEntries.add("Tendulkar on Strike.");
        tickerEntries.add("The umpires signal a no-ball. He has to settle for a single");


        mList = (ListView) findViewById(R.id.sport_core_listview);
        mList.setAdapter(new SportsAdapter(this, R.layout.layout_sports_list_row, eventNames));

        mList = (ListView) findViewById(R.id.ticker_list);
        mList.setAdapter(new SportTickerAdapter(this, R.layout.layout_sport_ticker_row, tickerEntries));

    }


    class SportsAdapter extends ArrayAdapter<String> {
        public SportsAdapter(Context context, int resource, ArrayList<String> objects) {
            super(context, resource, objects);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.layout_sports_list_row, null);
            }
            TextView eventName = (TextView) convertView.findViewById(R.id.sport_row_name);
            eventName.setText(getItem(position));
            TextView eventDesc = (TextView) convertView.findViewById(R.id.sport_row_description);
            eventDesc.setText("Watch England vs South Africa scores live!");


            return convertView;
        }
    }


    class SportTickerAdapter extends ArrayAdapter<String> {
        public SportTickerAdapter(Context context, int resource, ArrayList<String> objects) {
            super(context, resource, objects);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.layout_sport_ticker_row, null);
            }
            TextView tickerText = (TextView) convertView.findViewById(R.id.ticker_row_text);
            tickerText.setText(getItem(position));
            TextView tickerTimestamp = (TextView) convertView.findViewById(R.id.ticker_row_timestamp);
            tickerTimestamp.setText("2m");


            return convertView;
        }
    }


}
