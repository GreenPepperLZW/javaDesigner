package com.lzw.pattern.工厂模式.抽象工厂模式.child;

import com.lzw.pattern.工厂模式.抽象工厂模式.Dessert;

/**
 * 提拉米苏甜品
 * @author : lzw
 * @date : 2021/12/24
 * @since : 1.0
 */
public class Tiramisu extends Dessert {

    @Override
    protected void show() {
        System.out.println("提拉米苏");
    }
}
