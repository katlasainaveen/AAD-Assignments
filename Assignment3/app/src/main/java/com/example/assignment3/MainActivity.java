package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login, register;
    TextView username, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        pass = findViewById(R.id.password);

        pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((username.getText().toString().isEmpty()) || (pass.getText().toString().isEmpty())) {
                    Toast.makeText(MainActivity.this, "The reqiured fields are empty", Toast.LENGTH_SHORT).show();
                } else {

                }
            }
        });

        register = findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, register.class);
                startActivity(i);
            }
        });

        login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((username.getText().toString().isEmpty()) || (pass.getText().toString().isEmpty())) {
                    Toast.makeText(MainActivity.this, "The reqiured fields are empty", Toast.LENGTH_SHORT).show();
                } else {
                    String name = username.getText().toString();;
                    Intent i = new Intent(MainActivity.this, Welcome_screen.class);
                    i.putExtra("username", name);
                    startActivity(i);
                }
            }
        });

    }
}