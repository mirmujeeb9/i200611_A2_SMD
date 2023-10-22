package com.faizanahmed.i200546;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        Button HomeBtn = findViewById(R.id.HomeBtn);
        HomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity10.this, MainActivity5.class);
                startActivity(intent);
            }
        });

        Button AddBtn = findViewById(R.id.AddBtn);
        AddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity10.this, MainActivity12.class);
                startActivity(intent);
            }
        });

        Button SearchBtn = findViewById(R.id.SearchBtn);
        SearchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity10.this, MainActivity6.class);
                startActivity(intent);
            }
        });

        Button ChatBtn = findViewById(R.id.ChatBtn);
        ChatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity10.this, MainActivity8.class);
                startActivity(intent);
            }
        });

        LinearLayout FeaturesItems_CardViewLinearLayout = findViewById(R.id.FeaturesItems_CardViewLinearLayout1);
        FeaturesItems_CardViewLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity10.this, MainActivity11.class);
                startActivity(intent);
            }
        });

        ImageView EditProfile = findViewById(R.id.EditProfile);
        EditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity10.this, MainActivity13.class);
                startActivity(intent);
            }
        });

        LinearLayout CardViewLinearLayout = findViewById(R.id.CardViewLinearLayout1);
        CardViewLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity10.this, MainActivity11.class);
                startActivity(intent);
            }
        });
    }
}