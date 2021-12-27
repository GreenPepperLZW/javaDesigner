package com.lzw.pattern.单例模式.枚举方式;

/**
 * 使用枚举实现单例模式
 *
 * 优点：枚举只会装载一次，是线程安全的
 * 并且枚举类型是所用单例实现中唯一一种不会被破坏的单例实现模式
 *
 * @author : lzw
 * @date : 2021/12/24
 * @since : 1.0
 */
public enum Single {

    INSTANCE;
}
