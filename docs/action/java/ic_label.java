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
public class ic_label extends SVGRenderer {

    public ic_label(Context context) {
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
        
        mPath.moveTo(17.63f, 5.84f);
        mPath.cubicTo(17.27f, 5.33f, 16.67f, 5.0f, 16.0f, 5.0f);
        mPath.lineTo(5.0f, 5.01f);
        mPath.cubicTo(3.9f, 5.01f, 3.0f, 5.9f, 3.0f, 7.0f);
        mPath.rLineTo(0f, 10.0f);
        mPath.rCubicTo(0.0f, 1.1f, 0.9f, 1.99f, 2.0f, 1.99f);
        mPath.lineTo(16.0f, 19.0f);
        mPath.rCubicTo(0.67f, 0.0f, 1.27f, -0.33f, 1.63f, -0.84f);
        mPath.lineTo(22.0f, 12.0f);
        mPath.rLineTo(-4.37f, -6.16f);
        mPath.close();
        mPath.moveTo(17.63f, 5.84f);
        
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