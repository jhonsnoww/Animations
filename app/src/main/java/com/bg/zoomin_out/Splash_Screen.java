package com.bg.zoomin_out;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class Splash_Screen extends AppCompatActivity {

    AnimationDrawable animationDrawable;
    ImageView iv;
    Animation anim,in,out;
    Animation anim1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);
        iv = findViewById(R.id.iv);

        anim = AnimationUtils.loadAnimation(this, R.anim.zoomin);
        in = AnimationUtils.loadAnimation(this, R.anim.slidein);
        out = AnimationUtils.loadAnimation(this, R.anim.slideout);
        iv.startAnimation(anim);
       // animationDrawable = (AnimationDrawable) iv.getBackground();


        anim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                startActivity(new Intent(Splash_Screen.this, MainActivity.class));
                overridePendingTransition(R.anim.right_in_ratation,R.anim.moveleftrotation);


                // animationDrawable.start();

                /*   if (animation == anim) {

                   *//* anim1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out);
                    iv.setAnimation(anim1);*//*
                    startActivity(new Intent(Splash_Screen.this, MainActivity.class));
                    //finish();

                }*/
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
