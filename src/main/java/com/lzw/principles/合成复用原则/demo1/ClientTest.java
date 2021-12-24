package com.lzw.principles.合成复用原则.demo1;

import com.lzw.principles.合成复用原则.demo1.grandson.RedPetorCar;
import com.lzw.principles.合成复用原则.demo1.grandson.WhitePetorCar;

/**
 * 优化前测试
 * 每添加一种新的能源汽车，都需要添加大量的字类
 * @author : lzw
 * @date : 2021/12/23
 * @since : 1.0
 */
public class ClientTest {
    public static void main(String[] args) {
        Car redPetorCar = new RedPetorCar();
        redPetorCar.move();

        Car whitePetorCar = new WhitePetorCar();
        whitePetorCar.move();
    }
}
