package com.example.assignment7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button menu = findViewById(R.id.menu_);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popup = new PopupMenu(MainActivity.this, view);
                popup.setOnMenuItemClickListener(MainActivity.this);
                popup.inflate(R.menu.my_menu);
                popup.show();
            }
        });
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.item1:
                Toast.makeText(this, "item 1", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(this, "item 2", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Toast.makeText(this, "item 3", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item4:
                Toast.makeText(this, "item 4", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }
    }
}