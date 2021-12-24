package com.lzw.pattern.工厂模式_2.工厂方法模式;

import com.lzw.pattern.工厂模式_2.工厂方法模式.factory.CoffeeFactory;
import com.lzw.pattern.工厂模式_2.简单工厂模式.Coffee;
import com.lzw.pattern.工厂模式_2.简单工厂模式.SimpleCoffeeFactory;

/**
 * 咖啡店类，点咖啡
 *
 * @author : lzw
 * @date : 2021/12/24
 * @since : 1.0
 */
public class CoffeeStore {

    private CoffeeFactory coffeeFactory;

    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    /**
     * 点咖啡功能
     * @return
     */
    public Coffee orderCoffee() {
        Coffee coffee = coffeeFactory.createCoffee();
        coffee.addSugr();
        coffee.addMilk();
        return coffee;
    }
}
