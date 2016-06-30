package com.example.android.montrealtourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ArchitectureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);

        ArrayList<Attraction> architecture = new ArrayList<Attraction>();
        architecture.add(new Attraction("Claire and Marc Bourgie Pavilion of Quebec and Canadian Art", "1380 Rue Sherbrooke O,", "Montreal, QC", "H3G 1J5"));
        architecture.add(new Attraction("La Vitrine Culturelle", "350 Place Royale,", "Montreal, QC", "H2Y 3Y5"));
        architecture.add(new Attraction("Connaught Residence", "690 Rue Sherbrooke O,", "Montreal, QC", "H3A 1E9"));
        architecture.add(new Attraction("Stacked House", "280 Rue Notre-Dame E,", "Montreal, QC", "H2Y 1C5"));
        architecture.add(new Attraction("Chambord Residence", "185 Rue Sainte-Catherine,", "Montreal, QC", "H2X 3X5"));
        architecture.add(new Attraction("Mary, Queen of the World Cathedral", "1920 Rue Baile,", "Montreal, QC", "H3H 2S6"));
        architecture.add(new Attraction("Notre-Dame Basilica", "859 Rue Sherbrooke O,", "Montreal, QC", "H3A 0C4"));
        architecture.add(new Attraction("St. Patrick's Basilica", "160 Chemin Tour-de-l'Isle,", "Île Sainte-Hélène, QC", "H3C 4G8"));
        architecture.add(new Attraction("Saint Joseph's Oratory", "2 Rue de la Commune Ouest,", "Montreal, QC", "H2X 4B2"));

        AttractionAdapter atAdapter = new AttractionAdapter(this, architecture);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(atAdapter);
    }
}
