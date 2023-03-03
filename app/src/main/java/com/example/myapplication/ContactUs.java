package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ContactUs extends AppCompatActivity {

    TextView sendTo;
    EditText subject, body;
    Button btnSendTo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        setTitle("Contact Us");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        sendTo = (TextView) findViewById(R.id.sendTo);
        sendTo.setText("noreply@walingsmartapp.com");
        subject = (EditText) findViewById(R.id.subject);
        body = (EditText) findViewById(R.id.body);
        btnSendTo = (Button) findViewById(R.id.btnSendEmail);

        btnSendTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailsend = sendTo.getText().toString();
                String emailsubject = subject.getText().toString();
                String emailbody = body.getText().toString();

                Intent intentSend = new Intent(Intent.ACTION_SEND);

                intentSend.putExtra(Intent.EXTRA_EMAIL, new String[]{emailsend});
                intentSend.putExtra(Intent.EXTRA_SUBJECT, emailsubject);
                intentSend.putExtra(Intent.EXTRA_TEXT, emailbody);

                intentSend.setType("message/rfc822");

                startActivity(Intent.createChooser(intentSend, "Choose an Email client :"));
            }
        });

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}