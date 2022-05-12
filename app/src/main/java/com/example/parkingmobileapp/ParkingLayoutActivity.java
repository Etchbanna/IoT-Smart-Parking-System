package com.example.parkingmobileapp;
import static java.security.AccessController.getContext;

import android.graphics.Color;
import android.util.Log;
import android.os.*;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class ParkingLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button A1=(Button)findViewById(R.id.A1);
        Button A2=(Button)findViewById(R.id.A2);
        Button A3=(Button)findViewById(R.id.A3);
        Button A4=(Button)findViewById(R.id.A4);
        Button A5=(Button)findViewById(R.id.A5);
        Button A6=(Button)findViewById(R.id.A6);
        Button A7=(Button)findViewById(R.id.A7);
        Button A8=(Button)findViewById(R.id.A8);
        Button A9=(Button)findViewById(R.id.A9);
        Button A10=(Button)findViewById(R.id.A10);

        Button B1=(Button)findViewById(R.id.B1);
        Button B2=(Button)findViewById(R.id.B2);
        Button B3=(Button)findViewById(R.id.B3);
        Button B4=(Button)findViewById(R.id.B4);
        Button B5=(Button)findViewById(R.id.B5);
        Button B6=(Button)findViewById(R.id.B6);
        Button B7=(Button)findViewById(R.id.B7);
        Button B8=(Button)findViewById(R.id.B8);
        Button B9=(Button)findViewById(R.id.B9);
        Button B10=(Button)findViewById(R.id.B10);


        DatabaseAdapter mDbHelper = new DatabaseAdapter(getBaseContext());
        mDbHelper.createDatabase();
        mDbHelper.open();


        Handler uiCallback = new Handler () {
            public void handleMessage (Message msg) {

                Cursor a1c = mDbHelper.getA1Status();
                String A1Status=a1c.getString(0);
                Log.i("Status:",A1Status+"");
                if(A1Status.equals("f")){
                    A1.setBackgroundColor(Color.parseColor("#5ED177"));
                    A1.setText("A1 \n FREE");
                }
                else if(A1Status.equals("o")){
                    A1.setBackgroundColor(Color.parseColor("#E34040"));
                    A1.setText("A1 \n OCCUPIED");
                }

                Cursor a2c = mDbHelper.getA2Status();
                String A2Status=a2c.getString(0);
                Log.i("Status:",A2Status+"");
                if(A2Status.equals("f")){
                    A2.setBackgroundColor(Color.parseColor("#5ED177"));
                    A2.setText("A2 \n FREE");
                }
                else if(A2Status.equals("o")){
                    A2.setBackgroundColor(Color.parseColor("#E34040"));
                    A2.setText("A2 \n OCCUPIED");
                }
                Cursor a3c = mDbHelper.getA3Status();
                String A3Status=a3c.getString(0);
                Log.i("Status:",A3Status+"");
                if(A3Status.equals("f")){
                    A3.setBackgroundColor(Color.parseColor("#5ED177"));
                    A3.setText("A3 \n FREE");
                }
                else if(A3Status.equals("o")){
                    A3.setBackgroundColor(Color.parseColor("#E34040"));
                    A3.setText("A3 \n OCCUPIED");
                }
//                Cursor a4c = mDbHelper.getA4Status();
//                String A4Status=a4c.getString(0);
//                Log.i("Status:",A4Status+"");
//                if(A4Status.equals("f")){
//                    A4.setBackgroundColor(Color.parseColor("#5ED177"));
//                    A4.setText("A4 \n FREE");
//                }
//                else if(A4Status.equals("o")){
//                    A4.setBackgroundColor(Color.parseColor("#E34040"));
//                    A4.setText("A4 \n OCCUPIED");
//                }


                // do stuff with UI
            }
        };
        Thread timer = new Thread() {
            public void run () {
                for (;;) {
                    // do stuff in a separate thread
                    uiCallback.sendEmptyMessage(0);
                    try {
                        Thread.sleep(3000);    // sleep for 3 seconds
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        timer.start();



    }

}


