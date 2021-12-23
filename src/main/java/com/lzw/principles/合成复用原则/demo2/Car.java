package com.lzw.principles.合成复用原则.demo2;

import com.lzw.principles.合成复用原则.demo2.service.Color;

/**
 * @author : lzw
 * @date : 2021/12/23
 * @since : 1.0
 */
public abstract class Car {

    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void move();
}
