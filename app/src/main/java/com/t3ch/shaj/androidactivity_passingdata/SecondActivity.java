package com.t3ch.shaj.androidactivity_passingdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.TV_ID);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            String value = bundle.getString("tag");
            textView.setText(value);
        }


    }
}