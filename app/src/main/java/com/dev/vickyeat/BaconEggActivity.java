package com.dev.vickyeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class BaconEggActivity extends AppCompatActivity {

    ImageView backToBreakfastBtn;
    ImageView minusBtn2;
    ImageView plusBtn2;
    ImageView cartBtn;
    TextView numberOrderTxt2;
    TextView txtPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacon_egg);

        backToBreakfastBtn=findViewById(R.id.backToBreakfastBtn);
        minusBtn2=findViewById(R.id.minusBtn2);
        plusBtn2=findViewById(R.id.plusBtn2);
        cartBtn=findViewById(R.id.cartBtn);
        numberOrderTxt2=findViewById(R.id.numberOrderTxt2);
        txtPrice=findViewById(R.id.txtPrice);

        backToBreakfastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BaconEggActivity.this, BreakfastActivity.class));
            }
        });

        cartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BaconEggActivity.this, CheckOutActivity.class));
            }
        });

    }
}