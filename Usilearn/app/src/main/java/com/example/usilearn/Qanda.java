package com.example.usilearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Qanda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qanda);
    }

    public void sendToQ1(View view) {
        QuestionPage.q = getString(R.string.q1);
        QuestionPage.a = getString(R.string.a1);
        Intent intent = new Intent(this, QuestionPage.class);
        startActivity(intent);
    }

    public void sendToQ2(View view) {
        QuestionPage.q = getString(R.string.q2);
        QuestionPage.a = getString(R.string.a2);
        Intent intent = new Intent(this, QuestionPage.class);
        startActivity(intent);
    }
}
