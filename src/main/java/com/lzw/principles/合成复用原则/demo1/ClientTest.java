package com.lzw.principles.合成复用原则.demo1;

import com.lzw.principles.合成复用原则.demo1.grandson.RedPetorCar;

/**
 * @author : lzw
 * @date : 2021/12/23
 * @since : 1.0
 */
public class ClientTest {
    public static void main(String[] args) {
        Car redPetorCar = new RedPetorCar();
        redPetorCar.move();
    }
}
