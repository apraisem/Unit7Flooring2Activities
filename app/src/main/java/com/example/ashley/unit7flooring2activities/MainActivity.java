package com.example.ashley.unit7flooring2activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    TextView tvWidth; //initializes variables
    TextView tvLength;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvLength = (TextView) findViewById(R.id.textViewRoomLength); //declares length and width
        tvWidth = (TextView) findViewById(R.id.textViewRoomWidth);

    }

    public void onButtonClick( View view) {
        // Calling the second activity
        Double width = Double.parseDouble(tvWidth.getText().toString()); //turns width and length into strings for display
        Double length = Double.parseDouble(tvLength.getText().toString() );


        Intent secActIntent = new Intent(this, SecondActivity.class);
        secActIntent.putExtra("RoomWidth", width);
        secActIntent.putExtra("RoomLength", length);
   
        startActivity(secActIntent);
}};
