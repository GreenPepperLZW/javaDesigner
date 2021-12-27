package com.lzw.pattern.原型模式.deepclone;


/**
 * 颁发奖状测试类
 * 演示浅克隆出现的问题
 * 对象的创建非常复杂时，可以使用克隆模式进行快捷的创建对象
 *
 * @author : lzw
 * @date : 2021/12/27
 * @since : 1.0
 */
public class CitaionTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        Citation ciation1 = new Citation();
        Student stu = new Student();
        stu.setName("张三");
        ciation1.setStudent(stu);

        Citation ciation2 = ciation1.clone();
        /**
         * 浅克隆时，克隆后的对象中的引用类型属性还是指向原型对象
         * 所以在修改克隆对象中引用类型时，同时也改变了原型对象中对应属性的值，克隆对象和原型对象的引用类型属性指向同一个地址
         */
        ciation2.getStudent().setName("李四");

        ciation1.show();
        ciation2.show();

    }
}
