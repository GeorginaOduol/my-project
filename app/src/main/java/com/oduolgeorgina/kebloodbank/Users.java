package com.oduolgeorgina.kebloodbank;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Users extends AppCompatActivity {

    Button btndonor,btnrecipient,btnhealthofficer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        btndonor= (Button) findViewById(R.id.btndonor);
        btndonor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent donor= new Intent(Users.this,Donor.class);
                startActivity(donor);
            }
        });
        btnhealthofficer = (Button) findViewById(R.id.btnhealthofficer);
        btnhealthofficer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Health= new Intent(Users.this,HealthOfficer.class);
                startActivity(Health);
            }
        });
    }

}
