package com.example.demoimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    ImageView ivDay1;
    ImageView ivDay2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivDay1 = findViewById(R.id.imageView1);
        ivDay2 = findViewById(R.id.imageView2);


        //2 ways of displaying the ImageView image
        //1. Code 23 & 24
        //2. Use drawable in activity_main.xml file
        ivDay1.setImageResource(R.drawable.day1);
        ivDay2.setImageResource(R.drawable.day2);
    }
}
