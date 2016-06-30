package com.example.android.montrealtourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);

        ArrayList<Attraction> restaurants = new ArrayList<Attraction>();
        restaurants.add(new Attraction("Le St-Urbain", "96 rue Fleury Ouest", "Montreal, QC", "H3L 1T2"));
        restaurants.add(new Attraction("La Récolte", "764 rue Bélanger", "Montreal, QC", "H2S 1C6"));
        restaurants.add(new Attraction("Salmigondis", "6896 Saint-Dominique", "Montreal, QC", "H2S 3B1"));
        restaurants.add(new Attraction("Impasto", "48 Rue Dante", "Montreal, QC", "H2S 1J5"));
        restaurants.add(new Attraction("Damas", "1201 Van Horne", "Montreal, QC", "H2V 1K4"));

        AttractionAdapter atAdapter = new AttractionAdapter(this, restaurants, R.color.colorFood);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(atAdapter);
    }
}
