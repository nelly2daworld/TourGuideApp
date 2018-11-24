package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        ArrayList<Location> restaurant = new ArrayList<>();
        restaurant.add(new Location("Naoussa Restaurant, Santorini", " Νext to the Central Orthodox Church, Fira 84700, Greece", R.drawable.naoussarestaurant));
        restaurant.add(new Location("Remvi Restaurant", "847 00 Firostefani – Santorini Island – GREECE", R.drawable.remvirestaurant));
        restaurant.add(new Location("Yalos Restaurant", "Exo Gialos Thiras, Fira 847 00, Greece ", R.drawable.yalosrestaurant));

        LocationAdapter adapter = new LocationAdapter(this, restaurant, R.color.category_restaurant);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
