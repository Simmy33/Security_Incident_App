package com.example.a0110541.security_incident_reporting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by 0110541 on 2016-07-13.
 */
public class SubmitSecond extends AppCompatActivity {

    EditText eName;
    EditText eSurname;
    EditText eCell;
    EditText eWork_num;
    EditText eOD;
    EditText eProvince;
    EditText eCity;
    EditText iDescription;
    EditText iLocation;

    Button btnSubmit2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.SubmitSecond);

        btnSubmit2 = (Button) findViewById(R.id.btnSubmit2);
        eName = (EditText) findViewById(R.id.eName);
        eSurname = (EditText) findViewById(R.id.eSurname);
        eCell = (EditText) findViewById(R.id.eCell);
        eWork_num = (EditText) findViewById(R.id.eWork_num);
        eOD = (EditText) findViewById(R.id.eOD);
        eProvince = (EditText) findViewById(R.id.eProvince);
        eCity = (EditText) findViewById(R.id.eCity);
        iDescription = (EditText) findViewById(R.id.iDescription);
       iLocation = (EditText) findViewById(R.id.iLocation);


        btnSubmit2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(getApplicationContext(), SubmitFirst.class);
                startActivity(intent);

                validate();

            }

            public boolean validate() {
                boolean valid = true;

                String name = eName.getText().toString();
                String surname = eSurname.getText().toString();
                String cell = eCell.getText().toString();
                String work_number = eWork_num.getText().toString();
                String op_div = eOD.getText().toString();
                String province = eProvince.getText().toString();
                String city = eCity.getText().toString();
                String inc_description = iDescription.getText().toString();
                String inc_location = iLocation.getText().toString();

                if (name.isEmpty() || name.length() < 0){
                    System.out.print ("Enter valid name");
                    valid = false;
                }else{
                    System.out.print ("proceed");
                }
                if (surname.isEmpty() || name.length() < 0){
                    System.out.print ("Enter valid Surname");
                    valid = false;
                }else{
                    System.out.print ("proceed");
                }

                if (cell.isEmpty() || name.length() < 0){
                    System.out.print ("Enter valid Cell Number");
                    valid = false;
                }else{
                    System.out.print ("proceed");
                }

                if (work_number.isEmpty() || name.length() < 0){
                    System.out.print ("Enter valid Work Number");
                    valid = false;
                }else{
                    System.out.print ("proceed");
                }

                if (op_div.isEmpty() || name.length() < 0){
                    System.out.print ("Enter valid Operating Division");
                    valid = false;
                }else{
                    System.out.print ("proceed");
                }

                if (province.isEmpty() || name.length() < 0){
                    System.out.print ("Enter valid Province");
                    valid = false;
                }else{
                    System.out.print ("proceed");
                }

                if (city.isEmpty() || name.length() < 0){
                    System.out.print ("Enter valid City name");
                    valid = false;
                }else{
                    System.out.print ("proceed");
                }

                if (inc_description.isEmpty() || name.length() < 0){
                    System.out.print ("Enter valid Incident Description");
                    valid = false;
                }else{
                    System.out.print ("proceed");
                }

                if (inc_location.isEmpty() || name.length() < 0){
                    System.out.print ("Enter valid Incident Location");
                    valid = false;
                }else{
                    System.out.print ("proceed");
                }
                return valid;
            }
        });
    }


}





