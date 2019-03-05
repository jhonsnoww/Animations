package com.bg.zoomin_out;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout rOut;
    ImageView iv;
    TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rOut = findViewById(R.id.rOut);
        iv = findViewById(R.id.mainiv);
        tv1 = findViewById(R.id.name);
        tv2 = findViewById(R.id.blac);

        rOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this,SharedElement.class);
                Pair[] pairs = new Pair[3];
                pairs[0] = new Pair<View,String>(iv,"iv");
                pairs[1] = new Pair<View,String>(iv,"tv1");
                pairs[2] = new Pair<View,String>(iv,"tv2");
                ActivityOptions options = null;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    options =ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);
                }
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    startActivity(i,options.toBundle());
                }
            }
        });
    }
}
