package com.lzw.pattern.享元模式.boxchild;

import com.lzw.pattern.享元模式.AbstractBox;

/**
 * 具体享元角色
 * O图形
 *
 * @author : lzw
 * @date : 2022/1/6
 * @since : 1.0
 */
public class OBox extends AbstractBox {

    @Override
    public String getShape() {
        return "O";
    }
}
