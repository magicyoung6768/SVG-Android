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
public class ic_live_help extends SVGRenderer {

    public ic_live_help(Context context) {
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
        
        mPath.moveTo(19.0f, 2.0f);
        mPath.lineTo(5.0f, 2.0f);
        mPath.rCubicTo(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        mPath.rLineTo(0f, 14.0f);
        mPath.rCubicTo(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        mPath.rLineTo(4.0f, 0f);
        mPath.rLineTo(3.0f, 3.0f);
        mPath.rLineTo(3.0f, -3.0f);
        mPath.rLineTo(4.0f, 0f);
        mPath.rCubicTo(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        mPath.lineTo(21.0f, 4.0f);
        mPath.rCubicTo(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        mPath.close();
        mPath.moveTo(19.0f, 2.0f);
        mPath.rMoveTo(-6.0f, 16.0f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.close();
        mPath.moveTo(13.0f, 18.0f);
        mPath.rMoveTo(2.07f, -7.75f);
        mPath.rLineTo(-0.9f, 0.92f);
        mPath.cubicTo(13.45f, 11.9f, 13.0f, 12.5f, 13.0f, 14.0f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.rLineTo(0f, -0.5f);
        mPath.rCubicTo(0.0f, -1.1f, 0.45f, -2.1f, 1.17f, -2.83f);
        mPath.rLineTo(1.24f, -1.26f);
        mPath.rCubicTo(0.37f, -0.36f, 0.59f, -0.86f, 0.59f, -1.41f);
        mPath.rCubicTo(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        mPath.rCubicTo(-1.1000004f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        mPath.lineTo(8.0f, 8.0f);
        mPath.rCubicTo(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
        mPath.rCubicTo(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f);
        mPath.rCubicTo(0.0f, 0.88f, -0.36f, 1.68f, -0.93f, 2.25f);
        mPath.close();
        mPath.moveTo(15.07f, 10.25f);
        
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