package com.example.evaluation_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner);

        arrayList.add("i1");
        arrayList.add("i2");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,                         android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
    }

    public void addEle(View view)
    {
        EditText e=findViewById(R.id.editTextTextPersonName);
        String str=e.getText().toString();
        arrayList.add(str);
    }

    public void remEle(View view)
    {
        EditText e=findViewById(R.id.editTextTextPersonName);
        String str=e.getText().toString();
        arrayList.remove(str);
    }
}