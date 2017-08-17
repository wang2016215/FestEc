package com.example.wanbin.festec;

import android.app.Application;

import com.example.latte.app.Latte;
import com.example.latte.ec.datebase.DatabaseManager;
import com.example.latte.ec.icon.FontEcModule;
import com.example.latte.net.interceptors.DebugInterceptor;
import com.joanzapata.iconify.fonts.FontAwesomeModule;

/**
 * Created by wanbin on 2017/7/14.
 */

public class ExampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Latte.init(this).
                withApiHost("http://192.168.17.24/").
                withIcon(new FontAwesomeModule()).
                withIcon(new FontEcModule()).
                withLoaderDelayed(1000).
                withWeChatAppId("").
                withWeChatAppSecret("").
                withInterceptor(new DebugInterceptor("index", R.raw.test)).
                configure();

        DatabaseManager.getInstance().init(this);
    }
}
