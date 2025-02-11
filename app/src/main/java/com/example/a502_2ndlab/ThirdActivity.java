package com.example.a502_2ndlab;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        TextView textView = findViewById(R.id.textView);

        Intent intent = getIntent();
        String text = intent.getStringExtra("text");

        if (text != null) {
            textView.setText(text);
        }
    }
}