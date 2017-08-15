package com.example.wanbin.festec.generators;

import com.example.annotations.EntryGenerator;
import com.example.latte.wechat.templates.WXEntryTemplate;

/**
 * Created by wanbin on 2017/8/15.
 */

@EntryGenerator(
        packageName = "com.example.wanbin.festec",
        entryTemplete = WXEntryTemplate.class)
public interface WeChatEntry {
}
