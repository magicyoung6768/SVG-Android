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
public class ic_monochrome_photos extends SVGRenderer {

    public ic_monochrome_photos(Context context) {
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
        
        mPath.moveTo(20.0f, 5.0f);
        mPath.rLineTo(-3.2f, 0f);
        mPath.lineTo(15.0f, 3.0f);
        mPath.lineTo(9.0f, 3.0f);
        mPath.lineTo(7.2f, 5.0f);
        mPath.lineTo(4.0f, 5.0f);
        mPath.rCubicTo(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        mPath.rLineTo(0f, 12.0f);
        mPath.rCubicTo(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        mPath.rLineTo(16.0f, 0f);
        mPath.rCubicTo(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        mPath.lineTo(22.0f, 7.0f);
        mPath.rCubicTo(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        mPath.close();
        mPath.moveTo(20.0f, 5.0f);
        mPath.rMoveTo(0.0f, 14.0f);
        mPath.rLineTo(-8.0f, 0f);
        mPath.rLineTo(0f, -1.0f);
        mPath.rCubicTo(-2.8f, 0.0f, -5.0f, -2.2f, -5.0f, -5.0f);
        mPath.rCubicTo(0.0f, -2.8000002f, 2.2f, -5.0f, 5.0f, -5.0f);
        mPath.lineTo(12.0f, 7.0f);
        mPath.rLineTo(8.0f, 0f);
        mPath.rLineTo(0f, 12.0f);
        mPath.close();
        mPath.moveTo(20.0f, 19.0f);
        mPath.rMoveTo(-3.0f, -6.0f);
        mPath.rCubicTo(0.0f, -2.8f, -2.2f, -5.0f, -5.0f, -5.0f);
        mPath.rLineTo(0f, 1.8f);
        mPath.rCubicTo(1.8f, 0.0f, 3.2f, 1.4f, 3.2f, 3.2f);
        mPath.rCubicTo(0.0f, 1.8000002f, -1.4f, 3.2f, -3.2f, 3.2f);
        mPath.lineTo(12.0f, 18.0f);
        mPath.rCubicTo(2.8f, 0.0f, 5.0f, -2.2f, 5.0f, -5.0f);
        mPath.close();
        mPath.moveTo(17.0f, 13.0f);
        mPath.rMoveTo(-8.2f, 0.0f);
        mPath.rCubicTo(0.0f, 1.8f, 1.4f, 3.2f, 3.2f, 3.2f);
        mPath.lineTo(12.0f, 9.8f);
        mPath.rCubicTo(-1.8f, 0.0f, -3.2f, 1.4f, -3.2f, 3.2f);
        mPath.close();
        mPath.moveTo(8.8f, 13.0f);
        
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