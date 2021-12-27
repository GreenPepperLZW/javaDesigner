package com.lzw.pattern.单例模式.懒汉式;

/**
 * @author : lzw
 * @date : 2021/12/24
 * @since : 1.0
 */
public class ClientTest {
    public static void main(String[] args) {

        Singleton5  instance = Singleton5.getInstance();
        Singleton5  instance2 = Singleton5.getInstance();
        System.out.println(instance == instance2);
    }
}
