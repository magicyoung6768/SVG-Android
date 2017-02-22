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
public class ic_vibration extends SVGRenderer {

    public ic_vibration(Context context) {
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
        
        mPath.moveTo(0.0f, 15.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.lineTo(2.0f, 9.0f);
        mPath.lineTo(0.0f, 9.0f);
        mPath.rLineTo(0f, 6.0f);
        mPath.close();
        mPath.moveTo(0.0f, 15.0f);
        mPath.rMoveTo(3.0f, 2.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.lineTo(5.0f, 7.0f);
        mPath.lineTo(3.0f, 7.0f);
        mPath.rLineTo(0f, 10.0f);
        mPath.close();
        mPath.moveTo(3.0f, 17.0f);
        mPath.rMoveTo(19.0f, -8.0f);
        mPath.rLineTo(0f, 6.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.lineTo(24.0f, 9.0f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.close();
        mPath.moveTo(22.0f, 9.0f);
        mPath.rMoveTo(-3.0f, 8.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.lineTo(21.0f, 7.0f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.rLineTo(0f, 10.0f);
        mPath.close();
        mPath.moveTo(19.0f, 17.0f);
        mPath.moveTo(16.5f, 3.0f);
        mPath.rLineTo(-9.0f, 0f);
        mPath.cubicTo(6.67f, 3.0f, 6.0f, 3.67f, 6.0f, 4.5f);
        mPath.rLineTo(0f, 15.0f);
        mPath.rCubicTo(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        mPath.rLineTo(9.0f, 0f);
        mPath.rCubicTo(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        mPath.rLineTo(0f, -15.0f);
        mPath.rCubicTo(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        mPath.close();
        mPath.moveTo(16.5f, 3.0f);
        mPath.moveTo(16.0f, 19.0f);
        mPath.lineTo(8.0f, 19.0f);
        mPath.lineTo(8.0f, 5.0f);
        mPath.rLineTo(8.0f, 0f);
        mPath.rLineTo(0f, 14.0f);
        mPath.close();
        mPath.moveTo(16.0f, 19.0f);
        
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