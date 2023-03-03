package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Tourism_Area extends AppCompatActivity {


    //a list to store all the Festival List
    List<TourismAreaList> tourismListList;

    //the recyclerview
    RecyclerView recyclerViewTourism;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourism_area);

        setTitle("Tourism Area");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        //getting the recyclerview from xml
        recyclerViewTourism = (RecyclerView) findViewById(R.id.recyclerViewTourism);
        recyclerViewTourism.setHasFixedSize(true);
        recyclerViewTourism.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productlist
        tourismListList = new ArrayList<>();


        //adding some items to our list
        tourismListList.add(
                new TourismAreaList(
                        1,
                        "Bahaunthan",
                        "Waling, Syangja",
                        R.drawable.bahunthan));

        tourismListList.add(
                new TourismAreaList(
                        2,
                        "Ghangkhola",
                        "Waling, Syangja",
                        R.drawable.ghangkhola));

        tourismListList.add(
                new TourismAreaList(
                        5,
                        "Andhikhola",
                        "Waling, Syangja",
                        R.drawable.adhikhola));

        //creating recyclerview adapter
        TourismAreaAdapter adapter = new TourismAreaAdapter(this, tourismListList);

        //setting adapter to recyclerview
        recyclerViewTourism.setAdapter(adapter);


    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}