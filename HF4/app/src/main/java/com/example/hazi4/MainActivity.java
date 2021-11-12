package com.example.hazi4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    String[] nameArray = {"EUR", "USD", "GPB", "AUD", "CAD", "CHF", "DKK", "HUF"};

    String[] infoArray = {"Euro", "Dollar american", "Lira sterlina", "Dollar australian", "Dollar canadian", "Franc elvetian", "Corona daneza", "Forint magyar"};

    String[] buyingArray = {"4,4100", "3,9750", "6,1250", "2,9600", "3,0950", "4,2300", "0,5850", "0,0136"};

    String[] sellingArray = {"4,5500", "3,9750", "6,3550", "3,0600", "3,2650", "4,3300", "0,6150", "0,0146"};

    Integer[] imageArray = {
            R.drawable.euro, R.drawable.usa, R.drawable.uk, R.drawable.australia, R.drawable.canada, R.drawable.switzerland, R.drawable.denmark, R.drawable.hungary
    };

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter customListAdapter=new CustomListAdapter(this,imageArray,nameArray,infoArray,buyingArray,sellingArray);
        listView=findViewById(R.id.lista);
        listView.setAdapter(customListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                TextView cumpara=view.findViewById(R.id.cumpara);
                TextView vinde=view.findViewById(R.id.vinde);
                TextView cumparaPrice=view.findViewById(R.id.cumparaprice);
                TextView vindePrice=view.findViewById(R.id.vindeprice);

                cumpara.setVisibility(View.VISIBLE);
                vinde.setVisibility(View.VISIBLE);
                cumparaPrice.setVisibility(View.VISIBLE);
                vindePrice.setVisibility(View.VISIBLE);

            }
        });
    }
}