package com.example.parkingmobileapp;

import androidx.appcompat.app.AppCompatActivity;

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


public class Layout3 extends AppCompatActivity {
    Button a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17;
    Button c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16;
    Button d1, d2, d3, d4, d5, d6, d7;
    Button e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout3);
        a1 = findViewById(R.id.A1);
        a2 = findViewById(R.id.A2);
        a3 = findViewById(R.id.A3);
        a4 = findViewById(R.id.A4);
        a5 = findViewById(R.id.A5);
        a7 = findViewById(R.id.A7);
        a6 = findViewById(R.id.A6);
        a8 = findViewById(R.id.A8);
        a9 = findViewById(R.id.A9);
        a10 = findViewById(R.id.A10);
        a11 = findViewById(R.id.A11);
        a12 = findViewById(R.id.A12);

        b1 = findViewById(R.id.B1);
        b2 = findViewById(R.id.B2);
        b3 = findViewById(R.id.B3);
        b4 = findViewById(R.id.B4);
        b5 = findViewById(R.id.B5);
        b6 = findViewById(R.id.B6);
        b7 = findViewById(R.id.B7);
        b8 = findViewById(R.id.B8);
        b9 = findViewById(R.id.B9);
        b11 = findViewById(R.id.B11);
        b10 = findViewById(R.id.B10);
        b12 = findViewById(R.id.B12);
        b13 = findViewById(R.id.B13);
        b14 = findViewById(R.id.B14);
        b16 = findViewById(R.id.B16);
        b17 = findViewById(R.id.B17);
        b15 = findViewById(R.id.B15);

        c1 = findViewById(R.id.C1);
        c2 = findViewById(R.id.C2);
        c3 = findViewById(R.id.C3);
        c4 = findViewById(R.id.C4);
        c5 = findViewById(R.id.C5);
        c6 = findViewById(R.id.C6);
        c7 = findViewById(R.id.C7);
        c8 = findViewById(R.id.C8);
        c9 = findViewById(R.id.C9);
        c10 = findViewById(R.id.C10);
        c11 = findViewById(R.id.C11);
        c12 = findViewById(R.id.C12);
        c13 = findViewById(R.id.C13);
        c14 = findViewById(R.id.H4);
        c15 = findViewById(R.id.H5);
        c16 = findViewById(R.id.H7);

        d1 = findViewById(R.id.D1);
        d2 = findViewById(R.id.D2);
        d3 = findViewById(R.id.D3);
        d4 = findViewById(R.id.D4);
        d5 = findViewById(R.id.D5);
        d6 = findViewById(R.id.D6);
        d7 = findViewById(R.id.D7);

        e1 = findViewById(R.id.E1);
        e2 = findViewById(R.id.E2);
        e3 = findViewById(R.id.E3);
        e4 = findViewById(R.id.E4);
        e5 = findViewById(R.id.E5);
        e6 = findViewById(R.id.E6);
        e7 = findViewById(R.id.E7);
        e8 = findViewById(R.id.E8);
        e9 = findViewById(R.id.E9);
        e11 = findViewById(R.id.E11);
        e10 = findViewById(R.id.E10);
        e12 = findViewById(R.id.E12);


        TextView chosen = (TextView) findViewById(R.id.chosen_spot);
        TextView status = (TextView) findViewById(R.id.spot_status);

        DatabaseAdapter mDbHelper = new DatabaseAdapter(getBaseContext());
        mDbHelper.createDatabase();
        mDbHelper.open();


        View.OnClickListener ButtonListener = new View.OnClickListener() {
            public void onClick(View v) {
                chosen.setText("" + v.getResources().getResourceEntryName(v.getId()) + " - Floor 1");
                switch (v.getId()) {
                    case R.id.A1:
                        Cursor a1c = mDbHelper.getA1Status();
                        String A1Status = a1c.getString(0);
                        if (A1Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (A1Status.equals("f")) {
                            status.setText("Free");
                        } else if (A1Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.A2:
                        Cursor a2c = mDbHelper.getA2Status();
                        String A2Status = a2c.getString(0);
                        if (A2Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (A2Status.equals("f")) {
                            status.setText("Free");
                        } else if (A2Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.A3:
                        Cursor a3c = mDbHelper.getA3Status();
                        String A3Status = a3c.getString(0);
                        if (A3Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (A3Status.equals("f")) {
                            status.setText("Free");
                        } else if (A3Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.A4:
                        Cursor a4c = mDbHelper.getA4Status();
                        String A4Status = a4c.getString(0);
                        if (A4Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (A4Status.equals("f")) {
                            status.setText("Free");
                        } else if (A4Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.A5:
                        Cursor a5c = mDbHelper.getA5Status();
                        String A5Status = a5c.getString(0);
                        if (A5Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (A5Status.equals("f")) {
                            status.setText("Free");
                        } else if (A5Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.A6:
                        Cursor a6c = mDbHelper.getA6Status();
                        String A6Status = a6c.getString(0);
                        if (A6Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (A6Status.equals("f")) {
                            status.setText("Free");
                        } else if (A6Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.A7:
                        Cursor a7c = mDbHelper.getA7Status();
                        String A7Status = a7c.getString(0);
                        if (A7Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (A7Status.equals("f")) {
                            status.setText("Free");
                        } else if (A7Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.A8:
                        Cursor a8c = mDbHelper.getA8Status();
                        String A8Status = a8c.getString(0);
                        if (A8Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (A8Status.equals("f")) {
                            status.setText("Free");
                        } else if (A8Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.A9:
                        Cursor a9c = mDbHelper.getA9Status();
                        String A9Status = a9c.getString(0);
                        if (A9Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (A9Status.equals("f")) {
                            status.setText("Free");
                        } else if (A9Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.A10:
                        Cursor a10c = mDbHelper.getA10Status();
                        String A10Status = a10c.getString(0);
                        if (A10Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (A10Status.equals("f")) {
                            status.setText("Free");
                        } else if (A10Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.A11:
                        Cursor a11c = mDbHelper.getA11Status();
                        String A11Status = a11c.getString(0);
                        if (A11Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (A11Status.equals("f")) {
                            status.setText("Free");
                        } else if (A11Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.A12:
                        Cursor a12c = mDbHelper.getA12Status();
                        String A12Status = a12c.getString(0);
                        if (A12Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (A12Status.equals("f")) {
                            status.setText("Free");
                        } else if (A12Status.equals("r")) {
                            status.setText("Reserved");

                        }

                    case R.id.B1:
                        Cursor b1c = mDbHelper.getB1Status();
                        String B1Status = b1c.getString(0);
                        if (B1Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (B1Status.equals("f")) {
                            status.setText("Free");
                        } else if (B1Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.B2:
                        Cursor b2c = mDbHelper.getB2Status();
                        String B2Status = b2c.getString(0);
                        if (B2Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (B2Status.equals("f")) {
                            status.setText("Free");
                        } else if (B2Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.B3:
                        Cursor b3c = mDbHelper.getB3Status();
                        String B3Status = b3c.getString(0);
                        if (B3Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (B3Status.equals("f")) {
                            status.setText("Free");
                        } else if (B3Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.B4:
                        Cursor b4c = mDbHelper.getB4Status();
                        String B4Status = b4c.getString(0);
                        if (B4Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (B4Status.equals("f")) {
                            status.setText("Free");
                        } else if (B4Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.B5:
                        Cursor b5c = mDbHelper.getB5Status();
                        String B5Status = b5c.getString(0);
                        if (B5Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (B5Status.equals("f")) {
                            status.setText("Free");
                        } else if (B5Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.B6:
                        Cursor b6c = mDbHelper.getB6Status();
                        String B6Status = b6c.getString(0);
                        if (B6Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (B6Status.equals("f")) {
                            status.setText("Free");
                        } else if (B6Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.B7:
                        Cursor b7c = mDbHelper.getB7Status();
                        String B7Status = b7c.getString(0);
                        if (B7Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (B7Status.equals("f")) {
                            status.setText("Free");
                        } else if (B7Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.B8:
                        Cursor b8c = mDbHelper.getB8Status();
                        String B8Status = b8c.getString(0);
                        if (B8Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (B8Status.equals("f")) {
                            status.setText("Free");
                        } else if (B8Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.B9:
                        Cursor b9c = mDbHelper.getB9Status();
                        String B9Status = b9c.getString(0);
                        if (B9Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (B9Status.equals("f")) {
                            status.setText("Free");
                        } else if (B9Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.B10:
                        Cursor b10c = mDbHelper.getB10Status();
                        String B10Status = b10c.getString(0);
                        if (B10Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (B10Status.equals("f")) {
                            status.setText("Free");
                        } else if (B10Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.B11:
                        Cursor b11c = mDbHelper.getB11Status();
                        String B11Status = b11c.getString(0);
                        if (B11Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (B11Status.equals("f")) {
                            status.setText("Free");
                        } else if (B11Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.B12:
                        Cursor b12c = mDbHelper.getB12Status();
                        String B12Status = b12c.getString(0);
                        if (B12Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (B12Status.equals("f")) {
                            status.setText("Free");
                        } else if (B12Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.B13:
                        Cursor b13c = mDbHelper.getB13Status();
                        String B13Status = b13c.getString(0);
                        if (B13Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (B13Status.equals("f")) {
                            status.setText("Free");
                        } else if (B13Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.B14:
                        Cursor b14c = mDbHelper.getB14Status();
                        String B14Status = b14c.getString(0);
                        if (B14Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (B14Status.equals("f")) {
                            status.setText("Free");
                        } else if (B14Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.B15:
                        Cursor b15c = mDbHelper.getB15Status();
                        String B15Status = b15c.getString(0);
                        if (B15Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (B15Status.equals("f")) {
                            status.setText("Free");
                        } else if (B15Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.B16:
                        Cursor b16c = mDbHelper.getB16Status();
                        String B16Status = b16c.getString(0);
                        if (B16Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (B16Status.equals("f")) {
                            status.setText("Free");
                        } else if (B16Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.B17:
                        Cursor b17c = mDbHelper.getB17Status();
                        String B17Status = b17c.getString(0);
                        if (B17Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (B17Status.equals("f")) {
                            status.setText("Free");
                        } else if (B17Status.equals("r")) {
                            status.setText("Reserved");

                        }


                    case R.id.C1:
                        Cursor c1c = mDbHelper.getC1Status();
                        String C1Status = c1c.getString(0);
                        if (C1Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (C1Status.equals("f")) {
                            status.setText("Free");
                        } else if (C1Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.C2:
                        Cursor c2c = mDbHelper.getC2Status();
                        String C2Status = c2c.getString(0);
                        if (C2Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (C2Status.equals("f")) {
                            status.setText("Free");
                        } else if (C2Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.C3:
                        Cursor c3c = mDbHelper.getC3Status();
                        String C3Status = c3c.getString(0);
                        if (C3Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (C3Status.equals("f")) {
                            status.setText("Free");
                        } else if (C3Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.C4:
                        Cursor c4c = mDbHelper.getC4Status();
                        String C4Status = c4c.getString(0);
                        if (C4Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (C4Status.equals("f")) {
                            status.setText("Free");
                        } else if (C4Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.C5:
                        Cursor c5c = mDbHelper.getC5Status();
                        String C5Status = c5c.getString(0);
                        if (C5Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (C5Status.equals("f")) {
                            status.setText("Free");
                        } else if (C5Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.C6:
                        Cursor c6c = mDbHelper.getC6Status();
                        String C6Status = c6c.getString(0);
                        if (C6Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (C6Status.equals("f")) {
                            status.setText("Free");
                        } else if (C6Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.C7:
                        Cursor c7c = mDbHelper.getC7Status();
                        String C7Status = c7c.getString(0);
                        if (C7Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (C7Status.equals("f")) {
                            status.setText("Free");
                        } else if (C7Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.C8:
                        Cursor c8c = mDbHelper.getC8Status();
                        String C8Status = c8c.getString(0);
                        if (C8Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (C8Status.equals("f")) {
                            status.setText("Free");
                        } else if (C8Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.C9:
                        Cursor c9c = mDbHelper.getC9Status();
                        String C9Status = c9c.getString(0);
                        if (C9Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (C9Status.equals("f")) {
                            status.setText("Free");
                        } else if (C9Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.C10:
                        Cursor c10c = mDbHelper.getC10Status();
                        String C10Status = c10c.getString(0);
                        if (C10Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (C10Status.equals("f")) {
                            status.setText("Free");
                        } else if (C10Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.C11:
                        Cursor c11c = mDbHelper.getC11Status();
                        String C11Status = c11c.getString(0);
                        if (C11Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (C11Status.equals("f")) {
                            status.setText("Free");
                        } else if (C11Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.C12:
                        Cursor c12c = mDbHelper.getC12Status();
                        String C12Status = c12c.getString(0);
                        if (C12Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (C12Status.equals("f")) {
                            status.setText("Free");
                        } else if (C12Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.C13:
                        Cursor c13c = mDbHelper.getC13Status();
                        String C13Status = c13c.getString(0);
                        if (C13Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (C13Status.equals("f")) {
                            status.setText("Free");
                        } else if (C13Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.H4:
                        Cursor c14c = mDbHelper.getC14Status();
                        String C14Status = c14c.getString(0);
                        if (C14Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (C14Status.equals("f")) {
                            status.setText("Free");
                        } else if (C14Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.H5:
                        Cursor c15c = mDbHelper.getC15Status();
                        String C15Status = c15c.getString(0);
                        if (C15Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (C15Status.equals("f")) {
                            status.setText("Free");
                        } else if (C15Status.equals("r")) {
                            status.setText("Reserved");

                        }

                    case R.id.H7:
                        Cursor c16c = mDbHelper.getC16Status();
                        String C16Status = c16c.getString(0);
                        if (C16Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (C16Status.equals("f")) {
                            status.setText("Free");
                        } else if (C16Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.d1:
                        Cursor d1c = mDbHelper.getD1Status();
                        String D1Status = d1c.getString(0);
                        if (D1Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (D1Status.equals("f")) {
                            status.setText("Free");
                        } else if (D1Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.d2:
                        Cursor d2c = mDbHelper.getD2Status();
                        String D2Status = d2c.getString(0);
                        if (D2Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (D2Status.equals("f")) {
                            status.setText("Free");
                        } else if (D2Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.d3:
                        Cursor d3c = mDbHelper.getD3Status();
                        String D3Status = d3c.getString(0);
                        if (D3Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (D3Status.equals("f")) {
                            status.setText("Free");
                        } else if (D3Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.d4:
                        Cursor d4c = mDbHelper.getD4Status();
                        String D4Status = d4c.getString(0);
                        if (D4Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (D4Status.equals("f")) {
                            status.setText("Free");
                        } else if (D4Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.d5:
                        Cursor d5c = mDbHelper.getD5Status();
                        String D5Status = d5c.getString(0);
                        if (D5Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (D5Status.equals("f")) {
                            status.setText("Free");
                        } else if (D5Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.d6:
                        Cursor d6c = mDbHelper.getD6Status();
                        String D6Status = d6c.getString(0);
                        if (D6Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (D6Status.equals("f")) {
                            status.setText("Free");
                        } else if (D6Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.d7:
                        Cursor d7c = mDbHelper.getD7Status();
                        String D7Status = d7c.getString(0);
                        if (D7Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (D7Status.equals("f")) {
                            status.setText("Free");
                        } else if (D7Status.equals("r")) {
                            status.setText("Reserved");

                        }


                    case R.id.E1:
                        Cursor e1c = mDbHelper.getE1Status();
                        String E1Status = e1c.getString(0);
                        if (E1Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (E1Status.equals("f")) {
                            status.setText("Free");
                        } else if (E1Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.E2:
                        Cursor e2c = mDbHelper.getE2Status();
                        String E2Status = e2c.getString(0);
                        if (E2Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (E2Status.equals("f")) {
                            status.setText("Free");
                        } else if (E2Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.E3:
                        Cursor e3c = mDbHelper.getE3Status();
                        String E3Status = e3c.getString(0);
                        if (E3Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (E3Status.equals("f")) {
                            status.setText("Free");
                        } else if (E3Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.E4:
                        Cursor e4c = mDbHelper.getE4Status();
                        String E4Status = e4c.getString(0);
                        if (E4Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (E4Status.equals("f")) {
                            status.setText("Free");
                        } else if (E4Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.E5:
                        Cursor e5c = mDbHelper.getE5Status();
                        String E5Status = e5c.getString(0);
                        if (E5Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (E5Status.equals("f")) {
                            status.setText("Free");
                        } else if (E5Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.E6:
                        Cursor e6c = mDbHelper.getE6Status();
                        String E6Status = e6c.getString(0);
                        if (E6Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (E6Status.equals("f")) {
                            status.setText("Free");
                        } else if (E6Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.E7:
                        Cursor e7c = mDbHelper.getE7Status();
                        String E7Status = e7c.getString(0);
                        if (E7Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (E7Status.equals("f")) {
                            status.setText("Free");
                        } else if (E7Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.E8:
                        Cursor e8c = mDbHelper.getE8Status();
                        String E8Status = e8c.getString(0);
                        if (E8Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (E8Status.equals("f")) {
                            status.setText("Free");
                        } else if (E8Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.E9:
                        Cursor e9c = mDbHelper.getE9Status();
                        String E9Status = e9c.getString(0);
                        if (E9Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (E9Status.equals("f")) {
                            status.setText("Free");
                        } else if (E9Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.E10:
                        Cursor e10c = mDbHelper.getE10Status();
                        String E10Status = e10c.getString(0);
                        if (E10Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (E10Status.equals("f")) {
                            status.setText("Free");
                        } else if (E10Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.E11:
                        Cursor e11c = mDbHelper.getE11Status();
                        String E11Status = e11c.getString(0);
                        if (E11Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (E11Status.equals("f")) {
                            status.setText("Free");
                        } else if (E11Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.E12:
                        Cursor e12c = mDbHelper.getE12Status();
                        String E12Status = e12c.getString(0);
                        if (E12Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (E12Status.equals("f")) {
                            status.setText("Free");
                        } else if (E12Status.equals("r")) {
                            status.setText("Reserved");

                        }


                }


            }

        };


        a1.setOnClickListener(ButtonListener);
        a2.setOnClickListener(ButtonListener);
        a3.setOnClickListener(ButtonListener);
        a4.setOnClickListener(ButtonListener);
        a5.setOnClickListener(ButtonListener);
        a6.setOnClickListener(ButtonListener);
        a7.setOnClickListener(ButtonListener);
        a8.setOnClickListener(ButtonListener);
        a9.setOnClickListener(ButtonListener);
        a10.setOnClickListener(ButtonListener);
        a11.setOnClickListener(ButtonListener);
        a12.setOnClickListener(ButtonListener);

        b1.setOnClickListener(ButtonListener);
        b2.setOnClickListener(ButtonListener);
        b3.setOnClickListener(ButtonListener);
        b4.setOnClickListener(ButtonListener);
        b5.setOnClickListener(ButtonListener);
        b6.setOnClickListener(ButtonListener);
        b7.setOnClickListener(ButtonListener);
        b8.setOnClickListener(ButtonListener);
        b9.setOnClickListener(ButtonListener);
        b10.setOnClickListener(ButtonListener);
        b11.setOnClickListener(ButtonListener);
        b12.setOnClickListener(ButtonListener);
        b13.setOnClickListener(ButtonListener);
        b14.setOnClickListener(ButtonListener);
        b15.setOnClickListener(ButtonListener);
        b16.setOnClickListener(ButtonListener);
        b17.setOnClickListener(ButtonListener);

        c1.setOnClickListener(ButtonListener);
        c2.setOnClickListener(ButtonListener);
        c3.setOnClickListener(ButtonListener);
        c4.setOnClickListener(ButtonListener);
        c5.setOnClickListener(ButtonListener);
        c6.setOnClickListener(ButtonListener);
        c7.setOnClickListener(ButtonListener);
        c8.setOnClickListener(ButtonListener);
        c9.setOnClickListener(ButtonListener);
        c10.setOnClickListener(ButtonListener);
        c11.setOnClickListener(ButtonListener);
        c12.setOnClickListener(ButtonListener);
        c13.setOnClickListener(ButtonListener);
        c14.setOnClickListener(ButtonListener);
        c15.setOnClickListener(ButtonListener);
        c16.setOnClickListener(ButtonListener);

        d1.setOnClickListener(ButtonListener);
        d2.setOnClickListener(ButtonListener);
        d3.setOnClickListener(ButtonListener);
        d4.setOnClickListener(ButtonListener);
        d5.setOnClickListener(ButtonListener);
        d6.setOnClickListener(ButtonListener);
        d7.setOnClickListener(ButtonListener);

        e1.setOnClickListener(ButtonListener);
        e2.setOnClickListener(ButtonListener);
        e3.setOnClickListener(ButtonListener);
        e4.setOnClickListener(ButtonListener);
        e5.setOnClickListener(ButtonListener);
        e6.setOnClickListener(ButtonListener);
        e7.setOnClickListener(ButtonListener);
        e8.setOnClickListener(ButtonListener);
        e9.setOnClickListener(ButtonListener);
        e10.setOnClickListener(ButtonListener);
        e11.setOnClickListener(ButtonListener);
        e12.setOnClickListener(ButtonListener);


        Handler uiCallback = new Handler() {
            public void handleMessage(Message msg) {

                Cursor a1c = mDbHelper.getA1Status();
                String A1Status = a1c.getString(0);
                Log.i("Status:", A1Status + "");
                if (A1Status.equals("f")) {
                    a1.setBackgroundColor(Color.parseColor("#5ED177"));
                    a1.setText("A1 \n FREE");
                } else if (A1Status.equals("o")) {
                    a1.setBackgroundColor(Color.parseColor("#E34040"));
                    a1.setText("A1 \n OCCUPIED");
                }
                Cursor a2c = mDbHelper.getA2Status();
                String A2Status = a2c.getString(0);
                Log.i("Status:", A2Status + "");
                if (A2Status.equals("f")) {
                    a2.setBackgroundColor(Color.parseColor("#5ED177"));
                    a2.setText("A2 \n FREE");
                } else if (A2Status.equals("o")) {
                    a2.setBackgroundColor(Color.parseColor("#E34040"));
                    a2.setText("A2 \n OCCUPIED");
                }
                Cursor a3c = mDbHelper.getA3Status();
                String A3Status = a3c.getString(0);
                Log.i("Status:", A1Status + "");
                if (A3Status.equals("f")) {
                    a3.setBackgroundColor(Color.parseColor("#5ED177"));
                    a3.setText("A3 \n FREE");
                } else if (A1Status.equals("o")) {
                    a3.setBackgroundColor(Color.parseColor("#E34040"));
                    a3.setText("A3 \n OCCUPIED");
                }
                Cursor a4c = mDbHelper.getA4Status();
                String A4Status = a4c.getString(0);
                Log.i("Status:", A4Status + "");
                if (A4Status.equals("f")) {
                    a4.setBackgroundColor(Color.parseColor("#5ED177"));
                    a4.setText("A4 \n FREE");
                } else if (A4Status.equals("o")) {
                    a4.setBackgroundColor(Color.parseColor("#E34040"));
                    a4.setText("A4 \n OCCUPIED");
                }
                Cursor a5c = mDbHelper.getA5Status();
                String A5Status = a5c.getString(0);
                Log.i("Status:", A5Status + "");
                if (A5Status.equals("f")) {
                    a5.setBackgroundColor(Color.parseColor("#5ED177"));
                    a5.setText("A5 \n FREE");
                } else if (A5Status.equals("o")) {
                    a5.setBackgroundColor(Color.parseColor("#E34040"));
                    a5.setText("A5 \n OCCUPIED");
                }
                Cursor a6c = mDbHelper.getA6Status();
                String A6Status = a6c.getString(0);
                Log.i("Status:", A6Status + "");
                if (A6Status.equals("f")) {
                    a6.setBackgroundColor(Color.parseColor("#5ED177"));
                    a6.setText("A6 \n FREE");
                } else if (A1Status.equals("o")) {
                    a6.setBackgroundColor(Color.parseColor("#E34040"));
                    a6.setText("A6 \n OCCUPIED");
                }
                Cursor a7c = mDbHelper.getA7Status();
                String A7Status = a7c.getString(0);
                Log.i("Status:", A7Status + "");
                if (A7Status.equals("f")) {
                    a7.setBackgroundColor(Color.parseColor("#5ED177"));
                    a7.setText("A7 \n FREE");
                } else if (A7Status.equals("o")) {
                    a7.setBackgroundColor(Color.parseColor("#E34040"));
                    a7.setText("A7 \n OCCUPIED");
                }
                Cursor a8c = mDbHelper.getA8Status();
                String A8Status = a8c.getString(0);
                Log.i("Status:", A8Status + "");
                if (A8Status.equals("f")) {
                    a8.setBackgroundColor(Color.parseColor("#5ED177"));
                    a8.setText("A8 \n FREE");
                } else if (A8Status.equals("o")) {
                    a8.setBackgroundColor(Color.parseColor("#E34040"));
                    a8.setText("A8 \n OCCUPIED");
                }
                Cursor a9c = mDbHelper.getA9Status();
                String A9Status = a9c.getString(0);
                Log.i("Status:", A9Status + "");
                if (A9Status.equals("f")) {
                    a9.setBackgroundColor(Color.parseColor("#5ED177"));
                    a9.setText("A9 \n FREE");
                } else if (A9Status.equals("o")) {
                    a9.setBackgroundColor(Color.parseColor("#E34040"));
                    a9.setText("A9 \n OCCUPIED");
                }
                Cursor a10c = mDbHelper.getA10Status();
                String A10Status = a10c.getString(0);
                Log.i("Status:", A10Status + "");
                if (A10Status.equals("f")) {
                    a10.setBackgroundColor(Color.parseColor("#5ED177"));
                    a10.setText("A10 \n FREE");
                } else if (A10Status.equals("o")) {
                    a10.setBackgroundColor(Color.parseColor("#E34040"));
                    a10.setText("A10 \n OCCUPIED");
                }
                Cursor a11c = mDbHelper.getA11Status();
                String A11Status = a11c.getString(0);
                Log.i("Status:", A11Status + "");
                if (A11Status.equals("f")) {
                    a11.setBackgroundColor(Color.parseColor("#5ED177"));
                    a11.setText("A11 \n FREE");
                } else if (A11Status.equals("o")) {
                    a11.setBackgroundColor(Color.parseColor("#E34040"));
                    a11.setText("A11 \n OCCUPIED");
                }
                Cursor a12c = mDbHelper.getA12Status();
                String A12Status = a12c.getString(0);
                Log.i("Status:", A12Status + "");
                if (A12Status.equals("f")) {
                    a12.setBackgroundColor(Color.parseColor("#5ED177"));
                    a12.setText("A12 \n FREE");
                } else if (A12Status.equals("o")) {
                    a12.setBackgroundColor(Color.parseColor("#E34040"));
                    a12.setText("A12 \n OCCUPIED");
                }
                Cursor b1c = mDbHelper.getB1Status();
                String B1Status = b1c.getString(0);
                Log.i("Status:", B1Status + "");
                if (B1Status.equals("f")) {
                    b1.setBackgroundColor(Color.parseColor("#5ED177"));
                    b1.setText("B1 \n FREE");
                } else if (B1Status.equals("o")) {
                    b1.setBackgroundColor(Color.parseColor("#E34040"));
                    b1.setText("B1 \n OCCUPIED");
                }

                Cursor b2c = mDbHelper.getB2Status();
                String B2Status = b2c.getString(0);
                Log.i("Status:", B2Status + "");
                if (B2Status.equals("f")) {
                    b2.setBackgroundColor(Color.parseColor("#5ED177"));
                    b2.setText("B2 \n FREE");
                } else if (B2Status.equals("o")) {
                    b2.setBackgroundColor(Color.parseColor("#E34040"));
                    b2.setText("B2 \n OCCUPIED");
                }

                Cursor b3c = mDbHelper.getB3Status();
                String B3Status = b3c.getString(0);
                Log.i("Status:", B3Status + "");
                if (B3Status.equals("f")) {
                    b3.setBackgroundColor(Color.parseColor("#5ED177"));
                    b3.setText("B3 \n FREE");
                } else if (B3Status.equals("o")) {
                    b3.setBackgroundColor(Color.parseColor("#E34040"));
                    b3.setText("B3 \n OCCUPIED");
                }
                Cursor b4c = mDbHelper.getB4Status();
                String B4Status = b4c.getString(0);
                Log.i("Status:", B4Status + "");
                if (B4Status.equals("f")) {
                    b4.setBackgroundColor(Color.parseColor("#5ED177"));
                    b4.setText("B4 \n FREE");
                } else if (B4Status.equals("o")) {
                    b4.setBackgroundColor(Color.parseColor("#E34040"));
                    b4.setText("B4 \n OCCUPIED");
                }
                Cursor b5c = mDbHelper.getB5Status();
                String B5Status = b5c.getString(0);
                Log.i("Status:", B5Status + "");
                if (B5Status.equals("f")) {
                    b5.setBackgroundColor(Color.parseColor("#5ED177"));
                    b5.setText("B5 \n FREE");
                } else if (B5Status.equals("o")) {
                    b5.setBackgroundColor(Color.parseColor("#E34040"));
                    b5.setText("B5 \n OCCUPIED");
                }
                Cursor b6c = mDbHelper.getB6Status();
                String B6Status = b6c.getString(0);
                Log.i("Status:", B6Status + "");
                if (B6Status.equals("f")) {
                    b6.setBackgroundColor(Color.parseColor("#5ED177"));
                    b6.setText("B6 \n FREE");
                } else if (B6Status.equals("o")) {
                    b6.setBackgroundColor(Color.parseColor("#E34040"));
                    b6.setText("B6 \n OCCUPIED");
                }
                Cursor b7c = mDbHelper.getB7Status();
                String B7Status = b7c.getString(0);
                Log.i("Status:", B7Status + "");
                if (B7Status.equals("f")) {
                    b7.setBackgroundColor(Color.parseColor("#5ED177"));
                    b7.setText("B7 \n FREE");
                } else if (B7Status.equals("o")) {
                    b7.setBackgroundColor(Color.parseColor("#E34040"));
                    b7.setText("B7 \n OCCUPIED");
                }
                Cursor b8c = mDbHelper.getB8Status();
                String B8Status = b8c.getString(0);
                Log.i("Status:", B8Status + "");
                if (B8Status.equals("f")) {
                    b8.setBackgroundColor(Color.parseColor("#5ED177"));
                    b8.setText("B8 \n FREE");
                } else if (B8Status.equals("o")) {
                    b8.setBackgroundColor(Color.parseColor("#E34040"));
                    b8.setText("B8 \n OCCUPIED");
                }
                Cursor b9c = mDbHelper.getB9Status();
                String B9Status = b9c.getString(0);
                Log.i("Status:", B9Status + "");
                if (B9Status.equals("f")) {
                    b9.setBackgroundColor(Color.parseColor("#5ED177"));
                    b9.setText("B9 \n FREE");
                } else if (B9Status.equals("o")) {
                    b9.setBackgroundColor(Color.parseColor("#E34040"));
                    b9.setText("B9 \n OCCUPIED");
                }
                Cursor b10c = mDbHelper.getB10Status();
                String B10Status = b10c.getString(0);
                Log.i("Status:", B10Status + "");
                if (B10Status.equals("f")) {
                    b10.setBackgroundColor(Color.parseColor("#5ED177"));
                    b10.setText("B10 \n FREE");
                } else if (B10Status.equals("o")) {
                    b10.setBackgroundColor(Color.parseColor("#E34040"));
                    b10.setText("B10 \n OCCUPIED");
                }
                Cursor b11c = mDbHelper.getB11Status();
                String B11Status = b11c.getString(0);
                Log.i("Status:", B11Status + "");
                if (B11Status.equals("f")) {
                    b11.setBackgroundColor(Color.parseColor("#5ED177"));
                    b11.setText("B11 \n FREE");
                } else if (B11Status.equals("o")) {
                    b11.setBackgroundColor(Color.parseColor("#E34040"));
                    b11.setText("B11 \n OCCUPIED");
                }
                Cursor b12c = mDbHelper.getB12Status();
                String B12Status = b12c.getString(0);
                Log.i("Status:", B12Status + "");
                if (B12Status.equals("f")) {
                    b12.setBackgroundColor(Color.parseColor("#5ED177"));
                    b12.setText("B12 \n FREE");
                } else if (B12Status.equals("o")) {
                    b12.setBackgroundColor(Color.parseColor("#E34040"));
                    b12.setText("B12 \n OCCUPIED");
                }
                Cursor b13c = mDbHelper.getB13Status();
                String B13Status = b13c.getString(0);
                Log.i("Status:", B13Status + "");
                if (B13Status.equals("f")) {
                    b13.setBackgroundColor(Color.parseColor("#5ED177"));
                    b13.setText("B13 \n FREE");
                } else if (B13Status.equals("o")) {
                    b13.setBackgroundColor(Color.parseColor("#E34040"));
                    b13.setText("B13 \n OCCUPIED");
                }
                Cursor b14c = mDbHelper.getB14Status();
                String B14Status = b14c.getString(0);
                Log.i("Status:", B14Status + "");
                if (B14Status.equals("f")) {
                    b14.setBackgroundColor(Color.parseColor("#5ED177"));
                    b14.setText("B14 \n FREE");
                } else if (B14Status.equals("o")) {
                    b14.setBackgroundColor(Color.parseColor("#E34040"));
                    b14.setText("B14 \n OCCUPIED");
                }
                Cursor b15c = mDbHelper.getB15Status();
                String B15Status = b15c.getString(0);
                Log.i("Status:", B15Status + "");
                if (B15Status.equals("f")) {
                    b15.setBackgroundColor(Color.parseColor("#5ED177"));
                    b15.setText("B15 \n FREE");
                } else if (B15Status.equals("o")) {
                    b15.setBackgroundColor(Color.parseColor("#E34040"));
                    b15.setText("B15 \n OCCUPIED");
                }
                Cursor b16c = mDbHelper.getB16Status();
                String B16Status = b16c.getString(0);
                Log.i("Status:", B16Status + "");
                if (B16Status.equals("f")) {
                    b16.setBackgroundColor(Color.parseColor("#5ED177"));
                    b16.setText("B16 \n FREE");
                } else if (B16Status.equals("o")) {
                    b16.setBackgroundColor(Color.parseColor("#E34040"));
                    b16.setText("B16 \n OCCUPIED");
                }
                Cursor b17c = mDbHelper.getB17Status();
                String B17Status = b17c.getString(0);
                Log.i("Status:", B17Status + "");
                if (B17Status.equals("f")) {
                    b17.setBackgroundColor(Color.parseColor("#5ED177"));
                    b17.setText("B17 \n FREE");
                } else if (B17Status.equals("o")) {
                    b17.setBackgroundColor(Color.parseColor("#E34040"));
                    b17.setText("B17 \n OCCUPIED");
                }

                Cursor c1c = mDbHelper.getC1Status();
                String C1Status = c1c.getString(0);
                Log.i("Status:", C1Status + "");
                if (C1Status.equals("f")) {
                    c1.setBackgroundColor(Color.parseColor("#5ED177"));
                    c1.setText("C1 \n FREE");
                } else if (C1Status.equals("o")) {
                    c1.setBackgroundColor(Color.parseColor("#E34040"));
                    c1.setText("C1 \n OCCUPIED");
                }
                Cursor c2c = mDbHelper.getC2Status();
                String C2Status = c2c.getString(0);
                Log.i("Status:", C2Status + "");
                if (C2Status.equals("f")) {
                    c2.setBackgroundColor(Color.parseColor("#5ED177"));
                    c2.setText("C2 \n FREE");
                } else if (C2Status.equals("o")) {
                    c2.setBackgroundColor(Color.parseColor("#E34040"));
                    c2.setText("C2 \n OCCUPIED");
                }
                Cursor c3c = mDbHelper.getC3Status();
                String C3Status = c3c.getString(0);
                Log.i("Status:", C3Status + "");
                if (C3Status.equals("f")) {
                    c3.setBackgroundColor(Color.parseColor("#5ED177"));
                    c3.setText("C3 \n FREE");
                } else if (C3Status.equals("o")) {
                    c3.setBackgroundColor(Color.parseColor("#E34040"));
                    c3.setText("C3 \n OCCUPIED");
                }
                Cursor c4c = mDbHelper.getC4Status();
                String C4Status = c4c.getString(0);
                Log.i("Status:", C4Status + "");
                if (C4Status.equals("f")) {
                    c4.setBackgroundColor(Color.parseColor("#5ED177"));
                    c4.setText("C4 \n FREE");
                } else if (C4Status.equals("o")) {
                    c4.setBackgroundColor(Color.parseColor("#E34040"));
                    c4.setText("C4 \n OCCUPIED");
                }
                Cursor c5c = mDbHelper.getC5Status();
                String C5Status = c5c.getString(0);
                Log.i("Status:", C5Status + "");
                if (C5Status.equals("f")) {
                    c5.setBackgroundColor(Color.parseColor("#5ED177"));
                    c5.setText("C5 \n FREE");
                } else if (C5Status.equals("o")) {
                    c5.setBackgroundColor(Color.parseColor("#E34040"));
                    c5.setText("C5 \n OCCUPIED");
                }
                Cursor c6c = mDbHelper.getC6Status();
                String C6Status = c6c.getString(0);
                Log.i("Status:", C6Status + "");
                if (C6Status.equals("f")) {
                    c6.setBackgroundColor(Color.parseColor("#5ED177"));
                    c6.setText("C6 \n FREE");
                } else if (C6Status.equals("o")) {
                    c6.setBackgroundColor(Color.parseColor("#E34040"));
                    c6.setText("C6 \n OCCUPIED");
                }
                Cursor c7c = mDbHelper.getC7Status();
                String C7Status = c7c.getString(0);
                Log.i("Status:", C7Status + "");
                if (C7Status.equals("f")) {
                    c7.setBackgroundColor(Color.parseColor("#5ED177"));
                    c7.setText("C7 \n FREE");
                } else if (C7Status.equals("o")) {
                    c7.setBackgroundColor(Color.parseColor("#E34040"));
                    c7.setText("C7 \n OCCUPIED");
                }
                Cursor c8c = mDbHelper.getC8Status();
                String C8Status = c8c.getString(0);
                Log.i("Status:", C8Status + "");
                if (C8Status.equals("f")) {
                    c8.setBackgroundColor(Color.parseColor("#5ED177"));
                    c8.setText("C8 \n FREE");
                } else if (C8Status.equals("o")) {
                    c8.setBackgroundColor(Color.parseColor("#E34040"));
                    c8.setText("C8 \n OCCUPIED");
                }
                Cursor c9c = mDbHelper.getC9Status();
                String C9Status = c9c.getString(0);
                Log.i("Status:", C9Status + "");
                if (C9Status.equals("f")) {
                    c9.setBackgroundColor(Color.parseColor("#5ED177"));
                    c9.setText("C9 \n FREE");
                } else if (C9Status.equals("o")) {
                    c9.setBackgroundColor(Color.parseColor("#E34040"));
                    c9.setText("C9 \n OCCUPIED");
                }
                Cursor c10c = mDbHelper.getC10Status();
                String C10Status = c10c.getString(0);
                Log.i("Status:", C10Status + "");
                if (C10Status.equals("f")) {
                    c10.setBackgroundColor(Color.parseColor("#5ED177"));
                    c10.setText("C10 \n FREE");
                } else if (C10Status.equals("o")) {
                    c10.setBackgroundColor(Color.parseColor("#E34040"));
                    c10.setText("C10 \n OCCUPIED");
                }
                Cursor c11c = mDbHelper.getC11Status();
                String C11Status = c11c.getString(0);
                Log.i("Status:", C11Status + "");
                if (C11Status.equals("f")) {
                    c11.setBackgroundColor(Color.parseColor("#5ED177"));
                    c11.setText("C11 \n FREE");
                } else if (C11Status.equals("o")) {
                    c11.setBackgroundColor(Color.parseColor("#E34040"));
                    c11.setText("C11 \n OCCUPIED");
                }
                Cursor c12c = mDbHelper.getC12Status();
                String C12Status = c12c.getString(0);
                Log.i("Status:", C12Status + "");
                if (C12Status.equals("f")) {
                    c12.setBackgroundColor(Color.parseColor("#5ED177"));
                    c12.setText("C12 \n FREE");
                } else if (C12Status.equals("o")) {
                    c12.setBackgroundColor(Color.parseColor("#E34040"));
                    c12.setText("C12 \n OCCUPIED");
                }
                Cursor c13c = mDbHelper.getC13Status();
                String C13Status = c13c.getString(0);
                Log.i("Status:", C13Status + "");
                if (C13Status.equals("f")) {
                    c13.setBackgroundColor(Color.parseColor("#5ED177"));
                    c13.setText("C13 \n FREE");
                } else if (C13Status.equals("o")) {
                    c13.setBackgroundColor(Color.parseColor("#E34040"));
                    c13.setText("C13 \n OCCUPIED");
                }
                Cursor c14c = mDbHelper.getC14Status();
                String C14Status = c14c.getString(0);
                Log.i("Status:", C14Status + "");
                if (C14Status.equals("f")) {
                    c14.setBackgroundColor(Color.parseColor("#5ED177"));
                    c14.setText("C14 \n FREE");
                } else if (C14Status.equals("o")) {
                    c14.setBackgroundColor(Color.parseColor("#E34040"));
                    c14.setText("C14 \n OCCUPIED");
                }
                Cursor c15c = mDbHelper.getC15Status();
                String C15Status = c15c.getString(0);
                Log.i("Status:", C15Status + "");
                if (C15Status.equals("f")) {
                    c15.setBackgroundColor(Color.parseColor("#5ED177"));
                    c15.setText("C15 \n FREE");
                } else if (C15Status.equals("o")) {
                    c15.setBackgroundColor(Color.parseColor("#E34040"));
                    c15.setText("C15 \n OCCUPIED");
                }
                Cursor c16c = mDbHelper.getC16Status();
                String C16Status = c16c.getString(0);
                Log.i("Status:", C16Status + "");
                if (C16Status.equals("f")) {
                    c16.setBackgroundColor(Color.parseColor("#5ED177"));
                    c16.setText("C16 \n FREE");
                } else if (C16Status.equals("o")) {
                    c16.setBackgroundColor(Color.parseColor("#E34040"));
                    c16.setText("C16 \n OCCUPIED");
                }
                Cursor d1c = mDbHelper.getD1Status();
                String D1Status = d1c.getString(0);
                Log.i("Status:", D1Status + "");
                if (D1Status.equals("f")) {
                    d1.setBackgroundColor(Color.parseColor("#5ED177"));
                    d1.setText("D1 \n FREE");
                } else if (D1Status.equals("o")) {
                    d1.setBackgroundColor(Color.parseColor("#E34040"));
                    d1.setText("D1 \n OCCUPIED");
                }
                Cursor d2c = mDbHelper.getD2Status();
                String D2Status = d2c.getString(0);
                Log.i("Status:", D2Status + "");
                if (D2Status.equals("f")) {
                    d2.setBackgroundColor(Color.parseColor("#5ED277"));
                    d2.setText("D2 \n FREE");
                } else if (D2Status.equals("o")) {
                    d2.setBackgroundColor(Color.parseColor("#E34040"));
                    d2.setText("D2 \n OCCUPIED");
                }
                Cursor d3c = mDbHelper.getD3Status();
                String D3Status = d3c.getString(0);
                Log.i("Status:", D3Status + "");
                if (D3Status.equals("f")) {
                    d3.setBackgroundColor(Color.parseColor("#5ED377"));
                    d3.setText("D3 \n FREE");
                } else if (D3Status.equals("o")) {
                    d3.setBackgroundColor(Color.parseColor("#E34040"));
                    d3.setText("D3 \n OCCUPIED");
                }
                Cursor d4c = mDbHelper.getD4Status();
                String D4Status = d4c.getString(0);
                Log.i("Status:", D4Status + "");
                if (D4Status.equals("f")) {
                    d4.setBackgroundColor(Color.parseColor("#5ED477"));
                    d4.setText("D4 \n FREE");
                } else if (D4Status.equals("o")) {
                    d4.setBackgroundColor(Color.parseColor("#E34040"));
                    d4.setText("D4 \n OCCUPIED");
                }
                Cursor d5c = mDbHelper.getD5Status();
                String D5Status = d5c.getString(0);
                Log.i("Status:", D5Status + "");
                if (D5Status.equals("f")) {
                    d5.setBackgroundColor(Color.parseColor("#5ED177"));
                    d5.setText("D5 \n FREE");
                } else if (D5Status.equals("o")) {
                    d5.setBackgroundColor(Color.parseColor("#E34040"));
                    d5.setText("D5 \n OCCUPIED");
                }
                Cursor d6c = mDbHelper.getD6Status();
                String D6Status = d6c.getString(0);
                Log.i("Status:", D6Status + "");
                if (D6Status.equals("f")) {
                    d6.setBackgroundColor(Color.parseColor("#5ED177"));
                    d6.setText("D6 \n FREE");
                } else if (D6Status.equals("o")) {
                    d6.setBackgroundColor(Color.parseColor("#E34040"));
                    d6.setText("D6 \n OCCUPIED");
                }
                Cursor d7c = mDbHelper.getD7Status();
                String D7Status = d7c.getString(0);
                Log.i("Status:", D7Status + "");
                if (D7Status.equals("f")) {
                    d7.setBackgroundColor(Color.parseColor("#5ED177"));
                    d7.setText("D7 \n FREE");
                } else if (D7Status.equals("o")) {
                    d7.setBackgroundColor(Color.parseColor("#E34040"));
                    d7.setText("D7 \n OCCUPIED");
                }


                Cursor e1c = mDbHelper.getE1Status();
                String E1Status = e1c.getString(0);
                Log.i("Status:", E1Status + "");
                if (E1Status.equals("f")) {
                    e1.setBackgroundColor(Color.parseColor("#5EE177"));
                    e1.setText("E1 \n FREE");
                } else if (E1Status.equals("o")) {
                    e1.setBackgroundColor(Color.parseColor("#E34040"));
                    e1.setText("E1 \n OCCUPIED");
                }
                Cursor e2c = mDbHelper.getE2Status();
                String E2Status = e2c.getString(0);
                Log.i("Status:", E2Status + "");
                if (E2Status.equals("f")) {
                    e2.setBackgroundColor(Color.parseColor("#5EE277"));
                    e2.setText("E2 \n FREE");
                } else if (E2Status.equals("o")) {
                    e2.setBackgroundColor(Color.parseColor("#E34040"));
                    e2.setText("E2 \n OCCUPIED");
                }
                Cursor e3c = mDbHelper.getE3Status();
                String E3Status = e3c.getString(0);
                Log.i("Status:", E3Status + "");
                if (E3Status.equals("f")) {
                    e3.setBackgroundColor(Color.parseColor("#5EE377"));
                    e3.setText("E3 \n FREE");
                } else if (E3Status.equals("o")) {
                    e3.setBackgroundColor(Color.parseColor("#E34040"));
                    e3.setText("E3 \n OCCUPIED");
                }
                Cursor e4c = mDbHelper.getE4Status();
                String E4Status = e4c.getString(0);
                Log.i("Status:", E4Status + "");
                if (E4Status.equals("f")) {
                    e4.setBackgroundColor(Color.parseColor("#5EE477"));
                    e4.setText("E4 \n FREE");
                } else if (E4Status.equals("o")) {
                    e4.setBackgroundColor(Color.parseColor("#E34040"));
                    e4.setText("E4 \n OCCUPIED");
                }
                Cursor e5c = mDbHelper.getE5Status();
                String E5Status = e5c.getString(0);
                Log.i("Status:", E5Status + "");
                if (E5Status.equals("f")) {
                    e5.setBackgroundColor(Color.parseColor("#5EE177"));
                    e5.setText("E5 \n FREE");
                } else if (E5Status.equals("o")) {
                    e5.setBackgroundColor(Color.parseColor("#E34040"));
                    e5.setText("E5 \n OCCUPIED");
                }
                Cursor e6c = mDbHelper.getE6Status();
                String E6Status = e6c.getString(0);
                Log.i("Status:", E6Status + "");
                if (E6Status.equals("f")) {
                    e6.setBackgroundColor(Color.parseColor("#5EE177"));
                    e6.setText("E6 \n FREE");
                } else if (E6Status.equals("o")) {
                    e6.setBackgroundColor(Color.parseColor("#E34040"));
                    e6.setText("E6 \n OCCUPIED");
                }
                Cursor e7c = mDbHelper.getE7Status();
                String E7Status = e7c.getString(0);
                Log.i("Status:", E7Status + "");
                if (E7Status.equals("f")) {
                    e7.setBackgroundColor(Color.parseColor("#5EE177"));
                    e7.setText("E7 \n FREE");
                } else if (E7Status.equals("o")) {
                    e7.setBackgroundColor(Color.parseColor("#E34040"));
                    e7.setText("E7 \n OCCUPIED");
                }
                Cursor e8c = mDbHelper.getE8Status();
                String E8Status = e8c.getString(0);
                Log.i("Status:", E8Status + "");
                if (E8Status.equals("f")) {
                    e8.setBackgroundColor(Color.parseColor("#5EE177"));
                    e8.setText("E8 \n FREE");
                } else if (E8Status.equals("o")) {
                    e8.setBackgroundColor(Color.parseColor("#E34040"));
                    e8.setText("E8 \n OCCUPIED");
                }
                Cursor e9c = mDbHelper.getE9Status();
                String E9Status = e9c.getString(0);
                Log.i("Status:", E9Status + "");
                if (E9Status.equals("f")) {
                    e9.setBackgroundColor(Color.parseColor("#5EE177"));
                    e9.setText("E9 \n FREE");
                } else if (E9Status.equals("o")) {
                    e9.setBackgroundColor(Color.parseColor("#E34040"));
                    e9.setText("E9 \n OCCUPIED");
                }
                Cursor e10c = mDbHelper.getE10Status();
                String E10Status = e10c.getString(0);
                Log.i("Status:", E10Status + "");
                if (E10Status.equals("f")) {
                    e10.setBackgroundColor(Color.parseColor("#5EE177"));
                    e10.setText("E10 \n FREE");
                } else if (E10Status.equals("o")) {
                    e10.setBackgroundColor(Color.parseColor("#E34040"));
                    e10.setText("E10 \n OCCUPIED");
                }
                Cursor e11c = mDbHelper.getE11Status();
                String E11Status = e11c.getString(0);
                Log.i("Status:", E11Status + "");
                if (E11Status.equals("f")) {
                    e11.setBackgroundColor(Color.parseColor("#5EE177"));
                    e11.setText("E11 \n FREE");
                } else if (E11Status.equals("o")) {
                    e11.setBackgroundColor(Color.parseColor("#E34040"));
                    e11.setText("E11 \n OCCUPIED");
                }
                Cursor e12c = mDbHelper.getE12Status();
                String E12Status = e12c.getString(0);
                Log.i("Status:", E12Status + "");
                if (E12Status.equals("f")) {
                    e12.setBackgroundColor(Color.parseColor("#5EE177"));
                    e12.setText("E12 \n FREE");
                } else if (E12Status.equals("o")) {
                    e12.setBackgroundColor(Color.parseColor("#E34040"));
                    e12.setText("E12 \n OCCUPIED");
                }


            }
        };
    }
}