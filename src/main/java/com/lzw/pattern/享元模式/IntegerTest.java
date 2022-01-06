package com.lzw.pattern.享元模式;

/**
 * Integr使用了享元模式
 *
 * @author : lzw
 * @date : 2022/1/6
 * @since : 1.0
 */
public class IntegerTest {
    public static void main(String[] args) {
        Integer i1 = 127;
        Integer i2 = 127;

        // false
        System.out.println("i1和i2对象是否是同一个对象？" + (i1 == i2));

        Integer i3 = 128;
        Integer i4 = 128;

        // false
        System.out.println("i3和i4对象是否是同一个对象？" + (i3 == i4));

        // IntegetCache中只缓存了 -128到127的数据，128不在缓存中，每次都会实例化一个新的Integer对象
    }
}
