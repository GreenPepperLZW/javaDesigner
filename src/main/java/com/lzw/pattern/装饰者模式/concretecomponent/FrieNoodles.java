package com.lzw.pattern.装饰者模式.concretecomponent;

import com.lzw.pattern.装饰者模式.FastFood;

/**
 * 炒面类继承快餐店
 * <p>
 * 抽象构建角色的具体构建
 * </p>
 *
 * @author : lzw
 * @date : 2021/12/31
 * @since : 1.0
 */
public class FrieNoodles extends FastFood {

    public FrieNoodles() {
        super(20,"炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
