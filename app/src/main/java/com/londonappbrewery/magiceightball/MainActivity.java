package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnAsk = (Button) findViewById(R.id.btnAsk);
        final ImageView imgBall = (ImageView) findViewById(R.id.BallImg);
        final int[] arrBall = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        btnAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random RandomNumGen = new Random();
                int Num = RandomNumGen.nextInt(5);
                imgBall.setImageResource(arrBall[Num]);
            }
        });
    }
}
