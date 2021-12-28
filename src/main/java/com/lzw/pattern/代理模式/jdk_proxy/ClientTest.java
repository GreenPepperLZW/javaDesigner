package com.lzw.pattern.代理模式.jdk_proxy;

/**
 * jkd动态代理测试类
 *
 * @author : lzw
 * @date : 2021/12/28
 * @since : 1.0
 */
public class ClientTest {
    public static void main(String[] args) {
        // 实例化获取代理对象工厂
        ProxyFactory proxyFactory = new ProxyFactory();
        // 获取代理对象
        SellTickets proxyObject = proxyFactory.getProxyObject();
        // 执行买票的方法
        proxyObject.sell();
    }
}
