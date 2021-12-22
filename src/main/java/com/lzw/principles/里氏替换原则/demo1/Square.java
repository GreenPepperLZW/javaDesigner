package com.lzw.principles.里氏替换原则.demo1;

/**
 * @version : 1.0
 * @Author : lzw
 * @Date : 2021/12/22 13:38
 * @Description : 正方形类
 */
public class Square extends Rectangle{

    /**
     * 正方形的长和宽保持一致
     * @param length 长度
     */
    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
}
