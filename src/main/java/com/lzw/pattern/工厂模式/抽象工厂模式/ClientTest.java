package com.lzw.pattern.工厂模式.抽象工厂模式;

import com.lzw.pattern.工厂模式.抽象工厂模式.factory.ItalyDessertFactory;

/**
 * 抽象工厂：是一种为访问类提供一个创建一组相关或相互依赖对象的接口，且访问类无须指定所要产品的具体类就能得到同族的不同等级的产品的模式结构
 * 抽象工厂模式是工厂方法模式的升级版本，工厂方法模式只生产一个等级的产品，而抽象工厂模式可生产多个等级的产品。
 * <p>
 * 优点：如果要加同一个产品族的话，只需要再加一个对应的工厂类即可，不需要修改其他的类
 *      当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。
 * 缺点：
 *      当产品族中需要增加一个新的产品时，所有的工厂类都需要进行修改。
 *
 * @author : lzw
 * @date : 2021/12/24
 * @since : 1.0
 */
public class ClientTest {
    public static void main(String[] args) {
        // 创建美式甜点工厂
        // Factory factory = new AmericanDessertFactory();
        // 创建意大利甜点工厂
        ItalyDessertFactory factory = new ItalyDessertFactory();
        // 拿铁咖啡
        Coffee coffee = factory.createCoffee();
        // 抹茶慕斯
        Dessert dessert = factory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();
    }
}
