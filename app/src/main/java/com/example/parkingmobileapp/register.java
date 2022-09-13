package com.example.parkingmobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class register extends AppCompatActivity {
    ImageView im1;
    TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8;
    EditText name, email, number, password;
    Button b1;
    SharedPreferences sp;
    String nameStr, emailStr, numberStr, passwordStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ImageView im1 = (ImageView) findViewById(R.id.imageView22);
        TextView tv1 = (TextView) findViewById(R.id.textView29);
        TextView tv2 = (TextView) findViewById(R.id.textView27);
        TextView tv3 = (TextView) findViewById(R.id.textView28);
        TextView tv4 = (TextView) findViewById(R.id.textView30);
        TextView tv5 = (TextView) findViewById(R.id.textView31);
        TextView tv6 = (TextView) findViewById(R.id.textView32);
        TextView tv7 = (TextView) findViewById(R.id.textView28);
        EditText name = (EditText) findViewById(R.id.name);
        EditText email = (EditText) findViewById(R.id.email);
        EditText number = (EditText) findViewById(R.id.number);
        EditText password = (EditText) findViewById(R.id.pass);
        TextView tv8 = (TextView) findViewById(R.id.loginSwitchText);
        Button b1 = (Button) findViewById(R.id.loginBtn);
        sp = getSharedPreferences( "MyUserPrefs", Context.MODE_PRIVATE);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                nameStr = name.getText().toString();
                emailStr = email.getText().toString();
                numberStr = number.getText().toString();
                passwordStr = password.getText().toString();
                SharedPreferences.Editor editor = sp.edit();

                editor.putString("name", nameStr);
                editor.putString("email", emailStr);
                editor.putString("number", numberStr);
                editor.putString("password", passwordStr);
                editor.commit();
                Toast.makeText(register.this, "Information Saved.", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(register.this,ProfileActivity.class);
                startActivity(intent);
            }
        });
        tv8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(register.this,LoginActivity.class);
                startActivity(intent);
            }
        });





    }
}