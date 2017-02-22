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
public class ic_hearing extends SVGRenderer {

    public ic_hearing(Context context) {
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
        
        mPath.moveTo(17.0f, 20.0f);
        mPath.rCubicTo(-0.29f, 0.0f, -0.56f, -0.06f, -0.76f, -0.15f);
        mPath.rCubicTo(-0.71f, -0.37f, -1.21f, -0.88f, -1.71f, -2.38f);
        mPath.rCubicTo(-0.51f, -1.56f, -1.47f, -2.29f, -2.39f, -3.0f);
        mPath.rCubicTo(-0.79f, -0.61f, -1.61f, -1.24f, -2.32f, -2.53f);
        mPath.cubicTo(9.29f, 10.98f, 9.0f, 9.93f, 9.0f, 9.0f);
        mPath.rCubicTo(0.0f, -2.8f, 2.2f, -5.0f, 5.0f, -5.0f);
        mPath.rCubicTo(2.8000002f, 0.0f, 5.0f, 2.2f, 5.0f, 5.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rCubicTo(0.0f, -3.93f, -3.07f, -7.0f, -7.0f, -7.0f);
        mPath.cubicTo(10.07f, 2.0f, 7.0f, 5.07f, 7.0f, 9.0f);
        mPath.rCubicTo(0.0f, 1.26f, 0.38f, 2.65f, 1.07f, 3.9f);
        mPath.rCubicTo(0.91f, 1.65f, 1.98f, 2.48f, 2.85f, 3.15f);
        mPath.rCubicTo(0.81f, 0.62f, 1.39f, 1.07f, 1.71f, 2.05f);
        mPath.rCubicTo(0.6f, 1.82f, 1.37f, 2.84f, 2.73f, 3.55f);
        mPath.rCubicTo(0.51f, 0.23f, 1.07f, 0.35f, 1.64f, 0.35f);
        mPath.rCubicTo(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.rCubicTo(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        mPath.close();
        mPath.moveTo(17.0f, 20.0f);
        mPath.moveTo(7.64f, 2.64f);
        mPath.lineTo(6.22f, 1.22f);
        mPath.cubicTo(4.23f, 3.21f, 3.0f, 5.96f, 3.0f, 9.0f);
        mPath.rCubicTo(0.0f, 3.04f, 1.23f, 5.79f, 3.22f, 7.78f);
        mPath.rLineTo(1.41f, -1.41f);
        mPath.cubicTo(6.01f, 13.74f, 5.0f, 11.49f, 5.0f, 9.0f);
        mPath.rCubicTo(0.0f, -2.4899998f, 1.01f, -4.74f, 2.64f, -6.36f);
        mPath.close();
        mPath.moveTo(7.64f, 2.64f);
        mPath.moveTo(11.5f, 9.0f);
        mPath.rCubicTo(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f);
        mPath.rCubicTo(1.3800001f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        mPath.rCubicTo(0.0f, -1.3800001f, -1.12f, -2.5f, -2.5f, -2.5f);
        mPath.rCubicTo(-1.3800001f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f);
        mPath.close();
        mPath.moveTo(11.5f, 9.0f);
        
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