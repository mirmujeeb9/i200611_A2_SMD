package com.faizanahmed.i200546;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        CardView Chat_CardView = findViewById(R.id.Chat_CardView1);
        Chat_CardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity8.this, MainActivity9.class);
                startActivity(intent);
            }
        });

        Button HomeBtn = findViewById(R.id.HomeBtn);
        HomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity8.this, MainActivity5.class);
                startActivity(intent);
            }
        });

        Button ProfileBtn = findViewById(R.id.UserBtn);
        ProfileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity8.this, MainActivity10.class);
                startActivity(intent);
            }
        });

        Button AddBtn = findViewById(R.id.AddBtn);
        AddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity8.this, MainActivity12.class);
                startActivity(intent);
            }
        });

        Button SearchBtn = findViewById(R.id.SearchBtn);
        SearchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity8.this, MainActivity6.class);
                startActivity(intent);
            }
        });
    }
}