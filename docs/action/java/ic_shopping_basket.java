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
public class ic_shopping_basket extends SVGRenderer {

    public ic_shopping_basket(Context context) {
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
        
        mPath.moveTo(17.21f, 9.0f);
        mPath.rLineTo(-4.38f, -6.56f);
        mPath.rCubicTo(-0.19f, -0.28f, -0.51f, -0.42f, -0.83f, -0.42f);
        mPath.rCubicTo(-0.32f, 0.0f, -0.64f, 0.14f, -0.83f, 0.43f);
        mPath.lineTo(6.79f, 9.0f);
        mPath.lineTo(2.0f, 9.0f);
        mPath.rCubicTo(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        mPath.rCubicTo(0.0f, 0.09f, 0.01f, 0.18f, 0.04f, 0.27f);
        mPath.rLineTo(2.54f, 9.27f);
        mPath.rCubicTo(0.23f, 0.84f, 1.0f, 1.46f, 1.92f, 1.46f);
        mPath.rLineTo(13.0f, 0f);
        mPath.rCubicTo(0.92f, 0.0f, 1.69f, -0.62f, 1.93f, -1.46f);
        mPath.rLineTo(2.54f, -9.27f);
        mPath.lineTo(23.0f, 10.0f);
        mPath.rCubicTo(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        mPath.rLineTo(-4.79f, 0f);
        mPath.close();
        mPath.moveTo(17.21f, 9.0f);
        mPath.moveTo(9.0f, 9.0f);
        mPath.rLineTo(3.0f, -4.4f);
        mPath.lineTo(15.0f, 9.0f);
        mPath.lineTo(9.0f, 9.0f);
        mPath.close();
        mPath.moveTo(9.0f, 9.0f);
        mPath.rMoveTo(3.0f, 8.0f);
        mPath.rCubicTo(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        mPath.rCubicTo(0.0f, -1.1000004f, 0.9f, -2.0f, 2.0f, -2.0f);
        mPath.rCubicTo(1.1000004f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        mPath.rCubicTo(0.0f, 1.1000004f, -0.9f, 2.0f, -2.0f, 2.0f);
        mPath.close();
        mPath.moveTo(12.0f, 17.0f);
        
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