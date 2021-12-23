package com.lzw.principles.合成复用原则.demo1.grandson;

import com.lzw.principles.合成复用原则.demo1.child.PetorCar;

/**
 * 红色的汽油车
 * @author : lzw
 * @date : 2021/12/23
 * @since : 1.0
 */
public class RedPetorCar extends PetorCar {

    @Override
    public void move() {
        System.out.print("红色汽油");
        super.move();
    }
}
