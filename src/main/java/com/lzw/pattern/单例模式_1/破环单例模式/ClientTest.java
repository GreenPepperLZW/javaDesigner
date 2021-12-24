package com.lzw.pattern.单例模式_1.破环单例模式;


import java.io.*;

/**
 * 序列化与反序列破环单例
 * 两次获取的不是同一个对象
 *
 * @author : lzw
 * @date : 2021/12/24
 * @since : 1.0
 */
public class ClientTest {
    public static void main(String[] args) throws Exception{
        writeObjectFile();

        System.out.println(readOjbectFromFile() == readOjbectFromFile());

    }

    /**
     * 从文件中获取对象
     */
    public static Singleton readOjbectFromFile() throws Exception{
        // 创建输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\a.txt"));
        // 读取对象
        Singleton singleton = (Singleton)ois.readObject();
        System.out.println(singleton);
        ois.close();
        return singleton;
    }

    /**
     * 像文件中写出对象
     */
    public static void writeObjectFile() throws Exception{
        Singleton single = Singleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\a.txt"));
        // 向文件中写出对象
        oos.writeObject(single);
        oos.close();
    }



}
