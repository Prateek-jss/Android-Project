package com.example.netcampproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Fourth extends AppCompatActivity {
    Button b1,b2,b3,b4;
    ImageView i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        b1=(Button)findViewById(R.id.button40);
        b2=(Button)findViewById(R.id.button41);
        b3=(Button)findViewById(R.id.button42);
        b4=(Button)findViewById(R.id.prev);
        i=(ImageView)findViewById(R.id.imageView40);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Fourth.this,MainActivity.class);
                startActivity(i1);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(Fourth.this,quiz.class);
                startActivity(i2);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(Fourth.this,Magical.class);
                startActivity(i3);
                finish();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4=new Intent(Fourth.this,Third.class);
                startActivity(i4);
                finish();
            }
        });
    }
}

