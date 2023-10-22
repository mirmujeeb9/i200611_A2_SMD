package com.faizanahmed.i200546;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        Spinner FilterSpinner = findViewById(R.id.FilterInput);
        String[] Filters = {"Best Match", "Newest First","Oldest First", "Low to High", "High to Low"};
        ArrayAdapter<String> FilterAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, Filters);
        FilterAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        FilterSpinner.setAdapter(FilterAdapter);
        FilterSpinner.setSelection(0);

        ImageView CardViewImage = findViewById(R.id.CardViewImage1);
        CardViewImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity7.this, MainActivity11.class);
                startActivity(intent);
            }
        });

        ImageView BackBtn = findViewById(R.id.BackBtn);
        BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity7.this, MainActivity6.class);
                startActivity(intent);
            }
        });
    }
}