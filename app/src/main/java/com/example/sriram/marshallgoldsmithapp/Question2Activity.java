package com.example.sriram.marshallgoldsmithapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class Question2Activity extends AppCompatActivity {
    Switch swi2;
    Button back2, next2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        swi2 = (Switch) findViewById(R.id.Switch_Ques_2);
        back2 = (Button) findViewById(R.id.Button_back2);
        next2 = (Button) findViewById(R.id.Button_next2);
        swi2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {

                if (isChecked) {
                    swi2.setText("YES");
                    swi2.setTextColor(Color.GREEN);
                } else {
                    swi2.setText("NO");
                    swi2.setTextColor(Color.RED);
                }

            }
        });
        back2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Question2Activity.this,Question1Activity.class);
                startActivity(intent);
            }
        });
        next2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Question2Activity.this,Question3Activity.class);
                startActivity(intent);
            }
        });
    }
}
