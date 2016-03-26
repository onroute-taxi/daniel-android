package com.example.daniel.onroute;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 25.3.16.
 */
public class LocationSuggestionScreenActivity extends AppCompatActivity {

    ListView locationList;
    ArrayList<Destination> airports = new ArrayList<Destination>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_location_suggestion);
        initAirports();

        locationList = (ListView) findViewById(R.id.screen_location_suggestion_autocomplete);
        locationList.setAdapter(new CustomAdapter(this, R.layout.layout_autocomplete_row, airports));

    }


    class CustomAdapter extends ArrayAdapter<Destination> {
        ArrayList<Destination> destinations;

        public CustomAdapter(Context context, int resource, ArrayList<Destination> objects) {
            super(context, resource, objects);
            destinations = objects;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            locationList.setVerticalScrollBarEnabled(false);
            if (convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.layout_autocomplete_row, null);
            }

            TextView airportName = (TextView) convertView.findViewById(R.id.autocomplete_row_airport_name_text_view);
            TextView airportLocation = (TextView) convertView.findViewById(R.id.autocomplete_row_airport_location_text_view);
            TextView airportDistance = (TextView) convertView.findViewById(R.id.autocomplete_row_airport_distance_text_view);

            airportName.setText(destinations.get(position).getName());
            airportLocation.setText(destinations.get(position).getLocatiton());
            airportDistance.setText(destinations.get(position).getDistance());

            return convertView;
        }
    }


    public class Destination {

        String name;
        String locatiton;
        String distance;

        public Destination(String name, String locaiton, String distance) {
            this.name = name;
            this.locatiton = locaiton;
            this.distance = distance;
        }

        public String getName() {
            return name;
        }

        public String getLocatiton() {
            return locatiton;
        }

        public String getDistance() {
            return distance;
        }
    }
    public void initAirports() {
        airports.add(new Destination("CSIA Terminal 1"
                , "Chatrapati Shivaji International Airport, Santa Cruz Airport Airport",
                "3.5 KM"));
        airports.add(new Destination("CSIA Terminal 2"
                , "Chatrapati Shivaji International Airport, Santa Cruz Airport Airport",
                "6.1 KM"));
        airports.add(new Destination("CSIA Terminal 3"
                , "Chatrapati Shivaji International Airport, Santa Cruz Airport Airport",
                "8.2 KM"));
    }

}
