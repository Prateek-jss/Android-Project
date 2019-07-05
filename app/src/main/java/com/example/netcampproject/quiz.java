package com.example.netcampproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class quiz extends AppCompatActivity {

    TextView t1;
    Button b1;
    RadioButton r1,r2,r3,r4;
    static int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        t1=(TextView)findViewById(R.id.textView101);
        b1=(Button)findViewById(R.id.button101);
        r1=(RadioButton)findViewById(R.id.radioButton101);
        r2=(RadioButton)findViewById(R.id.radioButton102);
        r3=(RadioButton)findViewById(R.id.radioButton103);
        r4=(RadioButton)findViewById(R.id.radioButton104);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score=0;
                if(r2.isChecked())
                {
                    ++score;
                }
                else --score;
                Intent i =new Intent(quiz.this,quiz2.class);
                startActivity(i);
                finish();
            }
        });



    }
}
