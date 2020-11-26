package com.example.hf7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String[] nameArray = {"Octopus","Sheep","Rabbit",
            "Snake","Spider","Spider","Spider","Spider" };


    Integer[] imageArray = {R.drawable.cat,
            R.drawable.dog,
            R.drawable.giraffe,
            R.drawable.horse,
            R.drawable.lion,
            R.drawable.octopus3,
            R.drawable.rabbit,
            R.drawable.sheep
    };

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListAdapter whatever=new ListAdapter(this,nameArray,imageArray);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setAdapter(whatever); //


    }

}