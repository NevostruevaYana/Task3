package com.example.task3.task3_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.widget.Button;

import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;

import com.example.task3.ActivityAbout;
import com.example.task3.R;

public class Activity2 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(this);
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent = new Intent(this, ActivityAbout.class);
        startActivity(intent);
        return true;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.button1:
                finish();
                break;
            case R.id.button2:
                Intent intent = new Intent(this, Activity3.class);
                startActivityForResult(intent, 2);
                break;
            default:
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == 1) {
            finish();
        }
    }
}
