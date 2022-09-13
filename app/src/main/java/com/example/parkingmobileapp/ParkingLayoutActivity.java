package com.example.parkingmobileapp;

import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.os.*;
import android.database.Cursor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ParkingLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parking_layout);

        ImageView im1;


        TextView chosen=(TextView)findViewById(R.id.chosen_spot);
        TextView status=(TextView)findViewById(R.id.spot_status);


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

        im1 = findViewById(R.id.imageView17);
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ParkingLayoutActivity.this, ProfileActivity.class);
                startActivity(intent);
            }

        });


//        Button Btn4=(Button)findViewById(R.id.button4);

//        Btn4.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                Intent intent= new Intent(ParkingLayoutActivity.this,LocationsActivity.class);
//                startActivity(intent);
//            }
//        });


        DatabaseAdapter mDbHelper = new DatabaseAdapter(getBaseContext());
        mDbHelper.createDatabase();
        mDbHelper.open();


        View.OnClickListener ButtonListener = new View.OnClickListener() {
            public void onClick(View v) {
                chosen.setText(""+ v.getResources().getResourceEntryName(v.getId())+" - Floor 1");
                switch(v.getId()){
                    case R.id.A1:
                        Cursor a1c = mDbHelper.getA1Status();
                        String A1Status=a1c.getString(0);
                        if(A1Status.equals("o")){
                            status.setText("Occupied");
                        }
                        else if(A1Status.equals("f")){
                            status.setText("Free");
                        }
                        else if(A1Status.equals("r")){
                            status.setText("Reserved");

                        }
                        break;
                    case R.id.A2:
                        Cursor a2c = mDbHelper.getA2Status();
                        String A2Status=a2c.getString(0);
                        if(A2Status.equals("o")){
                            status.setText("Occupied");
                        }
                        else if(A2Status.equals("f")){
                            status.setText("Free");
                        }
                        else if(A2Status.equals("r")){
                            status.setText("Reserved");
                        }
                        break;
                    case R.id.A3:
                        Cursor a3c = mDbHelper.getA3Status();
                        String A3Status=a3c.getString(0);
                        if(A3Status.equals("o")){
                            status.setText("Occupied");
                        }
                        else if(A3Status.equals("f")){
                            status.setText("Free");
                        }
                        else if(A3Status.equals("r")){
                            status.setText("Reserved");
                        }
                        break;
                    case R.id.A4:
                        Cursor a4c = mDbHelper.getA4Status();
                        String A4Status=a4c.getString(0);
                        if(A4Status.equals("o")){
                            status.setText("Occupied");
                        }
                        else if(A4Status.equals("f")){
                            status.setText("Free");
                        }
                        else if(A4Status.equals("r")){
                            status.setText("Reserved");
                        }
                        break;
                    case R.id.A5:
                        Cursor a5c = mDbHelper.getA5Status();
                        String A5Status=a5c.getString(0);
                        if(A5Status.equals("o")){
                            status.setText("Occupied");
                        }
                        else if(A5Status.equals("f")){
                            status.setText("Free");
                        }
                        else if(A5Status.equals("r")){
                            status.setText("Reserved");
                        }
                        break;
                    case R.id.A6:
                        Cursor a6c = mDbHelper.getA6Status();
                        String A6Status=a6c.getString(0);
                        if(A6Status.equals("o")){
                            status.setText("Occupied");
                        }
                        else if(A6Status.equals("f")){
                            status.setText("Free");
                        }
                        else if(A6Status.equals("r")){
                            status.setText("Reserved");
                        }
                        break;
                    case R.id.A7:
                        Cursor a7c = mDbHelper.getA7Status();
                        String A7Status=a7c.getString(0);
                        if(A7Status.equals("o")){
                            status.setText("Occupied");
                        }
                        else if(A7Status.equals("f")){
                            status.setText("Free");
                        }
                        else if(A7Status.equals("r")){
                            status.setText("Reserved");
                        }
                        break;
                    case R.id.A8:
                        Cursor a8c = mDbHelper.getA8Status();
                        String A8Status=a8c.getString(0);
                        if(A8Status.equals("o")){
                            status.setText("Occupied");
                        }
                        else if(A8Status.equals("f")){
                            status.setText("Free");
                        }
                        else if(A8Status.equals("r")){
                            status.setText("Reserved");
                        }
                        break;
                    case R.id.A9:
                        Cursor a9c = mDbHelper.getA9Status();
                        String A9Status=a9c.getString(0);
                        if(A9Status.equals("o")){
                            status.setText("Occupied");
                        }
                        else if(A9Status.equals("f")){
                            status.setText("Free");
                        }
                        else if(A9Status.equals("r")){
                            status.setText("Reserved");
                        }
                        break;
                    case R.id.A10:
                        Cursor a10c = mDbHelper.getA10Status();
                        String A10Status=a10c.getString(0);
                        if(A10Status.equals("o")){
                            status.setText("Occupied");
                        }
                        else if(A10Status.equals("f")){
                            status.setText("Free");
                        }
                        else if(A10Status.equals("r")){
                            status.setText("Reserved");
                        }
                        break;
                    case R.id.B1:
                        Cursor b1c = mDbHelper.getB1Status();
                        String B1Status=b1c.getString(0);
                        if(B1Status.equals("o")){
                            status.setText("Occupied");
                        }
                        else if(B1Status.equals("f")){
                            status.setText("Free");
                        }
                        else if(B1Status.equals("r")){
                            status.setText("Reserved");
                        }
                        break;
                    case R.id.B2:
                        Cursor b2c = mDbHelper.getB2Status();
                        String B2Status=b2c.getString(0);
                        if(B2Status.equals("o")){
                            status.setText("Occupied");
                        }
                        else if(B2Status.equals("f")){
                            status.setText("Free");
                        }
                        else if(B2Status.equals("r")){
                            status.setText("Reserved");
                        }
                        break;
                    case R.id.B3:
                        Cursor b3c = mDbHelper.getB3Status();
                        String B3Status=b3c.getString(0);
                        if(B3Status.equals("o")){
                            status.setText("Occupied");
                        }
                        else if(B3Status.equals("f")){
                            status.setText("Free");
                        }
                        else if(B3Status.equals("r")){
                            status.setText("Reserved");
                        }
                        break;
                    case R.id.B4:
                        Cursor b4c = mDbHelper.getB4Status();
                        String B4Status=b4c.getString(0);
                        if(B4Status.equals("o")){
                            status.setText("Occupied");
                        }
                        else if(B4Status.equals("f")){
                            status.setText("Free");
                        }
                        else if(B4Status.equals("r")){
                            status.setText("Reserved");
                        }
                        break;
                    case R.id.B5:
                        Cursor b5c = mDbHelper.getB5Status();
                        String B5Status=b5c.getString(0);
                        if(B5Status.equals("o")){
                            status.setText("Occupied");
                        }
                        else if(B5Status.equals("f")){
                            status.setText("Free");
                        }
                        else if(B5Status.equals("r")){
                            status.setText("Reserved");
                        }
                        break;
                    case R.id.B6:
                        Cursor b6c = mDbHelper.getB6Status();
                        String B6Status=b6c.getString(0);
                        if(B6Status.equals("o")){
                            status.setText("Occupied");
                        }
                        else if(B6Status.equals("f")){
                            status.setText("Free");
                        }
                        else if(B6Status.equals("r")){
                            status.setText("Reserved");
                        }
                        break;
                    case R.id.B7:
                        Cursor b7c = mDbHelper.getB7Status();
                        String B7Status=b7c.getString(0);
                        if(B7Status.equals("o")){
                            status.setText("Occupied");
                        }
                        else if(B7Status.equals("f")){
                            status.setText("Free");
                        }
                        else if(B7Status.equals("r")){
                            status.setText("Reserved");
                        }
                        break;
                    case R.id.B8:
                        Cursor b8c = mDbHelper.getB8Status();
                        String B8Status=b8c.getString(0);
                        if(B8Status.equals("o")){
                            status.setText("Occupied");
                        }
                        else if(B8Status.equals("f")){
                            status.setText("Free");
                        }
                        else if(B8Status.equals("r")){
                            status.setText("Reserved");
                        }
                        break;
                    case R.id.B9:
                        Cursor b9c = mDbHelper.getB9Status();
                        String B9Status=b9c.getString(0);
                        if(B9Status.equals("o")){
                            status.setText("Occupied");
                        }
                        else if(B9Status.equals("f")){
                            status.setText("Free");
                        }
                        else if(B9Status.equals("r")){
                            status.setText("Reserved");
                        }
                        break;
                    case R.id.B10:
                        Cursor b10c = mDbHelper.getB10Status();
                        String B10Status=b10c.getString(0);
                        if(B10Status.equals("o")){
                            status.setText("Occupied");
                        }
                        else if(B10Status.equals("f")){
                            status.setText("Free");
                        }
                        else if(B10Status.equals("r")){
                            status.setText("Reserved");
                        }
                        break;

                }

                // do something when the button is clicked
            }
        };

        A1.setOnClickListener(ButtonListener);
        A2.setOnClickListener(ButtonListener);
        A3.setOnClickListener(ButtonListener);
        A4.setOnClickListener(ButtonListener);
        A5.setOnClickListener(ButtonListener);
        A6.setOnClickListener(ButtonListener);
        A7.setOnClickListener(ButtonListener);
        A8.setOnClickListener(ButtonListener);
        A9.setOnClickListener(ButtonListener);
        A10.setOnClickListener(ButtonListener);
        B1.setOnClickListener(ButtonListener);
        B2.setOnClickListener(ButtonListener);
        B3.setOnClickListener(ButtonListener);
        B4.setOnClickListener(ButtonListener);
        B5.setOnClickListener(ButtonListener);
        B6.setOnClickListener(ButtonListener);
        B7.setOnClickListener(ButtonListener);
        B8.setOnClickListener(ButtonListener);
        B9.setOnClickListener(ButtonListener);
        B10.setOnClickListener(ButtonListener);






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
                Cursor a4c = mDbHelper.getA4Status();
                String A4Status=a4c.getString(0);
                Log.i("Status:",A4Status+"");
                if(A4Status.equals("f")){
                    A4.setBackgroundColor(Color.parseColor("#5ED177"));
                    A4.setText("A4 \n FREE");
                }
                else if(A4Status.equals("o")){
                    A4.setBackgroundColor(Color.parseColor("#E34040"));
                    A4.setText("A4 \n OCCUPIED");
                }
                Cursor a5c = mDbHelper.getA5Status();
                String A5Status=a5c.getString(0);
                Log.i("Status:",A5Status+"");
                if(A5Status.equals("f")){
                    A5.setBackgroundColor(Color.parseColor("#5ED177"));
                    A5.setText("A5 \n FREE");
                }
                else if(A5Status.equals("o")){
                    A5.setBackgroundColor(Color.parseColor("#E34040"));
                    A5.setText("A5 \n OCCUPIED");
                }
                Cursor a6c = mDbHelper.getA6Status();
                String A6Status=a5c.getString(0);
                Log.i("Status:",A6Status+"");
                if(A6Status.equals("f")){
                    A6.setBackgroundColor(Color.parseColor("#5ED177"));
                    A6.setText("A6 \n FREE");
                }
                else if(A6Status.equals("o")){
                    A6.setBackgroundColor(Color.parseColor("#E34040"));
                    A6.setText("A6 \n OCCUPIED");
                }
                Cursor a7c = mDbHelper.getA7Status();
                String A7Status=a7c.getString(0);
                Log.i("Status:",A5Status+"");
                if(A7Status.equals("f")){
                    A7.setBackgroundColor(Color.parseColor("#5ED177"));
                    A7.setText("A7 \n FREE");
                }
                else if(A7Status.equals("o")){
                    A7.setBackgroundColor(Color.parseColor("#E34040"));
                    A7.setText("A7 \n OCCUPIED");
                }
                Cursor a8c = mDbHelper.getA8Status();
                String A8Status=a8c.getString(0);
                Log.i("Status:",A8Status+"");
                if(A8Status.equals("f")){
                    A8.setBackgroundColor(Color.parseColor("#5ED177"));
                    A8.setText("A8 \n FREE");
                }
                else if(A8Status.equals("o")){
                    A8.setBackgroundColor(Color.parseColor("#E34040"));
                    A8.setText("A8 \n OCCUPIED");
                }
                Cursor a9c = mDbHelper.getA9Status();
                String A9Status=a9c.getString(0);
                Log.i("Status:",A9Status+"");
                if(A9Status.equals("f")){
                    A9.setBackgroundColor(Color.parseColor("#5ED177"));
                    A9.setText("A9 \n FREE");
                }
                else if(A9Status.equals("o")){
                    A9.setBackgroundColor(Color.parseColor("#E34040"));
                    A9.setText("A9 \n OCCUPIED");
                }
                Cursor a10c = mDbHelper.getA10Status();
                String A10Status=a10c.getString(0);
                Log.i("Status:",A10Status+"");
                if(A10Status.equals("f")){
                    A10.setBackgroundColor(Color.parseColor("#5ED177"));
                    A10.setText("A10 \n FREE");
                }
                else if(A10Status.equals("o")){
                    A10.setBackgroundColor(Color.parseColor("#E34040"));
                    A10.setText("A10 \n OCCUPIED");
                }
                Cursor b1c = mDbHelper.getB1Status();
                String B1Status=b1c.getString(0);
                Log.i("Status:",B1Status+"");
                if(B1Status.equals("f")){
                    B1.setBackgroundColor(Color.parseColor("#5ED177"));
                    B1.setText("B1 \n FREE");
                }
                else if(B1Status.equals("o")){
                    B1.setBackgroundColor(Color.parseColor("#E34040"));
                    B1.setText("B1 \n OCCUPIED");
                }
                Cursor b2c = mDbHelper.getB2Status();
                String B2Status=b1c.getString(0);
                Log.i("Status:",B2Status+"");
                if(B2Status.equals("f")){
                    B2.setBackgroundColor(Color.parseColor("#5ED177"));
                    B2.setText("B2 \n FREE");
                }
                else if(B2Status.equals("o")){
                    B2.setBackgroundColor(Color.parseColor("#E34040"));
                    B2.setText("B2 \n OCCUPIED");
                }
                Cursor b3c = mDbHelper.getB3Status();
                String B3Status=b1c.getString(0);
                Log.i("Status:",B3Status+"");
                if(B3Status.equals("f")){
                    B3.setBackgroundColor(Color.parseColor("#5ED177"));
                    B3.setText("B3 \n FREE");
                }
                else if(B3Status.equals("o")){
                    B3.setBackgroundColor(Color.parseColor("#E34040"));
                    B3.setText("B3 \n OCCUPIED");
                }
                Cursor b4c = mDbHelper.getB4Status();
                String B4Status=b4c.getString(0);
                Log.i("Status:",B4Status+"");
                if(B4Status.equals("f")){
                    B4.setBackgroundColor(Color.parseColor("#5ED177"));
                    B4.setText("B4 \n FREE");
                }
                else if(B4Status.equals("o")){
                    B4.setBackgroundColor(Color.parseColor("#E34040"));
                    B4.setText("B4 \n OCCUPIED");
                }
                Cursor b5c = mDbHelper.getB5Status();
                String B5Status=b5c.getString(0);
                Log.i("Status:",B5Status+"");
                if(B5Status.equals("f")){
                    B5.setBackgroundColor(Color.parseColor("#5ED177"));
                    B5.setText("B5 \n FREE");
                }
                else if(B5Status.equals("o")){
                    B5.setBackgroundColor(Color.parseColor("#E34040"));
                    B5.setText("B5 \n OCCUPIED");
                }
                Cursor b6c = mDbHelper.getB6Status();
                String B6Status=b6c.getString(0);
                Log.i("Status:",B6Status+"");
                if(B6Status.equals("f")){
                    B6.setBackgroundColor(Color.parseColor("#5ED177"));
                    B6.setText("B6 \n FREE");
                }
                else if(B6Status.equals("o")){
                    B6.setBackgroundColor(Color.parseColor("#E34040"));
                    B6.setText("B6 \n OCCUPIED");
                }
                Cursor b7c = mDbHelper.getB7Status();
                String B7Status=b7c.getString(0);
                Log.i("Status:",B7Status+"");
                if(B7Status.equals("f")){
                    B7.setBackgroundColor(Color.parseColor("#5ED177"));
                    B7.setText("B7 \n FREE");
                }
                else if(B7Status.equals("o")){
                    B7.setBackgroundColor(Color.parseColor("#E34040"));
                    B7.setText("B7 \n OCCUPIED");
                }
                Cursor b8c = mDbHelper.getB8Status();
                String B8Status=b8c.getString(0);
                Log.i("Status:",B8Status+"");
                if(B8Status.equals("f")){
                    B8.setBackgroundColor(Color.parseColor("#5ED177"));
                    B8.setText("B8 \n FREE");
                }
                else if(B8Status.equals("o")){
                    B8.setBackgroundColor(Color.parseColor("#E34040"));
                    B8.setText("B8 \n OCCUPIED");
                }
                Cursor b9c = mDbHelper.getB9Status();
                String B9Status=b1c.getString(0);
                Log.i("Status:",B9Status+"");
                if(B9Status.equals("f")){
                    B9.setBackgroundColor(Color.parseColor("#5ED177"));
                    B9.setText("B9 \n FREE");
                }
                else if(B9Status.equals("o")){
                    B9.setBackgroundColor(Color.parseColor("#E34040"));
                    B9.setText("B9 \n OCCUPIED");
                }
                Cursor b10c = mDbHelper.getB10Status();
                String B10Status=b1c.getString(0);
                Log.i("Status:",B10Status+"");
                if(B10Status.equals("f")){
                    B10.setBackgroundColor(Color.parseColor("#5ED177"));
                    B10.setText("B10 \n FREE");
                }
                else if(B10Status.equals("o")){
                    B10.setBackgroundColor(Color.parseColor("#E34040"));
                    B10.setText("B10 \n OCCUPIED");
                }


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


