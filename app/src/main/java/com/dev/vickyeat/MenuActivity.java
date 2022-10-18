package com.dev.vickyeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MenuActivity extends AppCompatActivity {

    ImageView menuToHomeBtn;
    ImageView breakfastMenuBtn;
    ImageView lunchMenuBtn;
    ImageView fastfoodMenuBtn;
    ImageView drinksMenuBtn;
    private LinearLayout homeBtn;
    private LinearLayout ordersBtn;
    private LinearLayout profileBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        menuToHomeBtn=findViewById(R.id.menuToHomeBtn);
        breakfastMenuBtn=findViewById(R.id.breakfastMenuBtn);
        lunchMenuBtn=findViewById(R.id.lunchMenuBtn);
        fastfoodMenuBtn=findViewById(R.id.fastfoodMenuBtn);
        drinksMenuBtn=findViewById(R.id.drinksMenuBtn);
        homeBtn=findViewById(R.id.homeBtn);
        ordersBtn=findViewById(R.id.ordersBtn);
        profileBtn=findViewById(R.id.profileBtn);

        menuToHomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, HomeActivity.class));
            }
        });

        breakfastMenuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, BreakfastActivity.class));
            }
        });

        lunchMenuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, LunchActivity.class));
            }
        });

        fastfoodMenuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, FastFoodActivity.class));
            }
        });

        drinksMenuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, DrinksActivity.class));
            }
        });

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, HomeActivity.class));
            }
        });

        ordersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, CurrentOrdersActivity.class));
            }
        });

        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, ProfileActivity.class));
            }
        });
    }
}