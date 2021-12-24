package com.lzw.pattern.工厂模式_2.demo;

/**
 * 测试类，点咖啡
 *
 * @author : lzw
 * @date : 2021/12/24
 * @since : 1.0
 */
public class ClientTest {
    public static void main(String[] args) {
        // 创建咖啡店类
        CoffeeStore store = new CoffeeStore();
        // 点咖啡
        Coffee coffee = store.orderCoffee("latte");
        System.out.println(coffee.getName());
    }
}
