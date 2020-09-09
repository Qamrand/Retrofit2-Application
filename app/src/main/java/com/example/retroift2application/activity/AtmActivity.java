package com.example.retroift2application.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.retroift2application.R;

public class AtmActivity extends AppCompatActivity {

    public static final String EXTRA_ATM_DATA = "Atm data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atm);
    }
}