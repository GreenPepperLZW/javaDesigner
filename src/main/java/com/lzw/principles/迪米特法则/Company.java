package com.lzw.principles.迪米特法则;

/**
 * 媒体公司类
 * @author : lzw
 * @date : 2021/12/22
 * @since : 1.0
 */
public class Company {

    private String name;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
