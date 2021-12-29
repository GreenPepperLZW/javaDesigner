package com.lzw.pattern.代理模式.cglib_proxy;


/**
 * 测试cglib动态代理
 *
 * @author : lzw
 * @date : 2021/12/29
 * @since : 1.0
 */
public class ClientTest {
    public static void main(String[] args) {
        // 创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        // 获取代理对象,proxyObject 是 TrainStation类的字类对象
        TrainStation proxyObject = factory.getProxyObject();

        proxyObject.sell();
    }
}
