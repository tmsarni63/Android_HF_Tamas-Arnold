package com.example.hazi32;

import android.view.View;

import java.util.ArrayList;

public class Product {

    public String terekkod;
    public String termeknev;
    public String termekar;
    
    public Product(String termekkod,String termeknev,String termekar){
        this.terekkod=termekkod;
        this.termeknev=termeknev;
        this.termekar=termekar;
    }

    public String toString(){
        return "kod: "+ this.terekkod+ "nev: "+this.termeknev+"ar: " +this.termekar;
    }

    public void addProduct(View view){

    }

    public void add(ArrayList<Product> termekek) {


    }
}
