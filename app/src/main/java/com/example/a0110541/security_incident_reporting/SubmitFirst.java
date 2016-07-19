package com.example.a0110541.security_incident_reporting;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SubmitFirst extends AppCompatActivity {

    Context c;
    EditText email;
    EditText eNumber;
    Button btnSubmit1;

     public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.SubmitFirst);

        email = (EditText) findViewById(R.id.email);
        eNumber = (EditText) findViewById(R.id.eNumber);
        btnSubmit1 = (Button) findViewById(R.id.btnSubmit1);
        c = this;

        btnSubmit1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SubmitSecond.class);
                startActivity(intent);

            }
            String eAddress = email.getText() + "";
            String EmNumber = eNumber.getText() + "";
            // Validates that an email and employee number aren't blank

            if (eAddress.length() == 0 || EmNumber.length() == 0) ;
            {
                Toast.makeText(c, "Please fill in the correct email address and employee number", Toast.LENGTH_SHORT).show();
            }


        });
    };}



