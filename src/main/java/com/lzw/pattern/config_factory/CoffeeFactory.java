package com.lzw.pattern.config_factory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * 静态简单工厂类
 *
 * @author : lzw
 * @date : 2021/12/24
 * @since : 1.0
 */
public class CoffeeFactory {

    // 加载配置文件，获取配置文件中的全类名，并创建该类的对象，并进行存储

    /**
     *  1.定义容器存储咖啡对象
     */
    private static final HashMap<String,Coffee> map = new HashMap<>();

    // 2.加载配置文件，只加载一次
    static {
        Properties p = new Properties();
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            p.load(is);
            //遍历Properties集合对象
            Set<Object> keys = p.keySet();
            for (Object key : keys) {
                //根据键获取值（全类名）
                String className = p.getProperty((String) key);
                //获取字节码对象
                Class clazz = Class.forName(className);
                Coffee obj = (Coffee) clazz.newInstance();
                map.put((String)key,obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static Coffee createCoffee(String name) {
        return map.get(name);
    }
}
