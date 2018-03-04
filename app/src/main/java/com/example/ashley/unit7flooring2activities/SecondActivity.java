package com.example.ashley.unit7flooring2activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.Serializable;

public class SecondActivity extends AppCompatActivity {


    TextView tvResults; //initializes variables
    Double width;
    Double length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvResults = (TextView) findViewById(R.id.textViewResults); //declares the tvResults

        Bundle extras = getIntent().getExtras(); //gets extras from bundle

        width = extras.getDouble("RoomWidth"); //sets width and length
        length = extras.getDouble("RoomLength");

        tvResults.setText("Width is " + width + "Length is " + length + "and flooring needed is " + (width*length)); //displays width, length, and total needed for flooring.
    }
}
