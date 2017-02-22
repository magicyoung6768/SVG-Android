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
public class ic_streetview extends SVGRenderer {

    public ic_streetview(Context context) {
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
        
        mPath.moveTo(12.56f, 14.33f);
        mPath.rCubicTo(-0.34f, 0.27f, -0.56f, 0.7f, -0.56f, 1.17f);
        mPath.lineTo(12.0f, 21.0f);
        mPath.rLineTo(7.0f, 0f);
        mPath.rCubicTo(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        mPath.rLineTo(0f, -5.98f);
        mPath.rCubicTo(-0.94f, -0.33f, -1.95f, -0.52f, -3.0f, -0.52f);
        mPath.rCubicTo(-2.03f, 0.0f, -3.93f, 0.7f, -5.44f, 1.83f);
        mPath.close();
        mPath.moveTo(12.56f, 14.33f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(18.0f, 6.0f);
        mPath.rMoveTo(-5.0f, 0.0f);
        mPath.cubicTo(13.0f, 4.9442677f, 13.334372f, 3.915179f, 13.954915f, 3.0610738f);
        mPath.cubicTo(14.575459f, 2.2069683f, 15.450854f, 1.5709566f, 16.454914f, 1.2447174f);
        mPath.cubicTo(17.458977f, 0.91847813f, 18.541023f, 0.91847813f, 19.545086f, 1.2447174f);
        mPath.cubicTo(20.549147f, 1.5709566f, 21.424541f, 2.2069683f, 22.045086f, 3.0610738f);
        mPath.cubicTo(22.665628f, 3.915179f, 23.0f, 4.9442677f, 23.0f, 6.0f);
        mPath.cubicTo(23.0f, 7.0557323f, 22.665628f, 8.084821f, 22.045086f, 8.938927f);
        mPath.cubicTo(21.424541f, 9.793032f, 20.549147f, 10.429044f, 19.545086f, 10.755282f);
        mPath.cubicTo(18.541023f, 11.081522f, 17.458977f, 11.081522f, 16.454914f, 10.755282f);
        mPath.cubicTo(15.450854f, 10.429044f, 14.575459f, 9.793032f, 13.954915f, 8.938927f);
        mPath.cubicTo(13.334372f, 8.084821f, 13.0f, 7.0557323f, 13.0f, 6.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(11.5f, 6.0f);
        mPath.rCubicTo(0.0f, -1.08f, 0.27f, -2.1f, 0.74f, -3.0f);
        mPath.lineTo(5.0f, 3.0f);
        mPath.rCubicTo(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        mPath.rLineTo(0f, 14.0f);
        mPath.rCubicTo(0.0f, 0.55f, 0.23f, 1.05f, 0.59f, 1.41f);
        mPath.rLineTo(9.82f, -9.82f);
        mPath.cubicTo(12.23f, 9.42f, 11.5f, 7.8f, 11.5f, 6.0f);
        mPath.close();
        mPath.moveTo(11.5f, 6.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}