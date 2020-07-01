package com.example.day5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText name = findViewById(R.id.editText);
        final EditText age = findViewById(R.id.editText2);
        final EditText job = findViewById(R.id.editText3);
        final EditText phone = findViewById(R.id.editText4);
        final EditText email = findViewById(R.id.editText5);
       final Button next = findViewById(R.id.button);
       final EditText pass = findViewById(R.id.editText7);
        final EditText confirmPass = findViewById(R.id.pass);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra( "info",name.getText().toString());
                i.putExtra("info1", age.getText().toString());
                i.putExtra( "info2",job.getText().toString());
                i.putExtra( "info3",phone.getText().toString());
                i.putExtra( "info4",email.getText().toString());

                if ( pass.getText().toString().equals(confirmPass.getText().toString())){
                    startActivity(i);
                }

                    else if (pass.getText().toString().equalsIgnoreCase(confirmPass.getText().toString())){
                        confirmPass.setTextColor(Color.rgb(255,0,0));
                }




                else { confirmPass.setTextColor(Color.rgb(255,0,0 ));
                        Toast.makeText(MainActivity.this,"PASSWORD ISN'T CORRECT",Toast.LENGTH_LONG).show();}


















            }
        });
    }
}
