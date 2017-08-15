package com.example.wanbin.festec.generators;

import com.example.annotations.PayEntryGenerator;
import com.example.latte.wechat.templates.WXPayEntryTemplate;

/**
 * Created by wanbin on 2017/8/15.
 */

@PayEntryGenerator(
        packageName = "com.example.wanbin.festec",
        payEntryTemplete = WXPayEntryTemplate.class)
public interface WeChatPayEntry {
}
