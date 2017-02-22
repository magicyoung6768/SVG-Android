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
public class ic_pan_tool extends SVGRenderer {

    public ic_pan_tool(Context context) {
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
        
        mPath.moveTo(23.0f, 5.5f);
        mPath.lineTo(23.0f, 20.0f);
        mPath.rCubicTo(0.0f, 2.2f, -1.8f, 4.0f, -4.0f, 4.0f);
        mPath.rLineTo(-7.3f, 0f);
        mPath.rCubicTo(-1.08f, 0.0f, -2.1f, -0.43f, -2.85f, -1.19f);
        mPath.lineTo(1.0f, 14.83f);
        mPath.rCubicTo(0.0f, 0.0f, 1.26f, -1.23f, 1.3f, -1.25f);
        mPath.rCubicTo(0.22f, -0.19f, 0.49f, -0.29f, 0.79f, -0.29f);
        mPath.rCubicTo(0.22f, 0.0f, 0.42f, 0.06f, 0.6f, 0.16f);
        mPath.rCubicTo(0.04f, 0.01f, 4.31f, 2.46f, 4.31f, 2.46f);
        mPath.lineTo(8.0f, 4.0f);
        mPath.rCubicTo(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        mPath.cubicTo(10.33f, 2.5f, 11.0f, 3.17f, 11.0f, 4.0f);
        mPath.rLineTo(0f, 7.0f);
        mPath.rLineTo(1.0f, 0f);
        mPath.lineTo(12.0f, 1.5f);
        mPath.rCubicTo(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        mPath.cubicTo(14.33f, 0.0f, 15.0f, 0.67f, 15.0f, 1.5f);
        mPath.lineTo(15.0f, 11.0f);
        mPath.rLineTo(1.0f, 0f);
        mPath.lineTo(16.0f, 2.5f);
        mPath.rCubicTo(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        mPath.rCubicTo(0.8299999f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        mPath.lineTo(19.0f, 11.0f);
        mPath.rLineTo(1.0f, 0f);
        mPath.lineTo(20.0f, 5.5f);
        mPath.rCubicTo(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        mPath.rCubicTo(0.8299999f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        mPath.close();
        mPath.moveTo(23.0f, 5.5f);
        
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