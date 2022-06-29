package com.example.parkingmobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class LocationsActivity extends AppCompatActivity {
    TextView t,t2,t3,t4,t5;
    Button b1,b2,b3,b4;
    ImageView im1, im2, im3, im4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locations_activity);
        t = findViewById(R.id.textView);
        t2 = findViewById(R.id.textView2);
        t3 = findViewById(R.id.textView3);
        t3 = findViewById(R.id.textView6);
        t4 = findViewById(R.id.textView4);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button5);
        b3 = findViewById(R.id.button6);
        b4 = findViewById(R.id.button7);
        im1 = findViewById(R.id.imageView17);
        im2 = findViewById(R.id.imageView7);
        im3 = findViewById(R.id.imageView8);
        im4 = findViewById(R.id.imageView9);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LocationsActivity.this, LuluActivity.class);
                startActivity(intent);
            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LocationsActivity.this, WadiActivity.class);
                startActivity(intent);
            }

        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LocationsActivity.this, P90Activity.class);
                startActivity(intent);
            }

        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LocationsActivity.this, BankActivity.class);
                startActivity(intent);
            }

        });
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LocationsActivity.this, ProfileActivity.class);
                startActivity(intent);
            }

        });


    }
}