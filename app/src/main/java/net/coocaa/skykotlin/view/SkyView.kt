package net.coocaa.skykotlin.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Point
import android.util.AttributeSet
import android.util.Log
import android.view.View

/**
 * @name SkyKotlin
 * @package name：net.coocaa.skykotlin.view
 * @author chenguo QQ:1349100246
 * @time 2021/2/22 15:19
 * @chang time
 * @describe describe
 */
open class SkyView constructor(context: Context, attr: AttributeSet? = null, defStyle: Int = 0) :
    View(context, attr, defStyle) {
    private val TAG = "SkyView"
    private val mCtx: Context = context;
    var mPaint: Paint

    constructor(context: Context) : this(context, null, 0) {

    }

    constructor(context: Context, attr: AttributeSet?) : this(context, null, 0) {

    }

    init {
        Log.d(TAG, " SkyView init method invoked.")
        mPaint = Paint();
        mPaint.color = Color.RED;
        mPaint.isAntiAlias = true
        mPaint.strokeWidth = 5.0f
    }


    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        var widthMode: Int = MeasureSpec.getMode(widthMeasureSpec)
        var width  = MeasureSpec.getSize(widthMeasureSpec)
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }


    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        var o: Any;

        var center: Point = Point(measuredWidth / 2, measuredHeight / 2)
        var circleRadius: Int = (measuredWidth / 2).coerceAtMost(measuredHeight / 2)
        canvas?.drawCircle(center.x.toFloat(), center.y.toFloat(), circleRadius.toFloat(), mPaint)

        var str: String = ""
        var v = str.run {
            2
        }

    }

}