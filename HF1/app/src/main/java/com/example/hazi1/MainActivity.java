package com.example.hazi1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;

    TextView megoldas;
    EditText szam1;
    EditText szam2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        szam1=findViewById(R.id.szam1);
        szam2=findViewById(R.id.szam2);
        megoldas=findViewById(R.id.megoldas);
        final RadioButton szorzas=findViewById(R.id.szorzas);
        final RadioButton kivonas=findViewById(R.id.kivonas);
        final RadioButton osszeadas=findViewById(R.id.osszeadas);
        final RadioButton osztas=findViewById(R.id.osztas);

        final Button button= findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double sz1=Double.parseDouble(szam1.getText().toString());
                double sz2=Double.parseDouble(szam2.getText().toString());

                double ertek;

                if(szorzas.isChecked()){
                    ertek=sz1*sz2;
                megoldas.setText(Double.toString(ertek));}

                if(osztas.isChecked()){
                    ertek=sz1/sz2;
                    megoldas.setText(Double.toString(ertek));}

                if(kivonas.isChecked()){
                    ertek=sz1-sz2;
                    megoldas.setText(Double.toString(ertek));}

                if(osszeadas.isChecked()){
                    ertek=sz1+sz2;
                    megoldas.setText(Double.toString(ertek));}




            }
        });


        }


    }


