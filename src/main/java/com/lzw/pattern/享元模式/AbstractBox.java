package com.lzw.pattern.享元模式;

/**
 * 抽象享元角色
 * 方块类
 *
 * @author : lzw
 * @date : 2022/1/6
 * @since : 1.0
 */
public abstract class AbstractBox {

    /**
     * 获取图形的方法
     *
     * @return
     */
    public abstract String getShape();

    /**
     * 显示图形及颜色
     *
     * @param color
     */
    public void display(String color) {
        System.out.println("方块形状：" + this.getShape() + "，颜色：" + color);
    }

}
