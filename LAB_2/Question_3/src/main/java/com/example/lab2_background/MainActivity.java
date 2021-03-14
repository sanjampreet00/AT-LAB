package com.example.lab2_background;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    public void buttonPress( View v) {

        switch(v.getId()) {

            case R.id.b1:
                ConstraintLayout curr = (ConstraintLayout) findViewById(R.id.cid);
                curr.setBackgroundColor(Color.parseColor("#CC32E6"));
                break;

            case R.id.b2:
                ConstraintLayout curr2= (ConstraintLayout) findViewById(R.id.cid);
                curr2.setBackgroundColor(Color.parseColor("#DFEF3D"));
                break;

            case R.id.b3:
                ConstraintLayout curr3= (ConstraintLayout) findViewById(R.id.cid);
                curr3.setBackgroundColor(Color.parseColor("#0C2CDF"));
                break;

            case R.id.b4:
                ConstraintLayout curr4 = (ConstraintLayout) findViewById(R.id.cid);
                curr4.setBackgroundColor(Color.parseColor("#EA0C0C"));
                break;

            case R.id.b5:
                ConstraintLayout curr5 = (ConstraintLayout) findViewById(R.id.cid);
                curr5.setBackgroundColor(Color.parseColor("#70B520"));
                break;



        }


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}