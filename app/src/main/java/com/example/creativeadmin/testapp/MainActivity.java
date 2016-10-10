package com.example.creativeadmin.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.net.Uri;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        Glide.with(this).load(R.drawable.fall).asGif().into(imageView);

        final Button button = (Button) findViewById(R.id.pumpSpiceMe);

        button.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.starbucks.com/menu/drinks/espresso/pumpkin-spice-latte"));

                startActivity(browserIntent);


            }

        });


    }
}
