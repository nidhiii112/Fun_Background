package com.nidhi.funbackground;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity{
    private ConstraintLayout layout;
    private ImageButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(android.support.constraint.R.id.layout);
        btn = findViewById(R.id.imageButton6);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int color = Color.argb(255,random.nextInt(257),random.nextInt(258),
                        random.nextInt(234));

                    layout.setBackgroundColor(color);


            }
        });
    }
    }
