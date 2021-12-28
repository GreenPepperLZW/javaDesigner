package com.lzw.pattern.代理模式.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 获取代理对象的工厂类
 * 动态代理，在代码运行期间生成代理对象，而不用在编译期就固定写死
 *
 * @author : lzw
 * @date : 2021/12/28
 * @since : 1.0
 */
public class ProxyFactory {

    /**
     * 声明目标类的实例对象
     */
    private TrainStation trainStation = new TrainStation();

    /**
     * 获取代理对象
     * @return
     *
     */
    public SellTickets getProxyObject() {
        // 使用jdk提供的方法获取代理对象
        /**
         * ClassLoader loader    ：   类加载器，用于加载代理类，可以通过目标对象获取类加载器。代理类是在运行期间动态生成的
         * Class<?>[] interfaces ：   代理实现的接口的字节码对象
         * InvocationHandler h   ：   代理对象的调用处理程序
         */
        SellTickets proxyObject = (SellTickets) Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                /**
                 * proxy：代理对象,和上面的proxyObject是同一个对象，在invoke方法中基本不用
                 * method: 对接口中的方法进行封装的method方法，这里的method代表的即使 sell()买票方法
                 * args： 调用方法的实际参数
                 * 返回值：代理方法的返回值，即 sell() 方法的返回值
                 */
                (proxy, method, args) -> {
                    System.out.println("代售点收取一定的服务费用（jdk动态代理）");
                    // 执行目标对象的方法
                    Object obj = method.invoke(trainStation, args);

                    return obj;
                }
                /*new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("invoke 执行了");
                        return null;
                    }
                }*/
        );
        return proxyObject;
    }
}
