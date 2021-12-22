package com.lzw.principles.开闭原则;

/**
 * @version : 1.0
 * @Author : lzw
 * @Date : 2021/12/22 11:20
 * @Description :
 */
public class Clinet {
    public static void main(String[] args) {
        // 搜狗输入法对象
        SougouInput sougouInput = new SougouInput();
        // 创建皮肤对象
        // DefaultDkin skin = new DefaultDkin();
        OrderSkin skin = new OrderSkin();
        // 将皮肤设置到输入法中
        sougouInput.setSkin(skin);
        // 显示皮肤
        sougouInput.display();
    }
}
