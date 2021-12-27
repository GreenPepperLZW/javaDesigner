package com.lzw.pattern.单例模式.懒汉式;

/**
 * 懒汉式，双重检查锁方式
 *
 * 缺点：该方式在多线程的情况下会出现空指针的异常
 *
 * @author : lzw
 * @date : 2021/12/23
 * @since : 1.0
 */
public class Singleton3 {

    /**
     * 私有构造方法
     */
    private Singleton3(){}

    /**
     * 声明静态私有变量
     */
    private static Singleton3 intance;

    /**
     * 对外提供调用方法
     */
    public static Singleton3 getInstance() {
        //第一次判断，如果singleton不为nuLl,直接返回，不需要抢占锁
        if (intance == null) {
            synchronized (Singleton3.class){
                if (intance == null) {
                    intance = new Singleton3();
                }
            }
        }
        return intance;
    }
}
