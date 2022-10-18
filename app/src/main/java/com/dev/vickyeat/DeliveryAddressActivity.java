package com.dev.vickyeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DeliveryAddressActivity extends AppCompatActivity {

    ImageView addressToProfileBtn;
    ImageView imgAddDelAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_address);

        addressToProfileBtn=findViewById(R.id.addressToProfileBtn);
        imgAddDelAddress=findViewById(R.id.imgAddDelAddress);

        addressToProfileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DeliveryAddressActivity.this, ProfileActivity.class));
            }
        });
    }
}