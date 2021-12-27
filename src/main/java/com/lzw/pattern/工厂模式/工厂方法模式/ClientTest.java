package com.lzw.pattern.工厂模式.工厂方法模式;

import com.lzw.pattern.工厂模式.工厂方法模式.factory.LatteCoffeeFacotry;
import com.lzw.pattern.工厂模式.简单工厂模式.Coffee;

/**
 * 工厂方法模式测试类
 * <p>
 * 优点：
 * 用户只需要知道具体工厂的名称就可得到所要的产品，无须知道产品的具体创建过程；
 * 在系统增加新的产品时只需要添加具体产品类和对应的具体工厂类，无须对原工厂进行任何修改，满足开闭原则
 * 缺点：
 * 每增加一个产品就要增加一个具体产品类和一个对应的具体工厂类，这增加了系统的复杂度
 *
 * @author : lzw
 * @date : 2021/12/24
 * @since : 1.0
 */
public class ClientTest {
    public static void main(String[] args) {
        // 创建咖啡店对象
        CoffeeStore store = new CoffeeStore();
        // 通过工厂获取对象
        // AmericanCoffeeFacotry americanCoffee = new AmericanCoffeeFacotry();
        LatteCoffeeFacotry latteCoffee = new LatteCoffeeFacotry();
        store.setCoffeeFactory(latteCoffee);
        // 点咖啡
        Coffee coffee = store.orderCoffee();
        System.out.println(coffee.getName());
    }
}
