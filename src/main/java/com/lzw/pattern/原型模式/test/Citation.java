package com.lzw.pattern.原型模式.test;

/**
 * 奖状类
 * 有许多奖状，每张奖状上显示的名字不一样
 * @author : lzw
 * @date : 2021/12/27
 * @since : 1.0
 */
public class Citation implements Cloneable{

    /**
     * 姓名
     */
    private String name;

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println(name+"同学表现良好，特发此状");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation)super.clone();
    }
}
