package com.lzw.pattern.装饰者模式;

/**
 * 装饰者类
 * 抽象装饰（Decorator）角色，继承抽象构建角色
 *
 * @author : lzw
 * @date : 2021/12/31
 * @since : 1.0
 */
public abstract class Garnisher extends FastFood{

    /**
     * 声明抽象构建角色
     */
    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnisher(FastFood fastFood,float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }
}
