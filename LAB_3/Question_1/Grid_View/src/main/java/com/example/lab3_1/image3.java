package com.example.lab3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class image3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image3);
    }

    public void next(View view)
    {
        Intent in=new Intent(this,image4.class);
        startActivity(in);

    }

    public void prev(View view)
    {
        Intent in=new Intent(this,image2.class);
        startActivity(in);
    }
}