package com.lzw.principles.依赖倒转原则.demo2;

import com.lzw.principles.依赖倒转原则.demo2.service.Cpu;
import com.lzw.principles.依赖倒转原则.demo2.service.HardDisk;
import com.lzw.principles.依赖倒转原则.demo2.service.Memory;
import com.lzw.principles.依赖倒转原则.demo2.service.impl.IntelCpu;
import com.lzw.principles.依赖倒转原则.demo2.service.impl.KingstonMemory;
import com.lzw.principles.依赖倒转原则.demo2.service.impl.XiJieHardDisk;


/**
 * 优化后测试，组装电脑
 * @author : lzw
 * @date : 2021/12/22
 * @since : 1.0
 */
public class TestComputer {
    public static void main(String[] args) {
        Computer computer = new Computer();

        HardDisk xiJieHardDisk = new XiJieHardDisk();
        Cpu intelCpu = new IntelCpu();
        Memory kingstonMemory = new KingstonMemory();

        computer.setHardDisk(xiJieHardDisk);
        computer.setCpu(intelCpu);
        computer.setMemory(kingstonMemory);

        computer.run();
    }
}
