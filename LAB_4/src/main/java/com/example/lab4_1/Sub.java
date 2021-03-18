package com.example.lab4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Sub extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent in=getIntent();
        int i=in.getIntExtra(MainActivity.VAL,0);

        TextView t=findViewById(R.id.textView);
        String s= String.valueOf(i);
        t.setText("Your Score is " +s);
    }
}