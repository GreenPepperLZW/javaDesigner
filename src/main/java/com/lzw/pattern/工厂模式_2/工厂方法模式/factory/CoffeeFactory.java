package com.lzw.pattern.工厂模式_2.工厂方法模式.factory;

import com.lzw.pattern.工厂模式_2.简单工厂模式.Coffee;

/**
 * 抽象工厂
 *
 * @author : lzw
 * @date : 2021/12/24
 * @since : 1.0
 */
public interface CoffeeFactory {

    /**
     * 创建咖啡的方法
     *
     * @return
     */
    Coffee createCoffee();
}
