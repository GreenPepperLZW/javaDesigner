package com.lzw.pattern.config_factory.child;

import com.lzw.pattern.config_factory.Coffee;

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
