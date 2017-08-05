package com.example.latte.app;

import android.content.Context;

/**
 * Created by wanbin on 2017/7/14.
 */

public final class Latte {


    public static Configurator init(Context context){

        Configurator.getInstance()
                .getLatteConfigs()
                .put(ConfigKeys.APPLICATION_CONTEXT, context.getApplicationContext());
        return Configurator.getInstance();
    }

    public static Configurator getConfigurations() {
        return Configurator.getInstance();
    }

    public static <T> T getConfiguration(Object key) {
        return Configurator.getInstance().getConfiguration(key);
    }

    public static Context getApplicationContext() {
        return Configurator.getInstance()
                .getConfiguration(ConfigKeys.APPLICATION_CONTEXT);
    }
}
