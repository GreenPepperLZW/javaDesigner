package com.lzw.pattern.策略模式;

/**
 * 具体策略类
 * 为中秋准备的促销活动B，满200元减50元
 *
 * @author : lzw
 * @date : 2022/1/6
 * @since : 1.0
 */
public class StrategyB implements Strategy {

    @Override
    public void show() {
        System.out.println("满200元减50元");
    }
}
