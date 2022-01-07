package com.lzw.pattern.策略模式;

/**
 * 具体策略
 * 为春节准备的促销活动A，买一送一
 *
 * @author : lzw
 * @date : 2022/1/6
 * @since : 1.0
 */
public class StrategyA implements Strategy {

    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
