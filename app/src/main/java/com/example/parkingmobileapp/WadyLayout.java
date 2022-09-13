package com.example.parkingmobileapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.os.*;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import android.os.Bundle;
import android.widget.Button;

public class WadyLayout extends AppCompatActivity {

    private View.OnClickListener ButtonListener;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wady_layout);

        Button A1= findViewById(R.id.a1);
        Button A2= findViewById(R.id.a2);
        Button A3= findViewById(R.id.a3);
        Button A4= findViewById(R.id.a4);
        Button A5= findViewById(R.id.a5);
        Button A6= findViewById(R.id.a6);
        Button A7= findViewById(R.id.a7);
        Button A8= findViewById(R.id.a8);
        Button A9= findViewById(R.id.a9);
        Button A10= findViewById(R.id.a10);
        Button A11= findViewById(R.id.A11);
        Button A12= findViewById(R.id.A12);
        Button A13= findViewById(R.id.A14);
        Button A14= findViewById(R.id.A15);
        Button A15= findViewById(R.id.A16);
        Button A16= findViewById(R.id.A17);
        Button A17= findViewById(R.id.A18);
        Button A18= findViewById(R.id.A19);
        Button A19= findViewById(R.id.A20);
        Button A20= findViewById(R.id.A21);

        Button A21= findViewById(R.id.A22);
        Button A22= findViewById(R.id.A23);
        Button A23= findViewById(R.id.A24);
        Button A24= findViewById(R.id.A25);
        Button A25= findViewById(R.id.A26);
        Button A26= findViewById(R.id.A27);
        Button A27= findViewById(R.id.A28);
        Button A28= findViewById(R.id.A29);
        Button A29= findViewById(R.id.A30);
        Button A30= findViewById(R.id.A31);

        Button A31= findViewById(R.id.A32);
        Button A32= findViewById(R.id.A33);
        Button A33= findViewById(R.id.A34);
        Button A34= findViewById(R.id.A35);
        Button A35= findViewById(R.id.A36);
        Button A36= findViewById(R.id.A37);
        Button A37= findViewById(R.id.A38);
        Button A38= findViewById(R.id.A39);
        Button A39= findViewById(R.id.A40);
        Button A40= findViewById(R.id.A41);

        Button A41= findViewById(R.id.A42);
        Button A42= findViewById(R.id.A43);
        Button A43= findViewById(R.id.A44);
        Button A44= findViewById(R.id.A45);
        Button A45= findViewById(R.id.A46);
        Button A46= findViewById(R.id.A47);
        Button A47= findViewById(R.id.A48);
        Button A48= findViewById(R.id.A49);
        Button A49= findViewById(R.id.A50);
        Button A50= findViewById(R.id.A51);

        Button A51= findViewById(R.id.A52);
        Button A52= findViewById(R.id.A53);
        Button A53= findViewById(R.id.A54);
        Button A54= findViewById(R.id.A55);
        Button A55= findViewById(R.id.A56);
        Button A56= findViewById(R.id.A57);
        Button A57= findViewById(R.id.A58);
        Button A58= findViewById(R.id.A59);
        Button A59= findViewById(R.id.A60);
        Button A60= findViewById(R.id.A61);

        Button A61= findViewById(R.id.A62);
        Button A62= findViewById(R.id.A63);
        Button A63= findViewById(R.id.A64);
        Button A64= findViewById(R.id.A65);
        Button A65= findViewById(R.id.A66);
        Button A66= findViewById(R.id.A67);
        Button A67= findViewById(R.id.A68);
        Button A68= findViewById(R.id.A69);
        Button A69= findViewById(R.id.A70);
        Button A70= findViewById(R.id.A71);

        Button A71= findViewById(R.id.A72);
        Button A72= findViewById(R.id.A73);
        Button A73= findViewById(R.id.A74);
        Button A74= findViewById(R.id.A75);
        Button A75= findViewById(R.id.A76);
        Button A76= findViewById(R.id.A77);
        Button A77= findViewById(R.id.A78);
        Button A78= findViewById(R.id.A79);
        Button A79= findViewById(R.id.A80);
        Button A80= findViewById(R.id.A81);

        Button A81= findViewById(R.id.A82);
        Button A82= findViewById(R.id.A83);
        Button A83= findViewById(R.id.A84);
        Button A84= findViewById(R.id.A85);
        Button A85= findViewById(R.id.A86);
        Button A86= findViewById(R.id.A87);
        Button A87= findViewById(R.id.A88);
        Button A88= findViewById(R.id.A89);
        Button A89= findViewById(R.id.A90);
        Button A90= findViewById(R.id.A91);

        Button A91= findViewById(R.id.A92);
        Button A92= findViewById(R.id.A93);
        Button A93= findViewById(R.id.A94);
        Button A94= findViewById(R.id.A95);
        Button A95= findViewById(R.id.A96);
        Button A96= findViewById(R.id.A97);
        Button A97= findViewById(R.id.A98);
        Button A98= findViewById(R.id.A99);
        Button A99= findViewById(R.id.A100);
        Button A100= findViewById(R.id.A101);

        Button A101= findViewById(R.id.A102);
        Button A102= findViewById(R.id.A103);
        Button A103= findViewById(R.id.A104);
        Button A104= findViewById(R.id.A105);
        Button A105= findViewById(R.id.A106);
        Button A106= findViewById(R.id.A107);
        Button A107= findViewById(R.id.A108);
        Button A108= findViewById(R.id.A109);


        DatabaseAdapter mDbHelper = new DatabaseAdapter(getBaseContext());

        mDbHelper.createDatabase();
        mDbHelper.open();

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

        A11.setOnClickListener(ButtonListener);
        A12.setOnClickListener(ButtonListener);
        A13.setOnClickListener(ButtonListener);
        A14.setOnClickListener(ButtonListener);
        A15.setOnClickListener(ButtonListener);
        A16.setOnClickListener(ButtonListener);
        A17.setOnClickListener(ButtonListener);
        A18.setOnClickListener(ButtonListener);
        A19.setOnClickListener(ButtonListener);
        A20.setOnClickListener(ButtonListener);

        A21.setOnClickListener(ButtonListener);
        A22.setOnClickListener(ButtonListener);
        A23.setOnClickListener(ButtonListener);
        A24.setOnClickListener(ButtonListener);
        A25.setOnClickListener(ButtonListener);
        A26.setOnClickListener(ButtonListener);
        A27.setOnClickListener(ButtonListener);
        A28.setOnClickListener(ButtonListener);
        A29.setOnClickListener(ButtonListener);
        A30.setOnClickListener(ButtonListener);

        A31.setOnClickListener(ButtonListener);
        A32.setOnClickListener(ButtonListener);
        A33.setOnClickListener(ButtonListener);
        A34.setOnClickListener(ButtonListener);
        A35.setOnClickListener(ButtonListener);
        A36.setOnClickListener(ButtonListener);
        A37.setOnClickListener(ButtonListener);
        A38.setOnClickListener(ButtonListener);
        A39.setOnClickListener(ButtonListener);
        A40.setOnClickListener(ButtonListener);

        A41.setOnClickListener(ButtonListener);
        A42.setOnClickListener(ButtonListener);
        A43.setOnClickListener(ButtonListener);
        A44.setOnClickListener(ButtonListener);
        A45.setOnClickListener(ButtonListener);
        A46.setOnClickListener(ButtonListener);
        A47.setOnClickListener(ButtonListener);
        A48.setOnClickListener(ButtonListener);
        A49.setOnClickListener(ButtonListener);
        A50.setOnClickListener(ButtonListener);

        A51.setOnClickListener(ButtonListener);
        A52.setOnClickListener(ButtonListener);
        A53.setOnClickListener(ButtonListener);
        A54.setOnClickListener(ButtonListener);
        A55.setOnClickListener(ButtonListener);
        A56.setOnClickListener(ButtonListener);
        A57.setOnClickListener(ButtonListener);
        A58.setOnClickListener(ButtonListener);
        A59.setOnClickListener(ButtonListener);
        A60.setOnClickListener(ButtonListener);

        A61.setOnClickListener(ButtonListener);
        A62.setOnClickListener(ButtonListener);
        A63.setOnClickListener(ButtonListener);
        A64.setOnClickListener(ButtonListener);
        A65.setOnClickListener(ButtonListener);
        A66.setOnClickListener(ButtonListener);
        A67.setOnClickListener(ButtonListener);
        A68.setOnClickListener(ButtonListener);
        A69.setOnClickListener(ButtonListener);
        A70.setOnClickListener(ButtonListener);

        A71.setOnClickListener(ButtonListener);
        A72.setOnClickListener(ButtonListener);
        A73.setOnClickListener(ButtonListener);
        A74.setOnClickListener(ButtonListener);
        A75.setOnClickListener(ButtonListener);
        A76.setOnClickListener(ButtonListener);
        A77.setOnClickListener(ButtonListener);
        A78.setOnClickListener(ButtonListener);
        A79.setOnClickListener(ButtonListener);
        A80.setOnClickListener(ButtonListener);

        A81.setOnClickListener(ButtonListener);
        A82.setOnClickListener(ButtonListener);
        A83.setOnClickListener(ButtonListener);
        A84.setOnClickListener(ButtonListener);
        A85.setOnClickListener(ButtonListener);
        A86.setOnClickListener(ButtonListener);
        A87.setOnClickListener(ButtonListener);
        A88.setOnClickListener(ButtonListener);
        A89.setOnClickListener(ButtonListener);
        A90.setOnClickListener(ButtonListener);

        A91.setOnClickListener(ButtonListener);
        A92.setOnClickListener(ButtonListener);
        A93.setOnClickListener(ButtonListener);
        A94.setOnClickListener(ButtonListener);
        A95.setOnClickListener(ButtonListener);
        A96.setOnClickListener(ButtonListener);
        A97.setOnClickListener(ButtonListener);
        A98.setOnClickListener(ButtonListener);
        A99.setOnClickListener(ButtonListener);
        A100.setOnClickListener(ButtonListener);

        A101.setOnClickListener(ButtonListener);
        A102.setOnClickListener(ButtonListener);
        A103.setOnClickListener(ButtonListener);
        A104.setOnClickListener(ButtonListener);
        A105.setOnClickListener(ButtonListener);
        A106.setOnClickListener(ButtonListener);
        A107.setOnClickListener(ButtonListener);
        A108.setOnClickListener(ButtonListener);


        Handler uiCallback =new TimeHandler();

        Handler uiCallback1 = new Handler () {
            public void handleMessage (Message msg) {
                String A1Status="null";
                String A2Status="null";
                String A3Status="null";
                String A4Status="null";
                String A5Status="null";
                String A6Status="null";
                String A7Status="null";
                String A8Status="null";
                String A9Status="null";
                String A10Status="null";

                String A11Status="null";
                String A12Status="null";
                String A13Status="null";
                String A14Status="null";
                String A15Status="null";
                String A16Status="null";
                String A17Status="null";
                String A18Status="null";
                String A19Status="null";
                String A20Status="null";

                String A21Status="null";
                String A22Status="null";
                String A23Status="null";
                String A24Status="null";
                String A25Status="null";
                String A26Status="null";
                String A27Status="null";
                String A28Status="null";
                String A29Status="null";
                String A30Status="null";

                String A31Status="null";
                String A32Status="null";
                String A33Status="null";
                String A34Status="null";
                String A35Status="null";
                String A36Status="null";
                String A37Status="null";
                String A38Status="null";
                String A39Status="null";
                String A40Status="null";

                String A41Status="null";
                String A42Status="null";
                String A43Status="null";
                String A44Status="null";
                String A45Status="null";
                String A46Status="null";
                String A47Status="null";
                String A48Status="null";
                String A49Status="null";
                String A50Status="null";

                String A51Status="null";
                String A52Status="null";
                String A53Status="null";
                String A54Status="null";
                String A55Status="null";
                String A56Status="null";
                String A57Status="null";
                String A58Status="null";
                String A59Status="null";
                String A60Status="null";

                String A61Status="null";
                String A62Status="null";
                String A63Status="null";
                String A64Status="null";
                String A65Status="null";
                String A66Status="null";
                String A67Status="null";
                String A68Status="null";
                String A69Status="null";
                String A70Status="null";

                String A71Status="null";
                String A72Status="null";
                String A73Status="null";
                String A74Status="null";
                String A75Status="null";
                String A76Status="null";
                String A77Status="null";
                String A78Status="null";
                String A79Status="null";
                String A80Status="null";

                String A81Status="null";
                String A82Status="null";
                String A83Status="null";
                String A84Status="null";
                String A85Status="null";
                String A86Status="null";
                String A87Status="null";
                String A88Status="null";
                String A89Status="null";
                String A90Status="null";

                String A91Status="null";
                String A92Status="null";
                String A93Status="null";
                String A94Status="null";
                String A95Status="null";
                String A96Status="null";
                String A97Status="null";
                String A98Status="null";
                String A99Status="null";
                String A100Status="null";

                String A101Status="null";
                String A102Status="null";
                String A103Status="null";
                String A104Status="null";
                String A105Status="null";
                String A106Status="null";
                String A107Status="null";
                String A108Status="null";



                Cursor a1c = mDbHelper.getA1Status();
                if( a1c != null && a1c.moveToFirst() ){
                    A1Status=a1c.getString(0);
                    a1c.close();
                }
                Log.i("Status:",A1Status+"");
                if(A1Status.equals("f")){
                    A1.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A1Status.equals("o")){
                    A1.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a2c = mDbHelper.getA2Status();
                if( a2c != null && a2c.moveToFirst() ){
                    A2Status=a2c.getString(0);
                    a2c.close();
                }
                Log.i("Status:",A2Status+"");
                if(A2Status.equals("f")){
                    A2.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A2Status.equals("o")){
                    A2.setBackgroundColor(Color.parseColor("#E34040"));

                }
                Cursor a3c = mDbHelper.getA3Status();
                if( a3c != null && a3c.moveToFirst() ){
                    A3Status=a3c.getString(0);
                    a3c.close();
                }
                Log.i("Status:",A3Status+"");
                if(A3Status.equals("f")){
                    A3.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A3Status.equals("o")){
                    A3.setBackgroundColor(Color.parseColor("#E34040"));

                }
                Cursor a4c = mDbHelper.getA4Status();
                if( a4c != null && a4c.moveToFirst() ){
                    A4Status=a4c.getString(0);
                    a4c.close();
                }
                Log.i("Status:",A4Status+"");
                if(A4Status.equals("f")){
                    A4.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A4Status.equals("o")){
                    A4.setBackgroundColor(Color.parseColor("#E34040"));

                }
                Cursor a5c = mDbHelper.getA5Status();
                if( a5c != null && a5c.moveToFirst() ){
                    A5Status=a5c.getString(0);
                    a5c.close();
                }
                Log.i("Status:",A5Status+"");
                if(A5Status.equals("f")){
                    A5.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A5Status.equals("o")){
                    A5.setBackgroundColor(Color.parseColor("#E34040"));

                }
                Cursor a6c = mDbHelper.getA6Status();
                if( a6c != null && a6c.moveToFirst() ){
                    A6Status=a6c.getString(0);
                    a6c.close();
                }
                Log.i("Status:",A6Status+"");
                if(A6Status.equals("f")){
                    A6.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A6Status.equals("o")){
                    A6.setBackgroundColor(Color.parseColor("#E34040"));

                }
                Cursor a7c = mDbHelper.getA7Status();
                if( a7c != null && a7c.moveToFirst() ){
                    A7Status=a7c.getString(0);
                    a7c.close();
                }
                Log.i("Status:",A7Status+"");
                if(A7Status.equals("f")){
                    A7.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A7Status.equals("o")){
                    A7.setBackgroundColor(Color.parseColor("#E34040"));

                }
                Cursor a8c = mDbHelper.getA8Status();
                if( a8c != null && a8c.moveToFirst() ){
                    A8Status=a8c.getString(0);
                    a8c.close();
                }
                Log.i("Status:",A8Status+"");
                if(A8Status.equals("f")){
                    A8.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A8Status.equals("o")){
                    A8.setBackgroundColor(Color.parseColor("#E34040"));

                }
                Cursor a9c = mDbHelper.getA9Status();
                if( a9c != null && a9c.moveToFirst() ){
                    A9Status=a9c.getString(0);
                    a9c.close();
                }
                Log.i("Status:",A9Status+"");
                if(A9Status.equals("f")){
                    A9.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A9Status.equals("o")){
                    A9.setBackgroundColor(Color.parseColor("#E34040"));

                }
                Cursor a10c = mDbHelper.getA10Status();
                if( a10c != null && a10c.moveToFirst() ){
                    A10Status=a10c.getString(0);
                    a10c.close();
                }
                Log.i("Status:",A10Status+"");
                if(A10Status.equals("f")){
                    A10.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A10Status.equals("o")){
                    A10.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a12c = mDbHelper.getA12Status();
                if( a12c != null && a12c.moveToFirst() ){
                    A12Status=a12c.getString(0);
                    a12c.close();
                }
                Log.i("Status:",A12Status+"");
                if(A12Status.equals("f")){
                    A12.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A12Status.equals("o")){
                    A12.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a13c = mDbHelper.getA13Status();
                if( a13c != null && a13c.moveToFirst() ){
                    A13Status=a13c.getString(0);
                    a13c.close();
                }
                Log.i("Status:",A13Status+"");
                if(A13Status.equals("f")){
                    A13.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A13Status.equals("o")){
                    A13.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a14c = mDbHelper.getA14Status();
                if( a14c != null && a14c.moveToFirst() ){
                    A14Status=a14c.getString(0);
                    a14c.close();
                }
                Log.i("Status:",A14Status+"");
                if(A14Status.equals("f")){
                    A14.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A14Status.equals("o")){
                    A14.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a15c = mDbHelper.getA15Status();
                if( a15c != null && a15c.moveToFirst() ){
                    A15Status=a15c.getString(0);
                    a15c.close();
                }
                Log.i("Status:",A15Status+"");
                if(A15Status.equals("f")){
                    A15.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A15Status.equals("o")){
                    A15.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a16c = mDbHelper.getA16Status();
                if( a16c != null && a16c.moveToFirst() ){
                    A16Status=a16c.getString(0);
                    a16c.close();
                }
                Log.i("Status:",A16Status+"");
                if(A16Status.equals("f")){
                    A16.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A16Status.equals("o")){
                    A16.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a17c = mDbHelper.getA17Status();
                if( a17c != null && a17c.moveToFirst() ){
                    A17Status=a17c.getString(0);
                    a17c.close();
                }
                Log.i("Status:",A17Status+"");
                if(A17Status.equals("f")){
                    A17.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A17Status.equals("o")){
                    A17.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a18c = mDbHelper.getA18Status();
                if( a18c != null && a18c.moveToFirst() ){
                    A18Status=a18c.getString(0);
                    a18c.close();
                }
                Log.i("Status:",A18Status+"");
                if(A18Status.equals("f")){
                    A18.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A18Status.equals("o")){
                    A18.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a19c = mDbHelper.getA19Status();
                if( a19c != null && a19c.moveToFirst() ){
                    A19Status=a19c.getString(0);
                    a19c.close();
                }
                Log.i("Status:",A19Status+"");
                if(A19Status.equals("f")){
                    A19.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A19Status.equals("o")){
                    A19.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a20c = mDbHelper.getA20Status();
                if( a20c != null && a20c.moveToFirst() ){
                    A20Status=a20c.getString(0);
                    a20c.close();
                }
                Log.i("Status:",A20Status+"");
                if(A20Status.equals("f")){
                    A20.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A20Status.equals("o")){
                    A20.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a21c = mDbHelper.getA21Status();
                if( a21c != null && a21c.moveToFirst() ){
                    A21Status=a21c.getString(0);
                    a21c.close();
                }
                Log.i("Status:",A21Status+"");
                if(A21Status.equals("f")){
                    A21.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A21Status.equals("o")){
                    A21.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a22c = mDbHelper.getA22Status();
                if( a22c != null && a22c.moveToFirst() ){
                    A22Status=a22c.getString(0);
                    a22c.close();
                }
                Log.i("Status:",A22Status+"");
                if(A22Status.equals("f")){
                    A22.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A22Status.equals("o")){
                    A22.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a23c = mDbHelper.getA23Status();
                if( a23c != null && a23c.moveToFirst() ){
                    A23Status=a23c.getString(0);
                    a23c.close();
                }
                Log.i("Status:",A23Status+"");
                if(A23Status.equals("f")){
                    A23.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A23Status.equals("o")){
                    A23.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a24c = mDbHelper.getA24Status();
                if( a24c != null && a24c.moveToFirst() ){
                    A24Status=a24c.getString(0);
                    a24c.close();
                }
                Log.i("Status:",A24Status+"");
                if(A24Status.equals("f")){
                    A24.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A24Status.equals("o")){
                    A24.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a25c = mDbHelper.getA25Status();
                if( a25c != null && a25c.moveToFirst() ){
                    A25Status=a25c.getString(0);
                    a25c.close();
                }
                Log.i("Status:",A25Status+"");
                if(A25Status.equals("f")){
                    A25.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A25Status.equals("o")){
                    A25.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a26c = mDbHelper.getA26Status();
                if( a26c != null && a26c.moveToFirst() ){
                    A26Status=a26c.getString(0);
                    a26c.close();
                }
                Log.i("Status:",A26Status+"");
                if(A26Status.equals("f")){
                    A26.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A26Status.equals("o")){
                    A26.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a27c = mDbHelper.getA27Status();
                if( a27c != null && a27c.moveToFirst() ){
                    A27Status=a27c.getString(0);
                    a27c.close();
                }
                Log.i("Status:",A27Status+"");
                if(A27Status.equals("f")){
                    A27.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A27Status.equals("o")){
                    A27.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a28c = mDbHelper.getA28Status();
                if( a28c != null && a28c.moveToFirst() ){
                    A28Status=a28c.getString(0);
                    a28c.close();
                }
                Log.i("Status:",A28Status+"");
                if(A28Status.equals("f")){
                    A28.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A28Status.equals("o")){
                    A28.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a29c = mDbHelper.getA29Status();
                if( a29c != null && a29c.moveToFirst() ){
                    A29Status=a29c.getString(0);
                    a29c.close();
                }
                Log.i("Status:",A29Status+"");
                if(A29Status.equals("f")){
                    A29.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A29Status.equals("o")){
                    A29.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a30c = mDbHelper.getA30Status();
                if( a30c != null && a30c.moveToFirst() ){
                    A30Status=a30c.getString(0);
                    a30c.close();
                }
                Log.i("Status:",A30Status+"");
                if(A30Status.equals("f")){
                    A30.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A30Status.equals("o")){
                    A30.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a31c = mDbHelper.getA31Status();
                if( a31c != null && a31c.moveToFirst() ){
                    A31Status=a31c.getString(0);
                    a31c.close();
                }
                Log.i("Status:",A31Status+"");
                if(A31Status.equals("f")){
                    A31.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A31Status.equals("o")){
                    A31.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a32c = mDbHelper.getA32Status();
                if( a32c != null && a32c.moveToFirst() ){
                    A32Status=a32c.getString(0);
                    a32c.close();
                }
                Log.i("Status:",A32Status+"");
                if(A32Status.equals("f")){
                    A32.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A32Status.equals("o")){
                    A32.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a33c = mDbHelper.getA33Status();
                if( a33c != null && a33c.moveToFirst() ){
                    A33Status=a33c.getString(0);
                    a33c.close();
                }
                Log.i("Status:",A33Status+"");
                if(A33Status.equals("f")){
                    A33.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A33Status.equals("o")){
                    A33.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a34c = mDbHelper.getA34Status();
                if( a34c != null && a34c.moveToFirst() ){
                    A34Status=a34c.getString(0);
                    a34c.close();
                }
                Log.i("Status:",A34Status+"");
                if(A34Status.equals("f")){
                    A34.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A34Status.equals("o")){
                    A34.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a35c = mDbHelper.getA35Status();
                if( a35c != null && a35c.moveToFirst() ){
                    A35Status=a35c.getString(0);
                    a35c.close();
                }
                Log.i("Status:",A35Status+"");
                if(A35Status.equals("f")){
                    A35.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A35Status.equals("o")){
                    A35.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a36c = mDbHelper.getA36Status();
                if( a36c != null && a36c.moveToFirst() ){
                    A36Status=a36c.getString(0);
                    a36c.close();
                }
                Log.i("Status:",A36Status+"");
                if(A36Status.equals("f")){
                    A36.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A36Status.equals("o")){
                    A36.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a37c = mDbHelper.getA37Status();
                if( a37c != null && a37c.moveToFirst() ){
                    A37Status=a37c.getString(0);
                    a37c.close();
                }
                Log.i("Status:",A37Status+"");
                if(A37Status.equals("f")){
                    A37.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A37Status.equals("o")){
                    A37.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a38c = mDbHelper.getA38Status();
                if( a38c != null && a38c.moveToFirst() ){
                    A38Status=a38c.getString(0);
                    a38c.close();
                }
                Log.i("Status:",A38Status+"");
                if(A38Status.equals("f")){
                    A38.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A38Status.equals("o")){
                    A38.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a39c = mDbHelper.getA39Status();
                if( a39c != null && a39c.moveToFirst() ){
                    A39Status=a39c.getString(0);
                    a39c.close();
                }
                Log.i("Status:",A39Status+"");
                if(A39Status.equals("f")){
                    A39.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A39Status.equals("o")){
                    A39.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a40c = mDbHelper.getA40Status();
                if( a40c != null && a40c.moveToFirst() ){
                    A40Status=a40c.getString(0);
                    a40c.close();
                }
                Log.i("Status:",A40Status+"");
                if(A40Status.equals("f")){
                    A40.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A40Status.equals("o")){
                    A40.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a41c = mDbHelper.getA41Status();
                if( a41c != null && a41c.moveToFirst() ){
                    A41Status=a41c.getString(0);
                    a41c.close();
                }
                Log.i("Status:",A41Status+"");
                if(A41Status.equals("f")){
                    A41.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A41Status.equals("o")){
                    A41.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a42c = mDbHelper.getA42Status();
                if( a42c != null && a42c.moveToFirst() ){
                    A42Status=a42c.getString(0);
                    a42c.close();
                }
                Log.i("Status:",A42Status+"");
                if(A42Status.equals("f")){
                    A42.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A42Status.equals("o")){
                    A42.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a43c = mDbHelper.getA43Status();
                if( a43c != null && a43c.moveToFirst() ){
                    A43Status=a43c.getString(0);
                    a43c.close();
                }
                Log.i("Status:",A43Status+"");
                if(A43Status.equals("f")){
                    A43.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A43Status.equals("o")){
                    A43.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a44c = mDbHelper.getA44Status();
                if( a44c != null && a44c.moveToFirst() ){
                    A44Status=a44c.getString(0);
                    a44c.close();
                }
                Log.i("Status:",A44Status+"");
                if(A44Status.equals("f")){
                    A44.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A44Status.equals("o")){
                    A44.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a45c = mDbHelper.getA45Status();
                if( a45c != null && a45c.moveToFirst() ){
                    A45Status=a45c.getString(0);
                    a45c.close();
                }
                Log.i("Status:",A45Status+"");
                if(A45Status.equals("f")){
                    A45.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A45Status.equals("o")){
                    A45.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a46c = mDbHelper.getA46Status();
                if( a46c != null && a46c.moveToFirst() ){
                    A46Status=a46c.getString(0);
                    a46c.close();
                }
                Log.i("Status:",A46Status+"");
                if(A46Status.equals("f")){
                    A46.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A46Status.equals("o")){
                    A46.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a47c = mDbHelper.getA47Status();
                if( a47c != null && a47c.moveToFirst() ){
                    A47Status=a47c.getString(0);
                    a47c.close();
                }
                Log.i("Status:",A47Status+"");
                if(A47Status.equals("f")){
                    A47.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A47Status.equals("o")){
                    A47.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a48c = mDbHelper.getA48Status();
                if( a48c != null && a48c.moveToFirst() ){
                    A48Status=a48c.getString(0);
                    a48c.close();
                }
                Log.i("Status:",A48Status+"");
                if(A48Status.equals("f")){
                    A48.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A48Status.equals("o")){
                    A48.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a49c = mDbHelper.getA49Status();
                if( a49c != null && a49c.moveToFirst() ){
                    A49Status=a49c.getString(0);
                    a49c.close();
                }
                Log.i("Status:",A49Status+"");
                if(A49Status.equals("f")){
                    A49.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A49Status.equals("o")){
                    A49.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a50c = mDbHelper.getA50Status();
                if( a50c != null && a50c.moveToFirst() ){
                    A50Status=a50c.getString(0);
                    a50c.close();
                }
                Log.i("Status:",A50Status+"");
                if(A50Status.equals("f")){
                    A50.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A50Status.equals("o")){
                    A50.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a51c = mDbHelper.getA51Status();
                if( a51c != null && a51c.moveToFirst() ){
                    A51Status=a51c.getString(0);
                    a51c.close();
                }
                Log.i("Status:",A51Status+"");
                if(A51Status.equals("f")){
                    A51.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A51Status.equals("o")){
                    A51.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a52c = mDbHelper.getA52Status();
                if( a52c != null && a52c.moveToFirst() ){
                    A52Status=a52c.getString(0);
                    a52c.close();
                }
                Log.i("Status:",A52Status+"");
                if(A52Status.equals("f")){
                    A52.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A52Status.equals("o")){
                    A52.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a53c = mDbHelper.getA53Status();
                if( a53c != null && a53c.moveToFirst() ){
                    A53Status=a53c.getString(0);
                    a53c.close();
                }
                Log.i("Status:",A53Status+"");
                if(A53Status.equals("f")){
                    A53.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A53Status.equals("o")){
                    A53.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a54c = mDbHelper.getA54Status();
                if( a54c != null && a54c.moveToFirst() ){
                    A54Status=a54c.getString(0);
                    a54c.close();
                }
                Log.i("Status:",A54Status+"");
                if(A54Status.equals("f")){
                    A54.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A54Status.equals("o")){
                    A54.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a55c = mDbHelper.getA55Status();
                if( a55c != null && a55c.moveToFirst() ){
                    A55Status=a55c.getString(0);
                    a55c.close();
                }
                Log.i("Status:",A55Status+"");
                if(A55Status.equals("f")){
                    A55.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A55Status.equals("o")){
                    A55.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a56c = mDbHelper.getA56Status();
                if( a56c != null && a56c.moveToFirst() ){
                    A56Status=a56c.getString(0);
                    a56c.close();
                }
                Log.i("Status:",A56Status+"");
                if(A56Status.equals("f")){
                    A56.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A56Status.equals("o")){
                    A56.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a57c = mDbHelper.getA57Status();
                if( a57c != null && a57c.moveToFirst() ){
                    A57Status=a57c.getString(0);
                    a57c.close();
                }
                Log.i("Status:",A57Status+"");
                if(A57Status.equals("f")){
                    A57.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A57Status.equals("o")){
                    A57.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a58c = mDbHelper.getA58Status();
                if( a58c != null && a58c.moveToFirst() ){
                    A58Status=a58c.getString(0);
                    a58c.close();
                }
                Log.i("Status:",A58Status+"");
                if(A58Status.equals("f")){
                    A58.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A58Status.equals("o")){
                    A58.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a59c = mDbHelper.getA59Status();
                if( a59c != null && a59c.moveToFirst() ){
                    A59Status=a59c.getString(0);
                    a59c.close();
                }
                Log.i("Status:",A59Status+"");
                if(A59Status.equals("f")){
                    A59.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A59Status.equals("o")){
                    A59.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a60c = mDbHelper.getA60Status();
                if( a60c != null && a60c.moveToFirst() ){
                    A60Status=a60c.getString(0);
                    a60c.close();
                }
                Log.i("Status:",A60Status+"");
                if(A60Status.equals("f")){
                    A60.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A60Status.equals("o")){
                    A60.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a61c = mDbHelper.getA61Status();
                if( a61c != null && a61c.moveToFirst() ){
                    A61Status=a61c.getString(0);
                    a61c.close();
                }
                Log.i("Status:",A61Status+"");
                if(A61Status.equals("f")){
                    A61.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A61Status.equals("o")){
                    A61.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a62c = mDbHelper.getA62Status();
                if( a62c != null && a62c.moveToFirst() ){
                    A62Status=a62c.getString(0);
                    a62c.close();
                }
                Log.i("Status:",A62Status+"");
                if(A62Status.equals("f")){
                    A62.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A62Status.equals("o")){
                    A62.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a63c = mDbHelper.getA63Status();
                if( a63c != null && a63c.moveToFirst() ){
                    A63Status=a63c.getString(0);
                    a63c.close();
                }
                Log.i("Status:",A63Status+"");
                if(A63Status.equals("f")){
                    A63.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A63Status.equals("o")){
                    A63.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a64c = mDbHelper.getA64Status();
                if( a64c != null && a64c.moveToFirst() ){
                    A64Status=a64c.getString(0);
                    a64c.close();
                }
                Log.i("Status:",A64Status+"");
                if(A64Status.equals("f")){
                    A64.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A64Status.equals("o")){
                    A64.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a65c = mDbHelper.getA65Status();
                if( a65c != null && a65c.moveToFirst() ){
                    A65Status=a65c.getString(0);
                    a65c.close();
                }
                Log.i("Status:",A65Status+"");
                if(A65Status.equals("f")){
                    A65.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A65Status.equals("o")){
                    A65.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a66c = mDbHelper.getA66Status();
                if( a66c != null && a66c.moveToFirst() ){
                    A66Status=a66c.getString(0);
                    a66c.close();
                }
                Log.i("Status:",A66Status+"");
                if(A66Status.equals("f")){
                    A66.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A66Status.equals("o")){
                    A66.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a67c = mDbHelper.getA67Status();
                if( a67c != null && a67c.moveToFirst() ){
                    A67Status=a67c.getString(0);
                    a67c.close();
                }
                Log.i("Status:",A67Status+"");
                if(A67Status.equals("f")){
                    A67.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A67Status.equals("o")){
                    A67.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a68c = mDbHelper.getA68Status();
                if( a68c != null && a68c.moveToFirst() ){
                    A68Status=a68c.getString(0);
                    a68c.close();
                }
                Log.i("Status:",A68Status+"");
                if(A68Status.equals("f")){
                    A68.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A68Status.equals("o")){
                    A68.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a69c = mDbHelper.getA69Status();
                if( a69c != null && a69c.moveToFirst() ){
                    A69Status=a69c.getString(0);
                    a69c.close();
                }
                Log.i("Status:",A69Status+"");
                if(A69Status.equals("f")){
                    A69.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A69Status.equals("o")){
                    A69.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a70c = mDbHelper.getA70Status();
                if( a70c != null && a70c.moveToFirst() ){
                    A70Status=a70c.getString(0);
                    a70c.close();
                }
                Log.i("Status:",A70Status+"");
                if(A70Status.equals("f")){
                    A70.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A70Status.equals("o")){
                    A70.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a71c = mDbHelper.getA71Status();
                if( a71c != null && a71c.moveToFirst() ){
                    A71Status=a71c.getString(0);
                    a71c.close();
                }
                Log.i("Status:",A71Status+"");
                if(A71Status.equals("f")){
                    A71.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A71Status.equals("o")){
                    A71.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a72c = mDbHelper.getA72Status();
                if( a72c != null && a72c.moveToFirst() ){
                    A72Status=a72c.getString(0);
                    a72c.close();
                }
                Log.i("Status:",A72Status+"");
                if(A72Status.equals("f")){
                    A72.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A72Status.equals("o")){
                    A72.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a73c = mDbHelper.getA73Status();
                if( a73c != null && a73c.moveToFirst() ){
                    A73Status=a73c.getString(0);
                    a73c.close();
                }
                Log.i("Status:",A73Status+"");
                if(A73Status.equals("f")){
                    A73.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A73Status.equals("o")){
                    A73.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a74c = mDbHelper.getA74Status();
                if( a74c != null && a74c.moveToFirst() ){
                    A74Status=a74c.getString(0);
                    a74c.close();
                }
                Log.i("Status:",A74Status+"");
                if(A74Status.equals("f")){
                    A74.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A74Status.equals("o")){
                    A74.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a75c = mDbHelper.getA75Status();
                if( a75c != null && a75c.moveToFirst() ){
                    A75Status=a75c.getString(0);
                    a75c.close();
                }
                Log.i("Status:",A75Status+"");
                if(A75Status.equals("f")){
                    A75.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A75Status.equals("o")){
                    A75.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a76c = mDbHelper.getA76Status();
                if( a76c != null && a76c.moveToFirst() ){
                    A76Status=a76c.getString(0);
                    a76c.close();
                }
                Log.i("Status:",A76Status+"");
                if(A76Status.equals("f")){
                    A76.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A76Status.equals("o")){
                    A76.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a77c = mDbHelper.getA77Status();
                if( a77c != null && a77c.moveToFirst() ){
                    A77Status=a77c.getString(0);
                    a77c.close();
                }
                Log.i("Status:",A77Status+"");
                if(A77Status.equals("f")){
                    A77.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A77Status.equals("o")){
                    A77.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a78c = mDbHelper.getA78Status();
                if( a78c != null && a78c.moveToFirst() ){
                    A78Status=a78c.getString(0);
                    a78c.close();
                }
                Log.i("Status:",A78Status+"");
                if(A78Status.equals("f")){
                    A78.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A78Status.equals("o")){
                    A78.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a79c = mDbHelper.getA79Status();
                if( a79c != null && a79c.moveToFirst() ){
                    A79Status=a79c.getString(0);
                    a79c.close();
                }
                Log.i("Status:",A79Status+"");
                if(A79Status.equals("f")){
                    A79.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A79Status.equals("o")){
                    A79.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a80c = mDbHelper.getA80Status();
                if( a80c != null && a80c.moveToFirst() ){
                    A80Status=a80c.getString(0);
                    a80c.close();
                }
                Log.i("Status:",A80Status+"");
                if(A80Status.equals("f")){
                    A80.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A80Status.equals("o")){
                    A80.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a81c = mDbHelper.getA81Status();
                if( a81c != null && a81c.moveToFirst() ){
                    A81Status=a81c.getString(0);
                    a81c.close();
                }
                Log.i("Status:",A81Status+"");
                if(A81Status.equals("f")){
                    A81.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A81Status.equals("o")){
                    A81.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a82c = mDbHelper.getA82Status();
                if( a82c != null && a82c.moveToFirst() ){
                    A82Status=a82c.getString(0);
                    a82c.close();
                }
                Log.i("Status:",A82Status+"");
                if(A82Status.equals("f")){
                    A82.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A82Status.equals("o")){
                    A82.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a83c = mDbHelper.getA83Status();
                if( a83c != null && a83c.moveToFirst() ){
                    A83Status=a83c.getString(0);
                    a83c.close();
                }
                Log.i("Status:",A83Status+"");
                if(A83Status.equals("f")){
                    A83.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A83Status.equals("o")){
                    A83.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a84c = mDbHelper.getA84Status();
                if( a84c != null && a84c.moveToFirst() ){
                    A84Status=a84c.getString(0);
                    a84c.close();
                }
                Log.i("Status:",A84Status+"");
                if(A84Status.equals("f")){
                    A84.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A84Status.equals("o")){
                    A84.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a85c = mDbHelper.getA85Status();
                if( a85c != null && a85c.moveToFirst() ){
                    A85Status=a85c.getString(0);
                    a85c.close();
                }
                Log.i("Status:",A85Status+"");
                if(A85Status.equals("f")){
                    A85.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A85Status.equals("o")){
                    A85.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a86c = mDbHelper.getA86Status();
                if( a86c != null && a86c.moveToFirst() ){
                    A86Status=a86c.getString(0);
                    a86c.close();
                }
                Log.i("Status:",A86Status+"");
                if(A86Status.equals("f")){
                    A86.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A86Status.equals("o")){
                    A86.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a87c = mDbHelper.getA87Status();
                if( a87c != null && a87c.moveToFirst() ){
                    A87Status=a87c.getString(0);
                    a87c.close();
                }
                Log.i("Status:",A87Status+"");
                if(A87Status.equals("f")){
                    A87.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A87Status.equals("o")){
                    A87.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a88c = mDbHelper.getA88Status();
                if( a88c != null && a88c.moveToFirst() ){
                    A88Status=a88c.getString(0);
                    a88c.close();
                }
                Log.i("Status:",A88Status+"");
                if(A88Status.equals("f")){
                    A88.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A88Status.equals("o")){
                    A88.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a89c = mDbHelper.getA89Status();
                if( a89c != null && a89c.moveToFirst() ){
                    A89Status=a89c.getString(0);
                    a89c.close();
                }
                Log.i("Status:",A89Status+"");
                if(A89Status.equals("f")){
                    A89.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A89Status.equals("o")){
                    A89.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a90c = mDbHelper.getA90Status();
                if( a90c != null && a90c.moveToFirst() ){
                    A90Status=a90c.getString(0);
                    a90c.close();
                }
                Log.i("Status:",A90Status+"");
                if(A90Status.equals("f")){
                    A90.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A90Status.equals("o")){
                    A90.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a91c = mDbHelper.getA91Status();
                if( a91c != null && a91c.moveToFirst() ){
                    A91Status=a91c.getString(0);
                    a91c.close();
                }
                Log.i("Status:",A91Status+"");
                if(A91Status.equals("f")){
                    A91.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A91Status.equals("o")){
                    A91.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a92c = mDbHelper.getA92Status();
                if( a92c != null && a92c.moveToFirst() ){
                    A92Status=a92c.getString(0);
                    a92c.close();
                }
                Log.i("Status:",A92Status+"");
                if(A92Status.equals("f")){
                    A92.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A92Status.equals("o")){
                    A92.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a93c = mDbHelper.getA93Status();
                if( a93c != null && a93c.moveToFirst() ){
                    A93Status=a93c.getString(0);
                    a93c.close();
                }
                Log.i("Status:",A93Status+"");
                if(A93Status.equals("f")){
                    A93.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A93Status.equals("o")){
                    A93.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a94c = mDbHelper.getA94Status();
                if( a94c != null && a94c.moveToFirst() ){
                    A94Status=a94c.getString(0);
                    a94c.close();
                }
                Log.i("Status:",A94Status+"");
                if(A94Status.equals("f")){
                    A94.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A94Status.equals("o")){
                    A94.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a95c = mDbHelper.getA95Status();
                if( a95c != null && a95c.moveToFirst() ){
                    A95Status=a95c.getString(0);
                    a95c.close();
                }
                Log.i("Status:",A95Status+"");
                if(A95Status.equals("f")){
                    A95.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A95Status.equals("o")){
                    A95.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a96c = mDbHelper.getA96Status();
                if( a96c != null && a96c.moveToFirst() ){
                    A96Status=a96c.getString(0);
                    a96c.close();
                }
                Log.i("Status:",A96Status+"");
                if(A96Status.equals("f")){
                    A96.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A96Status.equals("o")){
                    A96.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a97c = mDbHelper.getA97Status();
                if( a97c != null && a97c.moveToFirst() ){
                    A97Status=a97c.getString(0);
                    a97c.close();
                }
                Log.i("Status:",A97Status+"");
                if(A97Status.equals("f")){
                    A97.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A97Status.equals("o")){
                    A97.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a98c = mDbHelper.getA98Status();
                if( a98c != null && a98c.moveToFirst() ){
                    A98Status=a98c.getString(0);
                    a98c.close();
                }
                Log.i("Status:",A98Status+"");
                if(A98Status.equals("f")){
                    A98.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A98Status.equals("o")){
                    A98.setBackgroundColor(Color.parseColor("#E34040"));

                }



                Cursor a99c = mDbHelper.getA99Status();
                if( a99c != null && a99c.moveToFirst() ){
                    A99Status=a99c.getString(0);
                    a99c.close();
                }
                Log.i("Status:",A99Status+"");
                if(A99Status.equals("f")){
                    A99.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A99Status.equals("o")){
                    A99.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a100c = mDbHelper.getA100Status();
                if( a100c != null && a100c.moveToFirst() ){
                    A100Status=a100c.getString(0);
                    a100c.close();
                }
                Log.i("Status:",A100Status+"");
                if(A100Status.equals("f")){
                    A100.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A100Status.equals("o")){
                    A100.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a101c = mDbHelper.getA101Status();
                if( a101c != null && a101c.moveToFirst() ){
                    A101Status=a101c.getString(0);
                    a101c.close();
                }
                Log.i("Status:",A101Status+"");
                if(A101Status.equals("f")){
                    A101.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A101Status.equals("o")){
                    A101.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a102c = mDbHelper.getA102Status();
                if( a102c != null && a102c.moveToFirst() ){
                    A102Status=a102c.getString(0);
                    a102c.close();
                }
                Log.i("Status:",A102Status+"");
                if(A102Status.equals("f")){
                    A102.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A102Status.equals("o")){
                    A102.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a103c = mDbHelper.getA103Status();
                if( a103c != null && a103c.moveToFirst() ){
                    A103Status=a103c.getString(0);
                    a103c.close();
                }
                Log.i("Status:",A103Status+"");
                if(A103Status.equals("f")){
                    A103.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A103Status.equals("o")){
                    A103.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a104c = mDbHelper.getA104Status();
                if( a104c != null && a104c.moveToFirst() ){
                    A104Status=a104c.getString(0);
                    a104c.close();
                }
                Log.i("Status:",A104Status+"");
                if(A104Status.equals("f")){
                    A104.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A104Status.equals("o")){
                    A104.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a105c = mDbHelper.getA105Status();
                if( a105c != null && a105c.moveToFirst() ){
                    A105Status=a105c.getString(0);
                    a105c.close();
                }
                Log.i("Status:",A105Status+"");
                if(A105Status.equals("f")){
                    A105.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A105Status.equals("o")){
                    A105.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a106c = mDbHelper.getA106Status();
                if( a106c != null && a106c.moveToFirst() ){
                    A106Status=a106c.getString(0);
                    a106c.close();
                }
                Log.i("Status:",A106Status+"");
                if(A106Status.equals("f")){
                    A106.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A106Status.equals("o")){
                    A106.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a107c = mDbHelper.getA107Status();
                if( a107c != null && a107c.moveToFirst() ){
                    A107Status=a107c.getString(0);
                    a107c.close();
                }
                Log.i("Status:",A107Status+"");
                if(A107Status.equals("f")){
                    A107.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A107Status.equals("o")){
                    A107.setBackgroundColor(Color.parseColor("#E34040"));

                }

                Cursor a108c = mDbHelper.getA108Status();
                if( a108c != null && a108c.moveToFirst() ){
                    A108Status=a108c.getString(0);
                    a108c.close();
                }
                Log.i("Status:",A108Status+"");
                if(A108Status.equals("f")){
                    A108.setBackgroundColor(Color.parseColor("#5ED177"));

                }
                else if(A108Status.equals("o")){
                    A108.setBackgroundColor(Color.parseColor("#E34040"));

                }



                // do stuff with UI
            }
        };
        Thread timer = new Thread() {
            public void run () {
                for (;;) {
                    // do stuff in a separate thread
                    uiCallback.sendEmptyMessage(0);
                    uiCallback1.sendEmptyMessage(0);
                    try {
                        Thread.sleep(1000);    // sleep for 3 seconds
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        timer.start();




    }
}
