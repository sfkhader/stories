package com.example.shahn.sustainability;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Home extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button login = (Button) findViewById(R.id.logout);
        login.setOnClickListener(this);
    }
    public void onClick(View v) {
        if (v.getId() == R.id.logout) {
            Intent loginPage = new Intent(this, Welcome.class);
            startActivity(loginPage);
        } else if (v.getId() == R.id.register) {
            Intent registrationPage = new Intent(this, Registration.class);
            startActivity(registrationPage);
        }
    }

}
