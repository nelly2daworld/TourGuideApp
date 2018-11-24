package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        ArrayList<Location> events = new ArrayList<>();
        events.add(new Location("Octopus", "Meditteranean Octopus drying at Santorini Restaurant.",
                R.drawable.octopusgreece));
        events.add(new Location("Santorini Sightseeing", "The capital of Santorini," +
                " Firá (Thíra) is made up of whitewashed cubic houses and terraces, winding lanes, little squares, " +
                "and blue-domed churches perched on the cliffs 300 meters above the caldera.", R.drawable.mysantorini));

        LocationAdapter adapter = new LocationAdapter(this, events, R.color.category_events);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

    }


}
