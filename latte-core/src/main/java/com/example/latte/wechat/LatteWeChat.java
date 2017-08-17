package com.example.latte.wechat;

import android.app.Activity;

import com.example.latte.app.ConfigKeys;
import com.example.latte.app.Latte;
import com.example.latte.wechat.callbacks.IWeChatSignInCallback;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

/**
 * Created by wanbin on 2017/8/15.
 */

public class LatteWeChat {
    public static final String APP_ID = Latte.getConfiguration(ConfigKeys.WE_CHAT_APP_ID);
    public static final String APP_SECRET = Latte.getConfiguration(ConfigKeys.WE_CHAT_APP_SECRET);
    private IWXAPI mIWXAPI;

    private IWeChatSignInCallback mSignInCallback;

    private static final class Holder {
        private static final LatteWeChat INSTANCE = new LatteWeChat();
    }

    public static LatteWeChat getInstance() {
        return Holder.INSTANCE;
    }

    private LatteWeChat() {
        final Activity activity = Latte.getConfiguration(ConfigKeys.ACTIVITY);
        mIWXAPI = WXAPIFactory.createWXAPI(activity, APP_ID, true);
        mIWXAPI.registerApp(APP_ID);
    }

    public final IWXAPI getIWXAPI() {
        return mIWXAPI;
    }

    public LatteWeChat onSignSuccess(IWeChatSignInCallback signInCallback) {
        this.mSignInCallback = signInCallback;
        return this;
    }

    public IWeChatSignInCallback getSignInCallback() {
        return mSignInCallback;
    }


    public final void signIn() {
        final SendAuth.Req req = new SendAuth.Req();
        req.scope = "snsapi_userinfo";
        req.state = "random_state";
        mIWXAPI.sendReq(req);
    }
}
