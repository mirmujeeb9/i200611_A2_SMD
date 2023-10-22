package com.faizanahmed.i200546;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    Button btnForgot, btnLogin, btnSignUp;
    EditText etEmail, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnForgot = findViewById(R.id.ForgotBtn);
        btnLogin = findViewById(R.id.LoginBtn);
        etEmail = findViewById(R.id.EmailInput);
        etPassword = findViewById(R.id.PasswordInput);
        btnSignUp = findViewById(R.id.SignupBtn);


        btnForgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth mAuth= FirebaseAuth.getInstance();

                if(mAuth.getUid()!=null){
                    Toast.makeText(MainActivity.this,"Already Signed in! :(",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this,"Signing in...",Toast.LENGTH_LONG).show();
                    mAuth.signInWithEmailAndPassword(etEmail.getText().toString(),
                            etPassword.getText().toString()
                    ).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                        @Override
                        public void onSuccess(AuthResult authResult) {
                            Toast.makeText(MainActivity.this, "Sign in successful! :)",Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(MainActivity.this, MainActivity5.class);
                            startActivity(intent);
                        }
                    }
                    ).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(MainActivity.this, "Sign in unsuccessful! :(",Toast.LENGTH_LONG).show();
                        }
                    });
                }
            }
        });


        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);
            }
        });
    }
}