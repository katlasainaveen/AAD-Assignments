package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class register extends AppCompatActivity {

    TextView username, email, pass, phone;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = findViewById(R.id.username);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.password);
        phone = findViewById(R.id.phone);

        register = findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((username.getText().toString().isEmpty()) || (email.getText().toString().isEmpty()) || (pass.getText().toString().isEmpty()) || (phone.getText().toString().isEmpty())) {
                    Toast.makeText(register.this, "The reqiured fields are empty", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(register.this, "Success", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}