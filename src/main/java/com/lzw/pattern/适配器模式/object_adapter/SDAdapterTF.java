package com.lzw.pattern.适配器模式.object_adapter;

import com.lzw.pattern.适配器模式.object_adapter.sdcard.SdCard;
import com.lzw.pattern.适配器模式.object_adapter.tfcard.TfCard;
import com.lzw.pattern.适配器模式.object_adapter.tfcard.TfCardImpl;

/**
 * 适配器类
 * 聚合适配者类，不用再去继承适配者类了，实现目标类
 * 即使目标类没有规范接口的情况下，也可以使用，应为适配器类必须继承目标类，而一个类不能同时继承两个类，满足了合成复用原则
 *
 * @author : lzw
 * @date : 2021/12/30
 * @since : 1.0
 */
public class SDAdapterTF implements SdCard {

    /**
     * 声明适配者类
     */
    private TfCard tfCard;

    public SDAdapterTF(TfCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public void readSD() {
        System.out.println("adapter read tf card");
        tfCard.readSD();
    }

    @Override
    public void writeSD() {
        System.out.println("adapter write tf card");
        tfCard.readSD();
    }
}
