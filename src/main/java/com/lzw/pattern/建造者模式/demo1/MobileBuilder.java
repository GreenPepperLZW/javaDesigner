package com.lzw.pattern.建造者模式.demo1;

/**
 * 具体的构建者，用来构建摩拜单车对象
 *
 * @author : lzw
 * @date : 2021/12/27
 * @since : 1.0
 */
public class MobileBuilder extends Builder {

    @Override
    public void buildFrame() {
        /**
         * 父类声明的bike变量 {@link Builder#bike }
         */
        bike.setFrame("碳纤维");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
