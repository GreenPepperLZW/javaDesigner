package com.lzw.principles.接口隔离原则.demo1;

/**
 * 安全门接口
 *
 * @author : lzw
 * @date : 2021/12/22
 * @since : 1.0
 */
public interface SafetyDoor {

    /**
     * 防盗
     */
    void antiTheft();

    /**
     * 防水
     */
    void fireproof();

    /**
     * 防火
     */
    void waterproof();
}
