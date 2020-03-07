package com.example.reproducciondeaudio2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {



    private TextView tv1,tv2;
    ProgressBar progressBar5;
    private int status = 0;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1 = (TextView)findViewById(R.id.textView2);
        tv2 = (TextView)findViewById(R.id.textView5);
        tv2.setVisibility(View.INVISIBLE);
        progressBar5 = (ProgressBar)findViewById(R.id.progressBar5);
        progressBar5.setVisibility(View.VISIBLE);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent llevarme = new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(llevarme);
                overridePendingTransition(R.anim.slideup,R.anim.nochange);
                finish();
            }
        },4000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fadeout);
                tv1.setAnimation(animation);
            }
        },1500);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fadein);
                tv2.setAnimation(animation);
                tv2.setVisibility(View.VISIBLE);
                tv1.setVisibility(View.INVISIBLE);
            }
        },2500);

       new Thread(new Runnable() {
           @Override
           public void run() {
               while (status < 100){
                   status++;
                   android.os.SystemClock.sleep(50);
                   handler.post(new Runnable() {
                       @Override
                       public void run() {
                           progressBar5.setProgress(status);
                       }
                   });


               }

           }
       }).start();




    }
}
