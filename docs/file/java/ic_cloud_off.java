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
public class ic_cloud_off extends SVGRenderer {

    public ic_cloud_off(Context context) {
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
        
        mPath.moveTo(19.35f, 10.04f);
        mPath.cubicTo(18.67f, 6.59f, 15.64f, 4.0f, 12.0f, 4.0f);
        mPath.rCubicTo(-1.48f, 0.0f, -2.85f, 0.43f, -4.01f, 1.17f);
        mPath.rLineTo(1.46f, 1.46f);
        mPath.cubicTo(10.21f, 6.23f, 11.08f, 6.0f, 12.0f, 6.0f);
        mPath.rCubicTo(3.04f, 0.0f, 5.5f, 2.46f, 5.5f, 5.5f);
        mPath.rLineTo(0f, 0.5f);
        mPath.lineTo(19.0f, 12.0f);
        mPath.rCubicTo(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        mPath.rCubicTo(0.0f, 1.13f, -0.64f, 2.11f, -1.56f, 2.62f);
        mPath.rLineTo(1.45f, 1.45f);
        mPath.cubicTo(23.16f, 18.16f, 24.0f, 16.68f, 24.0f, 15.0f);
        mPath.rCubicTo(0.0f, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f);
        mPath.close();
        mPath.moveTo(19.35f, 10.04f);
        mPath.moveTo(3.0f, 5.27f);
        mPath.rLineTo(2.75f, 2.74f);
        mPath.cubicTo(2.56f, 8.15f, 0.0f, 10.77f, 0.0f, 14.0f);
        mPath.rCubicTo(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        mPath.rLineTo(11.73f, 0f);
        mPath.rLineTo(2.0f, 2.0f);
        mPath.lineTo(21.0f, 20.73f);
        mPath.lineTo(4.27f, 4.0f);
        mPath.lineTo(3.0f, 5.27f);
        mPath.close();
        mPath.moveTo(3.0f, 5.27f);
        mPath.moveTo(7.73f, 10.0f);
        mPath.rLineTo(8.0f, 8.0f);
        mPath.lineTo(6.0f, 18.0f);
        mPath.rCubicTo(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        mPath.rCubicTo(0.0f, -2.209999f, 1.79f, -4.0f, 4.0f, -4.0f);
        mPath.rLineTo(1.73f, 0f);
        mPath.close();
        mPath.moveTo(7.73f, 10.0f);
        
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