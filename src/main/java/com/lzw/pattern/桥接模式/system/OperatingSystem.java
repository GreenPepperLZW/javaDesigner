package com.lzw.pattern.桥接模式.system;

import com.lzw.pattern.桥接模式.video.VideoFile;

/**
 * 抽象化（Abstraction）角色
 *
 * @author : lzw
 * @date : 2022/1/4
 * @since : 1.0
 */
public abstract class OperatingSystem {

    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
