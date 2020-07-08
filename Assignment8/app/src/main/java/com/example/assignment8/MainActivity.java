package com.example.assignment8;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.share:
                Toast.makeText(this, "share", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_TEXT, "Share");
                i.setType("text/plain");
                Intent z = Intent.createChooser(i, "Share");
                startActivity(z);
                return true;

            case R.id.dail:
                Toast.makeText(this, "dail", Toast.LENGTH_SHORT).show();
                Intent j = new Intent(Intent.ACTION_DIAL);
                j.setData(Uri.parse("tel:9876543210"));
                startActivity(j);
                return true;

            case R.id.gallery:
                Toast.makeText(this, "gallery", Toast.LENGTH_SHORT).show();
                Intent b = new Intent(Intent.ACTION_GET_CONTENT);
                b.setType("image/*");
                startActivityForResult(b, 11);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}