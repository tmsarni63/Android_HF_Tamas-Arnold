package com.example.hazi5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MainActivity extends AppCompatActivity {

    ListView lista;
    ArrayList<String> list=new ArrayList<>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list.add("Egy");
        list.add("Ketto");
        list.add("Harom");
        list.add("Negy");

        lista=findViewById(R.id.lista);
        adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list);
        registerForContextMenu(lista);
        lista.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu,menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.sort:
                Collections.sort(list, new Comparator<String>() {
                    @Override
                    public int compare(String s, String t1) {
                        return s.compareToIgnoreCase(t1);
                    }
                });
                adapter.notifyDataSetChanged();
                return true;


            case R.id.delete:
                list.clear();
                adapter.notifyDataSetChanged();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }


    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo info=(AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        View view=info.targetView;
        TextView textView=(TextView) view.findViewById(android.R.id.text1);
        switch (item.getItemId()){
            case R.id.piros:
                textView.setTextColor(Color.RED);
                return true;
            case R.id.zold:
                textView.setTextColor(Color.GREEN);
                return true;

            case R.id.sarga:
                textView.setTextColor(Color.YELLOW);
                return true;

            default:
                return super.onContextItemSelected(item);
        }


    }
}