package com.lzw.pattern.适配器模式.class_adapter.tfcard;

/**
 * TF卡接口，定义TF卡规范
 * 适配器模式中的适配者类，电脑只能适配sd卡，想要适配tf卡，必须使用到适配器
 *
 * @author : lzw
 * @date : 2021/12/30
 * @since : 1.0
 */
public interface TfCard {

    /**
     * 读功能
     */
    void readSD();

    /**
     * 写功能
     */
    void writeSD();
}
