package com.example.hf7;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter extends ArrayAdapter {
    private final Activity context;

    //to store the animal images
    private final Integer[] imageIDArray;

    //to store the list of countries
    private final String[] nameArray;

    public ListAdapter(Activity context, String[] nameArray, Integer[] imageIDArray){

        super(context, R.layout.listview_row, nameArray);
        this.context = context;
        this.imageIDArray = imageIDArray;
        this.nameArray = nameArray;
    }

    public View getView(int position, View convertView,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listview_row,null,true);

        TextView nameTextField= rowView.findViewById(R.id.name);
        ImageView imageView= rowView.findViewById(R.id.imageView);

        nameTextField.setText(nameArray[position]);
        imageView.setImageResource(imageIDArray[position]);

        return rowView;
    }
    }


