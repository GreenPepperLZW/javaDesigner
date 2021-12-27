package com.lzw.pattern.单例模式.饿汉式;

/**
 * 静态代码块方式，类加载时就会创建对象的实例
 *
 * 优点：线程安全，调用时反应速度快
 * 缺点：如果该类一直没有被使用，势必会造成一定内存浪费
 *
 * @author : lzw
 * @date : 2021/12/23
 * @since : 1.0
 */
public class Singleton2 {
    /**
     * 私有构造方法
     */
    private Singleton2(){}

    /**
     * 声明 Singleton2 变量
     */
    private static Singleton2 singleton2;

    /**
     * 在静态代码块中进行赋值
     */
    static {
        singleton2 = new Singleton2();
    }

    /**
     * 对外提供获取该类对象的方法
     */
    public static Singleton2 getInstance() {
        return singleton2;
    }

}
