package com.example.foodpointexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout break_llay;
    LinearLayout lunch_llay;
    LinearLayout dinner_llay;
    LinearLayout desert_llay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        break_llay = findViewById(R.id.break_llay);
        lunch_llay = findViewById(R.id.lunch_llay);
        dinner_llay = findViewById(R.id.dinner_llay);
        desert_llay = findViewById(R.id.desert_llay);




        break_llay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Breakfast.class);
                startActivity(intent);
            }
        });
        lunch_llay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Lunch.class);
                startActivity(intent);
            }
        });
        dinner_llay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Dinner.class);
                startActivity(intent);
            }
        });
        desert_llay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Desert.class);
                startActivity(intent);
            }
        });



    }
}