package com.example.android.montrealtourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum);

        ArrayList<Museum> museums = new ArrayList<Museum>();
        museums.add(new Museum("Montreal Museum of Fine Arts", "1380 Rue Sherbrooke O,", "Montreal, QC", "H3G 1J5", R.drawable.museum_of_fine_arts));
        museums.add(new Museum("Pointe-à-Callière Museum", "350 Place Royale,", "Montreal, QC", "H2Y 3Y5", R.drawable.pointe_a_calliere_museum));
        museums.add(new Museum("McCord Museum", "690 Rue Sherbrooke O,", "Montreal, QC", "H3A 1E9", R.drawable.mccord_museum));
        museums.add(new Museum("Château Ramezay", "280 Rue Notre-Dame E,", "Montreal, QC", "H2Y 1C5", R.drawable.chateau_ramezay));
        museums.add(new Museum("Musée d'art contemporain de Montréal", "185 Rue Sainte-Catherine,", "Montreal, QC", "H2X 3X5", R.drawable.mac_museum));
        museums.add(new Museum("Canadian Centre for Architecture", "1920 Rue Baile,", "Montreal, QC", "H3H 2S6", R.drawable.architecture_center));
        museums.add(new Museum("Redpath Museum", "859 Rue Sherbrooke O,", "Montreal, QC", "H3A 0C4", R.drawable.redpath_museum));
        museums.add(new Museum("Montreal Biosphère", "160 Chemin Tour-de-l'Isle,", "Île Sainte-Hélène, QC", "H3C 4G8", R.drawable.biosphere));
        museums.add(new Museum("Montreal Science Centre", "2 Rue de la Commune Ouest,", "Montreal, QC", "H2X 4B2", R.drawable.science_center));

        MuseumAdapter cardAdapter = new MuseumAdapter(this, museums);
        ListView listView = (ListView) findViewById(R.id.listview_museum);
        listView.setAdapter(cardAdapter);
    }
}
