package com.example.netcampproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class quiz5 extends AppCompatActivity {

    Button b1;
    TextView t1;
    RadioButton r1,r2,r3,r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz5);

        t1=(TextView)findViewById(R.id.textView105);
        b1=(Button)findViewById(R.id.button105);
        r1=(RadioButton)findViewById(R.id.radioButton117);
        r2=(RadioButton)findViewById(R.id.radioButton118);
        r3=(RadioButton)findViewById(R.id.radioButton119);
        r4=(RadioButton)findViewById(R.id.radioButton120);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(r3.isChecked()) ++quiz.score;
                else --quiz.score;

                Intent i=new Intent(quiz5.this,quiz6.class);
                startActivity(i);
                finish();

            }
        });
    }
}
