package com.example.parkingmobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import android.os.Bundle;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {
    ImageView im1;
    TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7;
    View v1, v2;
    Button b1;
    LinearLayout l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ImageView im1 = (ImageView) findViewById(R.id.imageView19);
        TextView tv1 = (TextView) findViewById(R.id.textView19);
        TextView tv2 = (TextView) findViewById(R.id.textView22);
        TextView tv3 = (TextView) findViewById(R.id.textView23);
        TextView tv4 = (TextView) findViewById(R.id.textView24);
        TextView tv5 = (TextView) findViewById(R.id.forgotPasswordText2);
        TextView tv6 = (TextView) findViewById(R.id.registerSwitchText);
        LinearLayout l1 = (LinearLayout) findViewById(R.id.linearLayout);
        Button b1 = (Button) findViewById(R.id.loginBtn2);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(LoginActivity.this,LocationsActivity.class);
                startActivity(intent);
            }
        });
        tv6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(LoginActivity.this,register.class);
                startActivity(intent);
            }
        });
    }
}