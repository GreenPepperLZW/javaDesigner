package com.lzw.pattern.原型模式.deepclone;


import java.io.*;

/**
 * 颁发奖状测试类
 * 演示深克隆
 * 对象的创建非常复杂时，可以使用克隆模式进行快捷的创建对象
 *
 * @author : lzw
 * @date : 2021/12/27
 * @since : 1.0
 */
public class CitaionTest2 {
    public static void main(String[] args) throws Exception{

        Citation ciation1 = new Citation();
        Student stu = new Student();
        stu.setName("张三");
        ciation1.setStudent(stu);


        // 创建输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/a.txt"));
        // 写对象
        oos.writeObject(ciation1);
        // 释放资源
        oos.close();


        // 创建输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/a.txt"));
        // 读对象
        Citation ciation2 = (Citation) ois.readObject();
        // 释放资源
        ois.close();
        Student student = new Student();
        student.setName("李四");
        ciation2.setStudent(student);

        ciation1.show();
        ciation2.show();
    }
}
