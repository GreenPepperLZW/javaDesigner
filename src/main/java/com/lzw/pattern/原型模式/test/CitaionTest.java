package com.lzw.pattern.原型模式.test;

/**
 * 颁发奖状测试类
 *
 * 对象的创建非常复杂时，可以使用克隆模式进行快捷的创建对象
 *
 * @author : lzw
 * @date : 2021/12/27
 * @since : 1.0
 */
public class CitaionTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        Citation ciation1 = new Citation();

        Citation ciation2 = ciation1.clone();

        ciation1.setName("张三");
        ciation2.setName("李四");

        ciation1.show();
        ciation2.show();

    }
}
