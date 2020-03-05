package com.example.lesson3ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random rnd;
    int num1;
    int num2;
    Button clear;
    Button worth;
    Button bigger;
    Button smaller;
    Button press;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
