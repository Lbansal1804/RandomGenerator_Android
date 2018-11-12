package com.example.lbansal1804.randomgenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(10);
        randomNumber++;
        Log.i("text", "here is your generated number: ");

        int [] intArray;
        intArray = new int[10];
    }
}
