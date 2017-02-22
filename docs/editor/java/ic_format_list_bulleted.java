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
public class ic_format_list_bulleted extends SVGRenderer {

    public ic_format_list_bulleted(Context context) {
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
        
        mPath.moveTo(4.0f, 10.5f);
        mPath.rCubicTo(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        mPath.rCubicTo(0.0f, 0.8299999f, 0.67f, 1.5f, 1.5f, 1.5f);
        mPath.rCubicTo(0.8299999f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        mPath.rCubicTo(0.0f, -0.8299999f, -0.67f, -1.5f, -1.5f, -1.5f);
        mPath.close();
        mPath.moveTo(4.0f, 10.5f);
        mPath.rMoveTo(0.0f, -6.0f);
        mPath.rCubicTo(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        mPath.cubicTo(2.5f, 6.83f, 3.17f, 7.5f, 4.0f, 7.5f);
        mPath.cubicTo(4.83f, 7.5f, 5.5f, 6.83f, 5.5f, 6.0f);
        mPath.cubicTo(5.5f, 5.17f, 4.83f, 4.5f, 4.0f, 4.5f);
        mPath.close();
        mPath.moveTo(4.0f, 4.5f);
        mPath.rMoveTo(0.0f, 12.0f);
        mPath.rCubicTo(-0.83f, 0.0f, -1.5f, 0.68f, -1.5f, 1.5f);
        mPath.rCubicTo(0.0f, 0.8199997f, 0.68f, 1.5f, 1.5f, 1.5f);
        mPath.rCubicTo(0.81999993f, 0.0f, 1.5f, -0.68f, 1.5f, -1.5f);
        mPath.rCubicTo(0.0f, -0.8199997f, -0.67f, -1.5f, -1.5f, -1.5f);
        mPath.close();
        mPath.moveTo(4.0f, 16.5f);
        mPath.moveTo(7.0f, 19.0f);
        mPath.rLineTo(14.0f, 0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.lineTo(7.0f, 17.0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.close();
        mPath.moveTo(7.0f, 19.0f);
        mPath.rMoveTo(0.0f, -6.0f);
        mPath.rLineTo(14.0f, 0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.lineTo(7.0f, 11.0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.close();
        mPath.moveTo(7.0f, 13.0f);
        mPath.rMoveTo(0.0f, -8.0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.rLineTo(14.0f, 0f);
        mPath.lineTo(21.0f, 5.0f);
        mPath.lineTo(7.0f, 5.0f);
        mPath.close();
        mPath.moveTo(7.0f, 5.0f);
        
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