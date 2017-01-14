package com.example.sriram.marshallgoldsmithapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

public class Question2Activity extends AppCompatActivity {
    Switch swi2;
    Button back2, next2;
    SeekBar s1;
    TextView t1;
    String seekValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        swi2 = (Switch) findViewById(R.id.Switch_Ques_2);
        back2 = (Button) findViewById(R.id.Button_back2);
        next2 = (Button) findViewById(R.id.Button_next2);
        t1 = (TextView) findViewById(R.id.seek_txt);
        s1 = (SeekBar) findViewById(R.id.seekBar1);
//        s1.setOnSeekBarChangeListener(this);
        s1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                t1.setText("How much you are satisfied?"+Integer.toString(progress)+"%");
                seekBar.setMax(100);
            }
        });
        seekValue = Integer.toString(s1.getProgress());
        swi2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {

                if (isChecked) {
                    swi2.setText("YES");
                    swi2.setTextColor(Color.GREEN);
                    s1.setVisibility(View.VISIBLE);
                    t1.setVisibility(View.VISIBLE);
                } else {
                    swi2.setText("NO");
                    swi2.setTextColor(Color.RED);
                    s1.setVisibility(View.GONE);
                    t1.setVisibility(View.GONE);
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
