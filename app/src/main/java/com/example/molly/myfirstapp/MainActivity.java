package com.example.molly.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.example.molly.myfirstapp.AddNewProd;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //wire buttons
        //..get button
        Button btn = (Button) findViewById(R.id.Add_New);
        Button btn1 = (Button) findViewById(R.id.Modify_existing);

        //set what happens when the user clicks
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Add_new_button","This is an add new");
                Toast.makeText(getApplicationContext(),"This is where you can Add a New product", Toast.LENGTH_SHORT)
                        .show();

                openAddNewProd();

                //openModifyExisting();
                //openRepairRequest();
            }
        });

}
public void openAddNewProd() {

    Intent intent;
    intent = new Intent(this, AddNewProd.class);
    startActivity(intent);

}
public void openModifyExisting() {

    Intent intent;
    intent = new Intent(this, ModifyExisting.class);
    startActivity(intent);
}

public void openRepairRequest() {

    Intent intent;
    intent = new Intent(this, RepairRequest.class);
    startActivity(intent);
}}
