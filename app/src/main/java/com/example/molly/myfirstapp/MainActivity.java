package com.example.molly.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.example.molly.myfirstapp.R.id.Add_New;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button Add_New, Repair_request, Retire_request, Support;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //wire buttons
        //..get button
        Add_New = findViewById(R.id.Add_New);
        Repair_request = findViewById(R.id.Repair_request);
        Retire_request = findViewById(R.id.Retire_request);
        Support = findViewById(R.id.Support);

        Add_New.setOnClickListener(this);
        Repair_request.setOnClickListener(this);
        Retire_request.setOnClickListener(this);
        Support.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Add_New:
                Toast.makeText(this, "Moving to Add New page", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, AddNewProd.class);
                startActivity(intent);
                break;
            case R.id.Repair_request:
                Toast.makeText(this, "Moving to Repair Request page", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(MainActivity.this, Repair_Request_page.class);
                startActivity(intent1);
                break;
            case R.id.Retire_request:
                Toast.makeText(this, "Moving to Retire Page", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(MainActivity.this, Retire_Product_Page.class);
                startActivity(intent2);
                break;
            case R.id.Support:
                Toast.makeText(this, "Moving to Support page", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(MainActivity.this, Support_2.class);
                startActivity(intent3);
                break;
        }
    }
}