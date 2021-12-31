package com.lzw.pattern.装饰者模式.concretedecorator;

import com.lzw.pattern.装饰者模式.FastFood;
import com.lzw.pattern.装饰者模式.Garnisher;

/**
 * 培根类
 * 具体装饰角色
 *
 * @author : lzw
 * @date : 2021/12/31
 * @since : 1.0
 */
public class Bacon extends Garnisher {


    public Bacon(FastFood fastFood) {
        // 继承抽象类，如果抽象类只有有参构造必须实现该有参构造，抽象类无法直接实例化，只能通过子类去实例化
        super(fastFood, 2, "培根");
    }

    @Override
    public float cost() {
        // 总价格为培根的价格加上快餐的价格
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
