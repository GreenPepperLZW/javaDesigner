package com.lzw.pattern.代理模式.jdk_proxy;

/**
 * 火车站类
 *
 * @author : lzw
 * @date : 2021/12/28
 * @since : 1.0
 */
public class TrainStation implements SellTickets {

    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
