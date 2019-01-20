package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.FileUriExposedException;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    Paint paint = new Paint();


    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        paint.setAntiAlias(true);
        paint.setStrokeWidth(3);
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        float[] pts = {100, 100, 100, 500, 100, 500, 900, 500};
        canvas.drawLines(pts, paint);
        paint.setStrokeWidth(2);
        paint.setTextSize(39);
        canvas.drawText("直方图", 400, 660, paint);


        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawRect(150, 450, 250, 500, paint);

        canvas.drawRect(300, 350, 400, 500, paint);
        canvas.drawRect(450, 250, 550, 500, paint);
        canvas.drawRect(600, 180, 700, 500, paint);
        canvas.drawRect(750, 380, 850, 500, paint);


        paint.setTextSize(22);
        paint.setStrokeWidth(1);
        paint.setColor(Color.WHITE);
        canvas.drawText("Fyfo", 170, 550, paint);

        canvas.drawText("GBt", 320, 550, paint);
        canvas.drawText("IOS", 470, 550, paint);
        canvas.drawText("Kotlin", 620, 550, paint);
        canvas.drawText("Java",770,550,paint);


    }
}
