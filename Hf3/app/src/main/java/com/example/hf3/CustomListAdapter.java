package com.example.hf3;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class CustomListAdapter extends ArrayAdapter {


    private final Activity context;

    private final Integer[] imageIDarray;

    private final String[] nameArray;

    private final String[] nameArray_long;

    private final String[] sellArray;

    private final String[] buyArray;

    public CustomListAdapter(Activity context, Integer[] imageIDarray, String[] nameArray, String[] nameArray_long, String[] sellArray, String[] buyArray) {
        super(context, R.layout.listview_row, nameArray);
        this.context = context;
        this.imageIDarray = imageIDarray;
        this.nameArray = nameArray;
        this.nameArray_long = nameArray_long;
        this.sellArray = sellArray;
        this.buyArray = buyArray;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.listview_row, null, true);


        TextView namelongTextField = rowView.findViewById(R.id.name);
        TextView nameTextField = rowView.findViewById(R.id.penznem);
        ImageView imageView = rowView.findViewById(R.id.imageView);
        TextView buyTextField = rowView.findViewById(R.id.buy);
        TextView sellTextField = rowView.findViewById(R.id.sell);

        nameTextField.setText(nameArray[position]);
        namelongTextField.setText(nameArray_long[position]);
        imageView.setImageResource(imageIDarray[position]);
        buyTextField.setText(buyArray[position]);
        sellTextField.setText(sellArray[position]);
        return rowView;


    }


}