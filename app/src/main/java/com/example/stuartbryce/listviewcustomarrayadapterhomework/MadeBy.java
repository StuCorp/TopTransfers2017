package com.example.stuartbryce.listviewcustomarrayadapterhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.stuartbryce.listviewcustomarrayadapterhomework.R.id.about;

public class MadeBy extends AppCompatActivity {

    TextView aboutMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_made_by);

        aboutMe = (TextView) findViewById(about);
        aboutMe.setText(R.string.made_by_stuart);

    }
}
