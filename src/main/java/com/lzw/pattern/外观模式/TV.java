package com.lzw.pattern.外观模式;

/**
 * 电视类
 *
 * @author : lzw
 * @date : 2022/1/4
 * @since : 1.0
 */
public class TV {
    /**
     * 打开电视
     */
    public void on() {
        System.out.println("打开了电视....");
    }

    /**
     * 关闭电视
     */
    public void off() {
        System.out.println("关闭了电视....");
    }
}
