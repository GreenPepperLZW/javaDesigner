package com.lzw.pattern.桥接模式.video;

/**
 * 具体实现化（Concrete Implementor）角色
 *
 * @author : lzw
 * @date : 2022/1/4
 * @since : 1.0
 */
public class AviFile implements VideoFile{

    @Override
    public void decode(String fileName) {
        System.out.println("avi视频文件"+fileName);
    }
}
