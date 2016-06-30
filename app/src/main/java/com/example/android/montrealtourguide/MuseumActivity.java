package com.example.android.montrealtourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);

        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction("Montreal Museum of Fine Arts", "1380 Rue Sherbrooke O,", "Montreal, QC", "H3G 1J5", R.drawable.museum_of_fine_arts));
        attractions.add(new Attraction("Pointe-à-Callière Museum", "350 Place Royale,", "Montreal, QC", "H2Y 3Y5", R.drawable.pointe_a_calliere_museum));
        attractions.add(new Attraction("McCord Museum", "690 Rue Sherbrooke O,", "Montreal, QC", "H3A 1E9", R.drawable.mccord_museum));
        attractions.add(new Attraction("Château Ramezay", "280 Rue Notre-Dame E,", "Montreal, QC", "H2Y 1C5", R.drawable.chateau_ramezay));
        attractions.add(new Attraction("Musée d'art contemporain de Montréal", "185 Rue Sainte-Catherine,", "Montreal, QC", "H2X 3X5", R.drawable.mac_museum));
        attractions.add(new Attraction("Canadian Centre for Architecture", "1920 Rue Baile,", "Montreal, QC", "H3H 2S6", R.drawable.architecture_center));
        attractions.add(new Attraction("Redpath Museum", "859 Rue Sherbrooke O,", "Montreal, QC", "H3A 0C4", R.drawable.redpath_museum));
        attractions.add(new Attraction("Montreal Biosphère", "160 Chemin Tour-de-l'Isle,", "Île Sainte-Hélène, QC", "H3C 4G8", R.drawable.biosphere));
        attractions.add(new Attraction("Montreal Science Centre", "2 Rue de la Commune Ouest,", "Montreal, QC", "H2X 4B2", R.drawable.science_center));

        AttractionAdapter atAdapter = new AttractionAdapter(this, attractions, R.color.colorMuseums);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(atAdapter);
    }
}
