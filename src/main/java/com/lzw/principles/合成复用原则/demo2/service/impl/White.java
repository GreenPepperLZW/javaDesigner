package com.lzw.principles.合成复用原则.demo2.service.impl;

import com.lzw.principles.合成复用原则.demo2.service.Color;

/**
 * @author : lzw
 * @date : 2021/12/23
 * @since : 1.0
 */
public class White implements Color {
    @Override
    public String getColor() {
        return "白色";
    }
}
