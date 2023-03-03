package com.example.myapplication;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.view.MenuInflater;
import android.view.View;

import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CardView festivalsCard, acconrestauCard, tourism_area, useful_contacts,transportaton;

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar); // get the reference of Toolbar
        setSupportActionBar(toolbar); // Setting/replace toolbar as the ActionBar
        //defining card
        festivalsCard = (CardView)findViewById(R.id.festivals_card);
        acconrestauCard = (CardView)findViewById(R.id.acconrestau_card);
        tourism_area = (CardView)findViewById(R.id.tourism_area_card);
        useful_contacts = (CardView)findViewById(R.id.usefulContact);
        transportaton = (CardView)findViewById(R.id.transportaion_time);

        fab = (FloatingActionButton)findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intFab = new Intent(MainActivity.this, ContactUs.class);
                startActivity(intFab);
            }
        });

        //add clicklistener to card
        festivalsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent festivalIntent = new Intent(MainActivity.this, Festivals.class);
                startActivity(festivalIntent);
            }
        });
        acconrestauCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent festivalIntent = new Intent(MainActivity.this, Acco_n_Restau.class);
                startActivity(festivalIntent);
            }
        });
        tourism_area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent festivalIntent = new Intent(MainActivity.this, Tourism_Area.class);
                startActivity(festivalIntent);
            }
        });
        useful_contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent festivalIntent = new Intent(MainActivity.this, UsefulContact.class);
                startActivity(festivalIntent);
            }
        });
        transportaton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent festivalIntent = new Intent(MainActivity.this, TransportationTime.class);
                startActivity(festivalIntent);
            }

        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int item_id = item.getItemId();

        if(item_id == R.id.action_settings){
            Intent setInt = new Intent(MainActivity.this, AppSetting.class);
            startActivity(setInt);
        }
        if(item_id == R.id.action_contactus){
            Intent contInt = new Intent(MainActivity.this, ContactUs.class);
            startActivity(contInt);
        }
        if(item_id == R.id.action_aboutus){
            Toast.makeText(this, "about us", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}