package com.example.shahn.sustainability;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.view.View;

public class Registration extends AppCompatActivity implements View.OnClickListener{

    private Spinner ageSpinner;
    private Spinner gradeSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        ageSpinner = findViewById(R.id.age);

        String[] ages = {"3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};
        ArrayAdapter<String> adapter =
                new ArrayAdapter(this,android.R.layout.simple_spinner_item, ages);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ageSpinner.setAdapter(adapter);

        gradeSpinner = findViewById(R.id.grade);

        String[] grades = {"Pre-K", "Kindergarten", "1", "2", "3", "4", "5", "6", "7", "8"};
        ArrayAdapter<String> adapter2 =
                new ArrayAdapter(this,android.R.layout.simple_spinner_item, grades);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gradeSpinner.setAdapter(adapter2);
        Button submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.submit) {
            Intent loginPage = new Intent(this, Home.class);
            startActivity(loginPage);
        }
    }
}
