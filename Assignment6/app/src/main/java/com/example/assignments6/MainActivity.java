package com.example.assignments6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    EditText name, roll, email, pass, phone;
    Button submit;
    Spinner branch;
    RadioGroup rg;
    RadioButton rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        roll = findViewById(R.id.roll);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.password);
        phone = findViewById(R.id.phone);

        branch = findViewById(R.id.branch);

        rg = findViewById(R.id.radioGroup);

        submit = findViewById(R.id.submit);

        ArrayAdapter<CharSequence> aa = ArrayAdapter.createFromResource(MainActivity.this, R.array.branch, android.R.layout.simple_spinner_item);
        branch.setAdapter(aa);

        branch.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        Toast.makeText(MainActivity.this, "Select a branch", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(MainActivity.this, "Select a branch", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void submit_tapped(View view) {
        String ans = branch.getSelectedItem().toString();
        if (name.getText().toString().isEmpty() || roll.getText().toString().isEmpty() || email.getText().toString().isEmpty() || pass.getText().toString().isEmpty() || phone.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "Required details missing", Toast.LENGTH_SHORT).show();
        }
        else {
            String n = name.getText().toString();
            String r = roll.getText().toString();
            String e = email.getText().toString();
            String p = pass.getText().toString();
            String ph = phone.getText().toString();

            int pos = rg.getCheckedRadioButtonId();
            rb = findViewById(pos);

            String gender = rb.getText().toString();
            String array[] = {n, r, e, p, ph, gender, ans};
            Intent i = new Intent(MainActivity.this, DetailsActivity.class);
            i.putExtra("details_array", array);
            startActivity(i);
        }
    }


}