package com.example.daniel.onroute;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

public class MapScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_map_connect_to_wifi);


        TextView textView = (TextView) findViewById(R.id.screen_map_connect_to_wifi_text_view);

        String text = "<font color=#FFFFFF>Find the best route  to get <br> " +
                "to your destination & </font> " +
                "<font color=#F5A623> more</font>";
        textView.setText(Html.fromHtml(text));

        TextView textView2 = (TextView) findViewById(R.id.screen_map_connect_to_wifi_text_view2);

        String text2 = "<font color=#FFFFFF>Connect to </font> " +
                "<font color=#F5A623>OnRoute</font> " +
                "<font color=#FFFFFF> to get started</font>";

        textView2.setText(Html.fromHtml(text2));

    }
}
