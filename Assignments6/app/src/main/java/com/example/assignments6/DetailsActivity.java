package com.example.assignments6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        tv = findViewById(R.id.detailslbl);

        Bundle extras = getIntent().getExtras();
        assert extras != null;
        String[] array = extras.getStringArray("details_array");
        tv.setText("Name :" + array[0] +"\n"+ "Roll :" + array[1] +"\n"+ "Email :" + array[2] +"\n"+ "Password :" + array[3] +"\n"+
                "Phone :" + array[4] +"\n"+ "Gender :" + array[5] +"\n"+ "Branch :" + array[6] );
    }
}