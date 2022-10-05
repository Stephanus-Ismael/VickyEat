package com.dev.vickyeat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BeginActivity extends AppCompatActivity {
    private ConstraintLayout regBtn;
    private ConstraintLayout logBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin);

        regBtn=findViewById(R.id.regBtn);
        logBtn=findViewById(R.id.logBtn);

        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BeginActivity.this, RegisteringActivity.class));
            }
        });

        logBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BeginActivity.this, LoginActivity.class));
            }
        });
    }
}