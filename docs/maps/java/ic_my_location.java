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
public class ic_my_location extends SVGRenderer {

    public ic_my_location(Context context) {
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
        
        mPath.moveTo(12.0f, 8.0f);
        mPath.rCubicTo(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        mPath.rCubicTo(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        mPath.rCubicTo(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        mPath.rCubicTo(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        mPath.close();
        mPath.moveTo(12.0f, 8.0f);
        mPath.rMoveTo(8.94f, 3.0f);
        mPath.rCubicTo(-0.46f, -4.17f, -3.77f, -7.48f, -7.94f, -7.94f);
        mPath.lineTo(12.999998f, 1.0f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.rLineTo(0f, 2.06f);
        mPath.cubicTo(6.83f, 3.52f, 3.52f, 6.83f, 3.06f, 11.0f);
        mPath.lineTo(1.0f, 11.0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.rLineTo(2.06f, 0f);
        mPath.rCubicTo(0.46f, 4.17f, 3.77f, 7.48f, 7.94f, 7.94f);
        mPath.lineTo(11.0f, 23.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rLineTo(0f, -2.06f);
        mPath.rCubicTo(4.17f, -0.46f, 7.48f, -3.77f, 7.94f, -7.94f);
        mPath.lineTo(23.0f, 13.0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.rLineTo(-2.06f, 0f);
        mPath.close();
        mPath.moveTo(20.939999f, 11.0f);
        mPath.moveTo(12.0f, 19.0f);
        mPath.rCubicTo(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        mPath.rCubicTo(0.0f, -3.87f, 3.13f, -7.0f, 7.0f, -7.0f);
        mPath.rCubicTo(3.87f, 0.0f, 7.0f, 3.13f, 7.0f, 7.0f);
        mPath.rCubicTo(0.0f, 3.87f, -3.13f, 7.0f, -7.0f, 7.0f);
        mPath.close();
        mPath.moveTo(12.0f, 19.0f);
        
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