package com.faizanahmed.i200546;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity7 extends AppCompatActivity {
    List<Item> lsItems;
    ItemAdapter adapter;
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //part 4 function below
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        Spinner FilterSpinner = findViewById(R.id.FilterInput);
        String[] Filters = {"Best Match", "Newest First","Oldest First", "Low to High", "High to Low"};
        ArrayAdapter<String> FilterAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, Filters);
        FilterAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        FilterSpinner.setAdapter(FilterAdapter);
        FilterSpinner.setSelection(0);

        rv = findViewById(R.id.rv);

        List<Item> ls = new ArrayList<>();
        ls.add(new Item("1. Car Cleaning", "$14", "We will clean your car", "Islamabad", "hmm", "hmmm"));
        ls.add(new Item("2. Home Painting", "$12", "Professional painting services", "Karachi", "hmm", "hmmm"));
        ls.add(new Item("3. Gardening Service", "$20", "Expert garden maintenance", "Lahore", "hmm", "hmmm"));
        ls.add(new Item("4. Mobile Repair", "$30", "Fast and reliable phone repair", "Islamabad", "hmm", "hmmm"));
        ls.add(new Item("5. Fitness Training", "$25", "Personalized fitness coaching", "Karachi", "hmm", "hmmm"));
        ls.add(new Item("6. Plumbing Assistance", "$18", "24/7 plumbing support", "Lahore", "hmm", "hmmm"));
        ls.add(new Item("7. House Cleaning", "$15", "Thorough house cleaning", "Islamabad", "hmm", "hmmm"));
        ls.add(new Item("8. Lawn Care", "$22", "Lawn mowing and maintenance", "Karachi", "hmm", "hmmm"));
        ls.add(new Item("9. Computer Repair", "$28", "Computer troubleshooting and repair", "Lahore", "hmm", "hmmm"));
        ls.add(new Item("10. Dog Walking", "$10", "Reliable dog walking service", "Islamabad", "hmm", "hmmm"));
        ls.add(new Item("11. Catering Service", "$50", "Delicious catering for events", "Karachi", "hmm", "hmmm"));
        ls.add(new Item("12. Electrical Repairs", "$18", "Electrical issues fixed", "Lahore", "hmm", "hmmm"));
        ls.add(new Item("13. Yoga Classes", "$15", "Beginner to advanced yoga", "Islamabad", "hmm", "hmmm"));
        ls.add(new Item("14. Bike Repair", "$10", "Bicycle tune-up and repairs", "Karachi", "hmm", "hmmm"));
        ls.add(new Item("15. Roofing Service", "$40", "Roof repairs and installations", "Lahore", "hmm", "hmmm"));
        ls.add(new Item("16. Tutoring Services", "$22", "Experienced tutors for all subjects", "Islamabad", "hmm", "hmmm"));
        ls.add(new Item("17. Car Rental", "$35", "Rent a car for your travel", "Karachi", "hmm", "hmmm"));
        ls.add(new Item("18. Event Photography", "$60", "Capture memories at your events", "Lahore", "hmm", "hmmm"));
        ls.add(new Item("19. Home Renovation", "$100", "Transform your living space", "Islamabad", "hmm", "hmmm"));
        ls.add(new Item("20. Appliance Repairs", "$25", "Fixing all appliance issues", "Karachi", "hmm", "hmmm"));


        adapter = new ItemAdapter(MainActivity7.this, ls);

//        RecyclerView.LayoutManager lm = new LinearLayoutManager((MainActivity7.this));

        GridLayoutManager lm = new GridLayoutManager(this, 2);
        rv.setLayoutManager(lm);
        rv.setAdapter(adapter);

        ImageView BackBtn = findViewById(R.id.BackBtn);
        BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity7.this, MainActivity6.class);
                startActivity(intent);
            }
        });
    }
}