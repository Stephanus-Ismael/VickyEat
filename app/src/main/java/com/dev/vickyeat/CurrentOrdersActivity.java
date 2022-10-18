package com.dev.vickyeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CurrentOrdersActivity extends AppCompatActivity {

    TextView txtCurrent;
    TextView pastOrdersBtn;
    private LinearLayout homeBtn;
    private LinearLayout menuBtn;
    private LinearLayout profileBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_orders);

        txtCurrent=findViewById(R.id.txtCurrent);
        pastOrdersBtn=findViewById(R.id.pastOrdersBtn);
        homeBtn=findViewById(R.id.homeBtn);
        menuBtn=findViewById(R.id.menuBtn);
        profileBtn=findViewById(R.id.profileBtn);

        txtCurrent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CurrentOrdersActivity.this, CurrentOrdersActivity.class));
            }
        });

        pastOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CurrentOrdersActivity.this, PastOrdersActivity.class));
            }
        });

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CurrentOrdersActivity.this, HomeActivity.class));
            }
        });

        menuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CurrentOrdersActivity.this, MenuActivity.class));
            }
        });

        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CurrentOrdersActivity.this, ProfileActivity.class));
            }
        });
    }
}