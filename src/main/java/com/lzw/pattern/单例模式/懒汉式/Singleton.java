package com.lzw.pattern.单例模式.懒汉式;

/**
 * 懒汉式，静态变量创建
 * 缺点：多线程下，会创建多个对象，出现线程安全问题，线程安全问题：上下文中，预期值与实际值不一致
 *
 * @author : lzw
 * @date : 2021/12/23
 * @since : 1.0
 */
public class Singleton {

    /**
     * 私有构造
     */
    private Singleton() { }

    /**
     * 声明静态变量
     */
    private static Singleton intence;

    public static Singleton getInstance() {
        // 只在首次调用时实例化一次，之后不在实例化新的对象
        // 线程2进行判断，此时线程1已经停滞，没有进行实例化对象，intance此时还是空的，会进入判断，线程1和线程2势必会创建两个对象
        if (intence == null) {
            // 线程1进入判断后等待，此时执行权已被线程2拿走
            intence = new Singleton();
        }
        return intence;
    }
}
