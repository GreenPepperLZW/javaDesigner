package com.lzw.pattern.装饰者模式;

import com.lzw.pattern.装饰者模式.concretecomponent.FrieRice;
import com.lzw.pattern.装饰者模式.concretedecorator.Bacon;
import com.lzw.pattern.装饰者模式.concretedecorator.Egg;

/**
 * 装饰者模式测试
 * <p>
 * 装饰者模式中有以下角色
 *   抽象构件（Component）角色 ：定义一个抽象接口以规范准备接收附加责任的对象。
 *   具体构件（Concrete  Component）角色 ：实现抽象构件，通过装饰角色为其添加一些职责。
 *   抽象装饰（Decorator）角色 ： 继承或实现抽象构件，并包含具体构件的实例，可以通过其子类扩展具体构件的功能。
 *   具体装饰（ConcreteDecorator）角色 ：实现抽象装饰的相关方法，并给具体构件对象添加附加的责任。
 * </p>
 *
 * @author : lzw
 * @date : 2021/12/31
 * @since : 1.0
 */
public class ClientTest {
    public static void main(String[] args) {
        // 点一份炒饭
        FastFood food = new FrieRice();
        System.out.println(food.getDesc() + "    " + food.cost()+"元");

        System.out.println("==========================");

        // 加一个鸡蛋
        food = new Egg(food);
        System.out.println(food.getDesc() + "    " + food.cost()+"元");
        System.out.println("==========================");

        // 再加一个蛋
        food = new Egg(food);
        System.out.println(food.getDesc() + "    " + food.cost()+"元");
        System.out.println("==========================");

        // 加一分培根
        food = new Bacon(food);
        System.out.println(food.getDesc() + "    " + food.cost()+"元");

    }
}
