package com.example.android.montrealtourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FestivalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);

        ArrayList<Attraction> festivals = new ArrayList<Attraction>();
        festivals.add(new Attraction("Beer Festival", "June 8-12, 2016"));
        festivals.add(new Attraction("Les FrancoFolies", "June 9-18, 2016"));
        festivals.add(new Attraction("Montreal Grand Prix", "June 10-11-12, 2016"));
        festivals.add(new Attraction("Montreal International Jazz Festival", "June 29-July 9, 2016"));
        festivals.add(new Attraction("Just for laughs", "July 2016"));
        festivals.add(new Attraction("International des feux Loto-Québec fireworks fest", "July 2-30, 2016"));
        festivals.add(new Attraction("International Festival of Circus Arts", "July 7-17, 2016"));
        festivals.add(new Attraction("Montreal Electronic Groove","July 21-31, 2016"));

        AttractionAdapter atAdapter = new AttractionAdapter(this, festivals, R.color.colorFestivals);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(atAdapter);

    }
}
