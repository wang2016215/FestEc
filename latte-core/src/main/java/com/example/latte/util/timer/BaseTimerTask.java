package com.example.latte.util.timer;

import java.util.TimerTask;

/**
 * Created by wanbin on 2017/7/29.
 */

public class BaseTimerTask extends TimerTask {

    private ITimerListener mITimerListener;

    public BaseTimerTask(ITimerListener timerListener) {
        mITimerListener = timerListener;
    }

    @Override
    public void run() {
        if (mITimerListener != null) {
            mITimerListener.onTimer();
        }
    }
}
