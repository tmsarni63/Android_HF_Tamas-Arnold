package com.example.hazi32;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Product> termekek=new ArrayList<>();
    EditText productcode;
    EditText productname;
    EditText productprice;
    Button addProduct;
    Button cancel;
    Button show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productcode=findViewById(R.id.pcodet);
        productname=findViewById(R.id.pnamet);
        productprice=findViewById(R.id.ppricet);
        addProduct=findViewById(R.id.add);
        cancel=findViewById(R.id.cancel);
        show=findViewById(R.id.show);

        addProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Product products=new Product(productcode.getText().toString(),productname.getText().toString(),productprice.getText().toString());
                products.add(termekek);
                Log.d("status","code"+productcode.getText().toString());
                productcode.setText("");
                productname.setText("");
                productprice.setText("");
            }

        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                productcode.setText("");
                productname.setText("");
                productprice.setText("");
            }
        });
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView lista=(TextView) findViewById(R.id.show);
                lista.setText("");
                for (Product product:termekek){
                    lista.append(product.toString());
                }
            }
        });
    }


}