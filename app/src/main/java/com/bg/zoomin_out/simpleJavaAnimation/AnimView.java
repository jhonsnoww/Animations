package com.bg.zoomin_out.simpleJavaAnimation;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.View;

import com.bg.zoomin_out.R;

public class AnimView extends View {
    Bitmap myCircle;
    public AnimView(Context context) {
        super(context);
        myCircle = BitmapFactory.decodeResource(getResources(),R.drawable.ic_data);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRGB(00,225,00);
    }
}
