package com.example.foodshopautomation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Sign_Up extends AppCompatActivity {
    public EditText num;
    public String Number;
    Button Get_otp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        num = findViewById(R.id.number);


        Get_otp = findViewById(R.id.get_otp);

        Get_otp.setOnClickListener(view -> {
            Number ="+91" + num.getText().toString().trim();

            Intent i = new Intent(Sign_Up.this, OTP.class);
            i.putExtra("num", Number);
            startActivity(i);
        });
    }
}