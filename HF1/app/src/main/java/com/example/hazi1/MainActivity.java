package com.example.hazi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText szam1= findViewById(R.id.firstnumber);
        EditText szam2= findViewById(R.id.secondnumber);
        TextView eredmeny=findViewById(R.id.result);
        Button osszead=findViewById(R.id.addition);
        Button kivon=findViewById(R.id.substraction);
        Button szoroz=findViewById(R.id.multiplication);
        Button oszt=findViewById(R.id.division);

        osszead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double elsoszam=Double.parseDouble(szam1.getText().toString());
                    double masodikszam=Double.parseDouble(szam2.getText().toString());


                    double osszeg=Double.parseDouble(String.valueOf(elsoszam+masodikszam));
                    eredmeny.setText(Double.toString(osszeg));

                } catch (NumberFormatException e) {
                    Context context= getApplicationContext();
                    CharSequence text="Hiba a muveletben!!!";
                    int duration= Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

//                    teszt sor pushoz
                }
            }
        });
        kivon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    double elsoszam=Double.parseDouble(szam1.getText().toString());
                    double masodikszam=Double.parseDouble(szam2.getText().toString());


                    double kivonas=Double.parseDouble(String.valueOf(elsoszam-masodikszam));
                    eredmeny.setText(Double.toString(kivonas));

                } catch (NumberFormatException e) {
                    Context context= getApplicationContext();
                    CharSequence text="Hiba a muveletben!!!";
                    int duration= Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });
        szoroz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    double elsoszam=Double.parseDouble(szam1.getText().toString());
                    double masodikszam=Double.parseDouble(szam2.getText().toString());


                    double szorzas=Double.parseDouble(String.valueOf(elsoszam*masodikszam));
                    eredmeny.setText(Double.toString(szorzas));

                } catch (NumberFormatException e) {
                    Context context= getApplicationContext();
                    CharSequence text="Hiba a muveletben!!!";
                    int duration= Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });
        oszt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double elsoszam=Double.parseDouble(szam1.getText().toString());
                    double masodikszam=Double.parseDouble(szam2.getText().toString());


                    double osztas=Double.parseDouble(String.valueOf(elsoszam/masodikszam));
                    eredmeny.setText(Double.toString(osztas));

                } catch (NumberFormatException e) {
                    Context context= getApplicationContext();
                    CharSequence text="Hiba a muveletben!!!";
                    int duration= Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });
    }
}