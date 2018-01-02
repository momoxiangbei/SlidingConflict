package com.haha.mmxb.slidingconflict;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void one(View view) {
        Intent i = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(i);
    }
}
