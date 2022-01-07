package com.lzw.pattern.策略模式;

/**
 * 策略模式：
 * 该模式定义了一系列算法，并将每个算法封装起来，使它们可以相互替换，
 * 且算法的变化不会影响使用算法的客户。策略模式属于对象行为模式，它通过对算法进行封装，把使用算法的责任和算法的实现分割开来，并委派给不同的对象对这些算法进行管理。
 * <p>
 * 策略模式的主要角色如下：
 * <p>
 * 抽象策略（Strategy）类：这是一个抽象角色，通常由一个接口或抽象类实现。此角色给出所有的具体策略类所需的接口。
 * 具体策略（Concrete Strategy）类：实现了抽象策略定义的接口，提供具体的算法实现或行为。
 * 环境（Context）类：持有一个策略类的引用，最终给客户端调用。
 *
 * @author : lzw
 * @date : 2022/1/6
 * @since : 1.0
 */
public class ClientTest {
    public static void main(String[] args) {
        System.out.println("=======春节=========");
        // 过年了，使用春节促销活动
        SaleMan man = new SaleMan(new StrategyA());
        // 展示促销活动
        man.saleManShow();

        System.out.println("=======中秋节=========");
        man = new SaleMan(new StrategyB());
        man.saleManShow();

        System.out.println("=======圣诞节=========");
        man = new SaleMan(new StrategyC());
        man.saleManShow();
    }
}
