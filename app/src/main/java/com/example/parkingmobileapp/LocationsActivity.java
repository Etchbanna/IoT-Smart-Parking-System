package com.example.parkingmobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONException;
import org.json.JSONObject;





public class LocationsActivity extends AppCompatActivity {
    String URL = "https://192.168.1.11/test_android/index.php";
//    JSONparser jsonParser = new JSONparser();


    TextView t, t2, t3, t4, t5;
    Button b1, b2, b3, b4;
    ImageView im1, im2, im3, im4;

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
        b3 = findViewById(R.id.C8);
        b4 = findViewById(R.id.C7);
        im1 = findViewById(R.id.imageView17);
        im2 = findViewById(R.id.imageView7);
        im3 = findViewById(R.id.imageView8);
        im4 = findViewById(R.id.imageView9);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            Intent intent = new Intent(LocationsActivity.this, MarinaActivity.class);
            startActivity(intent);

            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LocationsActivity.this, WadiActivity.class);
                startActivity(intent);
            }

        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LocationsActivity.this, HealthCenterActivity.class);
                startActivity(intent);
            }

        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LocationsActivity.this, BankActivity.class);
                startActivity(intent);
            }

        });
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LocationsActivity.this, ProfileActivity.class);
                startActivity(intent);
            }

        });


    }

    public void query() {
        StringRequest stringRequest = new StringRequest(
                Request.Method.GET,
                Constants.URL_QUERY,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject obj = new JSONObject(response);
                            if (!obj.getBoolean("error")) {
                                String stat = obj.getString("status");
                                System.out.println("Status: "+stat);
                                startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                                finish();
                            } else {
                                Toast.makeText(
                                        getApplicationContext(),
                                        obj.getString("message"),
                                        Toast.LENGTH_LONG
                                ).show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                        Toast.makeText(
                                getApplicationContext(),
                                error.getMessage(),
                                Toast.LENGTH_LONG
                        ).show();
                    }
                }

        ) {
//            @Override
//            protected Map<String, String> getParams() throws AuthFailureError {
//                Map<String, String> params = new HashMap<>();
//                params.put("username", username);
//                params.put("password", password);
//                return params;
//            }

        };

        RequestHandler.getInstance(this).addToRequestQueue(stringRequest);
    }
}

