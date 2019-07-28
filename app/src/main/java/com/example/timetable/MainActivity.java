package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void first(View view) {
        startActivity(new Intent(this,Main2Activity.class));
    }

    public void second(View view) {
        startActivity(new Intent(this,Main3Activity.class));
    }

    public void third(View view) {
        startActivity(new Intent(this,Main4Activity.class));
    }

    public void fourth(View view) {
        startActivity(new Intent(this,Main5Activity.class));
    }

    public void fifth(View view) {
        startActivity(new Intent(this,Main6Activity.class));
    }
}
