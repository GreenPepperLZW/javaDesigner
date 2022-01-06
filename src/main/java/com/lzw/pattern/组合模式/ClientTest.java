package com.lzw.pattern.组合模式;

import javafx.scene.input.Mnemonic;

/**
 * <p>
 * 组合模式：
 * 又名部分整体模式，是用于把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，
 * 用来表示部分以及整体层次。这种类型的设计模式属于结构型模式，它创建了对象组的树形结构。
 * </p>
 * <p>
 * 组合模式主要包含三种角色：
 * 抽象根节点（Component）：定义系统各层次对象的共有方法和属性，可以预先定义一些默认行为和属性。
 * 树枝节点（Composite）：定义树枝节点的行为，存储子节点，组合树枝节点和叶子节点形成一个树形结构。
 * 叶子节点（Leaf）：叶子节点对象，其下再无分支，是系统层次遍历的最小单位。
 * </p>
 * 可以在一定场景下取代递归查询
 *
 * @author : lzw
 * @date : 2022/1/5
 * @since : 1.0
 */
public class ClientTest {
    public static void main(String[] args) {
        /**
         * 树结构如下：
         * 系统管理
         *    菜单管理
         *       页面访问
         *       展开菜单
         *       编辑菜单
         *       删除菜单
         *       新增菜单
         *    权限管理
         *       页面访问
         *       提交保存
         *    角色管理
         *       页面访问
         *       新增角色
         *       修改角色
         */
        // 创建菜单树
        MenuComponent menu1 = new Menu("菜单管理", 2);
        menu1.add(new MenuItem("页面访问", 3));
        menu1.add(new MenuItem("展开菜单", 3));
        menu1.add(new MenuItem("编辑菜单", 3));
        menu1.add(new MenuItem("页面访问", 3));
        menu1.add(new MenuItem("删除菜单", 3));
        menu1.add(new MenuItem("新增菜单", 3));
        MenuComponent menu2 = new Menu("权限管理", 2);
        menu2.add(new MenuItem("页面访问", 3));
        menu2.add(new MenuItem("提交保存", 3));
        MenuComponent menu3 = new Menu("角色管理", 2);
        menu3.add(new MenuItem("页面访问", 3));
        menu3.add(new MenuItem("新增角色", 3));
        menu3.add(new MenuItem("修改角色", 3));

        // 创建一级菜单
        MenuComponent menu = new Menu("系统管理", 1);
        // 将二级菜单添加到一级菜单下
        menu.add(menu1);
        menu.add(menu2);
        menu.add(menu3);

        // 打印菜单名称
        menu.print();
    }
}
