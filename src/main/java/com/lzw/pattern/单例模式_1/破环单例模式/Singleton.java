package com.lzw.pattern.单例模式_1.破环单例模式;

import java.io.Serializable;

/**
 * @author : lzw
 * @date : 2021/12/24
 * @since : 1.0
 */
public class Singleton implements Serializable {
    private Singleton() { }

    private static class singletonHolder implements Serializable{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return singletonHolder.INSTANCE;
    }


    /**
     * 解决序列化反序列化破解单例模式
     *
     * 反序列化时会调用到{@link ObjectInputStream#readOrdinaryObject(boolean)}这个方法，在方法中有一个判断 hasReadResolveMethod()
     * 判断是否有readResolve()方法，如果有则会调用该方法创建对象
     *
     * 定义该方法，方法中返回同一个实例即可
     */
    private Object readResolve() {
        return singletonHolder.INSTANCE;
    }

}
