package com.example.hazi4;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomListAdapter extends ArrayAdapter {

private final Activity context;
private final Integer[] imageIDarray;
private final String[] countryCurrency;
private final String[] currencyDescription;
private final String[] buying;
private final String[] selling;

public CustomListAdapter(Activity context,Integer[] imageIDarray, String[] countryCurrency,String[] currencyDescription,String[] buying, String[] selling){
    super(context,R.layout.listview_row,countryCurrency);
    this.context=context;
    this.imageIDarray=imageIDarray;
    this.countryCurrency=countryCurrency;
    this.currencyDescription=currencyDescription;
    this.buying=buying;
    this.selling=selling;
}

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.listview_row, null, true);

        ImageView imageView = rowView.findViewById(R.id.imageView);
        TextView countryCurrency1 = rowView.findViewById(R.id.textView);
        TextView currencyDescription1 = rowView.findViewById(R.id.textView2);
        TextView buying1 = rowView.findViewById(R.id.cumpara);
        TextView selling1 = rowView.findViewById(R.id.vinde);

        imageView.setImageResource(imageIDarray[position]);
        countryCurrency1.setText(countryCurrency[position]);
        currencyDescription1.setText(currencyDescription[position]);
        buying1.setText(buying[position]);
        selling1.setText(selling[position]);

        return rowView;
    }
}
