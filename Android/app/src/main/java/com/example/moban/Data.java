package com.example.moban;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Data extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        getSupportActionBar().hide();
    }
}