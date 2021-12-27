package com.lzw.pattern.单例模式.破环单例模式2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 使用反射破环单例模式
 *
 * @author : lzw
 * @date : 2021/12/24
 * @since : 1.0
 */
public class ClientTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 获取singleton的字节码对象
        Class clazz = Singleton.class;
        // 获取无参的构造方法
        Constructor cos = clazz.getDeclaredConstructor();
        // 取消访问检查
        cos.setAccessible(true);
        // 创建singleton实例
        Singleton single = (Singleton) cos.newInstance();
        Singleton single2 = (Singleton) cos.newInstance();
        // false,获取了两个不同的对象
        System.out.println(single == single2);

    }
}
