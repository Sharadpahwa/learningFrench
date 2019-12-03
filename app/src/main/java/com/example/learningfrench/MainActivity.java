package com.example.learningfrench;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.CaseMap;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import java.nio.channels.InterruptedByTimeoutException;

public class MainActivity extends AppCompatActivity {

    Button btnRegister;
    TextView tvLogin;
    public Toolbar toolbar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Boolean customTitleSupported = requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_main);

//        toolbar1 = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar1);
//        toolbar1.setTitle("Home Page");

        btnRegister = findViewById(R.id.btnRegister);
        tvLogin = findViewById(R.id.tvLogin);


        toolbar1 = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar1);
        toolbar1.setTitle("HOME PAGE");
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Registered Successfully", Toast.LENGTH_LONG).show();
                Intent intent1 = new Intent(MainActivity.this, loginUser.class);
                startActivity(intent1);
            }
        });
    }


}
