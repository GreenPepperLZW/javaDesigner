package com.lzw.pattern.单例模式_1.饿汉式;

import com.lzw.pattern.单例模式_1.饿汉式.Singleton1;

/**
 * 测试类
 *
 * @author : lzw
 * @date : 2021/12/23
 * @since : 1.0
 */
public class ClientTest {
    public static void main(String[] args) {

        // 创建Singleton1的对象
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();
        // 判断获取的两个对象是否时同一个对象
        System.out.println(singleton1 == singleton2);


        // 创建Singleton2的对象
        Singleton2 singleton21 = Singleton2.getInstance();
        Singleton2 singleton22 = Singleton2.getInstance();
        System.out.println(singleton21 == singleton22);

    }
}
