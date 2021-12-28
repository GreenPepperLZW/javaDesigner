package com.lzw.pattern.代理模式.static_proxy;


/**
 * 火车票代售点
 *
 * @author : lzw
 * @date : 2021/12/27
 * @since : 1.0
 */
public class ProxyPoint implements SellTickets {

    private TrainStation trainStation =  new TrainStation();

    @Override
    public void sell() {
        System.out.println("代售点收取一些服务费用");
        trainStation.sell();
    }
}
