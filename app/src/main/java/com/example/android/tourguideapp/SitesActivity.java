package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SitesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        ArrayList<Location> sites = new ArrayList<>();

        sites.add(new Location("Dinner In Sky", "An extraordinary " +
                "culinary proposal -in the center of Athens- welcomes you! A table for 22 people, " +
                "along with our experienced chefs who are preparing a 5 course menu, lifts you up to " +
                "50 meters and offers once in a life time experience over the city.", R.drawable.dinnerinsky));
        sites.add(new Location("Greece Festival Dancing", "The Kalamata International " +
                "Dance Festival is the crown event of the year for the city's International Dance Centre, which was " +
                "founded in the spring of 1995 for the purpose of supporting and promoting the art of dance via research " +
                "and education. ", R.drawable.greecefestivaldancing));
        sites.add(new Location("Acropolis Hill", "In Greece, the significance of the Acropolis of Athens is such that it is " +
                "commonly known as \"The Acropolis\" without qualification. During ancient times it was known also more properly " +
                "as Cecropia, after the legendary serpent-man, Cecrops, the first Athenian king.", R.drawable.acropolishill));


        LocationAdapter adapter = new LocationAdapter(this, sites, R.color.category_sites);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
