package com.lzw.pattern.代理模式.static_proxy;

/**
 * 静态代理测试类
 * <p>
 * 测试类中要买票时直接访问的是ProxyPoint类对象，也就是说ProxyPoint作为访问对象和目标对象的中介
 * 同时也对sell方法进行了增强（代理点收取一些服务费用）
 *
 * @author : lzw
 * @date : 2021/12/28
 * @since : 1.0
 */
public class ClinetTest {
    public static void main(String[] args) {
        // 创建代售点类对象
        ProxyPoint proxyPoint = new ProxyPoint();
        // 调用方法进行买票
        proxyPoint.sell();
    }
}
