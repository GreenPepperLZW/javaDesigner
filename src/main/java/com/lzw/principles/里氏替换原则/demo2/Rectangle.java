package com.lzw.principles.里氏替换原则.demo2;

/**
 * 长方形类
 *
 * @author : lzw
 * @date : 2021/12/22
 * @since : 1.0
 */
public class Rectangle implements Quadrilateral{

    private double length;
    private double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }
}
