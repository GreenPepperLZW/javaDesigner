package com.lzw.principles.里氏替换原则.demo1;

/**
 * 测试类，违法里氏替换原则，正方形重写了父类长方形的设置长度、宽度的方法，导致出现死循环
 * 正方形不是长方形
 *
 * @author : lzw
 * @date : 2021/12/22
 * @since : 1.0
 */
public class RectangelTest {
    public static void main(String[] args) {
        //创建长方形对象
        Rectangle r = new Rectangle();
        //设置长和宽
        r.setLength(20);
        r.setWidth(10);
        //调用resize方法进行扩宽
        resize(r);
        printLengthAndWidth(r);

        System.out.println("==================");
        //创建正方形对象
        Square s = new Square();
        //设置长和宽
        s.setLength(10);
        //调用resize方法进行扩宽
        resize(s);
        printLengthAndWidth(s);
    }

    /**
     * 扩宽方法
     */
    public static void resize(Rectangle rectangle) {
        //判断宽如果比长小，进行扩宽的操作
        while(rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    /**
     * 打印长和宽
     * @param rectangle
     */
    public static void printLengthAndWidth(Rectangle rectangle) {
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }
}
