package com.example.hazi2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ActivityStateSaveTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state_save_two);
        Log.d("Allapot:","Activity3:onCreate()");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Allapot:","Activity3:onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("Allapot:","Activity3:onResume()");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Allapot:","Activity3:onPause()");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Allapot:","Activity3:onStop()");


    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Allapot:","Activity3:onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Allapot:","Activity3:onDestroy()");

    }
}