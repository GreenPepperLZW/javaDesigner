package com.lzw.pattern.原型模式.base;

/**
 * 用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型对象相同的新对象。
 * 对象的创建非常复杂时，可以使用克隆模式进行快捷的创建对象
 * @author : lzw
 * @date : 2021/12/27
 * @since : 1.0
 */
public class ClientTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        ProtoType protoType = new ProtoType();
        ProtoType clone = protoType.clone();

        //
        System.out.println("是否是同一个类" + (protoType == clone));
    }

}
