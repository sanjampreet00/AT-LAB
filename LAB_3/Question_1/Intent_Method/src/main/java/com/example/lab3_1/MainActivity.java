package com.example.lab3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    ArrayList<Integer> images =new ArrayList<>(Arrays.asList(R.drawable.i1,R.drawable.i2,R.drawable.i3,
            R.drawable.i4,R.drawable.i5,R.drawable.i6,
            R.drawable.i7,R.drawable.i8,R.drawable.i9,
            R.drawable.i10,R.drawable.i11,R.drawable.i12));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridview =findViewById(R.id.myGrid);
        gridview.setAdapter(new ImageAdapter(images,this));

    }
}