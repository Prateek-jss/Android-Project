package com.example.netcampproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class Magical extends AppCompatActivity implements SensorEventListener {
    Button b1;
    MediaPlayer mp;
    SensorManager sm;
    Sensor s;
    ImageView i1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magical);
        b1=(Button)findViewById(R.id.back900);
        i1=(ImageView)findViewById(R.id.imageView9);
        t1=(TextView)findViewById(R.id.textView2);
        mp=MediaPlayer.create(this,R.raw.z);
        sm=(SensorManager)getSystemService(SENSOR_SERVICE);
        s=sm.getDefaultSensor(Sensor.TYPE_LIGHT);
        sm.registerListener(this,s,SensorManager.SENSOR_DELAY_NORMAL);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii=new Intent(Magical.this,Third.class);
                startActivity(ii);
                finish();
            }
        });
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if(event.values[0]>3)
        {
            mp.start();
        }
        else
        {
            mp.pause();
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}

