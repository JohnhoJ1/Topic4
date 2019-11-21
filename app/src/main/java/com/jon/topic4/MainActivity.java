package com.jon.topic4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
public static final String countries[] = {
        "Nepal" ,"India","China","UK","US","Canada"
};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lstCountries = findViewById(R.id.lstCountries);

        ArrayAdapter countryAdapter = new ArrayAdapter<>(
          this,// Activity
                android.R.layout.simple_list_item_1, // layout
                countries// array
        );
        lstCountries.setAdapter(countryAdapter);
    }
}
