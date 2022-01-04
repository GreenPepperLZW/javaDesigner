package com.lzw.pattern.桥接模式;

import com.lzw.pattern.桥接模式.system.Mac;
import com.lzw.pattern.桥接模式.system.OperatingSystem;
import com.lzw.pattern.桥接模式.video.AviFile;

/**
 * 测试类
 * <p>
 * 需要开发一个跨平台视频播放器，可以在不同操作系统平台（如Windows、Mac、Linux等）上播放多种格式的视频文件，
 * 常见的视频格式包括RMVB、AVI、WMV等。该播放器包含了两个维度，适合使用桥接模式。
 * </p>
 * 使用场景：
 * 当一个类存在两个独立变化的维度，且这两个维度都需要进行扩展时；
 * 当一个系统不希望使用继承或因为多层次继承导致系统类的个数急剧增加时；
 * 当一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性时。避免在两个层次之间建立静态的继承联系，通过桥接模式可以使它们在抽象层建立一个关联关系；
 *
 * @author : lzw
 * @date : 2022/1/4
 * @since : 1.0
 */
public class ClientTest {

    public static void main(String[] args) {
        /**
         * 需要增加一个操作系统时，继承 OperatingSystem 即可
         * 需要增加一种视频格式时，实现 VideoFile 即可
         */
        // 创建mac系统对象
        OperatingSystem system = new Mac(new AviFile());
        system.play("长津湖");
    }
}
