package com.lzw.pattern.适配器模式.object_adapter;

import com.lzw.pattern.适配器模式.object_adapter.sdcard.SdCardImpl;
import com.lzw.pattern.适配器模式.object_adapter.tfcard.TfCardImpl;

/**
 * 对象适配器 测试类
 * 解决了类适配的不足
 * <p>
 * 适配器模式：将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作。
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
        System.out.println("================================");

        // 读取tf卡中的数据,使用适配器类作为参数进行传递
        // String s1 = computer.readSD(new SDAdapterTF(new TfCardImpl()));
        SDAdapterTF sdAdapterTF = new SDAdapterTF(new TfCardImpl());
        String s1 = computer.readSD(sdAdapterTF);
        System.out.println(s1);

    }
}
