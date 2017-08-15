package com.example.latte.wechat;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;

/**
 * Created by wanbin on 2017/8/15.
 */

public abstract class BaseWXActivity extends AppCompatActivity implements IWXAPIEventHandler {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        //这个必须写在onCreate中
        LatteWeChat.getInstance().getIWXAPI().handleIntent(getIntent(), this);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        LatteWeChat.getInstance().getIWXAPI().handleIntent(getIntent(), this);
    }
}
