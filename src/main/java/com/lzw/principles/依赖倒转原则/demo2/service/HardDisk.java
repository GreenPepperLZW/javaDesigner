package com.lzw.principles.依赖倒转原则.demo2.service;

/**
 * 硬盘接口类，可以实现不同品牌的硬盘
 * @author : lzw
 * @date : 2021/12/22
 * @since : 1.0
 */
public interface HardDisk {

    /**
     * 存储数据
     * @param data
     */
    public void save(String data);

    /**
     * 获取数据
     * @return
     */
    public String get();

}
