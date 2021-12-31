package com.lzw.pattern.装饰者模式.concretecomponent;

import com.lzw.pattern.装饰者模式.FastFood;

/**
 * 炒饭类继承快餐店
 * <p>
 * 抽象构建角色的具体构建
 * </p>
 *
 * @author : lzw
 * @date : 2021/12/31
 * @since : 1.0
 */
public class FrieRice extends FastFood {

    public FrieRice() {
        // 调用父类的构造方法，给价格和描述赋值
        super(10, "炒饭");
    }

    @Override
    public float cost() {
        // 获取价格，构造方法中已经给price赋过值了
        return getPrice();
    }
}
