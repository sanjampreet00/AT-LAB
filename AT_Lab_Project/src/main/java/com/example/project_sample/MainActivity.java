package com.example.project_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    EditText username,password;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=(EditText) findViewById(R.id.username1);
        password=(EditText) findViewById(R.id.password1);
        DB=new DBHelper(this);

    }

    public void LoginSucc(View v)
    {
        String user=username.getText().toString();
        String pass=password.getText().toString();

        if(user.equals(""))
        {
            username.requestFocus();
            username.setError("Enter Data");
        }else if(pass.equals(""))
        {
            password.requestFocus();
            password.setError("Enter PASSWORD");
        }else
        {
            Boolean checkuserpass=DB.checkusernamepassword(user,pass);
            if(checkuserpass==true)
            {
                Toast.makeText(MainActivity.this,"Sign-In Successful",Toast.LENGTH_SHORT).show();
                Intent in = new Intent(this, HomePage.class);
                startActivity(in);
            }else{
                Toast.makeText(MainActivity.this,"Invalid Credentials",Toast.LENGTH_SHORT).show();
            }
        }

    }

    public void SignUpForm(View v)
    {
        Intent in = new Intent(this, SignForm.class);
        startActivity(in);
    }

}