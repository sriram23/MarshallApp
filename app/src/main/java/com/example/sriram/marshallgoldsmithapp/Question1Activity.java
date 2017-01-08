package com.example.sriram.marshallgoldsmithapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

public class Question1Activity extends AppCompatActivity {
    Switch swi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        swi = (Switch) findViewById(R.id.Switch_Ques_1);
        swi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {

                if (isChecked) {
                    swi.setText("YES");
                    swi.setTextColor(Color.GREEN);
                } else {
                    swi.setText("NO");
                    swi.setTextColor(Color.RED);
                }

            }
        });
    }
}