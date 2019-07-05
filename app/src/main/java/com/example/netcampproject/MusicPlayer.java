package com.example.netcampproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class MusicPlayer extends AppCompatActivity {

    Button b1,b2,b3;
    MediaPlayer mp,mp1,mp2;
    ImageView i1;
    RadioButton r1,r2,r3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        r1=(RadioButton)findViewById(R.id.radioButton);
        r2=(RadioButton)findViewById(R.id.radioButton2);
        r3=(RadioButton)findViewById(R.id.radioButton3);
        i1=(ImageView)findViewById(R.id.imageView);
        b3=(Button)findViewById(R.id.back2);

        mp=MediaPlayer.create(this,R.raw.dilli);
        mp1=MediaPlayer.create(this,R.raw.kabira);
        mp2=MediaPlayer.create(this,R.raw.thumakda);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (r1.isChecked()) {
                    mp.start();
                }
                if (r2.isChecked()) {
                    mp1.start();
                }
                if (r3.isChecked()) {
                    mp2.start();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
                mp1.pause();
                mp2.pause();
                Intent i =new Intent(MusicPlayer.this,MusicPlayer.class);
                startActivity(i);
                finish();

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MusicPlayer.this,Third.class);
                startActivity(i);
                finish();
            }
        });


    }
}
