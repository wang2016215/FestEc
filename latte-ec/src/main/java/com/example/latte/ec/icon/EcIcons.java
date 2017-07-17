package com.example.latte.ec.icon;

import com.joanzapata.iconify.Icon;

/**
 * Created by wanbin on 2017/7/17.
 */

public enum EcIcons implements Icon {


    icon_ceshi('\ue606');

    private char character;

    EcIcons(char character) {
        this.character = character;
    }

    @Override
    public String key() {
        return name().replace('_', '-');
    }

    @Override
    public char character() {
        return character;
    }
}
