package com.lzw.pattern.适配器模式.class_adapter;

import com.lzw.pattern.适配器模式.class_adapter.sdcard.SdCard;
import com.lzw.pattern.适配器模式.class_adapter.tfcard.TfCardImpl;

/**
 * 适配器类
 * 继承适配者类，实现目标类
 *
 * @author : lzw
 * @date : 2021/12/30
 * @since : 1.0
 */
public class SDAdapterTF extends TfCardImpl implements SdCard {

    @Override
    public void readSD() {
        System.out.println("adapter read tf card");
        super.readSD();
    }

    @Override
    public void writeSD() {
        System.out.println("adapter write tf card");
        super.readSD();
    }
}
