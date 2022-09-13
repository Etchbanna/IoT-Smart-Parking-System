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

public class MarinaLayout extends AppCompatActivity {
    Button a1,a2,a3,a4,a5,a6,a7,a8,a9;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    Button c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13;
    Button d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14,d15,d16,d17,d18,d19,d20,d21,d22,d23,d24;
    Button e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16,e17,e18,e19,e20,e21,e22,e23,e24;
    Button f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14,f15,f16,f17,f18,f19,f20,f21,f22,f23,f24;
    Button g1,g2,g3,g4,g5,g6,g7,g8,g9,g10,g11,g12,g13,g14,g15,g16,g17,g18,g19,g20,g21,g22,g23,g24;
    Button h1,h2,h3,h4,h5,h6,h7,h8,h9,h10,h11,h12,h13,h14,h15,h16,h17,h18,h19,h20,h21,h22,h23,h24,h25,h26,h27,h28,h29,h30;
    Button i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17,i18;
    ImageView im1,im2;
    TextView tv1, tv2, tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marina_layout);
        a1 = findViewById(R.id.A1);
        a2 = findViewById(R.id.A2);
        a3 = findViewById(R.id.A3);
        a4 = findViewById(R.id.A4);
        a5 = findViewById(R.id.A5);
        a7 = findViewById(R.id.A7);
        a6 = findViewById(R.id.A6);
        a8 = findViewById(R.id.A8);
        a9 = findViewById(R.id.A9);
        b1 = findViewById(R.id.B1);
        b2 = findViewById(R.id.B2);
        b3 = findViewById(R.id.B3);
        b4 = findViewById(R.id.B4);
        b5 = findViewById(R.id.B5);
        b6 = findViewById(R.id.B6);
        b7 = findViewById(R.id.B7);
        b8 = findViewById(R.id.B8);
        b9 = findViewById(R.id.B9);
        b10 = findViewById(R.id.B10);
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
        d1 = findViewById(R.id.d1);
        d2 = findViewById(R.id.d2);
        d3 = findViewById(R.id.d3);
        d4 = findViewById(R.id.d4);
        d5 = findViewById(R.id.d5);
        d6 = findViewById(R.id.d6);
        d7 = findViewById(R.id.d7);
        d8 = findViewById(R.id.d8);
        d9 = findViewById(R.id.d9);
        d10 = findViewById(R.id.d10);
        d11 = findViewById(R.id.d11);
        d12 = findViewById(R.id.d12);
        d13 = findViewById(R.id.d13);
        d14 = findViewById(R.id.d14);
        d15 = findViewById(R.id.d15);
        d16 = findViewById(R.id.d16);
        d17 = findViewById(R.id.d17);
        d18 = findViewById(R.id.d18);
        d19 = findViewById(R.id.d19);
        d20 = findViewById(R.id.d20);
        d21 = findViewById(R.id.d21);
        d23 = findViewById(R.id.d23);
        d22 = findViewById(R.id.d22);
        d24 = findViewById(R.id.d24);

        e1 = findViewById(R.id.E1);
        e2 = findViewById(R.id.E2);
        e3 = findViewById(R.id.E3);
        e4 = findViewById(R.id.E4);
        e5 = findViewById(R.id.E5);
        e6 = findViewById(R.id.E6);
        e7 = findViewById(R.id.E7);
        e8 = findViewById(R.id.E8);
        e9 = findViewById(R.id.E9);
        e10 = findViewById(R.id.E10);
        e11 = findViewById(R.id.E11);
        e12 = findViewById(R.id.E12);
        e13 = findViewById(R.id.E13);
        e14 = findViewById(R.id.E14);
        e15 = findViewById(R.id.E15);
        e16 = findViewById(R.id.E16);
        e17 = findViewById(R.id.E17);
        e18 = findViewById(R.id.E18);
        e19 = findViewById(R.id.E19);
        e20 = findViewById(R.id.E20);
        e21 = findViewById(R.id.E21);
        e23 = findViewById(R.id.E23);
        e22 = findViewById(R.id.E22);
        e24 = findViewById(R.id.E24);

        f1 = findViewById(R.id.F1);
        f2 = findViewById(R.id.F2);
        f3 = findViewById(R.id.F3);
        f4 = findViewById(R.id.F4);
        f5 = findViewById(R.id.F5);
        f6 = findViewById(R.id.F6);
        f7 = findViewById(R.id.F7);
        f8 = findViewById(R.id.F8);
        f9 = findViewById(R.id.F9);
        f10 = findViewById(R.id.F10);
        f11 = findViewById(R.id.F11);
        f12 = findViewById(R.id.F12);
        f13 = findViewById(R.id.F13);
        f14 = findViewById(R.id.F14);
        f15 = findViewById(R.id.F15);
        f16 = findViewById(R.id.F16);
        f17 = findViewById(R.id.F17);
        f18 = findViewById(R.id.F18);
        f19 = findViewById(R.id.F19);
        f20 = findViewById(R.id.F20);
        f21 = findViewById(R.id.F21);
        f23 = findViewById(R.id.F23);
        f22 = findViewById(R.id.F22);
        f24 = findViewById(R.id.F24);

        g1 = findViewById(R.id.G1);
        g2 = findViewById(R.id.G2);
        g3 = findViewById(R.id.G3);
        g4 = findViewById(R.id.G4);
        g5 = findViewById(R.id.G5);
        g6 = findViewById(R.id.G6);
        g7 = findViewById(R.id.G7);
        g8 = findViewById(R.id.G8);
        g9 = findViewById(R.id.G9);
        g10 = findViewById(R.id.G10);
        g11 = findViewById(R.id.G11);
        g12 = findViewById(R.id.G12);
        g13 = findViewById(R.id.G13);
        g14 = findViewById(R.id.G14);
        g15 = findViewById(R.id.G15);
        g16 = findViewById(R.id.G16);
        g17 = findViewById(R.id.G17);
        g18 = findViewById(R.id.G18);
        g19 = findViewById(R.id.G19);
        g20 = findViewById(R.id.G20);
        g21 = findViewById(R.id.G21);
        g23 = findViewById(R.id.G23);
        g22 = findViewById(R.id.G22);
        g24 = findViewById(R.id.G24);

        i1 = findViewById(R.id.I1);
        i2 = findViewById(R.id.I2);
        i3 = findViewById(R.id.I3);
        i4 = findViewById(R.id.I4);
        i5 = findViewById(R.id.I5);
        i6 = findViewById(R.id.I6);
        i7 = findViewById(R.id.I7);
        i8 = findViewById(R.id.I8);
        i9 = findViewById(R.id.I9);
        i10 = findViewById(R.id.I10);
        i11 = findViewById(R.id.I11);
        i12 = findViewById(R.id.I12);
        i13 = findViewById(R.id.I13);
        i14 = findViewById(R.id.I14);
        i15 = findViewById(R.id.I15);
        i16 = findViewById(R.id.I16);
        i17 = findViewById(R.id.I17);
        i18 = findViewById(R.id.I18);

        h1 = findViewById(R.id.H1);
        h2 = findViewById(R.id.H2);
        h3 = findViewById(R.id.H3);
        h4 = findViewById(R.id.H4);
        h5 = findViewById(R.id.H5);
        h6 = findViewById(R.id.H6);
        h7 = findViewById(R.id.H7);
        h8 = findViewById(R.id.H8);
        h9 = findViewById(R.id.H9);
        h10 = findViewById(R.id.H10);
        h11 = findViewById(R.id.H11);
        h12 = findViewById(R.id.H12);
        h13 = findViewById(R.id.H13);
        h14 = findViewById(R.id.H14);
        h15 = findViewById(R.id.H15);
        h16 = findViewById(R.id.H16);
        h17 = findViewById(R.id.H17);
        h18 = findViewById(R.id.H18);
        h19 = findViewById(R.id.H19);
        h20 = findViewById(R.id.H20);
        h21 = findViewById(R.id.H21);
        h22 = findViewById(R.id.H22);
        h23 = findViewById(R.id.H23);
        h24 = findViewById(R.id.H24);
        h25 = findViewById(R.id.H25);
        h26 = findViewById(R.id.H26);
        h27 = findViewById(R.id.H27);
        h28 = findViewById(R.id.H28);
        h29 = findViewById(R.id.H29);
        h30 = findViewById(R.id.H30);

        im1 = findViewById(R.id.imageView23);
        im2 = findViewById(R.id.imageView24);

        tv1 = findViewById(R.id.textView36);
        tv2 = findViewById(R.id.textView37);

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
                    case R.id.d8:
                        Cursor d8c = mDbHelper.getD8Status();
                        String D8Status = d8c.getString(0);
                        if (D8Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (D8Status.equals("f")) {
                            status.setText("Free");
                        } else if (D8Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.d9:
                        Cursor d9c = mDbHelper.getD9Status();
                        String D9Status = d9c.getString(0);
                        if (D9Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (D9Status.equals("f")) {
                            status.setText("Free");
                        } else if (D9Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.d10:
                        Cursor d10c = mDbHelper.getD10Status();
                        String D10Status = d10c.getString(0);
                        if (D10Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (D10Status.equals("f")) {
                            status.setText("Free");
                        } else if (D10Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.d11:
                        Cursor d11c = mDbHelper.getD11Status();
                        String D11Status = d11c.getString(0);
                        if (D11Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (D11Status.equals("f")) {
                            status.setText("Free");
                        } else if (D11Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.d12:
                        Cursor d12c = mDbHelper.getD12Status();
                        String D12Status = d12c.getString(0);
                        if (D12Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (D12Status.equals("f")) {
                            status.setText("Free");
                        } else if (D12Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.d13:
                        Cursor d13c = mDbHelper.getD13Status();
                        String D13Status = d13c.getString(0);
                        if (D13Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (D13Status.equals("f")) {
                            status.setText("Free");
                        } else if (D13Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.d14:
                        Cursor d14c = mDbHelper.getD14Status();
                        String D14Status = d14c.getString(0);
                        if (D14Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (D14Status.equals("f")) {
                            status.setText("Free");
                        } else if (D14Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.d15:
                        Cursor d15c = mDbHelper.getD15Status();
                        String D15Status = d15c.getString(0);
                        if (D15Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (D15Status.equals("f")) {
                            status.setText("Free");
                        } else if (D15Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.d16:
                        Cursor d16c = mDbHelper.getD16Status();
                        String D16Status = d16c.getString(0);
                        if (D16Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (D16Status.equals("f")) {
                            status.setText("Free");
                        } else if (D16Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.d17:
                        Cursor d17c = mDbHelper.getD17Status();
                        String D17Status = d17c.getString(0);
                        if (D17Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (D17Status.equals("f")) {
                            status.setText("Free");
                        } else if (D17Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.d18:
                        Cursor d18c = mDbHelper.getD18Status();
                        String D18Status = d18c.getString(0);
                        if (D18Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (D18Status.equals("f")) {
                            status.setText("Free");
                        } else if (D18Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.d19:
                        Cursor d19c = mDbHelper.getD19Status();
                        String D19Status = d19c.getString(0);
                        if (D19Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (D19Status.equals("f")) {
                            status.setText("Free");
                        } else if (D19Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.d20:
                        Cursor d20c = mDbHelper.getD20Status();
                        String D20Status = d20c.getString(0);
                        if (D20Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (D20Status.equals("f")) {
                            status.setText("Free");
                        } else if (D20Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.d21:
                        Cursor d21c = mDbHelper.getD21Status();
                        String D21Status = d21c.getString(0);
                        if (D21Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (D21Status.equals("f")) {
                            status.setText("Free");
                        } else if (D21Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.d22:
                        Cursor d22c = mDbHelper.getD22Status();
                        String D22Status = d22c.getString(0);
                        if (D22Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (D22Status.equals("f")) {
                            status.setText("Free");
                        } else if (D22Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.d23:
                        Cursor d23c = mDbHelper.getD23Status();
                        String D23Status = d23c.getString(0);
                        if (D23Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (D23Status.equals("f")) {
                            status.setText("Free");
                        } else if (D23Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.d24:
                        Cursor d24c = mDbHelper.getD24Status();
                        String D24Status = d24c.getString(0);
                        if (D24Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (D24Status.equals("f")) {
                            status.setText("Free");
                        } else if (D24Status.equals("r")) {
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
                    case R.id.E13:
                        Cursor e13c = mDbHelper.getE13Status();
                        String E13Status = e13c.getString(0);
                        if (E13Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (E13Status.equals("f")) {
                            status.setText("Free");
                        } else if (E13Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.E14:
                        Cursor e14c = mDbHelper.getE14Status();
                        String E14Status = e14c.getString(0);
                        if (E14Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (E14Status.equals("f")) {
                            status.setText("Free");
                        } else if (E14Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.E15:
                        Cursor e15c = mDbHelper.getE15Status();
                        String E15Status = e15c.getString(0);
                        if (E15Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (E15Status.equals("f")) {
                            status.setText("Free");
                        } else if (E15Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.E16:
                        Cursor e16c = mDbHelper.getE16Status();
                        String E16Status = e16c.getString(0);
                        if (E16Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (E16Status.equals("f")) {
                            status.setText("Free");
                        } else if (E16Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.E17:
                        Cursor e17c = mDbHelper.getE17Status();
                        String E17Status = e17c.getString(0);
                        if (E17Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (E17Status.equals("f")) {
                            status.setText("Free");
                        } else if (E17Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.E18:
                        Cursor e18c = mDbHelper.getE18Status();
                        String E18Status = e18c.getString(0);
                        if (E18Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (E18Status.equals("f")) {
                            status.setText("Free");
                        } else if (E18Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.E19:
                        Cursor e19c = mDbHelper.getE19Status();
                        String E19Status = e19c.getString(0);
                        if (E19Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (E19Status.equals("f")) {
                            status.setText("Free");
                        } else if (E19Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.E20:
                        Cursor e20c = mDbHelper.getE20Status();
                        String E20Status = e20c.getString(0);
                        if (E20Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (E20Status.equals("f")) {
                            status.setText("Free");
                        } else if (E20Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.E21:
                        Cursor e21c = mDbHelper.getE21Status();
                        String E21Status = e21c.getString(0);
                        if (E21Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (E21Status.equals("f")) {
                            status.setText("Free");
                        } else if (E21Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.E22:
                        Cursor e22c = mDbHelper.getE22Status();
                        String E22Status = e22c.getString(0);
                        if (E22Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (E22Status.equals("f")) {
                            status.setText("Free");
                        } else if (E22Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.E23:
                        Cursor e23c = mDbHelper.getE23Status();
                        String E23Status = e23c.getString(0);
                        if (E23Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (E23Status.equals("f")) {
                            status.setText("Free");
                        } else if (E23Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.E24:
                        Cursor e24c = mDbHelper.getE24Status();
                        String E24Status = e24c.getString(0);
                        if (E24Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (E24Status.equals("f")) {
                            status.setText("Free");
                        } else if (E24Status.equals("r")) {
                            status.setText("Reserved");

                        }


                    case R.id.G1:
                        Cursor g1c = mDbHelper.getG1Status();
                        String G1Status = g1c.getString(0);
                        if (G1Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (G1Status.equals("f")) {
                            status.setText("Free");
                        } else if (G1Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.G2:
                        Cursor g2c = mDbHelper.getG2Status();
                        String G2Status = g2c.getString(0);
                        if (G2Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (G2Status.equals("f")) {
                            status.setText("Free");
                        } else if (G2Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.G3:
                        Cursor g3c = mDbHelper.getG3Status();
                        String G3Status = g3c.getString(0);
                        if (G3Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (G3Status.equals("f")) {
                            status.setText("Free");
                        } else if (G3Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.G4:
                        Cursor g4c = mDbHelper.getG4Status();
                        String G4Status = g4c.getString(0);
                        if (G4Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (G4Status.equals("f")) {
                            status.setText("Free");
                        } else if (G4Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.G5:
                        Cursor g5c = mDbHelper.getG5Status();
                        String G5Status = g5c.getString(0);
                        if (G5Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (G5Status.equals("f")) {
                            status.setText("Free");
                        } else if (G5Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.G6:
                        Cursor g6c = mDbHelper.getG6Status();
                        String G6Status = g6c.getString(0);
                        if (G6Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (G6Status.equals("f")) {
                            status.setText("Free");
                        } else if (G6Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.G7:
                        Cursor g7c = mDbHelper.getG7Status();
                        String G7Status = g7c.getString(0);
                        if (G7Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (G7Status.equals("f")) {
                            status.setText("Free");
                        } else if (G7Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.G8:
                        Cursor g8c = mDbHelper.getG8Status();
                        String G8Status = g8c.getString(0);
                        if (G8Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (G8Status.equals("f")) {
                            status.setText("Free");
                        } else if (G8Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.G9:
                        Cursor g9c = mDbHelper.getG9Status();
                        String G9Status = g9c.getString(0);
                        if (G9Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (G9Status.equals("f")) {
                            status.setText("Free");
                        } else if (G9Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.G10:
                        Cursor g10c = mDbHelper.getG10Status();
                        String G10Status = g10c.getString(0);
                        if (G10Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (G10Status.equals("f")) {
                            status.setText("Free");
                        } else if (G10Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.G11:
                        Cursor g11c = mDbHelper.getG11Status();
                        String G11Status = g11c.getString(0);
                        if (G11Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (G11Status.equals("f")) {
                            status.setText("Free");
                        } else if (G11Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.G12:
                        Cursor g12c = mDbHelper.getG12Status();
                        String G12Status = g12c.getString(0);
                        if (G12Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (G12Status.equals("f")) {
                            status.setText("Free");
                        } else if (G12Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.G13:
                        Cursor g13c = mDbHelper.getG13Status();
                        String G13Status = g13c.getString(0);
                        if (G13Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (G13Status.equals("f")) {
                            status.setText("Free");
                        } else if (G13Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.G14:
                        Cursor g14c = mDbHelper.getG14Status();
                        String G14Status = g14c.getString(0);
                        if (G14Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (G14Status.equals("f")) {
                            status.setText("Free");
                        } else if (G14Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.G15:
                        Cursor g15c = mDbHelper.getG15Status();
                        String G15Status = g15c.getString(0);
                        if (G15Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (G15Status.equals("f")) {
                            status.setText("Free");
                        } else if (G15Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.G16:
                        Cursor g16c = mDbHelper.getG16Status();
                        String G16Status = g16c.getString(0);
                        if (G16Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (G16Status.equals("f")) {
                            status.setText("Free");
                        } else if (G16Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.G17:
                        Cursor g17c = mDbHelper.getG17Status();
                        String G17Status = g17c.getString(0);
                        if (G17Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (G17Status.equals("f")) {
                            status.setText("Free");
                        } else if (G17Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.G18:
                        Cursor g18c = mDbHelper.getG18Status();
                        String G18Status = g18c.getString(0);
                        if (G18Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (G18Status.equals("f")) {
                            status.setText("Free");
                        } else if (G18Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.G19:
                        Cursor g19c = mDbHelper.getG19Status();
                        String G19Status = g19c.getString(0);
                        if (G19Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (G19Status.equals("f")) {
                            status.setText("Free");
                        } else if (G19Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.G20:
                        Cursor g20c = mDbHelper.getG20Status();
                        String G20Status = g20c.getString(0);
                        if (G20Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (G20Status.equals("f")) {
                            status.setText("Free");
                        } else if (G20Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.G21:
                        Cursor g21c = mDbHelper.getG21Status();
                        String G21Status = g21c.getString(0);
                        if (G21Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (G21Status.equals("f")) {
                            status.setText("Free");
                        } else if (G21Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.G22:
                        Cursor g22c = mDbHelper.getG22Status();
                        String G22Status = g22c.getString(0);
                        if (G22Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (G22Status.equals("f")) {
                            status.setText("Free");
                        } else if (G22Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.G23:
                        Cursor g23c = mDbHelper.getG23Status();
                        String G23Status = g23c.getString(0);
                        if (G23Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (G23Status.equals("f")) {
                            status.setText("Free");
                        } else if (G23Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.G24:
                        Cursor g24c = mDbHelper.getG24Status();
                        String G24Status = g24c.getString(0);
                        if (G24Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (G24Status.equals("f")) {
                            status.setText("Free");
                        } else if (G24Status.equals("r")) {
                            status.setText("Reserved");

                        }


                    case R.id.F1:
                        Cursor f1c = mDbHelper.getF1Status();
                        String F1Status = f1c.getString(0);
                        if (F1Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (F1Status.equals("f")) {
                            status.setText("Free");
                        } else if (F1Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.F2:
                        Cursor f2c = mDbHelper.getF2Status();
                        String F2Status = f2c.getString(0);
                        if (F2Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (F2Status.equals("f")) {
                            status.setText("Free");
                        } else if (F2Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.F3:
                        Cursor f3c = mDbHelper.getF3Status();
                        String F3Status = f3c.getString(0);
                        if (F3Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (F3Status.equals("f")) {
                            status.setText("Free");
                        } else if (F3Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.F4:
                        Cursor f4c = mDbHelper.getF4Status();
                        String F4Status = f4c.getString(0);
                        if (F4Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (F4Status.equals("f")) {
                            status.setText("Free");
                        } else if (F4Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.F5:
                        Cursor f5c = mDbHelper.getF5Status();
                        String F5Status = f5c.getString(0);
                        if (F5Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (F5Status.equals("f")) {
                            status.setText("Free");
                        } else if (F5Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.F6:
                        Cursor f6c = mDbHelper.getF6Status();
                        String F6Status = f6c.getString(0);
                        if (F6Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (F6Status.equals("f")) {
                            status.setText("Free");
                        } else if (F6Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.F7:
                        Cursor f7c = mDbHelper.getF7Status();
                        String F7Status = f7c.getString(0);
                        if (F7Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (F7Status.equals("f")) {
                            status.setText("Free");
                        } else if (F7Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.F8:
                        Cursor f8c = mDbHelper.getF8Status();
                        String F8Status = f8c.getString(0);
                        if (F8Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (F8Status.equals("f")) {
                            status.setText("Free");
                        } else if (F8Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.F9:
                        Cursor f9c = mDbHelper.getF9Status();
                        String F9Status = f9c.getString(0);
                        if (F9Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (F9Status.equals("f")) {
                            status.setText("Free");
                        } else if (F9Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.F10:
                        Cursor f10c = mDbHelper.getF10Status();
                        String F10Status = f10c.getString(0);
                        if (F10Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (F10Status.equals("f")) {
                            status.setText("Free");
                        } else if (F10Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.F11:
                        Cursor f11c = mDbHelper.getF11Status();
                        String F11Status = f11c.getString(0);
                        if (F11Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (F11Status.equals("f")) {
                            status.setText("Free");
                        } else if (F11Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.F12:
                        Cursor f12c = mDbHelper.getF12Status();
                        String F12Status = f12c.getString(0);
                        if (F12Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (F12Status.equals("f")) {
                            status.setText("Free");
                        } else if (F12Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.F13:
                        Cursor f13c = mDbHelper.getF13Status();
                        String F13Status = f13c.getString(0);
                        if (F13Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (F13Status.equals("f")) {
                            status.setText("Free");
                        } else if (F13Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.F14:
                        Cursor f14c = mDbHelper.getF14Status();
                        String F14Status = f14c.getString(0);
                        if (F14Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (F14Status.equals("f")) {
                            status.setText("Free");
                        } else if (F14Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.F15:
                        Cursor f15c = mDbHelper.getF15Status();
                        String F15Status = f15c.getString(0);
                        if (F15Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (F15Status.equals("f")) {
                            status.setText("Free");
                        } else if (F15Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.F16:
                        Cursor f16c = mDbHelper.getF16Status();
                        String F16Status = f16c.getString(0);
                        if (F16Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (F16Status.equals("f")) {
                            status.setText("Free");
                        } else if (F16Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.F17:
                        Cursor f17c = mDbHelper.getF17Status();
                        String F17Status = f17c.getString(0);
                        if (F17Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (F17Status.equals("f")) {
                            status.setText("Free");
                        } else if (F17Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.F18:
                        Cursor f18c = mDbHelper.getF18Status();
                        String F18Status = f18c.getString(0);
                        if (F18Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (F18Status.equals("f")) {
                            status.setText("Free");
                        } else if (F18Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.F19:
                        Cursor f19c = mDbHelper.getF19Status();
                        String F19Status = f19c.getString(0);
                        if (F19Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (F19Status.equals("f")) {
                            status.setText("Free");
                        } else if (F19Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.F20:
                        Cursor f20c = mDbHelper.getF20Status();
                        String F20Status = f20c.getString(0);
                        if (F20Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (F20Status.equals("f")) {
                            status.setText("Free");
                        } else if (F20Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.F21:
                        Cursor f21c = mDbHelper.getF21Status();
                        String F21Status = f21c.getString(0);
                        if (F21Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (F21Status.equals("f")) {
                            status.setText("Free");
                        } else if (F21Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.F22:
                        Cursor f22c = mDbHelper.getF22Status();
                        String F22Status = f22c.getString(0);
                        if (F22Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (F22Status.equals("f")) {
                            status.setText("Free");
                        } else if (F22Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.F23:
                        Cursor f23c = mDbHelper.getF23Status();
                        String F23Status = f23c.getString(0);
                        if (F23Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (F23Status.equals("f")) {
                            status.setText("Free");
                        } else if (F23Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.F24:
                        Cursor f24c = mDbHelper.getF24Status();
                        String F24Status = f24c.getString(0);
                        if (F24Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (F24Status.equals("f")) {
                            status.setText("Free");
                        } else if (F24Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.I1:
                        Cursor i1c = mDbHelper.getI1Status();
                        String I1Status = i1c.getString(0);
                        if (I1Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (I1Status.equals("f")) {
                            status.setText("Free");
                        } else if (I1Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.I2:
                        Cursor i2c = mDbHelper.getI2Status();
                        String I2Status = i2c.getString(0);
                        if (I2Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (I2Status.equals("f")) {
                            status.setText("Free");
                        } else if (I2Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.I3:
                        Cursor i3c = mDbHelper.getI3Status();
                        String I3Status = i3c.getString(0);
                        if (I3Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (I3Status.equals("f")) {
                            status.setText("Free");
                        } else if (I3Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.I4:
                        Cursor i4c = mDbHelper.getI4Status();
                        String I4Status = i4c.getString(0);
                        if (I4Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (I4Status.equals("f")) {
                            status.setText("Free");
                        } else if (I4Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.I5:
                        Cursor i5c = mDbHelper.getI5Status();
                        String I5Status = i5c.getString(0);
                        if (I5Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (I5Status.equals("f")) {
                            status.setText("Free");
                        } else if (I5Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.I6:
                        Cursor i6c = mDbHelper.getI6Status();
                        String I6Status = i6c.getString(0);
                        if (I6Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (I6Status.equals("f")) {
                            status.setText("Free");
                        } else if (I6Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.I7:
                        Cursor i7c = mDbHelper.getI7Status();
                        String I7Status = i7c.getString(0);
                        if (I7Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (I7Status.equals("f")) {
                            status.setText("Free");
                        } else if (I7Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.I8:
                        Cursor i8c = mDbHelper.getI8Status();
                        String I8Status = i8c.getString(0);
                        if (I8Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (I8Status.equals("f")) {
                            status.setText("Free");
                        } else if (I8Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.I9:
                        Cursor i9c = mDbHelper.getI9Status();
                        String I9Status = i9c.getString(0);
                        if (I9Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (I9Status.equals("f")) {
                            status.setText("Free");
                        } else if (I9Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.I10:
                        Cursor i10c = mDbHelper.getI10Status();
                        String I10Status = i10c.getString(0);
                        if (I10Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (I10Status.equals("f")) {
                            status.setText("Free");
                        } else if (I10Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.I11:
                        Cursor i11c = mDbHelper.getI11Status();
                        String I11Status = i11c.getString(0);
                        if (I11Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (I11Status.equals("f")) {
                            status.setText("Free");
                        } else if (I11Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.I12:
                        Cursor i12c = mDbHelper.getI12Status();
                        String I12Status = i12c.getString(0);
                        if (I12Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (I12Status.equals("f")) {
                            status.setText("Free");
                        } else if (I12Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.I13:
                        Cursor i13c = mDbHelper.getI13Status();
                        String I13Status = i13c.getString(0);
                        if (I13Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (I13Status.equals("f")) {
                            status.setText("Free");
                        } else if (I13Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.I14:
                        Cursor i14c = mDbHelper.getI14Status();
                        String I14Status = i14c.getString(0);
                        if (I14Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (I14Status.equals("f")) {
                            status.setText("Free");
                        } else if (I14Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.I15:
                        Cursor i15c = mDbHelper.getI15Status();
                        String I15Status = i15c.getString(0);
                        if (I15Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (I15Status.equals("f")) {
                            status.setText("Free");
                        } else if (I15Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.I16:
                        Cursor i16c = mDbHelper.getI16Status();
                        String I16Status = i16c.getString(0);
                        if (I16Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (I16Status.equals("f")) {
                            status.setText("Free");
                        } else if (I16Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.I17:
                        Cursor i17c = mDbHelper.getI17Status();
                        String I17Status = i17c.getString(0);
                        if (I17Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (I17Status.equals("f")) {
                            status.setText("Free");
                        } else if (I17Status.equals("r")) {
                            status.setText("Reserved");
                        }
                    case R.id.I18:
                        Cursor i18c = mDbHelper.getI18Status();
                        String I18Status = i18c.getString(0);
                        if (I18Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (I18Status.equals("f")) {
                            status.setText("Free");
                        } else if (I18Status.equals("r")) {
                            status.setText("Reserved");
                        }
                    case R.id.H1:
                        Cursor h1c = mDbHelper.getH1Status();
                        String H1Status = h1c.getString(0);
                        if (H1Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (H1Status.equals("f")) {
                            status.setText("Free");
                        } else if (H1Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.H2:
                        Cursor h2c = mDbHelper.getH2Status();
                        String H2Status = h2c.getString(0);
                        if (H2Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (H2Status.equals("f")) {
                            status.setText("Free");
                        } else if (H2Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.H3:
                        Cursor h3c = mDbHelper.getH3Status();
                        String H3Status = h3c.getString(0);
                        if (H3Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (H3Status.equals("f")) {
                            status.setText("Free");
                        } else if (H3Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.H4:
                        Cursor h4c = mDbHelper.getH4Status();
                        String H4Status = h4c.getString(0);
                        if (H4Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (H4Status.equals("f")) {
                            status.setText("Free");
                        } else if (H4Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.H5:
                        Cursor h5c = mDbHelper.getH5Status();
                        String H5Status = h5c.getString(0);
                        if (H5Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (H5Status.equals("f")) {
                            status.setText("Free");
                        } else if (H5Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.H6:
                        Cursor h6c = mDbHelper.getH6Status();
                        String H6Status = h6c.getString(0);
                        if (H6Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (H6Status.equals("f")) {
                            status.setText("Free");
                        } else if (H6Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.H7:
                        Cursor h7c = mDbHelper.getH7Status();
                        String H7Status = h7c.getString(0);
                        if (H7Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (H7Status.equals("f")) {
                            status.setText("Free");
                        } else if (H7Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.H8:
                        Cursor h8c = mDbHelper.getH8Status();
                        String H8Status = h8c.getString(0);
                        if (H8Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (H8Status.equals("f")) {
                            status.setText("Free");
                        } else if (H8Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.H9:
                        Cursor h9c = mDbHelper.getH9Status();
                        String H9Status = h9c.getString(0);
                        if (H9Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (H9Status.equals("f")) {
                            status.setText("Free");
                        } else if (H9Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.H10:
                        Cursor h10c = mDbHelper.getH10Status();
                        String H10Status = h10c.getString(0);
                        if (H10Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (H10Status.equals("f")) {
                            status.setText("Free");
                        } else if (H10Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.H11:
                        Cursor h11c = mDbHelper.getH11Status();
                        String H11Status = h11c.getString(0);
                        if (H11Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (H11Status.equals("f")) {
                            status.setText("Free");
                        } else if (H11Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.H12:
                        Cursor h12c = mDbHelper.getH12Status();
                        String H12Status = h12c.getString(0);
                        if (H12Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (H12Status.equals("f")) {
                            status.setText("Free");
                        } else if (H12Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.H13:
                        Cursor h13c = mDbHelper.getH13Status();
                        String H13Status = h13c.getString(0);
                        if (H13Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (H13Status.equals("f")) {
                            status.setText("Free");
                        } else if (H13Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.H14:
                        Cursor h14c = mDbHelper.getH14Status();
                        String H14Status = h14c.getString(0);
                        if (H14Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (H14Status.equals("f")) {
                            status.setText("Free");
                        } else if (H14Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.H15:
                        Cursor h15c = mDbHelper.getH15Status();
                        String H15Status = h15c.getString(0);
                        if (H15Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (H15Status.equals("f")) {
                            status.setText("Free");
                        } else if (H15Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.H16:
                        Cursor h16c = mDbHelper.getH16Status();
                        String H16Status = h16c.getString(0);
                        if (H16Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (H16Status.equals("f")) {
                            status.setText("Free");
                        } else if (H16Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.H17:
                        Cursor h17c = mDbHelper.getH17Status();
                        String H17Status = h17c.getString(0);
                        if (H17Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (H17Status.equals("f")) {
                            status.setText("Free");
                        } else if (H17Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.H18:
                        Cursor h18c = mDbHelper.getH18Status();
                        String H18Status = h18c.getString(0);
                        if (H18Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (H18Status.equals("f")) {
                            status.setText("Free");
                        } else if (H18Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.H19:
                        Cursor h19c = mDbHelper.getH19Status();
                        String H19Status = h19c.getString(0);
                        if (H19Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (H19Status.equals("f")) {
                            status.setText("Free");
                        } else if (H19Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.H20:
                        Cursor h20c = mDbHelper.getH20Status();
                        String H20Status = h20c.getString(0);
                        if (H20Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (H20Status.equals("f")) {
                            status.setText("Free");
                        } else if (H20Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.H21:
                        Cursor h21c = mDbHelper.getH21Status();
                        String H21Status = h21c.getString(0);
                        if (H21Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (H21Status.equals("f")) {
                            status.setText("Free");
                        } else if (H21Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.H22:
                        Cursor h22c = mDbHelper.getH22Status();
                        String H22Status = h22c.getString(0);
                        if (H22Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (H22Status.equals("f")) {
                            status.setText("Free");
                        } else if (H22Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.H23:
                        Cursor h23c = mDbHelper.getH23Status();
                        String H23Status = h23c.getString(0);
                        if (H23Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (H23Status.equals("f")) {
                            status.setText("Free");
                        } else if (H23Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.H24:
                        Cursor h24c = mDbHelper.getH24Status();
                        String H24Status = h24c.getString(0);
                        if (H24Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (H24Status.equals("f")) {
                            status.setText("Free");
                        } else if (H24Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.H25:
                        Cursor h25c = mDbHelper.getH25Status();
                        String H25Status = h25c.getString(0);
                        if (H25Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (H25Status.equals("f")) {
                            status.setText("Free");
                        } else if (H25Status.equals("r")) {
                            status.setText("Reserved");

                        }

                    case R.id.H26:
                        Cursor h26c = mDbHelper.getH26Status();
                        String H26Status = h26c.getString(0);
                        if (H26Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (H26Status.equals("f")) {
                            status.setText("Free");
                        } else if (H26Status.equals("r")) {
                            status.setText("Reserved");

                        }

                    case R.id.H27:
                        Cursor h27c = mDbHelper.getH27Status();
                        String H27Status = h27c.getString(0);
                        if (H27Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (H27Status.equals("f")) {
                            status.setText("Free");
                        } else if (H27Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.H28:
                        Cursor h28c = mDbHelper.getH28Status();
                        String H28Status = h28c.getString(0);
                        if (H28Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (H28Status.equals("f")) {
                            status.setText("Free");
                        } else if (H28Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.H29:
                        Cursor h29c = mDbHelper.getH29Status();
                        String H29Status = h29c.getString(0);
                        if (H29Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (H29Status.equals("f")) {
                            status.setText("Free");
                        } else if (H29Status.equals("r")) {
                            status.setText("Reserved");

                        }
                    case R.id.H30:
                        Cursor h30c = mDbHelper.getH30Status();
                        String H30Status = h30c.getString(0);
                        if (H30Status.equals("o")) {
                            status.setText("Occupied");
                        } else if (H30Status.equals("f")) {
                            status.setText("Free");
                        } else if (H30Status.equals("r")) {
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
//        a9.setOnClickListener(ButtonListener);
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
        c1.setOnClickListener(ButtonListener);
        c2.setOnClickListener(ButtonListener);
        c3.setOnClickListener(ButtonListener);
        c4.setOnClickListener(ButtonListener);
        c5.setOnClickListener(ButtonListener);
        c6.setOnClickListener(ButtonListener);
        c7.setOnClickListener(ButtonListener);
        c8.setOnClickListener(ButtonListener);
        c9.setOnClickListener(ButtonListener);
        c10.setOnClickListener(ButtonListener);c11.setOnClickListener(ButtonListener);c12.setOnClickListener(ButtonListener);
        c13.setOnClickListener(ButtonListener);
        d1.setOnClickListener(ButtonListener);
        d2.setOnClickListener(ButtonListener);
        d3.setOnClickListener(ButtonListener);
        d4.setOnClickListener(ButtonListener);
        d5.setOnClickListener(ButtonListener);
        d6.setOnClickListener(ButtonListener);
        d7.setOnClickListener(ButtonListener);
        d8.setOnClickListener(ButtonListener);
        d9.setOnClickListener(ButtonListener);
        d10.setOnClickListener(ButtonListener);d11.setOnClickListener(ButtonListener);d12.setOnClickListener(ButtonListener);
        d13.setOnClickListener(ButtonListener);
        d14.setOnClickListener(ButtonListener);
        d15.setOnClickListener(ButtonListener);
        d16.setOnClickListener(ButtonListener);
        d17.setOnClickListener(ButtonListener);
        d18.setOnClickListener(ButtonListener);
        d19.setOnClickListener(ButtonListener);
        d20.setOnClickListener(ButtonListener);
        d21.setOnClickListener(ButtonListener);
        d22.setOnClickListener(ButtonListener);
        d23.setOnClickListener(ButtonListener);
        d24.setOnClickListener(ButtonListener);
        e1.setOnClickListener(ButtonListener);
        e2.setOnClickListener(ButtonListener);
        e3.setOnClickListener(ButtonListener);
        e4.setOnClickListener(ButtonListener);
        e5.setOnClickListener(ButtonListener);
        e6.setOnClickListener(ButtonListener);
        e7.setOnClickListener(ButtonListener);
        e8.setOnClickListener(ButtonListener);
        e9.setOnClickListener(ButtonListener);
        e10.setOnClickListener(ButtonListener);e11.setOnClickListener(ButtonListener);e12.setOnClickListener(ButtonListener);
        e13.setOnClickListener(ButtonListener);
        e14.setOnClickListener(ButtonListener);
        e15.setOnClickListener(ButtonListener);
        e16.setOnClickListener(ButtonListener);
        e17.setOnClickListener(ButtonListener);
        e18.setOnClickListener(ButtonListener);
        e19.setOnClickListener(ButtonListener);
        e20.setOnClickListener(ButtonListener);
        e21.setOnClickListener(ButtonListener);
        e22.setOnClickListener(ButtonListener);
        e23.setOnClickListener(ButtonListener);
        e24.setOnClickListener(ButtonListener);
        f1.setOnClickListener(ButtonListener);
        f2.setOnClickListener(ButtonListener);
        f3.setOnClickListener(ButtonListener);
        f4.setOnClickListener(ButtonListener);
        f5.setOnClickListener(ButtonListener);
        f6.setOnClickListener(ButtonListener);
        f7.setOnClickListener(ButtonListener);
        f8.setOnClickListener(ButtonListener);
        f9.setOnClickListener(ButtonListener);
        f10.setOnClickListener(ButtonListener);f11.setOnClickListener(ButtonListener);f12.setOnClickListener(ButtonListener);
        f13.setOnClickListener(ButtonListener);
        f14.setOnClickListener(ButtonListener);
        f15.setOnClickListener(ButtonListener);
        f16.setOnClickListener(ButtonListener);
        f17.setOnClickListener(ButtonListener);
        f18.setOnClickListener(ButtonListener);
        f19.setOnClickListener(ButtonListener);
        f20.setOnClickListener(ButtonListener);
        f21.setOnClickListener(ButtonListener);
        f22.setOnClickListener(ButtonListener);
        f23.setOnClickListener(ButtonListener);
        f24.setOnClickListener(ButtonListener);

        g1.setOnClickListener(ButtonListener);
        g2.setOnClickListener(ButtonListener);
        g3.setOnClickListener(ButtonListener);
        g4.setOnClickListener(ButtonListener);
        g5.setOnClickListener(ButtonListener);
        g6.setOnClickListener(ButtonListener);
        g7.setOnClickListener(ButtonListener);
        g8.setOnClickListener(ButtonListener);
        g9.setOnClickListener(ButtonListener);
        g10.setOnClickListener(ButtonListener);g11.setOnClickListener(ButtonListener);g12.setOnClickListener(ButtonListener);
        g13.setOnClickListener(ButtonListener);
        g14.setOnClickListener(ButtonListener);
        g15.setOnClickListener(ButtonListener);
        g16.setOnClickListener(ButtonListener);
        g17.setOnClickListener(ButtonListener);
        g18.setOnClickListener(ButtonListener);
        g19.setOnClickListener(ButtonListener);
        g20.setOnClickListener(ButtonListener);
        g21.setOnClickListener(ButtonListener);
        g22.setOnClickListener(ButtonListener);
        g23.setOnClickListener(ButtonListener);
        g24.setOnClickListener(ButtonListener);

        h1.setOnClickListener(ButtonListener);
        h2.setOnClickListener(ButtonListener);
        h3.setOnClickListener(ButtonListener);
        h4.setOnClickListener(ButtonListener);
        h5.setOnClickListener(ButtonListener);
        h6.setOnClickListener(ButtonListener);
        h7.setOnClickListener(ButtonListener);
        h8.setOnClickListener(ButtonListener);
        h9.setOnClickListener(ButtonListener);
        h10.setOnClickListener(ButtonListener);h11.setOnClickListener(ButtonListener);h12.setOnClickListener(ButtonListener);
        h13.setOnClickListener(ButtonListener);
        h14.setOnClickListener(ButtonListener);
        h15.setOnClickListener(ButtonListener);
        h16.setOnClickListener(ButtonListener);
        h17.setOnClickListener(ButtonListener);
        h18.setOnClickListener(ButtonListener);
        h19.setOnClickListener(ButtonListener);
        h20.setOnClickListener(ButtonListener);
        h21.setOnClickListener(ButtonListener);
        h22.setOnClickListener(ButtonListener);
        h23.setOnClickListener(ButtonListener);
        h24.setOnClickListener(ButtonListener);
        h25.setOnClickListener(ButtonListener);
        h26.setOnClickListener(ButtonListener);
        h27.setOnClickListener(ButtonListener);
        h28.setOnClickListener(ButtonListener);
        h29.setOnClickListener(ButtonListener);
        h30.setOnClickListener(ButtonListener);

        i1.setOnClickListener(ButtonListener);
        i2.setOnClickListener(ButtonListener);
        i3.setOnClickListener(ButtonListener);
        i4.setOnClickListener(ButtonListener);
        i5.setOnClickListener(ButtonListener);
        i6.setOnClickListener(ButtonListener);
        i7.setOnClickListener(ButtonListener);
        i8.setOnClickListener(ButtonListener);
        i9.setOnClickListener(ButtonListener);
        i10.setOnClickListener(ButtonListener);i11.setOnClickListener(ButtonListener);










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
                Cursor d8c = mDbHelper.getD8Status();
                String D8Status = d8c.getString(0);
                Log.i("Status:", D8Status + "");
                if (D8Status.equals("f")) {
                    d8.setBackgroundColor(Color.parseColor("#5ED177"));
                    d8.setText("D8 \n FREE");
                } else if (D8Status.equals("o")) {
                    d8.setBackgroundColor(Color.parseColor("#E34040"));
                    d8.setText("D8 \n OCCUPIED");
                }
                Cursor d9c = mDbHelper.getD9Status();
                String D9Status = d9c.getString(0);
                Log.i("Status:", D9Status + "");
                if (D9Status.equals("f")) {
                    d9.setBackgroundColor(Color.parseColor("#5ED177"));
                    d9.setText("D9 \n FREE");
                } else if (D9Status.equals("o")) {
                    d9.setBackgroundColor(Color.parseColor("#E34040"));
                    d9.setText("D9 \n OCCUPIED");
                }
                Cursor d10c = mDbHelper.getD10Status();
                String D10Status = d10c.getString(0);
                Log.i("Status:", D10Status + "");
                if (D10Status.equals("f")) {
                    d10.setBackgroundColor(Color.parseColor("#5ED177"));
                    d10.setText("D10 \n FREE");
                } else if (D10Status.equals("o")) {
                    d10.setBackgroundColor(Color.parseColor("#E34040"));
                    d10.setText("D10 \n OCCUPIED");
                }
                Cursor d11c = mDbHelper.getD11Status();
                String D11Status = d11c.getString(0);
                Log.i("Status:", D11Status + "");
                if (D11Status.equals("f")) {
                    d11.setBackgroundColor(Color.parseColor("#5ED177"));
                    d11.setText("D11 \n FREE");
                } else if (D11Status.equals("o")) {
                    d11.setBackgroundColor(Color.parseColor("#E34040"));
                    d11.setText("D11 \n OCCUPIED");
                }
                Cursor d12c = mDbHelper.getD12Status();
                String D12Status = d12c.getString(0);
                Log.i("Status:", D12Status + "");
                if (D12Status.equals("f")) {
                    d12.setBackgroundColor(Color.parseColor("#5ED177"));
                    d12.setText("D12 \n FREE");
                } else if (D12Status.equals("o")) {
                    d12.setBackgroundColor(Color.parseColor("#E34040"));
                    d12.setText("D12 \n OCCUPIED");
                }
                Cursor d13c = mDbHelper.getD13Status();
                String D13Status = d13c.getString(0);
                Log.i("Status:", D13Status + "");
                if (D13Status.equals("f")) {
                    d13.setBackgroundColor(Color.parseColor("#5ED177"));
                    d13.setText("D13 \n FREE");
                } else if (D13Status.equals("o")) {
                    d13.setBackgroundColor(Color.parseColor("#E34040"));
                    d13.setText("D13 \n OCCUPIED");
                }
                Cursor d14c = mDbHelper.getD14Status();
                String D14Status = d14c.getString(0);
                Log.i("Status:", D14Status + "");
                if (D14Status.equals("f")) {
                    d14.setBackgroundColor(Color.parseColor("#5ED177"));
                    d14.setText("D14 \n FREE");
                } else if (D14Status.equals("o")) {
                    d14.setBackgroundColor(Color.parseColor("#E34040"));
                    d14.setText("D14 \n OCCUPIED");
                }
                Cursor d15c = mDbHelper.getD15Status();
                String D15Status = d15c.getString(0);
                Log.i("Status:", D15Status + "");
                if (D15Status.equals("f")) {
                    d15.setBackgroundColor(Color.parseColor("#5ED177"));
                    d15.setText("D15 \n FREE");
                } else if (D15Status.equals("o")) {
                    d15.setBackgroundColor(Color.parseColor("#E34040"));
                    d15.setText("D15 \n OCCUPIED");
                }
                Cursor d16c = mDbHelper.getD16Status();
                String D16Status = d16c.getString(0);
                Log.i("Status:", D16Status + "");
                if (D16Status.equals("f")) {
                    d16.setBackgroundColor(Color.parseColor("#5ED177"));
                    d16.setText("D16 \n FREE");
                } else if (D16Status.equals("o")) {
                    d16.setBackgroundColor(Color.parseColor("#E34040"));
                    d16.setText("D16 \n OCCUPIED");
                }
                Cursor d17c = mDbHelper.getD17Status();
                String D17Status = d17c.getString(0);
                Log.i("Status:", D17Status + "");
                if (D17Status.equals("f")) {
                    d17.setBackgroundColor(Color.parseColor("#5ED177"));
                    d17.setText("D17 \n FREE");
                } else if (D17Status.equals("o")) {
                    d17.setBackgroundColor(Color.parseColor("#E34040"));
                    d17.setText("D17 \n OCCUPIED");
                }
                Cursor d18c = mDbHelper.getD18Status();
                String D18Status = d18c.getString(0);
                Log.i("Status:", D18Status + "");
                if (D18Status.equals("f")) {
                    d18.setBackgroundColor(Color.parseColor("#5ED187"));
                    d18.setText("D18 \n FREE");
                } else if (D18Status.equals("o")) {
                    d18.setBackgroundColor(Color.parseColor("#E34040"));
                    d18.setText("D18 \n OCCUPIED");
                }
                Cursor d19c = mDbHelper.getD19Status();
                String D19Status = d19c.getString(0);
                Log.i("Status:", D19Status + "");
                if (D19Status.equals("f")) {
                    d19.setBackgroundColor(Color.parseColor("#5ED197"));
                    d19.setText("D19 \n FREE");
                } else if (D19Status.equals("o")) {
                    d19.setBackgroundColor(Color.parseColor("#E34040"));
                    d19.setText("D19 \n OCCUPIED");
                }
                Cursor d20c = mDbHelper.getD20Status();
                String D20Status = d20c.getString(0);
                Log.i("Status:", D20Status + "");
                if (D20Status.equals("f")) {
                    d20.setBackgroundColor(Color.parseColor("#5ED207"));
                    d20.setText("D20 \n FREE");
                } else if (D20Status.equals("o")) {
                    d20.setBackgroundColor(Color.parseColor("#E34040"));
                    d20.setText("D20 \n OCCUPIED");
                }
                Cursor d21c = mDbHelper.getD21Status();
                String D21Status = d21c.getString(0);
                Log.i("Status:", D21Status + "");
                if (D21Status.equals("f")) {
                    d21.setBackgroundColor(Color.parseColor("#5ED217"));
                    d21.setText("D21 \n FREE");
                } else if (D21Status.equals("o")) {
                    d21.setBackgroundColor(Color.parseColor("#E34040"));
                    d21.setText("D21 \n OCCUPIED");
                }
                Cursor d22c = mDbHelper.getD22Status();
                String D22Status = d22c.getString(0);
                Log.i("Status:", D22Status + "");
                if (D22Status.equals("f")) {
                    d22.setBackgroundColor(Color.parseColor("#5ED227"));
                    d22.setText("D22 \n FREE");
                } else if (D22Status.equals("o")) {
                    d22.setBackgroundColor(Color.parseColor("#E34040"));
                    d22.setText("D22 \n OCCUPIED");
                }
                Cursor d23c = mDbHelper.getD23Status();
                String D23Status = d23c.getString(0);
                Log.i("Status:", D23Status + "");
                if (D23Status.equals("f")) {
                    d23.setBackgroundColor(Color.parseColor("#5ED237"));
                    d23.setText("D23 \n FREE");
                } else if (D23Status.equals("o")) {
                    d23.setBackgroundColor(Color.parseColor("#E34040"));
                    d23.setText("D23 \n OCCUPIED");
                }
                Cursor d24c = mDbHelper.getD24Status();
                String D24Status = d24c.getString(0);
                Log.i("Status:", D24Status + "");
                if (D24Status.equals("f")) {
                    d24.setBackgroundColor(Color.parseColor("#5ED247"));
                    d24.setText("D24 \n FREE");
                } else if (D24Status.equals("o")) {
                    d24.setBackgroundColor(Color.parseColor("#E34040"));
                    d24.setText("D24 \n OCCUPIED");
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
                Cursor e13c = mDbHelper.getE13Status();
                String E13Status = e13c.getString(0);
                Log.i("Status:", E13Status + "");
                if (E13Status.equals("f")) {
                    e13.setBackgroundColor(Color.parseColor("#5EE177"));
                    e13.setText("E13 \n FREE");
                } else if (E13Status.equals("o")) {
                    e13.setBackgroundColor(Color.parseColor("#E34040"));
                    e13.setText("E13 \n OCCUPIED");
                }
                Cursor e14c = mDbHelper.getE14Status();
                String E14Status = e14c.getString(0);
                Log.i("Status:", E14Status + "");
                if (E14Status.equals("f")) {
                    e14.setBackgroundColor(Color.parseColor("#5EE177"));
                    e14.setText("E14 \n FREE");
                } else if (E14Status.equals("o")) {
                    e14.setBackgroundColor(Color.parseColor("#E34040"));
                    e14.setText("E14 \n OCCUPIED");
                }
                Cursor e15c = mDbHelper.getE15Status();
                String E15Status = e15c.getString(0);
                Log.i("Status:", E15Status + "");
                if (E15Status.equals("f")) {
                    e15.setBackgroundColor(Color.parseColor("#5EE177"));
                    e15.setText("E15 \n FREE");
                } else if (E15Status.equals("o")) {
                    e15.setBackgroundColor(Color.parseColor("#E34040"));
                    e15.setText("E15 \n OCCUPIED");
                }
                Cursor e16c = mDbHelper.getE16Status();
                String E16Status = e16c.getString(0);
                Log.i("Status:", E16Status + "");
                if (E16Status.equals("f")) {
                    e16.setBackgroundColor(Color.parseColor("#5EE177"));
                    e16.setText("E16 \n FREE");
                } else if (E16Status.equals("o")) {
                    e16.setBackgroundColor(Color.parseColor("#E34040"));
                    e16.setText("E16 \n OCCUPIED");
                }
                Cursor e17c = mDbHelper.getE17Status();
                String E17Status = e17c.getString(0);
                Log.i("Status:", E17Status + "");
                if (E17Status.equals("f")) {
                    e17.setBackgroundColor(Color.parseColor("#5EE177"));
                    e17.setText("E17 \n FREE");
                } else if (E17Status.equals("o")) {
                    e17.setBackgroundColor(Color.parseColor("#E34040"));
                    e17.setText("E17 \n OCCUPIED");
                }
                Cursor e18c = mDbHelper.getE18Status();
                String E18Status = e18c.getString(0);
                Log.i("Status:", E18Status + "");
                if (E18Status.equals("f")) {
                    e18.setBackgroundColor(Color.parseColor("#5EE187"));
                    e18.setText("E18 \n FREE");
                } else if (E18Status.equals("o")) {
                    e18.setBackgroundColor(Color.parseColor("#E34040"));
                    e18.setText("E18 \n OCCUPIED");
                }
                Cursor e19c = mDbHelper.getE19Status();
                String E19Status = e19c.getString(0);
                Log.i("Status:", E19Status + "");
                if (E19Status.equals("f")) {
                    e19.setBackgroundColor(Color.parseColor("#5EE197"));
                    e19.setText("E19 \n FREE");
                } else if (E19Status.equals("o")) {
                    e19.setBackgroundColor(Color.parseColor("#E34040"));
                    e19.setText("E19 \n OCCUPIED");
                }
                Cursor e20c = mDbHelper.getE20Status();
                String E20Status = e20c.getString(0);
                Log.i("Status:", E20Status + "");
                if (E20Status.equals("f")) {
                    e20.setBackgroundColor(Color.parseColor("#5EE207"));
                    e20.setText("E20 \n FREE");
                } else if (E20Status.equals("o")) {
                    e20.setBackgroundColor(Color.parseColor("#E34040"));
                    e20.setText("E20 \n OCCUPIED");
                }
                Cursor e21c = mDbHelper.getE21Status();
                String E21Status = e21c.getString(0);
                Log.i("Status:", E21Status + "");
                if (E21Status.equals("f")) {
                    e21.setBackgroundColor(Color.parseColor("#5EE217"));
                    e21.setText("E21 \n FREE");
                } else if (E21Status.equals("o")) {
                    e21.setBackgroundColor(Color.parseColor("#E34040"));
                    e21.setText("E21 \n OCCUPIED");
                }
                Cursor e22c = mDbHelper.getE22Status();
                String E22Status = e22c.getString(0);
                Log.i("Status:", E22Status + "");
                if (E22Status.equals("f")) {
                    e22.setBackgroundColor(Color.parseColor("#5EE227"));
                    e22.setText("E22 \n FREE");
                } else if (E22Status.equals("o")) {
                    e22.setBackgroundColor(Color.parseColor("#E34040"));
                    e22.setText("E22 \n OCCUPIED");
                }
                Cursor e23c = mDbHelper.getE23Status();
                String E23Status = e23c.getString(0);
                Log.i("Status:", E23Status + "");
                if (E23Status.equals("f")) {
                    e23.setBackgroundColor(Color.parseColor("#5EE237"));
                    e23.setText("E23 \n FREE");
                } else if (E23Status.equals("o")) {
                    e23.setBackgroundColor(Color.parseColor("#E34040"));
                    e23.setText("E23 \n OCCUPIED");
                }
                Cursor e24c = mDbHelper.getE24Status();
                String E24Status = e24c.getString(0);
                Log.i("Status:", E24Status + "");
                if (E24Status.equals("f")) {
                    e24.setBackgroundColor(Color.parseColor("#5EE247"));
                    e24.setText("E24 \n FREE");
                } else if (E24Status.equals("o")) {
                    e24.setBackgroundColor(Color.parseColor("#E34040"));
                    e24.setText("E24 \n OCCUPIED");
                }

                Cursor f1c = mDbHelper.getF1Status();
                String F1Status = f1c.getString(0);
                Log.i("Status:", F1Status + "");
                if (F1Status.equals("f")) {
                    f1.setBackgroundColor(Color.parseColor("#5ed177"));
                    f1.setText("F1 \n FREE");
                } else if (F1Status.equals("o")) {
                    f1.setBackgroundColor(Color.parseColor("#F34040"));
                    f1.setText("F1 \n OCCUPIED");
                }
                Cursor f2c = mDbHelper.getF2Status();
                String F2Status = f2c.getString(0);
                Log.i("Status:", F2Status + "");
                if (F2Status.equals("f")) {
                    f2.setBackgroundColor(Color.parseColor("#5FF277"));
                    f2.setText("F2 \n FREE");
                } else if (F2Status.equals("o")) {
                    f2.setBackgroundColor(Color.parseColor("#F34040"));
                    f2.setText("F2 \n OCCUPIED");
                }
                Cursor f3c = mDbHelper.getF3Status();
                String F3Status = f3c.getString(0);
                Log.i("Status:", F3Status + "");
                if (F3Status.equals("f")) {
                    f3.setBackgroundColor(Color.parseColor("#5FF377"));
                    f3.setText("F3 \n FREE");
                } else if (F3Status.equals("o")) {
                    f3.setBackgroundColor(Color.parseColor("#F34040"));
                    f3.setText("F3 \n OCCUPIED");
                }
                Cursor f4c = mDbHelper.getF4Status();
                String F4Status = f4c.getString(0);
                Log.i("Status:", F4Status + "");
                if (F4Status.equals("f")) {
                    f4.setBackgroundColor(Color.parseColor("#5FF477"));
                    f4.setText("F4 \n FREE");
                } else if (F4Status.equals("o")) {
                    f4.setBackgroundColor(Color.parseColor("#F34040"));
                    f4.setText("F4 \n OCCUPIED");
                }
                Cursor f5c = mDbHelper.getF5Status();
                String F5Status = f5c.getString(0);
                Log.i("Status:", F5Status + "");
                if (F5Status.equals("f")) {
                    f5.setBackgroundColor(Color.parseColor("#5ed177"));
                    f5.setText("F5 \n FREE");
                } else if (F5Status.equals("o")) {
                    f5.setBackgroundColor(Color.parseColor("#F34040"));
                    f5.setText("F5 \n OCCUPIED");
                }
                Cursor f6c = mDbHelper.getF6Status();
                String F6Status = f6c.getString(0);
                Log.i("Status:", F6Status + "");
                if (F6Status.equals("f")) {
                    f6.setBackgroundColor(Color.parseColor("#5ed177"));
                    f6.setText("F6 \n FREE");
                } else if (F6Status.equals("o")) {
                    f6.setBackgroundColor(Color.parseColor("#F34040"));
                    f6.setText("F6 \n OCCUPIED");
                }
                Cursor f7c = mDbHelper.getF7Status();
                String F7Status = f7c.getString(0);
                Log.i("Status:", F7Status + "");
                if (F7Status.equals("f")) {
                    f7.setBackgroundColor(Color.parseColor("#5ed177"));
                    f7.setText("F7 \n FREE");
                } else if (F7Status.equals("o")) {
                    f7.setBackgroundColor(Color.parseColor("#F34040"));
                    f7.setText("F7 \n OCCUPIED");
                }
                Cursor f8c = mDbHelper.getF8Status();
                String F8Status = f8c.getString(0);
                Log.i("Status:", F8Status + "");
                if (F8Status.equals("f")) {
                    f8.setBackgroundColor(Color.parseColor("#5ed177"));
                    f8.setText("F8 \n FREE");
                } else if (F8Status.equals("o")) {
                    f8.setBackgroundColor(Color.parseColor("#F34040"));
                    f8.setText("F8 \n OCCUPIED");
                }
                Cursor f9c = mDbHelper.getF9Status();
                String F9Status = f9c.getString(0);
                Log.i("Status:", F9Status + "");
                if (F9Status.equals("f")) {
                    f9.setBackgroundColor(Color.parseColor("#5ed177"));
                    f9.setText("F9 \n FREE");
                } else if (F9Status.equals("o")) {
                    f9.setBackgroundColor(Color.parseColor("#F34040"));
                    f9.setText("F9 \n OCCUPIED");
                }
                Cursor f10c = mDbHelper.getF10Status();
                String F10Status = f10c.getString(0);
                Log.i("Status:", F10Status + "");
                if (F10Status.equals("f")) {
                    f10.setBackgroundColor(Color.parseColor("#5ed177"));
                    f10.setText("F10 \n FREE");
                } else if (F10Status.equals("o")) {
                    f10.setBackgroundColor(Color.parseColor("#F34040"));
                    f10.setText("F10 \n OCCUPIED");
                }
                Cursor f11c = mDbHelper.getF11Status();
                String F11Status = f11c.getString(0);
                Log.i("Status:", F11Status + "");
                if (F11Status.equals("f")) {
                    f11.setBackgroundColor(Color.parseColor("#5ed177"));
                    f11.setText("F11 \n FREE");
                } else if (F11Status.equals("o")) {
                    f11.setBackgroundColor(Color.parseColor("#F34040"));
                    f11.setText("F11 \n OCCUPIED");
                }
                Cursor f12c = mDbHelper.getF12Status();
                String F12Status = f12c.getString(0);
                Log.i("Status:", F12Status + "");
                if (F12Status.equals("f")) {
                    f12.setBackgroundColor(Color.parseColor("#5ed177"));
                    f12.setText("F12 \n FREE");
                } else if (F12Status.equals("o")) {
                    f12.setBackgroundColor(Color.parseColor("#F34040"));
                    f12.setText("F12 \n OCCUPIED");
                }
                Cursor f13c = mDbHelper.getF13Status();
                String F13Status = f13c.getString(0);
                Log.i("Status:", F13Status + "");
                if (F13Status.equals("f")) {
                    f13.setBackgroundColor(Color.parseColor("#5ed177"));
                    f13.setText("F13 \n FREE");
                } else if (F13Status.equals("o")) {
                    f13.setBackgroundColor(Color.parseColor("#F34040"));
                    f13.setText("F13 \n OCCUPIED");
                }
                Cursor f14c = mDbHelper.getF14Status();
                String F14Status = f14c.getString(0);
                Log.i("Status:", F14Status + "");
                if (F14Status.equals("f")) {
                    f14.setBackgroundColor(Color.parseColor("#5ed177"));
                    f14.setText("F14 \n FREE");
                } else if (F14Status.equals("o")) {
                    f14.setBackgroundColor(Color.parseColor("#F34040"));
                    f14.setText("F14 \n OCCUPIED");
                }
                Cursor f15c = mDbHelper.getF15Status();
                String F15Status = f15c.getString(0);
                Log.i("Status:", F15Status + "");
                if (F15Status.equals("f")) {
                    f15.setBackgroundColor(Color.parseColor("#5ed177"));
                    f15.setText("F15 \n FREE");
                } else if (F15Status.equals("o")) {
                    f15.setBackgroundColor(Color.parseColor("#F34040"));
                    f15.setText("F15 \n OCCUPIED");
                }
                Cursor f16c = mDbHelper.getF16Status();
                String F16Status = f16c.getString(0);
                Log.i("Status:", F16Status + "");
                if (F16Status.equals("f")) {
                    f16.setBackgroundColor(Color.parseColor("#5ed177"));
                    f16.setText("F16 \n FREE");
                } else if (F16Status.equals("o")) {
                    f16.setBackgroundColor(Color.parseColor("#F34040"));
                    f16.setText("F16 \n OCCUPIED");
                }
                Cursor f17c = mDbHelper.getF17Status();
                String F17Status = f17c.getString(0);
                Log.i("Status:", F17Status + "");
                if (F17Status.equals("f")) {
                    f17.setBackgroundColor(Color.parseColor("#5ed177"));
                    f17.setText("F17 \n FREE");
                } else if (F17Status.equals("o")) {
                    f17.setBackgroundColor(Color.parseColor("#F34040"));
                    f17.setText("F17 \n OCCUPIED");
                }
                Cursor f18c = mDbHelper.getF18Status();
                String F18Status = f18c.getString(0);
                Log.i("Status:", F18Status + "");
                if (F18Status.equals("f")) {
                    f18.setBackgroundColor(Color.parseColor("#5FF187"));
                    f18.setText("F18 \n FREE");
                } else if (F18Status.equals("o")) {
                    f18.setBackgroundColor(Color.parseColor("#F34040"));
                    f18.setText("F18 \n OCCUPIED");
                }
                Cursor f19c = mDbHelper.getF19Status();
                String F19Status = f19c.getString(0);
                Log.i("Status:", F19Status + "");
                if (F19Status.equals("f")) {
                    f19.setBackgroundColor(Color.parseColor("#5FF197"));
                    f19.setText("F19 \n FREE");
                } else if (F19Status.equals("o")) {
                    f19.setBackgroundColor(Color.parseColor("#F34040"));
                    f19.setText("F19 \n OCCUPIED");
                }
                Cursor f20c = mDbHelper.getF20Status();
                String F20Status = f20c.getString(0);
                Log.i("Status:", F20Status + "");
                if (F20Status.equals("f")) {
                    f20.setBackgroundColor(Color.parseColor("#5FF207"));
                    f20.setText("F20 \n FREE");
                } else if (F20Status.equals("o")) {
                    f20.setBackgroundColor(Color.parseColor("#F34040"));
                    f20.setText("F20 \n OCCUPIED");
                }
                Cursor f21c = mDbHelper.getF21Status();
                String F21Status = f21c.getString(0);
                Log.i("Status:", F21Status + "");
                if (F21Status.equals("f")) {
                    f21.setBackgroundColor(Color.parseColor("#5FF217"));
                    f21.setText("F21 \n FREE");
                } else if (F21Status.equals("o")) {
                    f21.setBackgroundColor(Color.parseColor("#F34040"));
                    f21.setText("F21 \n OCCUPIED");
                }
                Cursor f22c = mDbHelper.getF22Status();
                String F22Status = f22c.getString(0);
                Log.i("Status:", F22Status + "");
                if (F22Status.equals("f")) {
                    f22.setBackgroundColor(Color.parseColor("#5FF227"));
                    f22.setText("F22 \n FREE");
                } else if (F22Status.equals("o")) {
                    f22.setBackgroundColor(Color.parseColor("#F34040"));
                    f22.setText("F22 \n OCCUPIED");
                }
                Cursor f23c = mDbHelper.getF23Status();
                String F23Status = f23c.getString(0);
                Log.i("Status:", F23Status + "");
                if (F23Status.equals("f")) {
                    f23.setBackgroundColor(Color.parseColor("#5FF237"));
                    f23.setText("F23 \n FREE");
                } else if (F23Status.equals("o")) {
                    f23.setBackgroundColor(Color.parseColor("#F34040"));
                    f23.setText("F23 \n OCCUPIED");
                }
                Cursor f24c = mDbHelper.getF24Status();
                String F24Status = f24c.getString(0);
                Log.i("Status:", F24Status + "");
                if (F24Status.equals("f")) {
                    f24.setBackgroundColor(Color.parseColor("#5FF247"));
                    f24.setText("F24 \n FREE");
                } else if (F24Status.equals("o")) {
                    f24.setBackgroundColor(Color.parseColor("#F34040"));
                    f24.setText("F24 \n OCCUPIED");
                }

                Cursor g1c = mDbHelper.getG1Status();
                String G1Status = g1c.getString(0);
                Log.i("Status:", G1Status + "");
                if (G1Status.equals("g")) {
                    g1.setBackgroundColor(Color.parseColor("#5ed177"));
                    g1.setText("G1 \n FREE");
                } else if (G1Status.equals("o")) {
                    g1.setBackgroundColor(Color.parseColor("#F34040"));
                    g1.setText("G1 \n OCCUPIED");
                }
                Cursor g2c = mDbHelper.getG2Status();
                String G2Status = g2c.getString(0);
                Log.i("Status:", G2Status + "");
                if (G2Status.equals("g")) {
                    g2.setBackgroundColor(Color.parseColor("#5GG277"));
                    g2.setText("G2 \n FREE");
                } else if (G2Status.equals("o")) {
                    g2.setBackgroundColor(Color.parseColor("#F34040"));
                    g2.setText("G2 \n OCCUPIED");
                }
                Cursor g3c = mDbHelper.getG3Status();
                String G3Status = g3c.getString(0);
                Log.i("Status:", G3Status + "");
                if (G3Status.equals("g")) {
                    g3.setBackgroundColor(Color.parseColor("#5GG377"));
                    g3.setText("G3 \n FREE");
                } else if (G3Status.equals("o")) {
                    g3.setBackgroundColor(Color.parseColor("#F34040"));
                    g3.setText("G3 \n OCCUPIED");
                }
                Cursor g4c = mDbHelper.getG4Status();
                String G4Status = g4c.getString(0);
                Log.i("Status:", G4Status + "");
                if (G4Status.equals("g")) {
                    g4.setBackgroundColor(Color.parseColor("#5GG477"));
                    g4.setText("G4 \n FREE");
                } else if (G4Status.equals("o")) {
                    g4.setBackgroundColor(Color.parseColor("#F34040"));
                    g4.setText("G4 \n OCCUPIED");
                }
                Cursor g5c = mDbHelper.getG5Status();
                String G5Status = g5c.getString(0);
                Log.i("Status:", G5Status + "");
                if (G5Status.equals("g")) {
                    g5.setBackgroundColor(Color.parseColor("#5ed177"));
                    g5.setText("G5 \n FREE");
                } else if (G5Status.equals("o")) {
                    g5.setBackgroundColor(Color.parseColor("#F34040"));
                    g5.setText("G5 \n OCCUPIED");
                }
                Cursor g6c = mDbHelper.getG6Status();
                String G6Status = g6c.getString(0);
                Log.i("Status:", G6Status + "");
                if (G6Status.equals("g")) {
                    g6.setBackgroundColor(Color.parseColor("#5ed177"));
                    g6.setText("G6 \n FREE");
                } else if (G6Status.equals("o")) {
                    g6.setBackgroundColor(Color.parseColor("#F34040"));
                    g6.setText("G6 \n OCCUPIED");
                }
                Cursor g7c = mDbHelper.getG7Status();
                String G7Status = g7c.getString(0);
                Log.i("Status:", G7Status + "");
                if (G7Status.equals("g")) {
                    g7.setBackgroundColor(Color.parseColor("#5ed177"));
                    g7.setText("G7 \n FREE");
                } else if (G7Status.equals("o")) {
                    g7.setBackgroundColor(Color.parseColor("#F34040"));
                    g7.setText("G7 \n OCCUPIED");
                }
                Cursor g8c = mDbHelper.getG8Status();
                String G8Status = g8c.getString(0);
                Log.i("Status:", G8Status + "");
                if (G8Status.equals("g")) {
                    g8.setBackgroundColor(Color.parseColor("#5ed177"));
                    g8.setText("G8 \n FREE");
                } else if (G8Status.equals("o")) {
                    g8.setBackgroundColor(Color.parseColor("#F34040"));
                    g8.setText("G8 \n OCCUPIED");
                }
                Cursor g9c = mDbHelper.getG9Status();
                String G9Status = g9c.getString(0);
                Log.i("Status:", G9Status + "");
                if (G9Status.equals("g")) {
                    g9.setBackgroundColor(Color.parseColor("#5ed177"));
                    g9.setText("G9 \n FREE");
                } else if (G9Status.equals("o")) {
                    g9.setBackgroundColor(Color.parseColor("#F34040"));
                    g9.setText("G9 \n OCCUPIED");
                }
                Cursor g10c = mDbHelper.getG10Status();
                String G10Status = g10c.getString(0);
                Log.i("Status:", G10Status + "");
                if (G10Status.equals("g")) {
                    g10.setBackgroundColor(Color.parseColor("#5ed177"));
                    g10.setText("G10 \n FREE");
                } else if (G10Status.equals("o")) {
                    g10.setBackgroundColor(Color.parseColor("#F34040"));
                    g10.setText("G10 \n OCCUPIED");
                }
                Cursor g11c = mDbHelper.getG11Status();
                String G11Status = g11c.getString(0);
                Log.i("Status:", G11Status + "");
                if (G11Status.equals("g")) {
                    g11.setBackgroundColor(Color.parseColor("#5ed177"));
                    g11.setText("G11 \n FREE");
                } else if (G11Status.equals("o")) {
                    g11.setBackgroundColor(Color.parseColor("#F34040"));
                    g11.setText("G11 \n OCCUPIED");
                }
                Cursor g12c = mDbHelper.getG12Status();
                String G12Status = g12c.getString(0);
                Log.i("Status:", G12Status + "");
                if (G12Status.equals("g")) {
                    g12.setBackgroundColor(Color.parseColor("#5ed177"));
                    g12.setText("G12 \n FREE");
                } else if (G12Status.equals("o")) {
                    g12.setBackgroundColor(Color.parseColor("#F34040"));
                    g12.setText("G12 \n OCCUPIED");
                }
                Cursor g13c = mDbHelper.getG13Status();
                String G13Status = g13c.getString(0);
                Log.i("Status:", G13Status + "");
                if (G13Status.equals("g")) {
                    g13.setBackgroundColor(Color.parseColor("#5ed177"));
                    g13.setText("G13 \n FREE");
                } else if (G13Status.equals("o")) {
                    g13.setBackgroundColor(Color.parseColor("#F34040"));
                    g13.setText("G13 \n OCCUPIED");
                }
                Cursor g14c = mDbHelper.getG14Status();
                String G14Status = g14c.getString(0);
                Log.i("Status:", G14Status + "");
                if (G14Status.equals("g")) {
                    g14.setBackgroundColor(Color.parseColor("#5ed177"));
                    g14.setText("G14 \n FREE");
                } else if (G14Status.equals("o")) {
                    g14.setBackgroundColor(Color.parseColor("#F34040"));
                    g14.setText("G14 \n OCCUPIED");
                }
                Cursor g15c = mDbHelper.getG15Status();
                String G15Status = g15c.getString(0);
                Log.i("Status:", G15Status + "");
                if (G15Status.equals("g")) {
                    g15.setBackgroundColor(Color.parseColor("#5ed177"));
                    g15.setText("G15 \n FREE");
                } else if (G15Status.equals("o")) {
                    g15.setBackgroundColor(Color.parseColor("#F34040"));
                    g15.setText("G15 \n OCCUPIED");
                }
                Cursor g16c = mDbHelper.getG16Status();
                String G16Status = g16c.getString(0);
                Log.i("Status:", G16Status + "");
                if (G16Status.equals("g")) {
                    g16.setBackgroundColor(Color.parseColor("#5ed177"));
                    g16.setText("G16 \n FREE");
                } else if (G16Status.equals("o")) {
                    g16.setBackgroundColor(Color.parseColor("#F34040"));
                    g16.setText("G16 \n OCCUPIED");
                }
                Cursor g17c = mDbHelper.getG17Status();
                String G17Status = g17c.getString(0);
                Log.i("Status:", G17Status + "");
                if (G17Status.equals("g")) {
                    g17.setBackgroundColor(Color.parseColor("#5ed177"));
                    g17.setText("G17 \n FREE");
                } else if (G17Status.equals("o")) {
                    g17.setBackgroundColor(Color.parseColor("#F34040"));
                    g17.setText("G17 \n OCCUPIED");
                }
                Cursor g18c = mDbHelper.getG18Status();
                String G18Status = g18c.getString(0);
                Log.i("Status:", G18Status + "");
                if (G18Status.equals("g")) {
                    g18.setBackgroundColor(Color.parseColor("#5GG187"));
                    g18.setText("G18 \n FREE");
                } else if (G18Status.equals("o")) {
                    g18.setBackgroundColor(Color.parseColor("#F34040"));
                    g18.setText("G18 \n OCCUPIED");
                }
                Cursor g19c = mDbHelper.getG19Status();
                String G19Status = g19c.getString(0);
                Log.i("Status:", G19Status + "");
                if (G19Status.equals("g")) {
                    g19.setBackgroundColor(Color.parseColor("#5GG197"));
                    g19.setText("G19 \n FREE");
                } else if (G19Status.equals("o")) {
                    g19.setBackgroundColor(Color.parseColor("#F34040"));
                    g19.setText("G19 \n OCCUPIED");
                }
                Cursor g20c = mDbHelper.getG20Status();
                String G20Status = g20c.getString(0);
                Log.i("Status:", G20Status + "");
                if (G20Status.equals("g")) {
                    g20.setBackgroundColor(Color.parseColor("#5GG207"));
                    g20.setText("G20 \n FREE");
                } else if (G20Status.equals("o")) {
                    g20.setBackgroundColor(Color.parseColor("#F34040"));
                    g20.setText("G20 \n OCCUPIED");
                }
                Cursor g21c = mDbHelper.getG21Status();
                String G21Status = g21c.getString(0);
                Log.i("Status:", G21Status + "");
                if (G21Status.equals("g")) {
                    g21.setBackgroundColor(Color.parseColor("#5GG217"));
                    g21.setText("G21 \n FREE");
                } else if (G21Status.equals("o")) {
                    g21.setBackgroundColor(Color.parseColor("#F34040"));
                    g21.setText("G21 \n OCCUPIED");
                }
                Cursor g22c = mDbHelper.getG22Status();
                String G22Status = g22c.getString(0);
                Log.i("Status:", G22Status + "");
                if (G22Status.equals("g")) {
                    g22.setBackgroundColor(Color.parseColor("#5GG227"));
                    g22.setText("G22 \n FREE");
                } else if (G22Status.equals("o")) {
                    g22.setBackgroundColor(Color.parseColor("#F34040"));
                    g22.setText("G22 \n OCCUPIED");
                }
                Cursor g23c = mDbHelper.getG23Status();
                String G23Status = g23c.getString(0);
                Log.i("Status:", G23Status + "");
                if (G23Status.equals("g")) {
                    g23.setBackgroundColor(Color.parseColor("#5GG237"));
                    g23.setText("G23 \n FREE");
                } else if (G23Status.equals("o")) {
                    g23.setBackgroundColor(Color.parseColor("#F34040"));
                    g23.setText("G23 \n OCCUPIED");
                }
                Cursor g24c = mDbHelper.getG24Status();
                String G24Status = g24c.getString(0);
                Log.i("Status:", G24Status + "");
                if (G24Status.equals("g")) {
                    g24.setBackgroundColor(Color.parseColor("#5GG247"));
                    g24.setText("G24 \n FREE");
                } else if (G24Status.equals("o")) {
                    g24.setBackgroundColor(Color.parseColor("#F34040"));
                    g24.setText("G24 \n OCCUPIED");
                }
                Cursor h1c = mDbHelper.getH1Status();
                String H1Status = h1c.getString(0);
                Log.i("Status:", H1Status + "");
                if (H1Status.equals("h")) {
                    h1.setBackgroundColor(Color.parseColor("#5ed177"));
                    h1.setText("H1 \n FREE");
                } else if (H1Status.equals("o")) {
                    h1.setBackgroundColor(Color.parseColor("#F34040"));
                    h1.setText("H1 \n OCCUPIED");
                }
                Cursor h2c = mDbHelper.getH2Status();
                String H2Status = h2c.getString(0);
                Log.i("Status:", H2Status + "");
                if (H2Status.equals("h")) {
                    h2.setBackgroundColor(Color.parseColor("#5HH277"));
                    h2.setText("H2 \n FREE");
                } else if (H2Status.equals("o")) {
                    h2.setBackgroundColor(Color.parseColor("#F34040"));
                    h2.setText("H2 \n OCCUPIED");
                }
                Cursor h3c = mDbHelper.getH3Status();
                String H3Status = h3c.getString(0);
                Log.i("Status:", H3Status + "");
                if (H3Status.equals("h")) {
                    h3.setBackgroundColor(Color.parseColor("#5HH377"));
                    h3.setText("H3 \n FREE");
                } else if (H3Status.equals("o")) {
                    h3.setBackgroundColor(Color.parseColor("#F34040"));
                    h3.setText("H3 \n OCCUPIED");
                }
                Cursor h4c = mDbHelper.getH4Status();
                String H4Status = h4c.getString(0);
                Log.i("Status:", H4Status + "");
                if (H4Status.equals("h")) {
                    h4.setBackgroundColor(Color.parseColor("#5HH477"));
                    h4.setText("H4 \n FREE");
                } else if (H4Status.equals("o")) {
                    h4.setBackgroundColor(Color.parseColor("#F34040"));
                    h4.setText("H4 \n OCCUPIED");
                }
                Cursor h5c = mDbHelper.getH5Status();
                String H5Status = h5c.getString(0);
                Log.i("Status:", H5Status + "");
                if (H5Status.equals("h")) {
                    h5.setBackgroundColor(Color.parseColor("#5ed177"));
                    h5.setText("H5 \n FREE");
                } else if (H5Status.equals("o")) {
                    h5.setBackgroundColor(Color.parseColor("#F34040"));
                    h5.setText("H5 \n OCCUPIED");
                }
                Cursor h6c = mDbHelper.getH6Status();
                String H6Status = h6c.getString(0);
                Log.i("Status:", H6Status + "");
                if (H6Status.equals("h")) {
                    h6.setBackgroundColor(Color.parseColor("#5ed177"));
                    h6.setText("H6 \n FREE");
                } else if (H6Status.equals("o")) {
                    h6.setBackgroundColor(Color.parseColor("#F34040"));
                    h6.setText("H6 \n OCCUPIED");
                }
                Cursor h7c = mDbHelper.getH7Status();
                String H7Status = h7c.getString(0);
                Log.i("Status:", H7Status + "");
                if (H7Status.equals("h")) {
                    h7.setBackgroundColor(Color.parseColor("#5ed177"));
                    h7.setText("H7 \n FREE");
                } else if (H7Status.equals("o")) {
                    h7.setBackgroundColor(Color.parseColor("#F34040"));
                    h7.setText("H7 \n OCCUPIED");
                }
                Cursor h8c = mDbHelper.getH8Status();
                String H8Status = h8c.getString(0);
                Log.i("Status:", H8Status + "");
                if (H8Status.equals("h")) {
                    h8.setBackgroundColor(Color.parseColor("#5ed177"));
                    h8.setText("H8 \n FREE");
                } else if (H8Status.equals("o")) {
                    h8.setBackgroundColor(Color.parseColor("#F34040"));
                    h8.setText("H8 \n OCCUPIED");
                }
                Cursor h9c = mDbHelper.getH9Status();
                String H9Status = h9c.getString(0);
                Log.i("Status:", H9Status + "");
                if (H9Status.equals("h")) {
                    h9.setBackgroundColor(Color.parseColor("#5ed177"));
                    h9.setText("H9 \n FREE");
                } else if (H9Status.equals("o")) {
                    h9.setBackgroundColor(Color.parseColor("#F34040"));
                    h9.setText("H9 \n OCCUPIED");
                }
                Cursor h10c = mDbHelper.getH10Status();
                String H10Status = h10c.getString(0);
                Log.i("Status:", H10Status + "");
                if (H10Status.equals("h")) {
                    h10.setBackgroundColor(Color.parseColor("#5ed177"));
                    h10.setText("H10 \n FREE");
                } else if (H10Status.equals("o")) {
                    h10.setBackgroundColor(Color.parseColor("#F34040"));
                    h10.setText("H10 \n OCCUPIED");
                }
                Cursor h11c = mDbHelper.getH11Status();
                String H11Status = h11c.getString(0);
                Log.i("Status:", H11Status + "");
                if (H11Status.equals("h")) {
                    h11.setBackgroundColor(Color.parseColor("#5ed177"));
                    h11.setText("H11 \n FREE");
                } else if (H11Status.equals("o")) {
                    h11.setBackgroundColor(Color.parseColor("#F34040"));
                    h11.setText("H11 \n OCCUPIED");
                }
                Cursor h12c = mDbHelper.getH12Status();
                String H12Status = h12c.getString(0);
                Log.i("Status:", H12Status + "");
                if (H12Status.equals("h")) {
                    h12.setBackgroundColor(Color.parseColor("#5ed177"));
                    h12.setText("H12 \n FREE");
                } else if (H12Status.equals("o")) {
                    h12.setBackgroundColor(Color.parseColor("#F34040"));
                    h12.setText("H12 \n OCCUPIED");
                }
                Cursor h13c = mDbHelper.getH13Status();
                String H13Status = h13c.getString(0);
                Log.i("Status:", H13Status + "");
                if (H13Status.equals("h")) {
                    h13.setBackgroundColor(Color.parseColor("#5ed177"));
                    h13.setText("H13 \n FREE");
                } else if (H13Status.equals("o")) {
                    h13.setBackgroundColor(Color.parseColor("#F34040"));
                    h13.setText("H13 \n OCCUPIED");
                }
                Cursor h14c = mDbHelper.getH14Status();
                String H14Status = h14c.getString(0);
                Log.i("Status:", H14Status + "");
                if (H14Status.equals("h")) {
                    h14.setBackgroundColor(Color.parseColor("#5ed177"));
                    h14.setText("H14 \n FREE");
                } else if (H14Status.equals("o")) {
                    h14.setBackgroundColor(Color.parseColor("#F34040"));
                    h14.setText("H14 \n OCCUPIED");
                }
                Cursor h15c = mDbHelper.getH15Status();
                String H15Status = h15c.getString(0);
                Log.i("Status:", H15Status + "");
                if (H15Status.equals("h")) {
                    h15.setBackgroundColor(Color.parseColor("#5ed177"));
                    h15.setText("H15 \n FREE");
                } else if (H15Status.equals("o")) {
                    h15.setBackgroundColor(Color.parseColor("#F34040"));
                    h15.setText("H15 \n OCCUPIED");
                }
                Cursor h16c = mDbHelper.getH16Status();
                String H16Status = h16c.getString(0);
                Log.i("Status:", H16Status + "");
                if (H16Status.equals("h")) {
                    h16.setBackgroundColor(Color.parseColor("#5ed177"));
                    h16.setText("H16 \n FREE");
                } else if (H16Status.equals("o")) {
                    h16.setBackgroundColor(Color.parseColor("#F34040"));
                    h16.setText("H16 \n OCCUPIED");
                }
                Cursor h17c = mDbHelper.getH17Status();
                String H17Status = h17c.getString(0);
                Log.i("Status:", H17Status + "");
                if (H17Status.equals("h")) {
                    h17.setBackgroundColor(Color.parseColor("#5ed177"));
                    h17.setText("H17 \n FREE");
                } else if (H17Status.equals("o")) {
                    h17.setBackgroundColor(Color.parseColor("#F34040"));
                    h17.setText("H17 \n OCCUPIED");
                }
                Cursor h18c = mDbHelper.getH18Status();
                String H18Status = h18c.getString(0);
                Log.i("Status:", H18Status + "");
                if (H18Status.equals("h")) {
                    h18.setBackgroundColor(Color.parseColor("#5HH187"));
                    h18.setText("H18 \n FREE");
                } else if (H18Status.equals("o")) {
                    h18.setBackgroundColor(Color.parseColor("#F34040"));
                    h18.setText("H18 \n OCCUPIED");
                }
                Cursor h19c = mDbHelper.getH19Status();
                String H19Status = h19c.getString(0);
                Log.i("Status:", H19Status + "");
                if (H19Status.equals("h")) {
                    h19.setBackgroundColor(Color.parseColor("#5HH197"));
                    h19.setText("H19 \n FREE");
                } else if (H19Status.equals("o")) {
                    h19.setBackgroundColor(Color.parseColor("#F34040"));
                    h19.setText("H19 \n OCCUPIED");
                }
                Cursor h20c = mDbHelper.getH20Status();
                String H20Status = h20c.getString(0);
                Log.i("Status:", H20Status + "");
                if (H20Status.equals("h")) {
                    h20.setBackgroundColor(Color.parseColor("#5HH207"));
                    h20.setText("H20 \n FREE");
                } else if (H20Status.equals("o")) {
                    h20.setBackgroundColor(Color.parseColor("#F34040"));
                    h20.setText("H20 \n OCCUPIED");
                }
                Cursor h21c = mDbHelper.getH21Status();
                String H21Status = h21c.getString(0);
                Log.i("Status:", H21Status + "");
                if (H21Status.equals("h")) {
                    h21.setBackgroundColor(Color.parseColor("#5HH217"));
                    h21.setText("H21 \n FREE");
                } else if (H21Status.equals("o")) {
                    h21.setBackgroundColor(Color.parseColor("#F34040"));
                    h21.setText("H21 \n OCCUPIED");
                }
                Cursor h22c = mDbHelper.getH22Status();
                String H22Status = h22c.getString(0);
                Log.i("Status:", H22Status + "");
                if (H22Status.equals("h")) {
                    h22.setBackgroundColor(Color.parseColor("#5HH227"));
                    h22.setText("H22 \n FREE");
                } else if (H22Status.equals("o")) {
                    h22.setBackgroundColor(Color.parseColor("#F34040"));
                    h22.setText("H22 \n OCCUPIED");
                }
                Cursor h23c = mDbHelper.getH23Status();
                String H23Status = h23c.getString(0);
                Log.i("Status:", H23Status + "");
                if (H23Status.equals("h")) {
                    h23.setBackgroundColor(Color.parseColor("#5HH237"));
                    h23.setText("H23 \n FREE");
                } else if (H23Status.equals("o")) {
                    h23.setBackgroundColor(Color.parseColor("#F34040"));
                    h23.setText("H23 \n OCCUPIED");
                }
                Cursor h24c = mDbHelper.getH24Status();
                String H24Status = h24c.getString(0);
                Log.i("Status:", H24Status + "");
                if (H24Status.equals("h")) {
                    h24.setBackgroundColor(Color.parseColor("#5HH247"));
                    h24.setText("H24 \n FREE");
                } else if (H24Status.equals("o")) {
                    h24.setBackgroundColor(Color.parseColor("#F34040"));
                    h24.setText("H24 \n OCCUPIED");
                }

                Cursor h25c = mDbHelper.getH25Status();
                String H25Status = h25c.getString(0);
                Log.i("Status:", H25Status + "");
                if (H25Status.equals("h")) {
                    h25.setBackgroundColor(Color.parseColor("#5HH257"));
                    h25.setText("H25 \n FREE");
                } else if (H25Status.equals("o")) {
                    h25.setBackgroundColor(Color.parseColor("#F34040"));
                    h25.setText("H25 \n OCCUPIED");
                }
                Cursor h26c = mDbHelper.getH26Status();
                String H26Status = h26c.getString(0);
                Log.i("Status:", H26Status + "");
                if (H26Status.equals("h")) {
                    h26.setBackgroundColor(Color.parseColor("#5HH267"));
                    h26.setText("H26 \n FREE");
                } else if (H26Status.equals("o")) {
                    h26.setBackgroundColor(Color.parseColor("#F34040"));
                    h26.setText("H26 \n OCCUPIED");
                }
                Cursor h27c = mDbHelper.getH27Status();
                String H27Status = h27c.getString(0);
                Log.i("Status:", H27Status + "");
                if (H27Status.equals("h")) {
                    h27.setBackgroundColor(Color.parseColor("#5HH277"));
                    h27.setText("H27 \n FREE");
                } else if (H27Status.equals("o")) {
                    h27.setBackgroundColor(Color.parseColor("#F34040"));
                    h27.setText("H27 \n OCCUPIED");
                }
                Cursor h28c = mDbHelper.getH28Status();
                String H28Status = h28c.getString(0);
                Log.i("Status:", H28Status + "");
                if (H28Status.equals("h")) {
                    h28.setBackgroundColor(Color.parseColor("#5HH287"));
                    h28.setText("H28 \n FREE");
                } else if (H28Status.equals("o")) {
                    h28.setBackgroundColor(Color.parseColor("#F34040"));
                    h28.setText("H28 \n OCCUPIED");
                }
                Cursor h29c = mDbHelper.getH29Status();
                String H29Status = h29c.getString(0);
                Log.i("Status:", H29Status + "");
                if (H29Status.equals("h")) {
                    h29.setBackgroundColor(Color.parseColor("#5HH297"));
                    h29.setText("H29 \n FREE");
                } else if (H29Status.equals("o")) {
                    h29.setBackgroundColor(Color.parseColor("#F34040"));
                    h29.setText("H29 \n OCCUPIED");
                }
                Cursor h30c = mDbHelper.getH30Status();
                String H30Status = h30c.getString(0);
                Log.i("Status:", H30Status + "");
                if (H30Status.equals("h")) {
                    h30.setBackgroundColor(Color.parseColor("#5HH307"));
                    h30.setText("H30 \n FREE");
                } else if (H30Status.equals("o")) {
                    h30.setBackgroundColor(Color.parseColor("#F34040"));
                    h30.setText("H30 \n OCCUPIED");
                }
                Cursor i1c = mDbHelper.getI1Status();
                String I1Status = i1c.getString(0);
                Log.i("Status:", I1Status + "");
                if (I1Status.equals("i")) {
                    i1.setBackgroundColor(Color.parseColor("#5ed177"));
                    i1.setText("I1 \n FREE");
                } else if (I1Status.equals("o")) {
                    i1.setBackgroundColor(Color.parseColor("#F34040"));
                    i1.setText("I1 \n OCCUPIED");
                }
                Cursor i2c = mDbHelper.getI2Status();
                String I2Status = i2c.getString(0);
                Log.i("Status:", I2Status + "");
                if (I2Status.equals("i")) {
                    i2.setBackgroundColor(Color.parseColor("#5II277"));
                    i2.setText("I2 \n FREE");
                } else if (I2Status.equals("o")) {
                    i2.setBackgroundColor(Color.parseColor("#F34040"));
                    i2.setText("I2 \n OCCUPIED");
                }
                Cursor i3c = mDbHelper.getI3Status();
                String I3Status = i3c.getString(0);
                Log.i("Status:", I3Status + "");
                if (I3Status.equals("i")) {
                    i3.setBackgroundColor(Color.parseColor("#5II377"));
                    i3.setText("I3 \n FREE");
                } else if (I3Status.equals("o")) {
                    i3.setBackgroundColor(Color.parseColor("#F34040"));
                    i3.setText("I3 \n OCCUPIED");
                }
                Cursor i4c = mDbHelper.getI4Status();
                String I4Status = i4c.getString(0);
                Log.i("Status:", I4Status + "");
                if (I4Status.equals("i")) {
                    i4.setBackgroundColor(Color.parseColor("#5II477"));
                    i4.setText("I4 \n FREE");
                } else if (I4Status.equals("o")) {
                    i4.setBackgroundColor(Color.parseColor("#F34040"));
                    i4.setText("I4 \n OCCUPIED");
                }
                Cursor i5c = mDbHelper.getI5Status();
                String I5Status = i5c.getString(0);
                Log.i("Status:", I5Status + "");
                if (I5Status.equals("i")) {
                    i5.setBackgroundColor(Color.parseColor("#5ed177"));
                    i5.setText("I5 \n FREE");
                } else if (I5Status.equals("o")) {
                    i5.setBackgroundColor(Color.parseColor("#F34040"));
                    i5.setText("I5 \n OCCUPIED");
                }
                Cursor i6c = mDbHelper.getI6Status();
                String I6Status = i6c.getString(0);
                Log.i("Status:", I6Status + "");
                if (I6Status.equals("i")) {
                    i6.setBackgroundColor(Color.parseColor("#5ed177"));
                    i6.setText("I6 \n FREE");
                } else if (I6Status.equals("o")) {
                    i6.setBackgroundColor(Color.parseColor("#F34040"));
                    i6.setText("I6 \n OCCUPIED");
                }
                Cursor i7c = mDbHelper.getI7Status();
                String I7Status = i7c.getString(0);
                Log.i("Status:", I7Status + "");
                if (I7Status.equals("i")) {
                    i7.setBackgroundColor(Color.parseColor("#5ed177"));
                    i7.setText("I7 \n FREE");
                } else if (I7Status.equals("o")) {
                    i7.setBackgroundColor(Color.parseColor("#F34040"));
                    i7.setText("I7 \n OCCUPIED");
                }
                Cursor i8c = mDbHelper.getI8Status();
                String I8Status = i8c.getString(0);
                Log.i("Status:", I8Status + "");
                if (I8Status.equals("i")) {
                    i8.setBackgroundColor(Color.parseColor("#5ed177"));
                    i8.setText("I8 \n FREE");
                } else if (I8Status.equals("o")) {
                    i8.setBackgroundColor(Color.parseColor("#F34040"));
                    i8.setText("I8 \n OCCUPIED");
                }
                Cursor i9c = mDbHelper.getI9Status();
                String I9Status = i9c.getString(0);
                Log.i("Status:", I9Status + "");
                if (I9Status.equals("i")) {
                    i9.setBackgroundColor(Color.parseColor("#5ed177"));
                    i9.setText("I9 \n FREE");
                } else if (I9Status.equals("o")) {
                    i9.setBackgroundColor(Color.parseColor("#F34040"));
                    i9.setText("I9 \n OCCUPIED");
                }
                Cursor i10c = mDbHelper.getI10Status();
                String I10Status = i10c.getString(0);
                Log.i("Status:", I10Status + "");
                if (I10Status.equals("i")) {
                    i10.setBackgroundColor(Color.parseColor("#5ED177"));
                    i10.setText("I10 \n FREE");
                } else if (I10Status.equals("o")) {
                    i10.setBackgroundColor(Color.parseColor("#F34040"));
                    i10.setText("I10 \n OCCUPIED");
                }
                Cursor i11c = mDbHelper.getI11Status();
                String I11Status = i11c.getString(0);
                Log.i("Status:", I11Status + "");
                if (I11Status.equals("i")) {
                    i11.setBackgroundColor(Color.parseColor("#5ED177"));
                    i11.setText("I11 \n FREE");
                } else if (I11Status.equals("o")) {
                    i11.setBackgroundColor(Color.parseColor("#F34040"));
                    i11.setText("I11 \n OCCUPIED");
                }
                Cursor i12c = mDbHelper.getI12Status();
                String I12Status = i12c.getString(0);
                Log.i("Status:", I12Status + "");
                if (I12Status.equals("i")) {
                    i12.setBackgroundColor(Color.parseColor("#5ED177"));
                    i12.setText("I12 \n FREE");
                } else if (I12Status.equals("o")) {
                    i12.setBackgroundColor(Color.parseColor("#F34040"));
                    i12.setText("I12 \n OCCUPIED");
                }
                Cursor i13c = mDbHelper.getI13Status();
                String I13Status = i13c.getString(0);
                Log.i("Status:", I13Status + "");
                if (I13Status.equals("i")) {
                    i13.setBackgroundColor(Color.parseColor("#5ED177"));
                    i13.setText("I13 \n FREE");
                } else if (I13Status.equals("o")) {
                    i13.setBackgroundColor(Color.parseColor("#F34040"));
                    i13.setText("I13 \n OCCUPIED");
                }
                Cursor i14c = mDbHelper.getI14Status();
                String I14Status = i14c.getString(0);
                Log.i("Status:", I14Status + "");
                if (I14Status.equals("i")) {
                    i14.setBackgroundColor(Color.parseColor("#5ED177"));
                    i14.setText("I14 \n FREE");
                } else if (I14Status.equals("o")) {
                    i14.setBackgroundColor(Color.parseColor("#F34040"));
                    i14.setText("I14 \n OCCUPIED");
                }
                Cursor i15c = mDbHelper.getI15Status();
                String I15Status = i15c.getString(0);
                Log.i("Status:", I15Status + "");
                if (I15Status.equals("i")) {
                    i15.setBackgroundColor(Color.parseColor("#5ED177"));
                    i15.setText("I15 \n FREE");
                } else if (I15Status.equals("o")) {
                    i15.setBackgroundColor(Color.parseColor("#F34040"));
                    i15.setText("I15 \n OCCUPIED");
                }
                Cursor i16c = mDbHelper.getI16Status();
                String I16Status = i16c.getString(0);
                Log.i("Status:", I16Status + "");
                if (I16Status.equals("i")) {
                    i16.setBackgroundColor(Color.parseColor("#5ED177"));
                    i16.setText("I16 \n FREE");
                } else if (I16Status.equals("o")) {
                    i16.setBackgroundColor(Color.parseColor("#F34040"));
                    i16.setText("I16 \n OCCUPIED");
                }
                Cursor i17c = mDbHelper.getI17Status();
                String I17Status = i17c.getString(0);
                Log.i("Status:", I17Status + "");
                if (I17Status.equals("i")) {
                    i17.setBackgroundColor(Color.parseColor("#5ED177"));
                    i17.setText("I17 \n FREE");
                } else if (I17Status.equals("o")) {
                    i17.setBackgroundColor(Color.parseColor("#F34040"));
                    i17.setText("I17 \n OCCUPIED");
                }
                Cursor i18c = mDbHelper.getI18Status();
                String I18Status = i18c.getString(0);
                Log.i("Status:", I18Status + "");
                if (I18Status.equals("i")) {
                    i18.setBackgroundColor(Color.parseColor("#5ED177"));
                    i18.setText("I18 \n FREE");
                } else if (I18Status.equals("o")) {
                    i18.setBackgroundColor(Color.parseColor("#F34040"));
                    i18.setText("I18 \n OCCUPIED");
                }











            }

        };
    }
}