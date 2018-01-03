package com.haha.mmxb.slidingconflict;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ScrollView;

/**
 * Created by xueying on 2018/1/2.
 * <p>
 * 解决方法之一，可以参考
 */

public class MyScrollView extends ScrollView {

    private int downY;
    private int mTouchSlop;

    public MyScrollView(Context context) {
        this(context, null);
    }

    public MyScrollView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        int action = event.getAction();
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                downY = (int) event.getRawY();
                break;
            case MotionEvent.ACTION_MOVE:
                int moveY = (int) event.getRawY();
                if (Math.abs(moveY - downY) > mTouchSlop) {
                    return true;
                }
                break;
        }

        return super.onInterceptTouchEvent(event);
    }


}
