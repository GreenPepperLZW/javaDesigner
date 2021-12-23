package com.lzw.principles.合成复用原则.demo1.grandson;

import com.lzw.principles.合成复用原则.demo1.child.PetorCar;

/**
 * 白色的汽油车
 * @author : lzw
 * @date : 2021/12/23
 * @since : 1.0
 */
public class WhitePetorCar extends PetorCar {

    @Override
    public void move() {
        System.out.println("白色汽油");
        super.move();
    }
}
