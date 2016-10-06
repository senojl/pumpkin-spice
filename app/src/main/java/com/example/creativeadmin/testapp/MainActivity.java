package com.example.creativeadmin.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.dancing);

        Glide.with(this).load("http://goo.gl/gEgYUd").into(imageView);

    }
}
