package com.lzw.pattern.代理模式.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理工厂对象，用来获取代理对象
 * cglib获取的代理对象是目标类的字类
 *
 * @author : lzw
 * @date : 2021/12/29
 * @since : 1.0
 */
public class ProxyFactory implements MethodInterceptor {

    /**
     * 目标对象
     */
    private TrainStation trainStation = new TrainStation();

    public TrainStation getProxyObject() {
        // 创建Enhancer对象,类似与jdk代理中的proxy类
        Enhancer enhancer = new Enhancer();

        // 设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        // 设置回调函数，参数为MethodInterceptor的子实现类
        enhancer.setCallback(this);
        // 创建代理对象
        TrainStation station = (TrainStation) enhancer.create();
        return station;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理增强（Cglib代理）");
        // 要调用的目标对象的方法
        Object obj = method.invoke(trainStation, objects);
        return obj;
    }
}
