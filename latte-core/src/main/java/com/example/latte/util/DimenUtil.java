package com.example.latte.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;

import com.example.latte.app.Latte;

/**
 * Created by wangbin on 2017/7/19
 */

public final class DimenUtil {

    public static int getScreenWidth() {
        final Resources resources = Latte.getApplicationContext().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.widthPixels;
    }

    public static int getScreenHeight() {
        final Resources resources = Latte.getApplicationContext().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.heightPixels;
    }
}
