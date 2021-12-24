package com.lzw.pattern.config_factory;

/**
 * 简单工厂模式+配置文件实现的方式解除工厂对象和产品对象的耦合
 * 在工厂类中加载配置文件中的全类名，并创建对象进行存储，客户端如果需要对象，直接进行获取即可。
 *
 * @author : lzw
 * @date : 2021/12/24
 * @since : 1.0
 */
public class ClientTest {
    public static void main(String[] args) {

        Coffee american = CoffeeFactory.createCoffee("american");

        System.out.println(american.getName());

        System.out.println("================================");

        Coffee latte = CoffeeFactory.createCoffee("latte");

        System.out.println(latte.getName());
    }
}
