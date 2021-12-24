package com.lzw.pattern.工厂模式_2.抽象工厂模式.child;

import com.lzw.pattern.工厂模式_2.抽象工厂模式.Dessert;

/**
 * 抹茶慕斯甜品
 * @author : lzw
 * @date : 2021/12/24
 * @since : 1.0
 */
public class MatchMousse extends Dessert {
    @Override
    protected void show() {
        System.out.println("抹茶慕斯");
    }
}
