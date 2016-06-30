package com.example.android.montrealtourguide;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout architecture = (LinearLayout) findViewById(R.id.activity_architecture);
        architecture.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent archIntent = new Intent(MainActivity.this, ArchitectureActivity.class );
                startActivity(archIntent);
            }
        });

        LinearLayout museum = (LinearLayout) findViewById(R.id.activity_museums);
        museum.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent museumIntent = new Intent(MainActivity.this, ArchitectureActivity.class );
                startActivity(museumIntent);
            }
        });

        LinearLayout festivals = (LinearLayout) findViewById(R.id.activity_festivals);
        festivals.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent festivalIntent = new Intent(MainActivity.this, FestivalActivity.class);
                startActivity(festivalIntent);
            }
        });

        LinearLayout food = (LinearLayout) findViewById(R.id.activity_food);
        food.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent foodIntent = new Intent(MainActivity.this, FoodActivity.class);
                startActivity(foodIntent);
            }
        });
    }
}
