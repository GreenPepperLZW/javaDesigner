package com.lzw.pattern.工厂模式_2.工厂方法模式.factory;

import com.lzw.pattern.工厂模式_2.简单工厂模式.Coffee;
import com.lzw.pattern.工厂模式_2.简单工厂模式.child.AmericanCoffee;

/**
 * 美式咖啡实现工厂
 *
 * @author : lzw
 * @date : 2021/12/24
 * @since : 1.0
 */
public class AmericanCoffeeFacotry implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
