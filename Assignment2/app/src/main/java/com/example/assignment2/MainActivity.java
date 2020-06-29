package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button a1, a2, a3, b1, b2, b3, reset;
    TextView a, b;
    int a_score = 0, b_score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a1 = findViewById(R.id.A_add1);
        a2 = findViewById(R.id.A_add2);
        a3 = findViewById(R.id.A_add3);

        b1 = findViewById(R.id.B_add1);
        b2 = findViewById(R.id.B_add2);
        b3 = findViewById(R.id.B_add3);

        reset = findViewById(R.id.reset);

        a = findViewById(R.id.team_a_score);
        b = findViewById(R.id.team_b_score);

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a_score++;
                a.setText(""+a_score);
            }
        });

        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a_score = a_score + 2;
                a.setText(""+a_score);
            }
        });

        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a_score = a_score + 3;
                a.setText(""+a_score);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b_score++;
                b.setText(""+b_score);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b_score = b_score + 2;
                b.setText(""+b_score);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b_score = b_score + 3;
                b.setText(""+b_score);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a_score = 0;
                b_score = 0;
                a.setText(""+a_score);
                b.setText(""+b_score);
                Toast.makeText(MainActivity.this, "Scores reset", Toast.LENGTH_SHORT).show();
            }
        });
    }
}