package com.example.lab_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        public void validate(View view)
    {
        EditText name=findViewById(R.id.Name);
        EditText profession=findViewById(R.id.Profession);
        EditText email=findViewById(R.id.Email);
        EditText phone=findViewById(R.id.Phone);
        EditText pass=findViewById(R.id.Password);

        String mail=email.getText().toString();
        String num=phone.getText().toString();
        String nam=name.getText().toString();
        String pa=pass.getText().toString();

        if(nam.length()==0)
        {
            name.requestFocus();
            name.setError("Field Cannot be EMPTY");
        }
        else if(!(isValid(mail)))
        {
            email.requestFocus();
            email.setError("INVALID E-mail ID");
        }
        else if(num.length()!=10)
        {
            phone.requestFocus();
            phone.setError("INVALID Number");
        }
        else if(pa.length()==0)
        {
            pass.requestFocus();
            pass.setError("Field Cannot be EMPTY");
        }

        else
        {
            Toast.makeText(MainActivity.this,"Validation Successful",Toast.LENGTH_LONG).show();
        }
    }
}