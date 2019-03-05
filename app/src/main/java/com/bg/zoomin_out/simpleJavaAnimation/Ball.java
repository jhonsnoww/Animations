package com.bg.zoomin_out.simpleJavaAnimation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class Ball extends AppCompatActivity {
AnimView v;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        v = new AnimView(this);
        setContentView(v);

    }
}
