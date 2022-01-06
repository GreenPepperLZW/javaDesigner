package com.lzw.pattern.享元模式;

import com.lzw.pattern.享元模式.boxchild.IBox;
import com.lzw.pattern.享元模式.boxchild.LBox;
import com.lzw.pattern.享元模式.boxchild.OBox;

import java.util.HashMap;

/**
 * 享元工厂模式
 *
 * @author : lzw
 * @date : 2022/1/6
 * @since : 1.0
 */
public class BoxFactory {

    /**
     * 享元池
     */
    private static HashMap<String, AbstractBox> map;

    private BoxFactory() {
        map = new HashMap<String, AbstractBox>();
        AbstractBox iBox = new IBox();
        AbstractBox lBox = new LBox();
        AbstractBox oBox = new OBox();
        map.put("I", iBox);
        map.put("L", lBox);
        map.put("O", oBox);
    }

    public static final BoxFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final BoxFactory INSTANCE = new BoxFactory();
    }

    public AbstractBox getShape(String key) {
        return map.get(key);
    }
}
