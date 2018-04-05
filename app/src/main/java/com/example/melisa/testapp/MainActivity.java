package com.example.melisa.testapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.azrin_view);

        name = (EditText) findViewById(R.id.name);
        Button ok = (Button) findViewById(R.id.get_name);

        ok.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                String nameSting = name.getText().toString();

                Intent myintent = new Intent(MainActivity.this, DisplayName.class);
                myintent.putExtra("AzrinoIme", nameSting);
                startActivity(myintent);
//                Intent myIntent = new Intent(MainActivity.this, ListUsers.class);
//                startActivity(myIntent);
            }
        });


    }
}
