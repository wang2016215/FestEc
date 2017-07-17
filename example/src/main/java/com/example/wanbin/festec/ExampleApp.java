package com.example.wanbin.festec;

import android.app.Application;

import com.example.latte.app.latte;
import com.example.latte.ec.icon.FontEcModule;
import com.joanzapata.iconify.fonts.FontAwesomeModule;

/**
 * Created by wanbin on 2017/7/14.
 */

public class ExampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        latte.init(this).
                withApiHost("http://127.0.0.1/").
                withIcon(new FontAwesomeModule()).
                withIcon(new FontEcModule()).
                configure();
    }
}
