package com.example.usilearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class NewTopic extends AppCompatActivity {
    public static final String EXTRA_MESSAGE =
            "com.example.android.twoactivities.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_topic);
    }
    public void showAlgo(View view){
        if (MainActivity.algo==false) {
            MainActivity.algo = true;
        } else {
            Toast toast = Toast.makeText(this, "You already have this topic!", Toast.LENGTH_SHORT);
            toast.show();
        }
        Intent intent;
        intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void showCa(View view){
        if (MainActivity.ca==false) {
            MainActivity.ca = true;
        } else {
            Toast toast = Toast.makeText(this, "You already have this topic!", Toast.LENGTH_SHORT);
            toast.show();
        }
        Intent intent;
        intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void showCalc(View view){
        if (MainActivity.calc==false) {
            MainActivity.calc = true;
        } else {
            Toast toast = Toast.makeText(this, "You already have this topic!", Toast.LENGTH_SHORT);
            toast.show();
        }
        Intent intent;
        intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
