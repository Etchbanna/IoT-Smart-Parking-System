package com.example.parkingmobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;

public class LocationsActivity extends AppCompatActivity {
    TextView t,t2,t3,t4,t5;
    Button b1,b2,b3,b4;

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
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(LocationsActivity.this,InfoActivity.class);
                startActivity(intent);
            }
        });

    }
}
