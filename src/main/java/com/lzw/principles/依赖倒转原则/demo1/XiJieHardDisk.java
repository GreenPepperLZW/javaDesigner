package com.lzw.principles.依赖倒转原则.demo1;

/**
 * 希捷硬盘
 *
 * @author : lzw
 * @date : 2021/12/22
 * @since : 1.0
 */
public class XiJieHardDisk {
    /**
     * 存储数据
     * @param data
     */
    public void save(String data) {
        System.out.println("使用希捷硬盘存储数据为：" + data);
    }

    /**
     * 获取数据
     * @return
     */
    public String get() {
        System.out.println("使用希捷希捷硬盘取数据");
        return "数据";
    }
}
