package com.example.lab3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class image4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image4);
    }

    public void next(View view)
    {
        Intent in=new Intent(this,image5.class);
        startActivity(in);

    }

    public void prev(View view)
    {
        Intent in=new Intent(this,image3.class);
        startActivity(in);
    }
}