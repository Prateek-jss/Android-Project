package com.example.netcampproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class quiz3 extends AppCompatActivity {

    TextView t1;
    Button b1;
    RadioButton r1,r2,r3,r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);

        t1=(TextView)findViewById(R.id.textView103);
        b1=(Button)findViewById(R.id.button103);
        r1=(RadioButton)findViewById(R.id.radioButton109);
        r2=(RadioButton)findViewById(R.id.radioButton110);
        r3=(RadioButton)findViewById(R.id.radioButton111);
        r4=(RadioButton)findViewById(R.id.radioButton112);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r4.isChecked()) ++quiz.score;
                else --quiz.score;

                Intent i=new Intent(quiz3.this,quiz4.class);
                startActivity(i);
                finish();
            }
        });
    }
}
