package com.lzw.pattern.建造者模式.demo1;

/**
 * ofo单车具体构建者
 *
 * @author : lzw
 * @date : 2021/12/27
 * @since : 1.0
 */
public class OfoBuilder extends Builder {

    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
