package com.lzw.pattern.策略模式;

/**
 * 具体策略类
 * 为圣诞准备的促销活动C，满1000元加一元换购任意200元以下商品
 *
 * @author : lzw
 * @date : 2022/1/6
 * @since : 1.0
 */
public class StrategyC implements Strategy{
    @Override
    public void show() {
        System.out.println("为圣诞准备的促销活动C，满1000元加一元换购任意200元以下商品");
    }
}
