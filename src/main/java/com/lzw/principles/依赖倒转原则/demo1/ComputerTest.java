package com.lzw.principles.依赖倒转原则.demo1;

/**
 * 测试类，运行电脑
 * @author : lzw
 * @date : 2021/12/22
 * @since : 1.0
 */
public class ComputerTest {
    public static void main(String[] args) {
        //创建组件对象
        XiJieHardDisk hardDisk = new XiJieHardDisk();
        IntelCpu cpu = new IntelCpu();
        KingstonMemory memory = new KingstonMemory();

        //创建计算机对象
        Computer computer = new Computer();
        //组装计算机
        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.setMemory(memory);

        //运行计算机
        computer.run();
    }
}
