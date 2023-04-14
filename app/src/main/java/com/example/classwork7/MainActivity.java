package com.example.classwork7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn;
    WebView wb;
    EditText et;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        wb = findViewById(R.id.wb);
        et = findViewById(R.id.et);

    }

    public void go(View view) {
        String url = et.getText().toString();
        wb.loadUrl(url);

    }
}