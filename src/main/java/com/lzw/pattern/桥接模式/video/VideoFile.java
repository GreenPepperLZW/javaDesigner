package com.lzw.pattern.桥接模式.video;

/**
 * 实现化（Implementor）角色
 *
 * @author : lzw
 * @date : 2022/1/4
 * @since : 1.0
 */
public interface VideoFile {

    /**
     * 视频解码
     * @param fileName
     */
    void decode(String fileName);
}
