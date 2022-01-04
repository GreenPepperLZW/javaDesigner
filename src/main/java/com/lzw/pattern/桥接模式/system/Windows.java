package com.lzw.pattern.桥接模式.system;

import com.lzw.pattern.桥接模式.video.VideoFile;

/**
 * 扩展抽象化（Refined  Abstraction）角色
 *
 * @author : lzw
 * @date : 2022/1/4
 * @since : 1.0
 */
public class Windows extends OperatingSystem {

    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
