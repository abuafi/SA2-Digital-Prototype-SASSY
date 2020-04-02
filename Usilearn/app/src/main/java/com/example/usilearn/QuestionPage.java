package com.example.usilearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class QuestionPage extends AppCompatActivity {

    public static String q = "";
    public static String a = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_page);
        TextView questionview = findViewById(R.id.questiontext);
        questionview.setText(q);
        TextView answerview = findViewById(R.id.answertext);
        answerview.setText(a);
        if(a.equals(getString(R.string.empty))){
            findViewById(R.id.afield).setVisibility(View.VISIBLE);
            findViewById(R.id.asend).setVisibility(View.VISIBLE);
        } else {
            findViewById(R.id.afield).setVisibility(View.GONE);
            findViewById(R.id.asend).setVisibility(View.GONE);
        }
    }

    public void sendA(View view){
        EditText edit = findViewById(R.id.afield);
        a=edit.getText().toString();
        Intent intent = new Intent(this, QuestionPage.class);
        startActivity(intent);
    }
}
