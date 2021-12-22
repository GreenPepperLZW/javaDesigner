package com.lzw.principles.依赖倒转原则.demo2.service.impl;

import com.lzw.principles.依赖倒转原则.demo2.service.Cpu;

/**
 * cpu接口类
 *
 * @author : lzw
 * @date : 2021/12/22
 * @since : 1.0
 */
public class IntelCpu implements Cpu {

    @Override
    public void run() {
        System.out.println("使用Intel处理器");
    }
}
