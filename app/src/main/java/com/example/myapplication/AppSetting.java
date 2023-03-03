package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

public class AppSetting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_setting);


        setTitle("Setting");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        TextView setRunDevice = (TextView) findViewById(R.id.setAppRunOn);
        setRunDevice.setText(Build.MANUFACTURER);

        TextView getVers = (TextView) findViewById(R.id.getAppVer);
        getVers.setText(BuildConfig.VERSION_NAME);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}