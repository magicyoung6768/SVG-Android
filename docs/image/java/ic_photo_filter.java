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
public class ic_photo_filter extends SVGRenderer {

    public ic_photo_filter(Context context) {
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
        
        mPath.moveTo(19.02f, 10.0f);
        mPath.rLineTo(0f, 9.0f);
        mPath.lineTo(5.0f, 19.0f);
        mPath.lineTo(5.0f, 5.0f);
        mPath.rLineTo(9.0f, 0f);
        mPath.lineTo(14.0f, 3.0f);
        mPath.lineTo(5.02f, 3.0f);
        mPath.rCubicTo(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        mPath.rLineTo(0f, 14.0f);
        mPath.rCubicTo(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        mPath.rLineTo(14.0f, 0f);
        mPath.rCubicTo(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        mPath.rLineTo(0f, -9.0f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.close();
        mPath.moveTo(19.02f, 10.0f);
        mPath.moveTo(17.0f, 10.0f);
        mPath.rLineTo(0.94f, -2.06f);
        mPath.lineTo(20.0f, 7.0f);
        mPath.rLineTo(-2.06f, -0.94f);
        mPath.lineTo(17.0f, 4.0f);
        mPath.rLineTo(-0.94f, 2.06f);
        mPath.lineTo(14.0f, 7.0f);
        mPath.rLineTo(2.06f, 0.94f);
        mPath.close();
        mPath.moveTo(17.0f, 10.0f);
        mPath.rMoveTo(-3.75f, 0.75f);
        mPath.lineTo(12.0f, 8.0f);
        mPath.rLineTo(-1.25f, 2.75f);
        mPath.lineTo(8.0f, 12.0f);
        mPath.rLineTo(2.75f, 1.25f);
        mPath.lineTo(12.0f, 16.0f);
        mPath.rLineTo(1.25f, -2.75f);
        mPath.lineTo(16.0f, 12.0f);
        mPath.close();
        mPath.moveTo(13.25f, 10.75f);
        
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