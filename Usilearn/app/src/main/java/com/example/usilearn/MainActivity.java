package com.example.usilearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static boolean algo = false;
    public static boolean calc = false;
    public static boolean ca = false;
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(!algo) {
            findViewById(R.id.algobutton).setVisibility(View.GONE);
        } else {
            findViewById(R.id.algobutton).setVisibility(View.VISIBLE);
        }
        if(!calc) {
            findViewById(R.id.calcbutton).setVisibility(View.GONE);
        } else {
            findViewById(R.id.calcbutton).setVisibility(View.VISIBLE);
        }
        if(!ca) {
            findViewById(R.id.cabutton).setVisibility(View.GONE);
        } else {
            findViewById(R.id.cabutton).setVisibility(View.VISIBLE);
        }
    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intent;
        intent = new Intent(this, NewTopic.class);
        startActivity(intent);
    }

    public void launchAlgo(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intent;
        intent = new Intent(this, Algo.class);
        startActivity(intent);
    }

    public void launchCalc(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intent;
        intent = new Intent(this, Calc.class);
        startActivity(intent);
    }

    public void launchCa(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intent;
        intent = new Intent(this, Ca.class);
        startActivity(intent);
    }
}
