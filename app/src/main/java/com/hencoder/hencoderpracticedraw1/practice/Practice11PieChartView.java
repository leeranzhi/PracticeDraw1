package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {
    Paint paint = new Paint();

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        int x = getWidth();
        int y = getHeight();

        paint.setAntiAlias(true);

        String[] s = {"Lollipop", "KitKat", "Jelly Bean",
                "Ice Cream Sandwich", "Gingerbred", "Froyo", "Marshmallow"};
        paint.setTextSize(39);
        paint.setColor(Color.WHITE);
        canvas.drawText("饼图", x / 2 - 70, y - 70, paint);

        paint.setColor(Color.parseColor("#F44232"));
        canvas.drawArc(200, 100, 600, 500, -180, 125, true, paint);

        paint.setColor(Color.parseColor("#1C97F3"));
        canvas.drawArc(220, 120, 620, 520, 176, -105, true, paint);


        paint.setColor(Color.parseColor("#009789"));
        canvas.drawArc(230, 130, 620, 520, 70, -50, true, paint);

        paint.setColor(Color.parseColor("#FFC200"));
        canvas.drawArc(220, 120, 620, 520, -5, -50, true, paint);

        paint.setColor(Color.parseColor("#9D22B1"));
        canvas.drawArc(220, 120, 620, 520, 0, 10, true, paint);

        paint.setColor(Color.parseColor("#9F9F9F"));
        canvas.drawArc(220, 120, 620, 520, 12, 8, true, paint);



    }
}
