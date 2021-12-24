package com.lzw.pattern.工厂模式_2.简单工厂模式;

import com.lzw.pattern.工厂模式_2.简单工厂模式.child.AmericanCoffee;
import com.lzw.pattern.工厂模式_2.简单工厂模式.child.LatteCoffee;

/**
 * 简单咖啡工厂类，生产咖啡
 *
 * 优点：解决了咖啡店（客户端）和具体咖啡实现类的耦合，封装了创建对象的过程，可以通过参数直接获取对象，把对象的创建和业务逻辑分开，如果要实现
 *      新的产品，直接修改工厂即可，不需要需改客户端代码
 * 缺点：产生了新的耦合，工厂和具体咖啡实现类的耦合，如果需要加入新的咖啡种类，必须要修改工厂
 *
 * @author : lzw
 * @date : 2021/12/24
 * @since : 1.0
 */
public class SimpleCoffeeFactory {

    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("咖啡不存在");
        }
        return coffee;
    }
}
