package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Score extends AppCompatActivity {

    private int result=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        Intent intentGet = getIntent();

        result = result+intentGet.getIntExtra("result",0);

        TextView textview = (TextView) findViewById(R.id.score);

        result = result*333;

        String resultString = Integer.toString(result);

        textview.setText(resultString);
    }
}