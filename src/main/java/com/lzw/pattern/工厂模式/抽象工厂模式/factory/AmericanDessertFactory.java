package com.lzw.pattern.工厂模式.抽象工厂模式.factory;

import com.lzw.pattern.工厂模式.抽象工厂模式.Coffee;
import com.lzw.pattern.工厂模式.抽象工厂模式.Dessert;
import com.lzw.pattern.工厂模式.抽象工厂模式.child.AmericanCoffee;
import com.lzw.pattern.工厂模式.抽象工厂模式.child.MatchMousse;

/**
 * 美式甜点工厂
 *
 * @author : lzw
 * @date : 2021/12/24
 * @since : 1.0
 */
public class AmericanDessertFactory implements Factory {

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchMousse();
    }
}
