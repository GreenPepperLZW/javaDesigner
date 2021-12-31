package com.lzw.pattern.装饰者模式;

/**
 * 快餐店类
 * 抽象构件角色
 *
 * @author : lzw
 * @date : 2021/12/31
 * @since : 1.0
 */
public abstract class FastFood {

    /**
     * 价格
     */
    private float price;

    /**
     * 描述
     */
    private String desc;

    public FastFood() {
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 计算价格
     * @return 总价格
     */
    public abstract float cost();
}
