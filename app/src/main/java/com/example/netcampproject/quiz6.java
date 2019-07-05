package com.example.netcampproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class quiz6 extends AppCompatActivity {

    TextView t1;
    Button b1,b2,b3,b4;
    static  String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz6);

        t1=(TextView)findViewById(R.id.textView106);
        b1=(Button)findViewById(R.id.button106);
        b2=(Button)findViewById(R.id.button107);
        b3=(Button)findViewById(R.id.button108);
        b4=(Button)findViewById(R.id.button109);

        t1.setText("YOUR SCORE IS  "+ quiz.score);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(quiz6.this,Third.class);
                startActivity(i);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s="https://www.facebook.in";
                Intent i=new Intent(quiz6.this,quiz7.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s="https://www.google.co.in";
                Intent i=new Intent(quiz6.this,quiz7.class);
                startActivity(i);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s="https://www.netcamp.in";
                Intent i=new Intent(quiz6.this,quiz7.class);
                startActivity(i);
                finish();
            }
        });
    }
}
