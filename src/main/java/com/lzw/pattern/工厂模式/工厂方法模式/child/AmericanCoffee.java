package com.lzw.pattern.工厂模式.工厂方法模式.child;

import com.lzw.pattern.工厂模式.工厂方法模式.Coffee;

/**
 * 美式咖啡类
 *
 * @author : lzw
 * @date : 2021/12/24
 * @since : 1.0
 */
public class AmericanCoffee extends Coffee {
    @Override
    public String getName() {
        return "美式咖啡";
    }
}
