package com.lzw.principles.接口隔离原则.demo2;

/**
 * 优化后测试
 * @author : lzw
 * @date : 2021/12/22
 * @since : 1.0
 */
public class ClientTest {
    public static void main(String[] args) {
        // 创建安全门实例
        SafetyDoorImpl safetyDoor = new SafetyDoorImpl();
        // 调用功能
        safetyDoor.antiTheft();
        safetyDoor.fireproof();
        safetyDoor.waterproof();
        System.out.println("=========================");
        // 只需要防盗和防水功能
        SafetyDoorImpl2 safetyDoorImpl2 = new SafetyDoorImpl2();
        // 调用功能
        safetyDoorImpl2.antiTheft();
        safetyDoorImpl2.fireproof();
    }
}
