package com.lzw.pattern.工厂模式_2.抽象工厂模式.factory;

import com.lzw.pattern.工厂模式_2.抽象工厂模式.Coffee;
import com.lzw.pattern.工厂模式_2.抽象工厂模式.Dessert;

/**
 * 抽象工厂,实现类为不同厂商
 *
 * @author : lzw
 * @date : 2021/12/24
 * @since : 1.0
 */
public interface Factory {

    /**
     * 咖啡工厂
     *
     * @return
     */
    Coffee createCoffee();

    /**
     * 甜点工厂
     *
     * @return
     */
    Dessert createDessert();
}
