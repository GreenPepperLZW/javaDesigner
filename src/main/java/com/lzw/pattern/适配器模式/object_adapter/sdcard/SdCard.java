package com.lzw.pattern.适配器模式.object_adapter.sdcard;

/**
 * SD卡接口，定义sd卡规范
 * 适配器模式中的目标类，电脑只能适配sd卡
 *
 * @author : lzw
 * @date : 2021/12/30
 * @since : 1.0
 */
public interface SdCard {

    /**
     * 读功能
     */
    void readSD();

    /**
     * 写功能
     */
    void writeSD();
}
