package com.example.lab2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void encry(View view)
    {
        EditText tex= findViewById(R.id.Text);

        String str=tex.getText().toString();
        StringBuilder text=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char c=(char) (str.charAt(i) +1);
            text.append(c);
        }

        TextView v=findViewById(R.id.View);
        v.setText(text.toString());
    }
}