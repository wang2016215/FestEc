package com.example.latte.app;

import java.util.WeakHashMap;

/**
 * Created by wanbin on 2017/7/14.
 */

public class Configurator {

    private static final WeakHashMap<String ,Object> LATTE_CONFIGS = new WeakHashMap<>();

    private Configurator(){
        LATTE_CONFIGS.put(ConfigType.CONFIG_READY.name(),false);
    }



    public static Configurator getInstance(){
        return Holder.instance;
    }

    final WeakHashMap<String ,Object> getLatteConfigs(){
        return LATTE_CONFIGS;
    }

    private static class Holder{
        private static final Configurator instance = new Configurator();
    }

    public final void configure(){
        LATTE_CONFIGS.put(ConfigType.CONFIG_READY.name(),true);
    }

    public final Configurator withApiHost(String Host){
        LATTE_CONFIGS.put(ConfigType.API_HOST.name(),Host);
        return this;
    }

    private void checkConfiguration(){
        final boolean isReady = (boolean) LATTE_CONFIGS.get(ConfigType.CONFIG_READY.name());

        if (!isReady){
            throw new RuntimeException("Configuration is not ready,call configrue");
        }
    }


    @SuppressWarnings("SuspiciousMethodCalls")
    final <T> T getConfiguration(Enum<ConfigType> key){
        checkConfiguration();
        return (T) LATTE_CONFIGS.get(key.name());
    }
}
