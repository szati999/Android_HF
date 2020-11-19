package com.androidunleashed.fragmentcodeapp;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

public class ShowItemActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            finish();
            return;
        }
        setContentView(R.layout.fragment2);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String selectedItem = extras.getString("name");
            TextView textView = (TextView) findViewById(R.id.selectedopt);
            textView.setText(selectedItem);

            String selectedItem2 = extras.getString("name2");
            TextView textView2 = (TextView) findViewById(R.id.selectedopt2);
            textView2.setText(selectedItem2);

            String selectedItem3 = extras.getString("sell");
            TextView textView3 = (TextView) findViewById(R.id.selectedopt3);
            textView3.setText("Sell: "+selectedItem3);

            String selectedItem4 = extras.getString("buy");
            TextView textView4 = (TextView) findViewById(R.id.selectedopt4);
            textView3.setText("Buy: "+selectedItem3);
        }
    }
}
