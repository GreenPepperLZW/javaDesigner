package com.lzw.principles.合成复用原则.demo2;

import com.lzw.principles.合成复用原则.demo2.child.ElectricCar;
import com.lzw.principles.合成复用原则.demo2.child.PetroCar;
import com.lzw.principles.合成复用原则.demo2.service.Color;
import com.lzw.principles.合成复用原则.demo2.service.impl.Red;
import com.lzw.principles.合成复用原则.demo2.service.impl.White;

/**
 * @author : lzw
 * @date : 2021/12/23
 * @since : 1.0
 */
public class ClientTest {
    public static void main(String[] args) {

        // 红色汽油车
        Color color = new Red();
        Car car = new PetroCar();
        car.setColor(color);
        car.move();

        System.out.println("=======================");

        // 白色汽油车
        Color color2 = new White();
        Car car2 = new PetroCar();
        car2.setColor(color2);
        car2.move();

        System.out.println("=======================");

        // 红色电动车
        Color color3 = new White();
        Car car3 = new ElectricCar();
        car3.setColor(color3);
        car3.move();
    }
}
