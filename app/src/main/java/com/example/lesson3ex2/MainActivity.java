package com.example.lesson3ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random rnd;
    int counteraccurate;
    float countervalue;
    int num1;
    int num2;
    Button clear;
    Button worth;
    Button bigger;
    Button smaller;
    Button press;
    boolean click;
    TextView counter;
    TextView accurate;
    TextView number1;
    TextView number2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=0;
        counteraccurate=0;
        num2=0;
        countervalue=0;
        click=false;
        rnd=new Random();
        clear=(Button) findViewById(R.id.clear);
        counter = (TextView) findViewById(R.id.counter);
        press= (Button) findViewById(R.id.press);
        bigger=(Button) findViewById(R.id.bigger);
        smaller=(Button) findViewById(R.id.smaller);
        worth=(Button) findViewById(R.id.worth);
        number1=(TextView) findViewById(R.id.firstnumber);
        number2=(TextView) findViewById(R.id.secondnumber);
        accurate=(TextView) findViewById(R.id.trueFalse);


    }

    public void setnumber(View view) {
        click=true;
        num1=rnd.nextInt(20);
        num2=rnd.nextInt(20);
        number1.setText(String.valueOf(num1));
        number2.setText(String.valueOf(num2));
    }

    public void big(View view) {
        if (click==true) {
            countervalue++;
        }
        if ((click==true) && (num2>num1))
        {
            counteraccurate++;
        }
        counter.setText(String.valueOf(counteraccurate/countervalue));
        if (num2>num1)
        {
            accurate.setText("true");
        }
        else {
            accurate.setText("false");
        }
        click=false;
        }

    public void worth(View view) {
        if (click==true) {
            countervalue++;
        }
        if ((click==true) && (num2==num1))
        {
            counteraccurate++;
        }
        counter.setText(String.valueOf(counteraccurate/countervalue));
        if (num2==num1)
        {
            accurate.setText("true");
        }
        else {
            accurate.setText("false");

        }
        click=false;
    }

    public void small(View view) {
        if (click==true) {
            countervalue++;
        }
        if ((click==true) && (num2<num1))
        {
            counteraccurate++;
        }
        counter.setText(String.valueOf(counteraccurate/countervalue));
        if (num2<num1)
        {
            accurate.setText("true");
        }
        else {
            accurate.setText("false");

        }
        click=false;
    }

    public void clear(View view) {
        counteraccurate=0;
        countervalue=0;
        counter.setText(String.valueOf(counteraccurate/countervalue));
        accurate.setText("none");
        number1.setText("number not found");
        number2.setText("number not found");
    }
}
