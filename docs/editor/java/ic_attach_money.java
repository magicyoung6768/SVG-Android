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
public class ic_attach_money extends SVGRenderer {

    public ic_attach_money(Context context) {
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
        
        mPath.moveTo(11.8f, 10.9f);
        mPath.rCubicTo(-2.27f, -0.59f, -3.0f, -1.2f, -3.0f, -2.15f);
        mPath.rCubicTo(0.0f, -1.09f, 1.01f, -1.85f, 2.7f, -1.85f);
        mPath.rCubicTo(1.78f, 0.0f, 2.44f, 0.85f, 2.5f, 2.1f);
        mPath.rLineTo(2.21f, 0f);
        mPath.rCubicTo(-0.07f, -1.72f, -1.12f, -3.3f, -3.21f, -3.81f);
        mPath.lineTo(12.999999f, 3.0f);
        mPath.rLineTo(-3.0f, 0f);
        mPath.rLineTo(0f, 2.16f);
        mPath.rCubicTo(-1.94f, 0.42f, -3.5f, 1.68f, -3.5f, 3.61f);
        mPath.rCubicTo(0.0f, 2.31f, 1.91f, 3.46f, 4.7f, 4.13f);
        mPath.rCubicTo(2.5f, 0.6f, 3.0f, 1.48f, 3.0f, 2.41f);
        mPath.rCubicTo(0.0f, 0.69f, -0.49f, 1.79f, -2.7f, 1.79f);
        mPath.rCubicTo(-2.06f, 0.0f, -2.87f, -0.92f, -2.98f, -2.1f);
        mPath.rLineTo(-2.2f, 0f);
        mPath.rCubicTo(0.12f, 2.19f, 1.76f, 3.42f, 3.68f, 3.83f);
        mPath.lineTo(9.999999f, 21.0f);
        mPath.rLineTo(3.0f, 0f);
        mPath.rLineTo(0f, -2.15f);
        mPath.rCubicTo(1.95f, -0.37f, 3.5f, -1.5f, 3.5f, -3.55f);
        mPath.rCubicTo(0.0f, -2.84f, -2.43f, -3.81f, -4.7f, -4.4f);
        mPath.close();
        mPath.moveTo(11.8f, 10.9f);
        
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