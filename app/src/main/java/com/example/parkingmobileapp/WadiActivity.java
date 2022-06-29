package com.example.parkingmobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WadiActivity extends AppCompatActivity {
    TextView t,t2,t3,t4,t5,t6,t7;
    Button b1,b2;
    ImageView im1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wadi_activity);
        t = findViewById(R.id.textView10);
        t2 = findViewById(R.id.textView9);
        t3 = findViewById(R.id.textView7);
        t3 = findViewById(R.id.textView8);
        t4 = findViewById(R.id.textView12);
        t5 = findViewById(R.id.textView11);
        t6 = findViewById(R.id.textView5);
        b1 = findViewById(R.id.button2);
        b2 = findViewById(R.id.button3);

        im1 = findViewById(R.id.imageView17);
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WadiActivity.this, ProfileActivity.class);
                startActivity(intent);
            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WadiActivity.this, ParkingLayoutActivity.class);
                startActivity(intent);
            }

        });
    }
}