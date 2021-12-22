package com.lzw.principles.依赖倒转原则.demo2.service.impl;

import com.lzw.principles.依赖倒转原则.demo2.service.HardDisk;

/**
 * 希捷硬盘
 *
 * @author : lzw
 * @date : 2021/12/22
 * @since : 1.0
 */
public class XiJieHardDisk implements HardDisk {

    @Override
    public void save(String data) {
        System.out.println("使用希捷硬盘存储数据为：" + data);
    }

    @Override
    public String get() {
        System.out.println("使用希捷希捷硬盘取数据");
        return "数据";
    }
}
