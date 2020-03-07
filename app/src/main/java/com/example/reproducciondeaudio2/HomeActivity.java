package com.example.reproducciondeaudio2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class HomeActivity extends AppCompatActivity {

    CheckBox cb1;
    View view;
    AnimationDrawable animationDrawable;
    Button b1;
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        cb1 = (CheckBox)findViewById(R.id.checkBox);
        layout = (ConstraintLayout) findViewById(R.id.layout1);
        animationDrawable = (AnimationDrawable)layout.getBackground();
        animationDrawable.setEnterFadeDuration(4500);
        animationDrawable.setExitFadeDuration(4500);
        animationDrawable.start();
        b1 = (Button)findViewById(R.id.button10);
        b1.setEnabled(false);
        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb1.isChecked()){
                    b1.setEnabled(true);
                }else {
                    b1.setEnabled(false);
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b1.isClickable()){
                    Intent llevarme = new Intent(HomeActivity.this,Main2Activity.class);
                    startActivity(llevarme);
                    finish();
                } else {
                }
            }
        });
    }





}
