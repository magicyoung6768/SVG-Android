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
public class ic_visibility extends SVGRenderer {

    public ic_visibility(Context context) {
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
        
        mPath.moveTo(12.0f, 4.5f);
        mPath.cubicTo(7.0f, 4.5f, 2.73f, 7.61f, 1.0f, 12.0f);
        mPath.rCubicTo(1.73f, 4.39f, 6.0f, 7.5f, 11.0f, 7.5f);
        mPath.rCubicTo(5.0f, 0.0f, 9.27f, -3.11f, 11.0f, -7.5f);
        mPath.rCubicTo(-1.73f, -4.39f, -6.0f, -7.5f, -11.0f, -7.5f);
        mPath.close();
        mPath.moveTo(12.0f, 4.5f);
        mPath.moveTo(12.0f, 17.0f);
        mPath.rCubicTo(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        mPath.rCubicTo(0.0f, -2.7600002f, 2.24f, -5.0f, 5.0f, -5.0f);
        mPath.rCubicTo(2.7600002f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        mPath.rCubicTo(0.0f, 2.7600002f, -2.24f, 5.0f, -5.0f, 5.0f);
        mPath.close();
        mPath.moveTo(12.0f, 17.0f);
        mPath.rMoveTo(0.0f, -8.0f);
        mPath.rCubicTo(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        mPath.rCubicTo(0.0f, 1.6599998f, 1.34f, 3.0f, 3.0f, 3.0f);
        mPath.rCubicTo(1.6599998f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        mPath.rCubicTo(0.0f, -1.6599998f, -1.34f, -3.0f, -3.0f, -3.0f);
        mPath.close();
        mPath.moveTo(12.0f, 9.0f);
        
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