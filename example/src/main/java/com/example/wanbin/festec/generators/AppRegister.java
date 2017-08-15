package com.example.wanbin.festec.generators;

import com.example.annotations.AppRegisterGenerator;
import com.example.latte.wechat.templates.AppRegisterTemplate;

/**
 * Created by wanbin on 2017/8/15.
 */

@AppRegisterGenerator(
        packageName = "com.example.wanbin.festec",
        registerTemplate = AppRegisterTemplate.class)
public interface AppRegister {
}
