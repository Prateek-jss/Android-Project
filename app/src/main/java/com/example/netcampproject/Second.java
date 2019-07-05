package com.example.netcampproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Second extends AppCompatActivity {
Button b1,b2;
EditText e1,e2,e3,e4,e5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        b1=(Button)findViewById(R.id.back1);
        b2=(Button)findViewById(R.id.sign);
        e1=(EditText)findViewById(R.id.name);
        e2=(EditText)findViewById(R.id.pass);
        e3=(EditText)findViewById(R.id.mail);
        e4=(EditText)findViewById(R.id.city);
        e5=(EditText)findViewById(R.id.phone);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Second.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                String s3=e3.getText().toString();
                String s4=e4.getText().toString();
                String s5=e5.getText().toString();

                if(s1.equals("") || s2.equals("") || s3.equals("") || s4.equals("") || s5.equals(""))
                {
                    Toast.makeText(Second.this, "Please fill all the fields", Toast.LENGTH_SHORT).show();
                }
                else {
                    SQLiteDatabase db=openOrCreateDatabase("netcamp",MODE_PRIVATE,null);
                    db.execSQL("create table if not exists diya (name varchar ,password varchar,email varchar,city varchar,phone varchar)");

                    String s6="select * from diya where name='"+s1+"' and email='"+s3+"'";
                    Cursor cursor=db.rawQuery(s6,null);

                    if(cursor.getCount()>0){
                        Toast.makeText(Second.this, "User already exists", Toast.LENGTH_SHORT).show();
                        Intent i= new Intent(Second.this,MainActivity.class);
                        startActivity(i);
                        finish();
                    }
                    else{
                        db.execSQL("insert into diya values ('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')");
                        Toast.makeText(Second.this, "Sign Up successful", Toast.LENGTH_SHORT).show();
                        Intent i=new Intent(Second.this,MainActivity.class);
                        startActivity(i);
                        finish();
                    }
                }
            }
        });
    }
}

