package com.lzw.pattern.建造者模式.demo1;

/**
 * 指挥者类
 * 指导具体构建者如何构建产品，控制调用先后次序，并向调用者返回完整的产品类
 * 但是有些情况下需要简化系统结构，可以把指挥者类和抽象建造者进行结合
 *
 * @author : lzw
 * @date : 2021/12/27
 * @since : 1.0
 */
public class Director {

    /**
     * 声明builder类型的变量
     */
    private Builder builder;


    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 组装自行车
     * @return
     */
    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
