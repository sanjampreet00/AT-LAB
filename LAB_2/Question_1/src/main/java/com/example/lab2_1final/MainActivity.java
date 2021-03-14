package com.example.lab2_1final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String res=" ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OnClick(View view)
    {
        if(view.getId() == R.id.c1)
        {
            res = res + "Tomato ";
        }
        if(view.getId() == R.id.c2)
        {
            res = res + "Potato ";
        }
        if(view.getId() == R.id.c3)
        {
            res = res + "Chilli ";
        }
        if(view.getId() == R.id.c4)
        {
            res = res + "Garlic ";
        }
        if(view.getId() == R.id.c5)
        {
            res = res + "Cabbage ";
        }
        if(view.getId() == R.id.c6)
        {
            res = res + "Onion ";
        }
        if(view.getId() == R.id.c7)
        {
            res = res + "Carrot ";
        }
        if(view.getId() == R.id.c8)
        {
            res = res + "Capsicum ";
        }
    }

    public void Order(View view)
    {
        if(res.length() !=0)
            Toast.makeText(MainActivity.this,res,Toast.LENGTH_LONG).show();
        else
            Toast.makeText(MainActivity.this,"0 items selected",Toast.LENGTH_LONG).show();
        res = "";

    }

}