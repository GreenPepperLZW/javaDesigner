package com.lzw.pattern.适配器模式.class_adapter;

import com.lzw.pattern.适配器模式.class_adapter.sdcard.SdCard;

/**
 * 电脑类
 * 电脑只能适配 SD 卡
 *
 * @author : lzw
 * @date : 2021/12/30
 * @since : 1.0
 */
public class Computer {

    /**
     * 从sd卡中读取数
     */
    public String readSD(SdCard card) {
        if (null == card) {
            throw new NullPointerException("sd card can not be null");
        }
        card.readSD();
        return "读取完毕";
    }
}
