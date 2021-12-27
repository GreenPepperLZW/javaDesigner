package com.lzw.pattern.工厂模式.简单工厂模式.child;

import com.lzw.pattern.工厂模式.简单工厂模式.Coffee;

/**
 * 拿铁咖啡类
 * @author : lzw
 * @date : 2021/12/24
 * @since : 1.0
 */
public class LatteCoffee extends Coffee {

    @Override
    public String getName() {
        return "拿铁咖啡";
    }
}
