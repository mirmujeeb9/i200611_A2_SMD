package com.faizanahmed.i200546;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);
        TextView PhotoBtn = findViewById(R.id.PhotoBtn);
        PhotoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity16.this, MainActivity15.class);
                startActivity(intent);
            }
        });

        ImageView CancelBtn = findViewById(R.id.CancelBtn);
        CancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity16.this, MainActivity10.class);
                startActivity(intent);
            }
        });
    }
}