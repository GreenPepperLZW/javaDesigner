package com.lzw.principles.里氏替换原则.demo2;

/**
 * 正方形类
 *
 * @author : lzw
 * @date : 2021/12/22
 * @since : 1.0
 */
public class Square implements Quadrilateral {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getLength() {
        // 长和宽一致
        return side;
    }

    @Override
    public double getWidth() {
        // 长和宽一致
        return side;
    }
}
