package com.lzw.pattern.单例模式_1.枚举方式;

/**
 * @author : lzw
 * @date : 2021/12/24
 * @since : 1.0
 */
public class ClientTest {
    public static void main(String[] args) {
        Single intance = Single.INSTANCE;
        Single intance2 = Single.INSTANCE;
        System.out.println(intance == intance);

    }
}
