package com.example.animationshmanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button btnRotateClock, btnRotateAntiClock, btnFadeIn, btnFadeOut;
    private ImageView imgPicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRotateClock = findViewById(R.id.btnRotateClock);
        btnRotateAntiClock = findViewById(R.id.btnRotateAntiClock);
        btnFadeIn = findViewById(R.id.btnFadeIn);
        btnFadeOut = findViewById(R.id.btnFadeOut);
        imgPicture = findViewById(R.id.imgPicture);
        Animation aniRotateClock = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_clockwise);
        Animation animRotateAntiClock = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_anticlockwise);
        Animation animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        Animation animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);

        btnRotateClock.setOnClickListener(v -> {
            imgPicture.startAnimation(aniRotateClock);
        });
        btnRotateAntiClock.setOnClickListener(v -> {

            imgPicture.startAnimation(animRotateAntiClock);
        });
        btnFadeIn.setOnClickListener(v -> {

            imgPicture.startAnimation(animFadeIn);
        });
        btnFadeOut.setOnClickListener(v -> {

            imgPicture.startAnimation(animFadeOut);
        });
    }
}