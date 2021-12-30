package com.lzw.pattern.适配器模式.class_adapter.tfcard;

/**
 *
 * TF卡实现列
 *
 * @author : lzw
 * @date : 2021/12/30
 * @since : 1.0
 */
public class TfCardImpl implements TfCard {

    @Override
    public void readSD() {
        System.out.println("从TF卡读数据");
    }

    @Override
    public void writeSD() {
        System.out.println("往TF卡写数据");
    }
}
