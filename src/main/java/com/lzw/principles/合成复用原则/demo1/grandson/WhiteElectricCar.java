package com.lzw.principles.合成复用原则.demo1.grandson;

import com.lzw.principles.合成复用原则.demo1.child.ElectricCar;

/**
 * 白色电车
 * @author : lzw
 * @date : 2021/12/23
 * @since : 1.0
 */
public class WhiteElectricCar extends ElectricCar {

    @Override
    public void move() {
        System.out.println("白色电车");
        super.move();
    }
}
