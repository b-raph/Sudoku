package com.android.paris8.sudoku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }


    @Override
    public void onBackPressed() {
        Intent i = new Intent(About.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
