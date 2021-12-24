package com.lzw.pattern.单例模式_1;

import java.io.IOException;
import java.io.InputStream;

/**
 * JDK中的Runtime使用了饿汉式单例模式,{@link Runtime#getRuntime()}
 *
 *
 * @author : lzw
 * @date : 2021/12/24
 * @since : 1.0
 */
public class JdkRunTime {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        // 执行命令
        Process process = runtime.exec("ipconfig");
        // 调用process对象的获取输入流的方法
        InputStream inputStream = process.getInputStream();
        byte[] arr = new byte[1024 * 1024 * 100];
        // 读取数据
        int read = inputStream.read(arr);
        System.out.println(new String(arr,0,read,"gbk"));

        // 返回 Java 虚拟机中的内存总量。
        System.out.println(runtime.totalMemory());
        // 返回 Java 虚拟机试图使用的最大内存量。
        System.out.println(runtime.maxMemory());

    }
}
