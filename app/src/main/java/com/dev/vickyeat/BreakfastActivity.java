package com.dev.vickyeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class BreakfastActivity extends AppCompatActivity {

    ImageView backToMenuBtn;
    ImageView baconInfoBtn;
    ImageView scrambledInfoBtn;
    ImageView toastInfoBtn;
    ImageView fattyInfoBtn;
    ImageView boiledInfoBtn;
    private LinearLayout homeBtn;
    private LinearLayout menuBtn;
    private LinearLayout ordersBtn;
    private LinearLayout profileBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);

        backToMenuBtn=findViewById(R.id.backToMenuBtn);
        baconInfoBtn=findViewById(R.id.baconInfoBtn);
        scrambledInfoBtn=findViewById(R.id.scrambledInfoBtn);
        toastInfoBtn=findViewById(R.id.toastInfoBtn);
        fattyInfoBtn=findViewById(R.id.fattyInfoBtn);
        boiledInfoBtn=findViewById(R.id.boiledInfoBtn);
        homeBtn=findViewById(R.id.homeBtn);
        menuBtn=findViewById(R.id.menuBtn);
        ordersBtn=findViewById(R.id.ordersBtn);
        profileBtn=findViewById(R.id.profileBtn);

        backToMenuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BreakfastActivity.this, MenuActivity.class));
            }
        });

        baconInfoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BreakfastActivity.this, BaconEggActivity.class));
            }
        });

        scrambledInfoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BreakfastActivity.this, ScrambledInfoActivity.class));
            }
        });

        toastInfoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BreakfastActivity.this, ToastInfoActivity.class));
            }
        });

        fattyInfoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BreakfastActivity.this, FattyInfoActivity.class));
            }
        });

        boiledInfoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BreakfastActivity.this, BoiledInfoActivity.class));
            }
        });

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BreakfastActivity.this, HomeActivity.class));
            }
        });

        menuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BreakfastActivity.this, HomeActivity.class));
            }
        });

        ordersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BreakfastActivity.this, CurrentOrdersActivity.class));
            }
        });

        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BreakfastActivity.this, ProfileActivity.class));
            }
        });
    }
}