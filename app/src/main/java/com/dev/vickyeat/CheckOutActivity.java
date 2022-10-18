package com.dev.vickyeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class CheckOutActivity extends AppCompatActivity {

    ImageView chooseAddressBtn;
    ImageView choosePaymentBtn;
    Button confirmBtn;
    private LinearLayout homeBtn;
    private LinearLayout menuBtn;
    private LinearLayout ordersBtn;
    private LinearLayout profileBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        chooseAddressBtn=findViewById(R.id.chooseAddressBtn);
        choosePaymentBtn=findViewById(R.id.choosePaymentBtn);
        confirmBtn=findViewById(R.id.confirmBtn);
        homeBtn=findViewById(R.id.homeBtn);
        menuBtn=findViewById(R.id.menuBtn);
        ordersBtn=findViewById(R.id.ordersBtn);
        profileBtn=findViewById(R.id.profileBtn);

        chooseAddressBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CheckOutActivity.this, DeliveryAddressActivity.class));
            }
        });

        choosePaymentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CheckOutActivity.this, PaymentActivity.class));
            }
        });

        confirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CheckOutActivity.this, CartActivity.class));
            }
        });

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CheckOutActivity.this, HomeActivity.class));
            }
        });

        menuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CheckOutActivity.this, MenuActivity.class));
            }
        });

        ordersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CheckOutActivity.this, CurrentOrdersActivity.class));
            }
        });

        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CheckOutActivity.this, CheckOutActivity.class));
            }
        });
    }
}