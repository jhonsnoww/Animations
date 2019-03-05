package com.bg.zoomin_out.simpleAnim;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bg.zoomin_out.R;

public class Main extends AppCompatActivity {
    ImageView iv,img;
    TextView tv;
    Animation fadein, fadeout, blink, zoonin,rotate,bounce,move,moveleftrotation,right_in_ratation;
    String fi = "fadein";
    String fo = "fadeout";
    boolean flag = true;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        img = findViewById(R.id.mainimg);
        tv = findViewById(R.id.tv);


        fadein = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadein);
        fadeout = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadeout);
        blink = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        zoonin = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoomin);
        rotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotation);
        bounce = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
        move = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        moveleftrotation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.moveleftrotation);
        right_in_ratation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.right_in_ratation);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 img.startAnimation(right_in_ratation);
//                Animation anim = flag ? fadein : fadeout;
//                String name = flag ? fi : fo;
//                if (flag) {
//                    iv.setAnimation(anim);
//                }
//                iv.startAnimation(anim);
//                tv.setText(name);
//                flag = !flag;
//                // iv.startAnimation(fadeout);
            }
        });
    }


}
