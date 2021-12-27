package com.lzw.pattern.工厂模式.demo;

import com.lzw.pattern.工厂模式.demo.child.AmericanCoffee;
import com.lzw.pattern.工厂模式.demo.child.LatteCoffee;

/**
 * 咖啡店类，生产咖啡
 *
 * @author : lzw
 * @date : 2021/12/24
 * @since : 1.0
 */
public class CoffeeStore {

    /**
     * 创建咖啡
     *
     * @param type
     * @return
     */
    public Coffee orderCoffee(String type) {
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("咖啡不存在");
        }
        // 如果之后要添加新的咖啡品种，必须要修改该类，会违背开闭原则
        coffee.addMilk();
        coffee.addSugr();
        return coffee;
    }
}
