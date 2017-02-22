package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_alarm_off extends SVGRenderer {

    public ic_alarm_off(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(12.0f, 6.0f);
        mPath.rCubicTo(3.87f, 0.0f, 7.0f, 3.13f, 7.0f, 7.0f);
        mPath.rCubicTo(0.0f, 0.84f, -0.16f, 1.65f, -0.43f, 2.4f);
        mPath.rLineTo(1.52f, 1.52f);
        mPath.rCubicTo(0.58f, -1.19f, 0.91f, -2.51f, 0.91f, -3.92f);
        mPath.rCubicTo(0.0f, -4.97f, -4.03f, -9.0f, -9.0f, -9.0f);
        mPath.rCubicTo(-1.41f, 0.0f, -2.73f, 0.33f, -3.92f, 0.91f);
        mPath.lineTo(9.6f, 6.43f);
        mPath.cubicTo(10.35f, 6.16f, 11.16f, 6.0f, 12.0f, 6.0f);
        mPath.close();
        mPath.moveTo(12.0f, 6.0f);
        mPath.rMoveTo(10.0f, -0.28f);
        mPath.rLineTo(-4.6f, -3.86f);
        mPath.rLineTo(-1.29f, 1.53f);
        mPath.rLineTo(4.6f, 3.86f);
        mPath.lineTo(22.0f, 5.72f);
        mPath.close();
        mPath.moveTo(22.0f, 5.72f);
        mPath.moveTo(2.92f, 2.29f);
        mPath.lineTo(1.65f, 3.57f);
        mPath.lineTo(2.98f, 4.9f);
        mPath.rLineTo(-1.11f, 0.93f);
        mPath.rLineTo(1.42f, 1.42f);
        mPath.rLineTo(1.11f, -0.94f);
        mPath.rLineTo(0.8f, 0.8f);
        mPath.cubicTo(3.83f, 8.69f, 3.0f, 10.75f, 3.0f, 13.0f);
        mPath.rCubicTo(0.0f, 4.97f, 4.02f, 9.0f, 9.0f, 9.0f);
        mPath.rCubicTo(2.25f, 0.0f, 4.31f, -0.83f, 5.89f, -2.2f);
        mPath.rLineTo(2.2f, 2.2f);
        mPath.rLineTo(1.27f, -1.27f);
        mPath.lineTo(3.89f, 3.27f);
        mPath.rLineTo(-0.97f, -0.98f);
        mPath.close();
        mPath.moveTo(2.92f, 2.29f);
        mPath.rMoveTo(13.55f, 16.1f);
        mPath.cubicTo(15.26f, 19.39f, 13.7f, 20.0f, 12.0f, 20.0f);
        mPath.rCubicTo(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        mPath.rCubicTo(0.0f, -1.7f, 0.61f, -3.26f, 1.61f, -4.47f);
        mPath.rLineTo(9.86f, 9.86f);
        mPath.close();
        mPath.moveTo(16.470001f, 18.39f);
        mPath.moveTo(8.02f, 3.28f);
        mPath.lineTo(6.6f, 1.86f);
        mPath.rLineTo(-0.86f, 0.71f);
        mPath.rLineTo(1.42f, 1.42f);
        mPath.rLineTo(0.86f, -0.71f);
        mPath.close();
        mPath.moveTo(8.02f, 3.28f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}