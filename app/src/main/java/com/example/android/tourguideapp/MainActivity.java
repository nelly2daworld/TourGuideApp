package com.example.android.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find view that shows Greece's History
        TextView history = findViewById(R.id.history);

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create intent to open the history category
                Intent historyIntent = new Intent(MainActivity.this, HistoryActivity.class);
                startActivity(historyIntent);

            }
        });

        //Find view that shows Greece's sites
        TextView sites = findViewById(R.id.sites);

        sites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create intent to open the sites category
                Intent sitesIntent = new Intent(MainActivity.this, SitesActivity.class);
                startActivity(sitesIntent);

            }
        });

        //Find view that shows Greece's restaurants
        TextView restaurants = findViewById(R.id.restaurant);

        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create intent to open the restaurants category
                Intent restaurantIntent = new Intent(MainActivity.this, RestaurantActivity.class);
                startActivity(restaurantIntent);
            }

        });

        //Find view that shows Greece's sites
        TextView events = findViewById(R.id.events);

        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create intent to open the history category
                Intent sitesIntent = new Intent(MainActivity.this, EventsActivity.class);
                startActivity(sitesIntent);
            }

        });


    }
}
