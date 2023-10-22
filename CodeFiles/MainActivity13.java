package com.faizanahmed.i200546;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        Spinner CitySpinner = findViewById(R.id.CityInput);
        String[] Cities = {"Islamabad", "Karachi", "Lahore", "Faisalabad"};
        ArrayAdapter<String> CityAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, Cities);
        CityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        CitySpinner.setAdapter(CityAdapter);
        CitySpinner.setSelection(0);

        Spinner CountrySpinner = findViewById(R.id.CountryInput);
        String[] Countries = {"Select Country", "Country 1", "Country 2", "Country 3"};
        ArrayAdapter<String> CountryAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, Countries);
        CountryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        CountrySpinner.setAdapter(CountryAdapter);
        CountrySpinner.setSelection(0);

        TextView SaveChanges = findViewById(R.id.SaveChanges);
        SaveChanges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity13.this, MainActivity10.class);
                startActivity(intent);
            }
        });

        ImageView BackBtn = findViewById(R.id.BackBtn);
        BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity13.this, MainActivity11.class);
                startActivity(intent);
            }
        });
    }
}