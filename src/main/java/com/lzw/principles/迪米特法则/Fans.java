package com.lzw.principles.迪米特法则;

/**
 * 粉丝类
 *
 * @author : lzw
 * @date : 2021/12/22
 * @since : 1.0
 */
public class Fans {

    private String name;

    public Fans(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
