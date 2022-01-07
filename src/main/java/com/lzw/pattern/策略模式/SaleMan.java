package com.lzw.pattern.策略模式;

/**
 * 环境类
 * 促销员类
 *
 * @author : lzw
 * @date : 2022/1/6
 * @since : 1.0
 */
public class SaleMan {

    /**
     * 聚合抽象策略类对象
     */
    private Strategy strategy;

    public SaleMan(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 由促销员促销活动给用户
     */
    public void saleManShow() {
        strategy.show();
    }


}
