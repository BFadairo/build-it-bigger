package com.example.android.joketellera;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class LibActivity extends AppCompatActivity {

    private TextView jokeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lib);

        jokeView = findViewById(R.id.joke_view);

        Intent libIntent = getIntent();

        String jokeFromLib = libIntent.getStringExtra("JOKE");

        jokeView.setText(jokeFromLib);
    }
}
