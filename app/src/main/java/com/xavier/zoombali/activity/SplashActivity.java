package com.xavier.zoombali.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import com.xavier.zoombali.R;

public class SplashActivity extends AppCompatActivity {

    private Animation animRotate = null;
    private static final int SPLASH_DURATION = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        animRotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim_rotate);
        findViewById(R.id.imgLoader).startAnimation(animRotate);

        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(SplashActivity.this,HomeActivity.class));
                        finish();
                    }
                }, SPLASH_DURATION);
            }
        });
    }
}
