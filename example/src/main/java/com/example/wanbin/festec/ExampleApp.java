package com.example.wanbin.festec;

import android.app.Application;

import com.example.latte.app.latte;

/**
 * Created by wanbin on 2017/7/14.
 */

public class ExampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        latte.init(this).
                withApiHost("http://127.0.0.1/").
                configure();
    }
}
