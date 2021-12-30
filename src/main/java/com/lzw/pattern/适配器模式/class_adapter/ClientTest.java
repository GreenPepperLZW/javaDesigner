package com.lzw.pattern.适配器模式.class_adapter;

import com.lzw.pattern.适配器模式.class_adapter.sdcard.SdCardImpl;

/**
 * 类适配器 测试类
 * <p>
 * 将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作。
 *
 * @author : lzw
 * @date : 2021/12/30
 * @since : 1.0
 */
public class ClientTest {
    public static void main(String[] args) {

        // 创建电脑类
        Computer computer = new Computer();
        // 读取sd卡中的数据
        String s = computer.readSD(new SdCardImpl());
        System.out.println(s);

        // 读取tf卡中的数据,使用适配器类作为参数进行传递
        String s1 = computer.readSD(new SDAdapterTF());
        System.out.println(s1);
    }
}
