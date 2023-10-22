package com.faizanahmed.i200546;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Spinner CountrySpinner = findViewById(R.id.CountryInput);
        String[] Countries = {"Select Country", "Country 1", "Country 2", "Country 3"};
        ArrayAdapter<String> CountryAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, Countries);
        CountryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        CountrySpinner.setAdapter(CountryAdapter);
        CountrySpinner.setSelection(0);

        Spinner CitySpinner = findViewById(R.id.CityInput);
        String[] Cities = {"Select City", "City 1", "City 2", "City 3"};
        ArrayAdapter<String> CityAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, Cities);
        CityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        CitySpinner.setAdapter(CityAdapter);
        CitySpinner.setSelection(0);

        Button SignUpBtn = findViewById(R.id.SignUpBtn);
        SignUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(intent);
            }
        });

        TextView LoginBtn = findViewById(R.id.LoginText);
        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}