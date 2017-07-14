package com.example.latte.app;

import android.content.Context;

import java.util.WeakHashMap;

/**
 * Created by wanbin on 2017/7/14.
 */

public  final class latte {


    public static Configurator init(Context context){

        getConfigurations().put(ConfigType.APPLICATION_CONTEXT.name(),context.getApplicationContext());
        return Configurator.getInstance();
    }

    private static WeakHashMap<String,Object> getConfigurations(){
        return Configurator.getInstance().getLatteConfigs();
    }
}
