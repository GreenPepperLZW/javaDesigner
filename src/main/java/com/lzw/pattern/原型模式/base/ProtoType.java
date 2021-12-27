package com.lzw.pattern.原型模式.base;

/**
 * 克隆原型类
 *
 * @author : lzw
 * @date : 2021/12/27
 * @since : 1.0
 */
public class ProtoType implements Cloneable {


    public ProtoType() {
        System.out.println("具体的原型对象创建完成!");
    }

    @Override
    protected ProtoType clone() throws CloneNotSupportedException {
        System.out.println("具体原型类复制成功!");
        return (ProtoType)super.clone();
    }
}

