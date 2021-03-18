package com.example.lab4_1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public static final String VAL="com.example.lab4_1.VAL";
    int i=0;

    public void onRadioButtonClicked(View view)
    {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.r3:
                if (checked) {
                    i++;
                }
                break;
            case R.id.r7:
                if (checked) {
                    i++;
                }
                break;
            case R.id.r10:
                if (checked) {
                    i++;
                }
                break;
            case R.id.r12:
                if (checked) {
                    i++;
                }
                break;
            case R.id.r16:
                if (checked) {
                    i++;
                }
                break;
        }
    }

    public void onclick(View v)
    {

        alert("Are you sure?");
    }

    public void openActivity()
    {
        Intent in = new Intent(this, Sub.class);
        in.putExtra(VAL,i);
        startActivity(in);
    }

    private void alert (String message)
    {
        AlertDialog dig = new AlertDialog.Builder(MainActivity.this)
                .setTitle("Confirmation")
                .setMessage(message)
                .setPositiveButton("YES", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick  (DialogInterface dialog, int which) {
                        openActivity();
                    }
                } )
                .setNegativeButton("NO", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                } )
                .create();
        dig.show();

    }
}
