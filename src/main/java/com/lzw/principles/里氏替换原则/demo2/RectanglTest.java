package com.lzw.principles.里氏替换原则.demo2;

/**
 * 优化后测试类
 *
 * @author : lzw
 * @date : 2021/12/22
 * @since : 1.0
 */
public class RectanglTest {

    public static void main(String[] args) {
        //创建长方形对象
        Rectangle r = new Rectangle();
        r.setLength(20);
        r.setWidth(10);
        //调用方法进行扩宽操作
        resize(r);

        printLengthAndWidth(r);
    }

    /**
     * 扩宽的方法
     *
     * @param rectangle
     */
    public static void resize(Rectangle rectangle) {
        //判断宽如果比长小，进行扩宽的操作
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    /**
     * 打印长和宽
     *
     * @param quadrilateral
     */
    public static void printLengthAndWidth(Quadrilateral quadrilateral) {
        System.out.println(quadrilateral.getLength());
        System.out.println(quadrilateral.getWidth());
    }

}
