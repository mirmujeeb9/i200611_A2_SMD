package com.faizanahmed.i200546;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        ImageView VoiceCallBtn = findViewById(R.id.VoiceCallBtn);
        VoiceCallBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity9.this, MainActivity18.class);
                startActivity(intent);
            }
        });

        ImageView VideoCallBtn = findViewById(R.id.VideoCallBtn);
        VideoCallBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity9.this, MainActivity17.class);
                startActivity(intent);
            }
        });

        ImageView ImageBtn = findViewById(R.id.ImageBtn);
        ImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity9.this, MainActivity15.class);
                startActivity(intent);
            }
        });
    }
}