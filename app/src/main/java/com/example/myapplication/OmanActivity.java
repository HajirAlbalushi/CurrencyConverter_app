package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class OmanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oman);
    }


        @SuppressLint("DefaultLocale")
        public void convertmoney (View view) {
            EditText editTextNumber = (EditText)findViewById(R.id.editTextNumber);
            double dollarValue = Double.parseDouble(editTextNumber.getText().toString());
            Double realValue = dollarValue * 0.384;
            Toast.makeText(OmanActivity.this, String.format("%.2f", realValue)+ "OMANI REAL", Toast.LENGTH_SHORT).show();
        }
    }
