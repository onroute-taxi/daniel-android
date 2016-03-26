package com.example.daniel.onroute;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class EnterPhoneScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_enter_phone_number);


        TextView textView = (TextView) findViewById(R.id.text_view);

        String text = "<font color=#FFFFFF>Connect to </font> " +
                "<font color=#F5A623>OnRoute</font> " +
                "<font color=#FFFFFF> network <br> from your phone WiFi to start.</font>";
        textView.setText(Html.fromHtml(text));

    }
}
