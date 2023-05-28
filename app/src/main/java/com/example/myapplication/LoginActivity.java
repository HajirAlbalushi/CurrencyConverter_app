
package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    Button omanBtn;
    Button saudiBtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        omanBtn = findViewById(R.id.omanBtn);
        saudiBtn = findViewById(R.id.saudiBtn);
    }

    public void go(View view) {
        Intent intent = new Intent(LoginActivity.this, OmanActivity.class);
        startActivities(new Intent[]{intent});
    }

    public void Go(View view) {
        Intent intent = new Intent(LoginActivity.this, SaudiArabiaActivity.class);
        startActivities(new Intent[]{intent});

    }


}