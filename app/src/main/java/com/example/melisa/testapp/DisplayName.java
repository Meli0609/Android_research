package com.example.melisa.testapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by melisa-pc on 04.04.2018.
 */

public class DisplayName extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_name);

        Intent myintent = getIntent();
        String newName = myintent.getStringExtra("AzrinoIme");

        TextView name = (TextView) findViewById(R.id.display_name);
        name.setText(newName);

    }
}
