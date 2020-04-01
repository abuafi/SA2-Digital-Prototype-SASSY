package com.example.usilearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CaMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ca_main);
    }

    public void remCa(View view) {
        MainActivity.ca=View.GONE;
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
