package com.faizanahmed.i200546;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity19 extends AppCompatActivity {

    public static final int SPLASH_TIME_OUT = 5000; // 5 seconds
    FirebaseUser UserAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main19);

        UserAuth = FirebaseAuth.getInstance().getCurrentUser();

        // Using a Handler to delay navigation
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent;
                if(UserAuth!=null){
                    intent = new Intent(MainActivity19.this, MainActivity5.class);
                }else{
                    intent = new Intent(MainActivity19.this, MainActivity3.class);
                }
                startActivity(intent);

            }
        }, SPLASH_TIME_OUT);
    }
}