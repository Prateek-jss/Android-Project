package com.example.netcampproject;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.net.MulticastSocket;

public class Third extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6;
    ImageView i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third2);
        b1=(Button)findViewById(R.id.button30);
        b2=(Button)findViewById(R.id.button31);
        b3=(Button)findViewById(R.id.button32);
        b4=(Button)findViewById(R.id.button33);
        b5=(Button)findViewById(R.id.button34);
        i=(ImageView)findViewById(R.id.imageView30);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Third.this,MainActivity.class);
                startActivity(i1);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(Third.this, MusicPlayer.class);
                startActivity(i2);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(Third.this,Calculator.class);
                startActivity(i3);
                finish();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4=new Intent(Third.this,Fifth.class);
                startActivity(i4);
                finish();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5=new Intent(Third.this,Fourth.class);
                startActivity(i5);
                finish();
            }
        });

    }
}
