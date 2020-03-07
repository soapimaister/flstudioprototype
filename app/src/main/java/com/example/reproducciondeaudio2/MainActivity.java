package com.example.reproducciondeaudio2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.AnimationDrawable;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 4000;

    SoundPool sp;
    int rpsp;

    View view;
    AnimationDrawable animationDrawable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = (View)findViewById(R.id.view2);
        animationDrawable = (AnimationDrawable)view.getBackground();
        animationDrawable.setEnterFadeDuration(1000);
        animationDrawable.setExitFadeDuration(1000);
        animationDrawable.start();


        sp = new SoundPool(1, AudioManager.STREAM_MUSIC,1);
        rpsp = sp.load(this,R.raw.flstudio1,1);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        view.setAnimation(animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeintent = new Intent(MainActivity.this,HomeActivity.class);
                startActivity(homeintent);
                sp.play(rpsp,1,1,1,0,0);
                finish();

            }
        },SPLASH_TIME_OUT);

        }

    }

