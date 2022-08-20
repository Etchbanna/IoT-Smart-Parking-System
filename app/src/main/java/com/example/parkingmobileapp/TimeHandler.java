package com.example.parkingmobileapp;
import static java.security.AccessController.getContext;

import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.os.*;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Date;
import java.util.Calendar;
import java.util.Calendar.Builder;

@RequiresApi(api = Build.VERSION_CODES.O)
public class TimeHandler extends Handler {
//    public static Date now=new Date(2022,8,10);


    public static Calendar now=new Calendar.Builder().setDate(2022,3,15)
            .set(Calendar.HOUR,8).set(Calendar.MINUTE,0).build();






        @Override
        public void handleMessage (Message msg) {


            if(now.get(Calendar.MINUTE)==59){
                now.set(Calendar.HOUR,now.get(Calendar.HOUR)+1);
                now.set(Calendar.MINUTE,0);

            }
            else {
                now.set(Calendar.MINUTE, now.get(Calendar.MINUTE) + 1);
            }




        }

}
