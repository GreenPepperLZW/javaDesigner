package com.lzw.pattern.外观模式;


/**
 * 灯类
 *
 * @author : lzw
 * @date : 2022/1/4
 * @since : 1.0
 */
public class Light {
    /**
     * 开灯
     */
    public void on() {
        System.out.println("打开了灯....");
    }

    /**
     * 关灯
     */
    public void off() {
        System.out.println("关闭了灯....");
    }
}
