package com.example.netcampproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Fifth extends AppCompatActivity {

    Button b1,b2;
    ImageView i,i2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        b1=(Button)findViewById(R.id.back19);
        b2=(Button)findViewById(R.id.capture);
        i = (ImageView) findViewById(R.id.imageView);
        i2 = (ImageView) findViewById(R.id.imageView1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(Fifth.this, Third.class);
                startActivity(ii);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(k, 0);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap b = (Bitmap) data.getExtras().get("data");
        i.setImageBitmap(b);
    }
}
