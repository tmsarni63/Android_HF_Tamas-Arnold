package com.example.hazi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button gomb2= findViewById(R.id.button2);
        Button gomb3=findViewById(R.id.button3);

        gomb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent2= new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent2);
            }
        });

        gomb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(SecondActivity.this, ActivityStateSaveTwo.class);
                startActivity(intent3);
            }
        });

    }
    public void startActivity(View v){
        Intent intent2= new Intent(SecondActivity.this,MainActivity.class);
        startActivity(intent2);

    }
    public void startActivity2(View v){
        Intent intent3= new Intent(SecondActivity.this, ActivityStateSaveTwo.class);
        startActivity(intent3);

    }

    //3.


}