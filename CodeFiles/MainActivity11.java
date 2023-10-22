package com.faizanahmed.i200546;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        ImageView BackBtn = findViewById(R.id.BackBtn);
        BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity11.this, MainActivity11.class);
                startActivity(intent);
            }
        });

        ImageView ChatBtn = findViewById(R.id.ChatBtn);
        ChatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity11.this, MainActivity9.class);
                startActivity(intent);
            }
        });

//        Button RentItBtn = findViewById(R.id.RentItBtn);
//        ChatBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity11.this, MainActivity9.class);
//                startActivity(intent);
//            }
//        });


        TextView ReportBtn = findViewById(R.id.ReportBtn);
        ReportBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity11.this, MainActivity14.class);
                startActivity(intent);
            }
        });

    }
}