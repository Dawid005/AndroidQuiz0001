package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class FirstQuestion extends AppCompatActivity {

    private int result=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question);
    }

    public void firstQuestionNext(View view) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.firstQuestionGroup);
        int id = radioGroup.getCheckedRadioButtonId();

        if(id==2131231203){
            result = result +1;
        }
        TextView textView = (TextView) findViewById(R.id.textView2);

        Intent intent = new Intent(this, SecondQuestion.class);

        intent.putExtra("result", result);

        startActivity(intent);

    }

}