package com.example.netcampproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class quiz7 extends AppCompatActivity {

    Button b1,b2;
    WebView w1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz7);

        b1=(Button)findViewById(R.id.button110);
        b2=(Button)findViewById(R.id.button400);
        w1=(WebView)findViewById(R.id.webview101);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(quiz7.this,Third.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(quiz7.this,quiz6.class);
                startActivity(i);
                finish();
            }
        });

        w1.loadUrl(quiz6.s);
    }
}
