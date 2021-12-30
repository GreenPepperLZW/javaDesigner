package com.lzw.pattern.适配器模式.class_adapter.sdcard;


/**
 * SD卡实现类
 *
 * @author : lzw
 * @date : 2021/12/30
 * @since : 1.0
 */
public class SdCardImpl implements SdCard {

    @Override
    public void readSD() {
        System.out.println("从SD卡读数据");
    }

    @Override
    public void writeSD() {
        System.out.println("往SD卡写数据");
    }
}
