package com.lzw.principles.开闭原则;

/**
 * @version : 1.0
 * @Author : lzw
 * @Date : 2021/12/22 11:13
 * @Description : 搜狗输入法，在使用搜狗输入法时可以选择不同的皮肤
 */
public class SougouInput {
    /**
     * 聚合AbstractSkin
     * 将会使用到皮肤功能
     */
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }


    /**
     * 调用皮肤的展示方法
     */
    public void display(){
        skin.display();
    }
}
