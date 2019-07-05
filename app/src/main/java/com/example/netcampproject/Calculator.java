package com.example.netcampproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6;
    TextView t1;
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        b1 = (Button)findViewById(R.id.back4);
        b2 = (Button)findViewById(R.id.add);
        b3 = (Button)findViewById(R.id.sub);
        b4 = (Button)findViewById(R.id.mul);
        b5 = (Button)findViewById(R.id.div);
        b6 = (Button)findViewById(R.id.reset);

        t1 = (TextView)findViewById(R.id.textView2);

        e1 = (EditText)findViewById(R.id.value1);
        e2 = (EditText)findViewById(R.id.value2);

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("");
                e2.setText("");
                t1.setText("");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double d1 = Double.parseDouble(e1.getText().toString());
                Double d2 = Double.parseDouble(e2.getText().toString());
                Double d3 = d1 + d2;
                String s3 = Double.toString(d3);
                t1.setText(s3);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double d1 = Double.parseDouble(e1.getText().toString());
                Double d2 = Double.parseDouble(e2.getText().toString());
                Double d3 = d1 - d2;
                String s3 = Double.toString(d3);
                t1.setText(s3);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double d1 = Double.parseDouble(e1.getText().toString());
                Double d2 = Double.parseDouble(e2.getText().toString());
                Double d3 = d1 * d2;
                String s3 = Double.toString(d3);
                t1.setText(s3);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double d1 = Double.parseDouble(e1.getText().toString());
                Double d2 = Double.parseDouble(e2.getText().toString());
                Double d3 = d1 / d2;
                String s3 = Double.toString(d3);
                t1.setText(s3);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Calculator.this,Third.class);
                startActivity(i);
                finish();
            }
        });
    }
}