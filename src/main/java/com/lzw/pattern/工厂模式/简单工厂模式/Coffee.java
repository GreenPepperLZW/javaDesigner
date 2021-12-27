package com.lzw.pattern.工厂模式.简单工厂模式;

/**
 * 咖啡类
 * @author : lzw
 * @date : 2021/12/24
 * @since : 1.0
 */
public abstract class Coffee {


    public abstract String getName();

    /**
     * 加糖
     */
    public void addSugr() {
        System.out.println("加糖");
    }

    /**
     * 加奶
     */
    public void addMilk() {
        System.out.println("加奶");
    }
}
