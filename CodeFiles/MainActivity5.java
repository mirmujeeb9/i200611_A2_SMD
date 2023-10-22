package com.faizanahmed.i200546;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Button SearchBtn = findViewById(R.id.SearchBtn);
        SearchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5.this, MainActivity6.class);
                startActivity(intent);
            }
        });

        Button ChatBtn = findViewById(R.id.ChatBtn);
        ChatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5.this, MainActivity8.class);
                startActivity(intent);
            }
        });

        Button ProfileBtn = findViewById(R.id.UserBtn);
        ProfileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5.this, MainActivity10.class);
                startActivity(intent);
            }
        });

        Button AddBtn = findViewById(R.id.AddBtn);
        AddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5.this, MainActivity12.class);
                startActivity(intent);
            }
        });
    }
}