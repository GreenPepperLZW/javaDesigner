package com.lzw.pattern.原型模式.deepclone;

import java.io.Serializable;

/**
 * 奖状类
 * 有许多奖状，每张奖状上显示的名字不一样
 *
 * @author : lzw
 * @date : 2021/12/27
 * @since : 1.0
 */
public class Citation implements Cloneable, Serializable {

    /**
     * 学生
     */
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void show() {
        System.out.println(student.getName() + "同学表现良好，特发此状");
    }


    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
