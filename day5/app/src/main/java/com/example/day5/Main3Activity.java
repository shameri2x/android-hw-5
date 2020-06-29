package com.example.day5;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Main3Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        final EditText quiz = findViewById(R.id.editText);
        final EditText homework = findViewById(R.id.editText2);
        final EditText mid = findViewById(R.id.editText3);
        final EditText Final = findViewById(R.id.editText4);
        final TextView result = findViewById(R.id.textView6);
        final    Button calc = findViewById(R.id.button2);
        final Button reset = findViewById(R.id.button);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num  = quiz.getText().toString();
                String num2 = homework.getText().toString();
                String num3  = mid.getText().toString();
                String num4 = Final.getText().toString();

                Double n1 = Double.parseDouble(num);
                Double n2 = Double.parseDouble(num2);
                Double n3 = Double.parseDouble(num3);
                Double n4 = Double.parseDouble(num4);

                double a = n1 + n2 + n3 + n4 ;
                result.setText(String.valueOf(student(a)));
                color(student(a));


            }
        });



        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                quiz.setText("");
                homework.setText("");
                mid.setText("");
                Final.setText("");
                result.setText("");

            }
        });

    }
    public static char student (double x)
    {
        if (( x < 60) && (0 < x))
        {
            return 'F';
        }

        else if (( x < 70) && (0 < x))
        {
            return 'D' ;
        }

        else if ((x < 80 ) && (0 < x))
        {

            return 'C' ;
        }
        else if ((x < 90) && (0 < x))
        {

            return 'B' ;
        }
        else if ((x <= 100)&& (0 < x))
        {
            return 'A' ;
        }

        else { return 'E' ;}






    }

    public  void color (char grade){
        TextView result = findViewById(R.id.textView6);

        if ( 'A' == grade ){
            result.setTextColor(Color.rgb(0, 255,0));}
        else if ('B' == grade ){
            result.setTextColor(Color.rgb(255, 255,0)); }
        else if ( 'C'== grade ){
            result.setTextColor(Color.rgb(0, 0,255));}
        else if ( 'D'== grade){
            result.setTextColor(Color.rgb(127, 0,255));}
        else if ( 'F' == grade){
            result.setTextColor(Color.rgb(255, 0,0));}
        else {  result.setTextColor(Color.rgb(255, 128,0));} }






};





