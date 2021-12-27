package com.lzw.pattern.单例模式.饿汉式;

/**
 * 静态变量创建类的对象,类加载时就会创建对象的实例
 *
 * 优点：线程安全，调用时反应速度快
 * 缺点：如果该类一直没有被使用，势必会造成一定内存浪费
 *
 * @author : lzw
 * @date : 2021/12/23
 * @since : 1.0
 */
public class Singleton1 {

    /**
     * 1.私有构造方法，外界无法实例化该类
     */
    private Singleton1(){}

    /**
     * 在本类中创建本类对象
     */
    private static Singleton1 singleton1 = new Singleton1();

    /**
     * 提供一个公共的访问方式，让外界获取该对象
     * 私有构造方法无法被外界实例化
     * @return
     */
    public static Singleton1 getInstance() {
        return singleton1;
    }

}
