package com.lzw.principles.接口隔离原则.demo1;

/**
 * 安全门实现类
 *
 * @author : lzw
 * @date : 2021/12/22
 * @since : 1.0
 */
public class SafetyDoorImpl implements SafetyDoor{

    @Override
    public void antiTheft() {
        System.out.println("防盗功能");
    }


    @Override
    public void fireproof() {
        // 当需求上不需要防火功能时，此时也不得不重写防火功能
    }

    @Override
    public void waterproof() {
        System.out.println("防水功能");
    }
}
