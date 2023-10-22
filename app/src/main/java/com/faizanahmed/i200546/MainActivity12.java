package com.faizanahmed.i200546;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        Spinner CitySpinner = findViewById(R.id.CityInput);
        String[] Cities = {"Islamabad", "Karachi", "Lahore", "Faisalabad"};
        ArrayAdapter<String> CityAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, Cities);
        CityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        CitySpinner.setAdapter(CityAdapter);
        CitySpinner.setSelection(0);

        LinearLayout UploadImage = findViewById(R.id.UploadImage);
        UploadImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity12.this, MainActivity15.class);
                startActivity(intent);
            }
        });

        LinearLayout UploadVideo = findViewById(R.id.UploadVideo);
        UploadVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity12.this, MainActivity16.class);
                startActivity(intent);
            }
        });

        Button PostItemBtn = findViewById(R.id.PostItemBtn);
        PostItemBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity12.this, MainActivity11.class);
                startActivity(intent);
            }
        });


        ImageView BackBtn = findViewById(R.id.BackBtn);
        BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity12.this, MainActivity11.class);
                startActivity(intent);
            }
        });
    }
}