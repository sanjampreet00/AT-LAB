package com.example.lab3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class CSE extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_s_e);
        Spinner s=findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.csesubjects, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);
        s.setOnItemSelectedListener(this);
    }
    String inp;
    public void Submit(View view)
    {
        EditText i_name=findViewById(R.id.editTextTextPersonName);
        String name=i_name.getText().toString();
        if(name.length()==0)
        {
            i_name.requestFocus();
            i_name.setError("Field cannot be EMPTY");
        }
        else {
            Intent in = new Intent(this, end.class);
            startActivity(in);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        inp = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}