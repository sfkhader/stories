package com.example.shahn.sustainability;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Welcome extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Button login = (Button) findViewById(R.id.login);
        login.setOnClickListener(this);
        Button registration = (Button) findViewById(R.id.register);
        registration.setOnClickListener(this);
    }
    public void onClick(View v) {
        if (v.getId() == R.id.login) {
            Intent loginPage = new Intent(this, Login.class);
            startActivity(loginPage);
        } else if (v.getId() == R.id.register) {
            Intent registrationPage = new Intent(this, Registration.class);
            startActivity(registrationPage);
        }
    }

}
