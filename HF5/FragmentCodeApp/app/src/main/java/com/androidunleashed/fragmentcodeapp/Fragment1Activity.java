package com.androidunleashed.fragmentcodeapp;

import android.view.View;
import android.view.LayoutInflater;
import android.app.Fragment;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;
import android.content.Intent;
import android.app.FragmentManager;

public class Fragment1Activity extends Fragment{

    protected static final String FRAG2 = "2";

    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        Context c = getActivity().getApplicationContext();
        View vw = inflater.inflate(R.layout.fragment1, container, false);

        final String[] nameArray = {"EUR", "USD", "GBP", "AUD",
                "CAD", "CHF", "DKK", "HUF"};

        final String[] nameArray_long = {
                "Euro",
                "Dolar American",
                "Lira sterlina",
                "Dolar Australian",
                "Dolar canadian",
                "Frank elcetian",
                "Corona daneza",
                "Forint maghiar"};
        final String[] buyArray = {
                "4,4100 RON",
                "3,9750 RON",
                "6,1250 RON",
                "2,9600 RON",
                "3,0950 RON",
                "4,2300 RON",
                "0,5850 RON",
                "0,0136 RON"
        };
        final String[] sellArray = {
                "4,5500 RON",
                "4,1450 RON",
                "6,3550 RON",
                "3,0600 RON",
                "3,2650 RON",
                "4,3300 RON",
                "0,6150 RON",
                "0,0146 RON"
        };
        ListView fruitsList = (ListView) vw.findViewById(R.id.fruits_list);
        ArrayAdapter<String> arrayAdpt= new ArrayAdapter<String>(c, android.R.layout.simple_list_item_1, nameArray_long);
        fruitsList.setAdapter(arrayAdpt);

        final FragmentManager fragmentManager = getFragmentManager();
        fruitsList.setOnItemClickListener(new OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                if(fragmentManager.findFragmentByTag(FRAG2)!=null){
                    TextView selectedOpt = (TextView) getActivity().findViewById(R.id.selectedopt);
                    TextView selectedOpt2 = (TextView) getActivity().findViewById(R.id.selectedopt2);
                    TextView selectedOpt3 = (TextView) getActivity().findViewById(R.id.selectedopt3);
                    TextView selectedOpt4 = (TextView) getActivity().findViewById(R.id.selectedopt4);
                    selectedOpt.setText("You have selected "+nameArray_long[position]);
                    selectedOpt2.setText("You have selected "+nameArray[position]);
                    selectedOpt3.setText("You have selected "+buyArray[position]);
                    selectedOpt4.setText("You have selected "+sellArray[position]);
                } else {
                    Intent intent = new Intent(getActivity().getApplicationContext(),  ShowItemActivity.class);
                    intent.putExtra("name",nameArray_long);
                    intent.putExtra("name2",nameArray);
                    intent.putExtra("sell",sellArray);
                    intent.putExtra("buy",buyArray);
                    startActivity(intent);
                }
            }
        });
        return vw;
    }
}
