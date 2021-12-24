package com.lzw.pattern.单例模式_1.懒汉式;

/**
 * 懒汉式，双重检查锁方式,使用 volatile 修饰变量
 *
 * 利用 volatile 的有序性，保证不会出现指令重排的情况
 *
 *
 * @author : lzw
 * @date : 2021/12/23
 * @since : 1.0
 */
public class Singleton4 {

    /**
     * 私有构造方法
     */
    private Singleton4(){}

    /**
     * 声明静态私有变量
     */
    private static volatile Singleton4 intance;

    /**
     * 对外提供调用方法
     */
    public static Singleton4 getInstance() {
        //第一次判断，如果singleton不为nuLl,直接返回，不需要抢占锁
        if (intance == null) {
            synchronized (Singleton4.class){
                if (intance == null) {
                    intance = new Singleton4();
                }
            }
        }
        return intance;
    }
}
