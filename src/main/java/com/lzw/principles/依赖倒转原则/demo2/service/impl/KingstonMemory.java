package com.lzw.principles.依赖倒转原则.demo2.service.impl;

import com.lzw.principles.依赖倒转原则.demo2.service.Memory;

/**
 *
 * @author : lzw
 * @date : 2021/12/22
 * @since : 1.0
 */
public class KingstonMemory implements Memory {

    @Override
    public void save() {
        System.out.println("使用金士顿作为内存条");
    }
}
