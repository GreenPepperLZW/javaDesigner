package com.lzw.pattern.外观模式;

/**
 * 空调类
 *
 * @author : lzw
 * @date : 2022/1/4
 * @since : 1.0
 */
public class AirCondition {

    /**
     * 打开空调
     */
    public void on() {
        System.out.println("打开了空调....");
    }

    /**
     * 关闭空调
     */
    public void off() {
        System.out.println("关闭了空调....");
    }
}
