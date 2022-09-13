package com.example.parkingmobileapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);
        TextView t1, t2, t3, t4, t5;
        t1= findViewById(R.id.textView9);
        t2= findViewById(R.id.textView14);
        t3= findViewById(R.id.textView13);

        SharedPreferences sp = getApplication().getSharedPreferences( "MyUserPrefs", Context.MODE_PRIVATE);
        String name = sp.getString("name", "");
        String email = sp.getString("email", "");
        String number = sp.getString("email", "");

        t1.setText(name);
        t2.setText(email);
        t3.setText(number);



    }
}