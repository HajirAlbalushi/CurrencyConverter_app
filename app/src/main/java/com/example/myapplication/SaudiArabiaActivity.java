package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SaudiArabiaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saudi_arabia);
    }
    @SuppressLint("DefaultLocale")
    public void ConvertMoney(View view) {
            EditText editTextNumber2 = (EditText)findViewById(R.id.editTextNumber2);
            double dollarValue = Double.parseDouble(editTextNumber2.getText().toString());
            Double realValue = dollarValue * 3.75;
            Toast.makeText(SaudiArabiaActivity.this, String.format("%.2f", realValue)+ "SAUDI REAL", Toast.LENGTH_SHORT).show();
        }
    }
