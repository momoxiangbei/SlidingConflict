package com.haha.mmxb.slidingconflict;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ScrollView;

/**
 * Created by xueying on 2018/1/2.
 * <p>
 * 解决方法之一，可以参考
 */

public class MyScrollViewS extends ScrollView {

    private GestureDetector mGestureDetector;

    public MyScrollViewS(Context context) {
        this(context, null);
    }

    public MyScrollViewS(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyScrollViewS(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mGestureDetector = new GestureDetector(context, new MScrollDetector());
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        return super.onInterceptTouchEvent(event)
                && mGestureDetector.onTouchEvent(event);
    }


    class MScrollDetector extends GestureDetector.SimpleOnGestureListener {
        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            return (Math.abs(distanceY) > Math.abs(distanceX));
        }
    }
}
