package com.chemwater.week6weekend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

/*
Homework:  Use 5 area restaurants.  place a custom marker using the restaurants logo.
Set the maker label to display the address using geocoder.

Use reference material and my repo supplied to do the next part:
Each restaurant should have a geofence around it so that the user is notified when walking in and out.
 */