package com.lzw.pattern.享元模式;

/**
 * 享元模式：
 * 运用共享技术来有效地支持大量细粒度对象的复用。
 * 它通过共享已经存在的对象来大幅度减少需要创建的对象数量、避免大量相似对象的开销，从而提高系统资源的利用率。
 * <p>
 * 享元（Flyweight ）模式中存在以下两种状态：
 * 内部状态，即不会随着环境的改变而改变的可共享部分。
 * 外部状态，指随环境改变而改变的不可以共享的部分。享元模式的实现要领就是区分应用中的这两种状态，并将外部状态外部化。
 * <p>
 * 享元模式的主要有以下角色：
 * 抽象享元角色（Flyweight）：通常是一个接口或抽象类，在抽象享元类中声明了具体享元类公共的方法，这些方法可以向外界提供享元对象的内部数据（内部状态），同时也可以通过这些方法来设置外部数据（外部状态）。
 * 具体享元（Concrete Flyweight）角色 ：它实现了抽象享元类，称为享元对象；在具体享元类中为内部状态提供了存储空间。通常我们可以结合单例模式来设计具体享元类，为每一个具体享元类提供唯一的享元对象。
 * 非享元（Unsharable Flyweight)角色 ：并不是所有的抽象享元类的子类都需要被共享，不能被共享的子类可设计为非共享具体享元类；当需要一个非共享具体享元类的对象时可以直接通过实例化创建。
 * 享元工厂（Flyweight Factory）角色 ：负责创建和管理享元角色。当客户对象请求一个享元对象时，享元工厂检査系统中是否存在符合要求的享元对象，如果存在则提供给客户；如果不存在的话，则创建一个新的享元对象。
 *
 * @author : lzw
 * @date : 2022/1/6
 * @since : 1.0
 */
public class ClinetTest {
    public static void main(String[] args) {
        // 获取O图形对象
        AbstractBox boxO = BoxFactory.getInstance().getShape("O");
        boxO.display("蓝色");
        // 获取L图形对象
        AbstractBox boxL = BoxFactory.getInstance().getShape("L");
        boxL.display("红色");
        // 获取I图形对象
        AbstractBox boxI = BoxFactory.getInstance().getShape("I");
        boxI.display("灰色");
        // 获取O图形对象
        AbstractBox boxO2 = BoxFactory.getInstance().getShape("O");
        boxO2.display("黑色");
        // 为true，表示这两个对象已经实现了共享，颜色为外部状态，不可以共享，形状是内部状态，可以共享
        System.out.println("两次获取到的O图形是否是同一个对象：" + (boxO == boxO2));

        // 如果不使用享元模式，同一种形状的不同颜色的方块需要分别实例化对象，在内存种开辟两块空间


    }
}
