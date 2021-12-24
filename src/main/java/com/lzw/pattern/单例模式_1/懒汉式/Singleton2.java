package com.lzw.pattern.单例模式_1.懒汉式;

/**
 * 懒汉式，使用同步锁线程安全方式创建
 * 优点：线程安全
 * 缺点：效率降低
 *
 * @author : lzw
 * @date : 2021/12/23
 * @since : 1.0
 */
public class Singleton2 {

    /**
     * 私有构造方法
     */
    private Singleton2() {}

    /**
     * 声明私有变量
     */
    private static Singleton2 intance;

    /**
     * 提供访问方法
     * 同步方法，一次是能有一个线程可以访问
     */
    private static synchronized Singleton2 getInstance() {
        if (intance == null) {
            intance = new Singleton2();
        }
        return intance;
    }

}
