package com.example.dslab.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static EditText username;
    public  static EditText pwd;
    public static Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText)findViewById(R.id.user_name);
        pwd=(EditText)findViewById(R.id.user_pwd);
        login=(Button)findViewById(R.id.login);


    }
    public void launchSecondActivity(View view)
    {
        if(username.getText().toString().equals("Parul")&& pwd.getText().toString().equals("1111")) {
            Intent intent = new Intent(this, Successful_loginPage.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(this, "Invalid User name orPassword", Toast.LENGTH_LONG).show();
        }
        }
    }


