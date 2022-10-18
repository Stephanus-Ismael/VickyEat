package com.dev.vickyeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PastOrdersActivity extends AppCompatActivity {

    TextView currentOrdersBtn;
    TextView txtPast;
    private LinearLayout homeBtn;
    private LinearLayout menuBtn;
    private LinearLayout profileBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_orders);

        currentOrdersBtn=findViewById(R.id.currentOrdersBtn);
        txtPast=findViewById(R.id.txtPast);
        homeBtn=findViewById(R.id.homeBtn);
        menuBtn=findViewById(R.id.menuBtn);
        profileBtn=findViewById(R.id.profileBtn);

        currentOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PastOrdersActivity.this, CurrentOrdersActivity.class));
            }
        });

        txtPast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PastOrdersActivity.this, PastOrdersActivity.class));
            }
        });

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PastOrdersActivity.this, HomeActivity.class));
            }
        });

        menuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PastOrdersActivity.this, MenuActivity.class));
            }
        });

        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PastOrdersActivity.this, ProfileActivity.class));
            }
        });
    }
}