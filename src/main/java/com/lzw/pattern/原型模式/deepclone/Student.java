package com.lzw.pattern.原型模式.deepclone;

import java.io.Serializable;

/**
 * 学生类
 *
 * @author : lzw
 * @date : 2021/12/27
 * @since : 1.0
 */
public class Student implements Serializable {

    /**
     * 学生姓名
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
