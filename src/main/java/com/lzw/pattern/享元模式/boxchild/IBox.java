package com.lzw.pattern.享元模式.boxchild;

import com.lzw.pattern.享元模式.AbstractBox;

/**
 * 具体享元角色
 * I图形类
 *
 * @author : lzw
 * @date : 2022/1/6
 * @since : 1.0
 */
public class IBox extends AbstractBox {
    @Override
    public String getShape() {
        return "I";
    }
}
