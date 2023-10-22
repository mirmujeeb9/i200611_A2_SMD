package com.faizanahmed.i200546;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity3 extends AppCompatActivity {

    EditText etName, etEmail, etContactNumber, etPassword;
    Spinner spnrCountry, spnrCity;
    Button btnSignUp;
    TextView tvbtnLogIn;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //inital data
        spnrCountry = findViewById(R.id.CountryInput);
        String[] Countries = {"Select Country", "Country 1", "Country 2", "Country 3"};
        ArrayAdapter<String> CountryAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, Countries);
        CountryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnrCountry.setAdapter(CountryAdapter);
        spnrCountry.setSelection(0);

        spnrCity = findViewById(R.id.CityInput);
        String[] Cities = {"Select City", "City 1", "City 2", "City 3"};
        ArrayAdapter<String> CityAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, Cities);
        CityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnrCity.setAdapter(CityAdapter);
        spnrCity.setSelection(0);

        //finding by view
        mAuth=FirebaseAuth.getInstance();
        etName = findViewById(R.id.NameInput);
        etEmail = findViewById(R.id.EmailInput);
        etPassword = findViewById(R.id.PasswordInput);
        etContactNumber = findViewById(R.id.ContactInput);
        btnSignUp = findViewById(R.id.SignUpBtn);
        tvbtnLogIn = findViewById(R.id.LoginText);

        //Click Listeners
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.createUserWithEmailAndPassword(etEmail.getText().toString(),
                        etPassword.getText().toString()
                ).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {
                        Toast.makeText(MainActivity3.this, "Sign up successful! :)",Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(MainActivity3.this, MainActivity10.class);
                        startActivity(intent);
                    }
                }).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

//                        mAuth = FirebaseAuth.getInstance();
//                        FirebaseDatabase fbdatabase = FirebaseDatabase.getInstance();
//                        DatabaseReference usersRef = fbdatabase.getReference("users");
//                        User newUser = new User(etName.getText().toString(),etEmail.getText().toString(),
//                                etPassword.getText().toString(),etContactNumber.getText().toString(),
//                                spnrCountry.getSelectedItem().toString(), spnrCity.getSelectedItem().toString());
//                        FirebaseUser User = mAuth.getCurrentUser();
//                        String userId = User.getUid();


                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(MainActivity3.this, "Sign up unsuccessful! :(",Toast.LENGTH_LONG).show();
                    }
                });

//                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
//                startActivity(intent);
            }
        });

        TextView LoginBtn = findViewById(R.id.LoginText);
        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}