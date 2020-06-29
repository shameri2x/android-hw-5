package com.example.day5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.lang.annotation.IncompleteAnnotationException;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final TextView name = findViewById(R.id.name);
        final TextView age = findViewById(R.id.age);
        final TextView job = findViewById(R.id.job);
        final TextView phone = findViewById(R.id.phone);
        final TextView email = findViewById(R.id.email);
        final TextView welc = findViewById(R.id.welc);



        Bundle i = getIntent().getExtras();
        name.setText(i.getString("info"));
        age.setText(i.getString("info1"));
        job.setText(i.getString("info2"));
        phone.setText(i.getString("info3"));
        email.setText(i.getString("info4"));

        welc.setText("welcome" + name);


        ImageButton back = findViewById(R.id.imageButton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(a);
            }

        });

        Button c = findViewById(R.id.button2);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ca = new Intent(Main2Activity.this,Main3Activity.class) ;
                startActivity(ca);
            }
        });

    }
};