package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ThirdQuestion extends AppCompatActivity {

    private int result=0;
    private boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_question);

        Intent intentGet = getIntent();

        result = result+intentGet.getIntExtra("result",0);
    }

    public void thirdQuestionNext(View view){
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.thirdQuestionGroup);
        int id = radioGroup.getCheckedRadioButtonId();
        if(flag) {
            if (id == 2131231216) {
                result = result + 1;
            }
        }

        flag=false;

        Intent intent = new Intent(this, Score.class);

        intent.putExtra("result", result);

        startActivity(intent);

    }
}