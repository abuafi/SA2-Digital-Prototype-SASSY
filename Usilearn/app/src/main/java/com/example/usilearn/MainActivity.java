package com.example.usilearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static int algo = View.GONE;
    public static int ca = View.GONE;
    public static int calc = View.GONE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.algob).setVisibility(algo);
        findViewById(R.id.calcb).setVisibility(calc);
        findViewById(R.id.cab).setVisibility(ca);
    }

    public void openNewTopic(View view) {
        Intent intent = new Intent(this, NewTopic.class);
        startActivity(intent);
    }

    public void openAlgo(View view){
        Intent intent = new Intent(this, AlgoMain.class);
        startActivity(intent);
    }

    public void openCalc(View view){
        Intent intent = new Intent(this, CalcMain.class);
        startActivity(intent);
    }

    public void openCa(View view){
        Intent intent = new Intent(this, CaMain.class);
        startActivity(intent);
    }
}
