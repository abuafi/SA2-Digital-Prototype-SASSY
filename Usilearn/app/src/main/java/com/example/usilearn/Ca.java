package com.example.usilearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ca);
    }

    public void removeCa(View view){
        MainActivity.ca=false;
        Intent intent;
        intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
