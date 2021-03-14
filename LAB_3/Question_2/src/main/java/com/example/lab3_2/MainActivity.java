package com.example.lab3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner s=findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.Departments, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);
        s.setOnItemSelectedListener(this);

    }

    String inp;
    @Override
    public boolean isDestroyed() {
        return super.isDestroyed();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        inp = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public static boolean isValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }

    public void Validate(View view)
    {
        EditText name=findViewById(R.id.Name);
        EditText mail=findViewById(R.id.email);
        EditText num=findViewById(R.id.regno);

        String n=name.getText().toString();
        String m=mail.getText().toString();
        String r=num.getText().toString();


        if(n.length()==0)
        {
            name.requestFocus();
            name.setError("Field cannot be EMPTY");
        }
        else if(!(isValid(m)))
        {
            mail.requestFocus();
            mail.setError("INVALID ID");
        }else if(r.length()==0)
        {
            num.requestFocus();
            num.setError("Field cannot be EMPTY");
        }else
        {
            if(inp.equals("CSE")) {
                Intent in = new Intent(this, CSE.class);
                startActivity(in);
            }else if(inp.equals("ICT"))
            {
                Intent in = new Intent(this, ICT.class);
                startActivity(in);
            }else if(inp.equals("EEE"))
            {
                Intent in = new Intent(this, EEE.class);
                startActivity(in);
            }else if(inp.equals("ECE"))
            {
                Intent in = new Intent(this, ECE.class);
                startActivity(in);
            }else if(inp.equals("Mech"))
            {
                Intent in = new Intent(this, Mech.class);
                startActivity(in);
            }

        }

    }
}