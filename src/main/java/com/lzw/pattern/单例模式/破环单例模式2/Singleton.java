package com.lzw.pattern.单例模式.破环单例模式2;

/**
 * @author : lzw
 * @date : 2021/12/24
 * @since : 1.0
 */
public class Singleton{

    // private Singleton() { }

    private static volatile boolean flag = false;
    /**
     * 解决反射调用破环单例
     */
    private Singleton() {
        synchronized (Singleton.class){
            // 如果为ture，说明非第一次创建，抛出异常
            if (flag) {
                throw new RuntimeException("不能创建多个对象");
            }
            // 将flag的值设置为 true
            flag = true;
        }
    }

    private static class singletonHolder{
        private static final Singleton INTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return singletonHolder.INTANCE;
    }




}
