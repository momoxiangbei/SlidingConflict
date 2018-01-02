package com.haha.mmxb.slidingconflict;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

/**
 * Created by xueying on 2018/1/2.
 */

public class MyScrollView extends ScrollView {

    private int mLastMotionY;
    private int mLastMotionX;

    public MyScrollView(Context context) {
        super(context);
    }

    public MyScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public boolean onInterceptTouchEvent(MotionEvent e) {
        int y = (int) e.getRawY();
        int x = (int) e.getRawX();
        boolean resume = false;
        switch (e.getAction()) {
            case MotionEvent.ACTION_DOWN:
                // 发生down事件时,记录y坐标
                mLastMotionY = y;
                mLastMotionX = x;
                resume = false;
                break;
            case MotionEvent.ACTION_MOVE:
                // deltaY > 0 是向下运动,< 0是向上运动
                int deltaY = y - mLastMotionY;
                int deleaX = x - mLastMotionX;

                if (Math.abs(deleaX) > Math.abs(deltaY)) {
                    resume = false;
                } else {
                    //当前正处于滑动
//                    if (isRefreshViewScroll(deltaY)) {
//                        resume = true;
//                    }
                }
                break;
            case MotionEvent.ACTION_UP:
            case MotionEvent.ACTION_CANCEL:
                break;
        }
        return resume;
    }


}
