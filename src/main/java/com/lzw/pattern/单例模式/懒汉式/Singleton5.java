package com.lzw.pattern.单例模式.懒汉式;

/**
 *  静态类部类方式创建
 *  优点：第一次加载Singleton类时不会去初始化INSTANCE，只有第一次调用getInstance，虚拟机加载SingletonHolder
 *  并初始化INSTANCE，这样不仅能确保线程安全，也能保证 Singleton 类的唯一性。
 *
 *  在没有加任何锁的情况下，保证了多线程下的安全，并且没有任何性能影响和空间的浪费。
 *
 *  在其他许多框架中都使用了此方式
 *
 * @author : lzw
 * @date : 2021/12/23
 * @since : 1.0
 */
public class Singleton5 {

    /**
     * 私有构造方法
     */
    private Singleton5() {}

    /**
     * 定义一个静态类部类
     */
    private static class SingletonHolder {
        private static final Singleton5 INTENCE = new Singleton5();
    }

    /**
     * 提供公共的访问方式
     */
    public static Singleton5 getInstance() {
        return SingletonHolder.INTENCE;
    }
}
