package com.example.hf3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] nameArray = {"EUR", "USD", "GBP", "AUD",
            "CAD", "CHF", "DKK", "HUF"};

    String[] nameArray_long = {
            "Euro",
            "Dolar American",
            "Lira sterlina",
            "Dolar Australian",
            "Dolar canadian",
            "Frank elcetian",
            "Corona daneza",
            "Forint maghiar"};


    Integer[] imageArray = {
            R.drawable.eur,
            R.drawable.usd,
            R.drawable.gbp,
            R.drawable.aud,
            R.drawable.cad,
            R.drawable.chf,
            R.drawable.dkk,
            R.drawable.huf,
    };

    String[] buyArray = {
            "4,4100 RON",
            "3,9750 RON",
            "6,1250 RON",
            "2,9600 RON",
            "3,0950 RON",
            "4,2300 RON",
            "0,5850 RON",
            "0,0136 RON"
    };
    String[] sellArray = {
            "4,5500 RON",
            "4,1450 RON",
            "6,3550 RON",
            "3,0600 RON",
            "3,2650 RON",
            "4,3300 RON",
            "0,6150 RON",
            "0,0146 RON"
    };

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter whatever=new CustomListAdapter(this, imageArray,nameArray,nameArray_long,sellArray,buyArray);
        listView=findViewById(R.id.listviewID);
        listView.setAdapter(whatever);



    }
}