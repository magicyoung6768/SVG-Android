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
public class ic_refresh extends SVGRenderer {

    public ic_refresh(Context context) {
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
        
        mPath.moveTo(17.65f, 6.35f);
        mPath.cubicTo(16.2f, 4.9f, 14.21f, 4.0f, 12.0f, 4.0f);
        mPath.rCubicTo(-4.42f, 0.0f, -7.99f, 3.58f, -7.99f, 8.0f);
        mPath.rCubicTo(0.0f, 4.42f, 3.57f, 8.0f, 7.99f, 8.0f);
        mPath.rCubicTo(3.73f, 0.0f, 6.84f, -2.55f, 7.73f, -6.0f);
        mPath.rLineTo(-2.08f, 0f);
        mPath.rCubicTo(-0.82f, 2.33f, -3.04f, 4.0f, -5.65f, 4.0f);
        mPath.rCubicTo(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        mPath.rCubicTo(0.0f, -3.3099995f, 2.69f, -6.0f, 6.0f, -6.0f);
        mPath.rCubicTo(1.66f, 0.0f, 3.14f, 0.69f, 4.22f, 1.78f);
        mPath.lineTo(13.0f, 11.0f);
        mPath.rLineTo(7.0f, 0f);
        mPath.lineTo(20.0f, 4.0f);
        mPath.rLineTo(-2.35f, 2.35f);
        mPath.close();
        mPath.moveTo(17.65f, 6.35f);
        
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