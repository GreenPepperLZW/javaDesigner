package com.lzw.principles.依赖倒转原则.demo2;

import com.lzw.principles.依赖倒转原则.demo2.service.Cpu;
import com.lzw.principles.依赖倒转原则.demo2.service.HardDisk;
import com.lzw.principles.依赖倒转原则.demo2.service.Memory;


/**
 *
 * @author : lzw
 * @date : 2021/12/22
 * @since : 1.0
 */
public class Computer {

    /**
     * 不再依赖具体的实现，而是依赖接口
     */
    private HardDisk hardDisk;
    private Cpu cpu;
    private Memory memory;

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void run() {
        System.out.println("计算机工作");
    }
}
