package com.lzw.principles.迪米特法则;

/**
 * 明星类
 *
 * @author : lzw
 * @date : 2021/12/22
 * @since : 1.0
 */
public class Star {

    private String name;

    public Star(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
