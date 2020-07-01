package com.example.day5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Address;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.annotation.IncompleteAnnotationException;

public class Main2Activity extends AppCompatActivity {

    private Object Address;
    private Object String;
    private Intent intent;

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
        final ImageView picture = findViewById(R.id.imageView);



        Bundle i = getIntent().getExtras();
        name.setText(i.getString("info"));
        age.setText(i.getString("info1"));
        job.setText(i.getString("info2"));
        phone.setText(i.getString("info3"));
        email.setText(i.getString("info4"));



        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail = email.getText().toString();
                Intent mail2 = new Intent(Intent.ACTION_SEND);
                mail2.setType("message/rfc822");
                mail2.putExtra(Intent.EXTRA_EMAIL,new String[]{mail});
                mail2.setPackage("com.google.android.gm");
                startActivity(mail2);
            }
        });

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String phonee = phone.getText().toString();
               Intent call = new Intent(Intent.ACTION_DIAL);
               call.setData(Uri.parse("tel:"+phone));
               startActivity(call);

            }
        });



        welc.setText("Welcome " + name.getText().toString() + " !!");



        Button back = findViewById(R.id.button);
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