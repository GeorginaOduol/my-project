package com.oduolgeorgina.kebloodbank;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    Button btnlogin1;
    EditText txtpass, txtemail1;
    String Email,Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
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
        btnlogin1= (Button) findViewById(R.id.btnlogin1);
        btnlogin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtemail1= (EditText) findViewById(R.id.txtemail1);
                Email=txtemail1.getText().toString().trim();
                txtpass= (EditText) findViewById(R.id.txtpass);
                Password=txtpass.getText().toString().trim();

                if (Email.equals("") || Password.equals("")){
                    Toast.makeText(Login.this, "Please Enter your Email and Password" + Email + "" + Password, Toast.LENGTH_LONG).show();
                }

            }
        });
    }

}
