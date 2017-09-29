package com.oduolgeorgina.kebloodbank;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Register extends AppCompatActivity {
    Button btnlogin, btnregister;
    EditText txtname, txtgender, txtdob, txtid, txtphonenumber, txtemail;
    Spinner spGender;
    String Name, Gender, DOB, ID, PhoneNumber, Email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txtname= (EditText) findViewById(R.id.txtname);
        //txtgender= (EditText) findViewById(R.id.txtgender);
        txtdob= (EditText) findViewById(R.id.txtdob);
        txtemail= (EditText) findViewById(R.id.txtemail);
        txtid= (EditText) findViewById(R.id.txtid);
        txtphonenumber= (EditText) findViewById(R.id.txtphonenumber);
        spGender = (Spinner) findViewById(R.id.sp_gender);

        List<String> gender = new ArrayList<String>();
        gender.add("Male");
        gender.add("Female");
        gender.add("Do not wish to disclose");

        ArrayAdapter<String> data = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,gender);
        data.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spGender.setAdapter(data);

        


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        btnregister= (Button) findViewById(R.id.btnregister);
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Name= txtname.getText().toString().trim();
                Gender= spGender.getSelectedItem().toString();
                DOB= txtdob.getText().toString().trim();
                Email= txtemail.getText().toString().trim();
                ID= txtid.getText().toString().trim();

                PhoneNumber= txtphonenumber.getText().toString().trim();

                if (Name.equals("") || Gender.equals("") || Email.equals("") || PhoneNumber.equals("") || DOB.equals("") || ID.equals("")) {
                    Toast.makeText(Register.this, "Please Enter All your Details!" + Name + "" + Email + "" + Gender + "" + PhoneNumber + "" + DOB + "" + ID, Toast.LENGTH_LONG).show();
                }else {
                            Intent Register= new Intent(Register.this,Users.class);
                            startActivity(Register);
                }

            }
        });
        btnlogin=(Button) findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Login= new Intent(Register.this, Login.class);
                startActivity(Login);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_register, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
