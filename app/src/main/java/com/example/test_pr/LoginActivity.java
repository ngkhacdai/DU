package com.example.test_pr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findViewById(R.id.btnback).setOnClickListener(v -> {
            Intent intent = new Intent(this,MainActivity2.class);
            startActivity(intent);
        });
    }
}