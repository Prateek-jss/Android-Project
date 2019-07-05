package com.example.netcampproject;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class quiz4 extends AppCompatActivity {

    Button b1;
    TextView t1;
    RadioButton r1,r2,r3,r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4);

        t1=(TextView)findViewById(R.id.textView104);
        b1=(Button)findViewById(R.id.button104);
        r1=(RadioButton)findViewById(R.id.radioButton113);
        r2=(RadioButton)findViewById(R.id.radioButton114);
        r3=(RadioButton)findViewById(R.id.radioButton115);
        r4=(RadioButton)findViewById(R.id.radioButton116);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r1.isChecked()) ++quiz.score;
                else --quiz.score;

                Intent i=new Intent(quiz4.this,quiz5.class);
                startActivity(i);
                finish();
            }
        });
    }
}
