package com.example.usilearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CalcMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_main);
    }

    public void remCalc(View view) {
        MainActivity.calc=View.GONE;
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
