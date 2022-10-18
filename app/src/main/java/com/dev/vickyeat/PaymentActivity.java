package com.dev.vickyeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PaymentActivity extends AppCompatActivity {

    ImageView paymentsToProfileBtn;
    ImageView imgAddPay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        paymentsToProfileBtn=findViewById(R.id.paymentsToProfileBtn);
        imgAddPay=findViewById(R.id.imgAddPay);

        paymentsToProfileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PaymentActivity.this, ProfileActivity.class));
            }
        });
    }
}