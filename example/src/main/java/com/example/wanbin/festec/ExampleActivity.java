package com.example.wanbin.festec;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;

import com.example.latte.activities.ProxyActivity;
import com.example.latte.delegates.LatteDelegate;
import com.example.latte.ec.launcher.LauncherDelegate;

public class ExampleActivity extends ProxyActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
    }

    @Override
    public LatteDelegate setRootDelegate() {
        // return new ExampleDelegate();
        return new LauncherDelegate();
        // return new LauncherScrollDelegate();
    }
}
