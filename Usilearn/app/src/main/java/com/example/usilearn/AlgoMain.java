package com.example.usilearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AlgoMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algo_main);
    }

    public void remAlgo(View view) {
        MainActivity.algo=View.GONE;
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
