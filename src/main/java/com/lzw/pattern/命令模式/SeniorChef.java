package com.lzw.pattern.命令模式;

/**
 * 厨师类
 * 接收者角色，正真执行命令的对象
 * @author : lzw
 * @date : 2022/1/7
 * @since : 1.0
 */
public class SeniorChef {

    public void makeFood(String name, Integer num) {
        System.out.println("制作了"+num+"份"+name);
    }
}
