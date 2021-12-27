package com.lzw.pattern.建造者模式.demo1;

/**
 * 自行车，具体产品类
 *
 * @author : lzw
 * @date : 2021/12/27
 * @since : 1.0
 */
public class Bike {

    /**
     * 车架
     */
    private String frame;

    /**
     * 车座
     */
    private String seat;

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
