package com.lzw.pattern.建造者模式.demo1;

/**
 * 抽象构造者
 *
 * @author : lzw
 * @date : 2021/12/27
 * @since : 1.0
 */
public abstract class Builder {

    /**
     * 声明bike实例
     */
    protected Bike bike = new Bike();

    /**
     * 构建车架
     */
    public abstract void buildFrame();

    /**
     * 构建车座
     */
    public abstract void buildSeat();

    /**
     * 构建自行车
     *
     * @return 自行车
     */
    public abstract Bike createBike();


}
