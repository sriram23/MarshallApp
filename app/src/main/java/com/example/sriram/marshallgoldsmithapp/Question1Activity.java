package com.example.sriram.marshallgoldsmithapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class Question1Activity extends AppCompatActivity {
    Switch swi;
    Button back1, next1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        swi = (Switch) findViewById(R.id.Switch_Ques_1);
        back1 = (Button) findViewById(R.id.Button_back1);
        next1 = (Button) findViewById(R.id.Button_next1);
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
        back1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Question1Activity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
        next1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Question1Activity.this,Question2Activity.class);
                startActivity(intent);
            }
        });
    }
}