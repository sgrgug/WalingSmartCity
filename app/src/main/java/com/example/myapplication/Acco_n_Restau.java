package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.accessibility.AccessibilityViewCommand;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Acco_n_Restau extends AppCompatActivity {

    private CardView acco_card, hotel_card;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acco_n_restau);


        setTitle("Accomodation & Restaurants");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        acco_card = (CardView)findViewById(R.id.acco_card);
        acco_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent festivalIntent = new Intent(Acco_n_Restau.this, Acco_n_Restau_Restau.class);
                startActivity(festivalIntent);
            }
        });

        hotel_card = (CardView) findViewById(R.id.hotels_card);
        hotel_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent festivalIntent = new Intent(Acco_n_Restau.this, Acco_n_Restau_Hotels.class);
                startActivity(festivalIntent);
            }
        });


    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}