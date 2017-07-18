package com.example.wanbin.festec;

import com.example.latte.activities.ProxyActivity;
import com.example.latte.delegates.LatteDelegate;

public class ExampleActivity extends ProxyActivity {


    @Override
    public LatteDelegate setRootDelegate() {
        return new ExampleDelegate();
    }
}
