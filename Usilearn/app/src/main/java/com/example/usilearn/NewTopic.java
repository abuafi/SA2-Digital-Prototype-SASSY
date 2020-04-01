package com.example.usilearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class NewTopic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_topic);
    }

    public void addCa(View view) {
        if(MainActivity.ca==View.GONE) {
            MainActivity.ca = View.VISIBLE;
        }else{
            Toast toast = Toast.makeText(this, "You already have this topic!", Toast.LENGTH_SHORT);
            toast.show();
        }
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void addCalc(View view) {
        if(MainActivity.calc==View.GONE) {
            MainActivity.calc = View.VISIBLE;
        }else{
            Toast toast = Toast.makeText(this, "You already have this topic!", Toast.LENGTH_SHORT);
            toast.show();
        }
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void addAlgo(View view) {
        if(MainActivity.algo==View.GONE) {
            MainActivity.algo = View.VISIBLE;
        }else{
            Toast toast = Toast.makeText(this, "You already have this topic!", Toast.LENGTH_SHORT);
            toast.show();
        }
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
