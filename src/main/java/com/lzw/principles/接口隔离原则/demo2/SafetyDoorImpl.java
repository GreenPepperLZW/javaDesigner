package com.lzw.principles.接口隔离原则.demo2;

import com.lzw.principles.接口隔离原则.demo1.SafetyDoor;


/**
 * @author : lzw
 * @date : 2021/12/22
 * @since : 1.0
 */
public class SafetyDoorImpl implements AntiTheft,Fireproof, SafetyDoor {
    @Override
    public void waterproof() {
        System.out.println("防水功能");
    }

    @Override
    public void antiTheft() {
        System.out.println("防功能");
    }

    @Override
    public void fireproof() {
        System.out.println("防火功能");
    }
}
