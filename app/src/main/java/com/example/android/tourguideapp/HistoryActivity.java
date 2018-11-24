package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoryActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

    ArrayList<Location> history = new ArrayList<>();
        history.add(new Location("Greece", "Greece is a country with a very rich history" +
                " and the homeland of many famous personalities throughout centuries."));
        history.add(new Location("Santorini", "Due to the wars of the 20th century, Santorini's " +
                "economy declines and the inhabitants abandon the island after the catastrophic earthquake in 1956. The tourist" +
                " development in Santorini begins in the 1970s and today it is one of the best tourist destinations in the world. " +
                "Over the years, Santorini has also developed as a wedding and honeymoon destination, while many international meetings " +
                "and conferences take place there in summer, at the Nomikos Conference Center or in luxurious hotels. Source: www.greeka.com"));

    LocationAdapter adapter = new LocationAdapter(this, history, R.color.category_history);

    ListView listView = findViewById(R.id.list);

    listView.setAdapter(adapter);

    }


}
