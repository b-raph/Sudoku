package com.android.paris8.sudoku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Rules extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(Rules.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
