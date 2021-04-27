package com.example.project_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignForm extends AppCompatActivity {

    EditText username, password, repassword;
    Button signup;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_form);

        username=(EditText) findViewById(R.id.username);
        password=(EditText) findViewById(R.id.password);
        repassword=(EditText) findViewById(R.id.repassword);

        signup=(Button) findViewById(R.id.btnsignup);
        DB=new DBHelper(this);

        signup.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String user=username.getText().toString();
                String pass=password.getText().toString();
                String repass=repassword.getText().toString();

                if(user.equals(""))
                {
                    username.requestFocus();
                    username.setError("Field cannot be EMPTY");
                }
                else if(pass.equals(""))
                {
                    password.requestFocus();
                    password.setError("Field cannot be EMPTY");
                }else if(repass.equals(""))
                {
                    repassword.requestFocus();
                    repassword.setError("Field cannot be EMPTY");
                }else {
                    if (pass.equals(repass)){
                        Boolean checkuser=DB.checkusername(user);
                        if(checkuser==false)
                        {
                            Boolean insert=DB.insertData(user,pass);
                            if(insert==true)
                            {
                                Toast.makeText(SignForm.this,"Registered Successfully",Toast.LENGTH_SHORT).show();
                                Intent intent =new Intent(getApplicationContext(),HomePage.class);
                                startActivity(intent);
                            }else{
                                Toast.makeText(SignForm.this,"Registration Failed",Toast.LENGTH_SHORT).show();
                            }
                        }else
                        {
                            Toast.makeText(SignForm.this,"User already Exists",Toast.LENGTH_SHORT).show();
                            finish();
                        }
                    }else{
                        repassword.requestFocus();
                        repassword.setError("Passwords don't MATCH");
                    }
                }
            }
        });

    }
}