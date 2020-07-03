package com.raman.raman_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static int TIME_OUT = 1400; //Time to launch the another activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView logo = findViewById(R.id.Logo);

//        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
//        alphaAnimation.setDuration(1000);
//        alphaAnimation.setRepeatCount(1);
//        alphaAnimation.setRepeatMode(Animation.REVERSE);
//        logo.startAnimation(alphaAnimation);

//        ObjectAnimator fadeOut = ObjectAnimator.ofFloat(logo, "alpha", 1f, 0);
//        fadeOut.setDuration(2000);
//        fadeOut.start();

//        Intent intent = new Intent(this, MainBar.class);
//        startActivity(intent);
//        finish();

        new CountDownTimer(3000, 3000) {

            @Override
            public void onTick(long millisUntilFinished) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(1250);
                alphaAnimation.setRepeatCount(1);
                alphaAnimation.setRepeatMode(Animation.INFINITE);
                logo.startAnimation(alphaAnimation);

            }


            public void onFinish() {

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                    }
                }, TIME_OUT);
                startActivity(new Intent(MainActivity.this, Home.class));
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }

        }.start();


    }
}
