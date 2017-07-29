package com.example.latte.net.rx;

import android.content.Context;

import com.example.latte.net.RestCreator;
import com.example.latte.ui.loader.LoaderStyle;

import java.io.File;
import java.util.WeakHashMap;

import okhttp3.MediaType;
import okhttp3.RequestBody;

/**
 * Created by wanbin on 2017/7/18.
 */

public class RxRestClientBuilder {

    private static final WeakHashMap<String, Object> PARAMS = RestCreator.getParams();
    private String mUrl;
    private RequestBody mBody;
    private File mFile = null;
    private Context mContext = null;
    private LoaderStyle mLoaderStyle = null;

    RxRestClientBuilder() {

    }

    public final RxRestClientBuilder url(String url) {
        this.mUrl = url;
        return this;
    }

    public final RxRestClientBuilder params(WeakHashMap<String, Object> params) {
        PARAMS.putAll(params);
        return this;
    }

    public final RxRestClientBuilder params(String key, Object value) {

        PARAMS.put(key, value);
        return this;
    }

    public final RxRestClientBuilder raw(String raw) {

        this.mBody = RequestBody.create(MediaType.parse("application/json;charset=UTF-8"), raw);
        return this;
    }

    public final RxRestClientBuilder file(File file) {
        this.mFile = file;
        return this;
    }

    public final RxRestClientBuilder file(String file) {
        this.mFile = new File(file);
        return this;
    }

    public final RxRestClientBuilder loader(Context context, LoaderStyle style) {
        this.mContext = context;
        this.mLoaderStyle = style;
        return this;
    }

    public final RxRestClientBuilder loader(Context context) {
        this.mContext = context;
        this.mLoaderStyle = LoaderStyle.BallClipRotatePulseIndicator;

        return this;
    }

    public final RxRestClient build() {
        return new RxRestClient(PARAMS, mUrl, mBody, mFile, mContext, mLoaderStyle);
    }


}
