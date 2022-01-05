package com.lzw.pattern.组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单类
 * 树枝节点
 *
 * @author : lzw
 * @date : 2022/1/5
 * @since : 1.0
 */
public class Menu extends MenuComponent{

    /**
     * 菜单可以有多个子菜单或者子菜单项
     */
    private List<MenuComponent> menuComponents;

    /**
     * 构造方法
     * @param name 菜单名称
     * @param level 菜单级别
     */
    public Menu(String name,int level) {
        this.name = name;
        this.level = level;
        menuComponents = new ArrayList<>();
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public void print() {
        for (int i = 1; i < level; i++) {
            System.out.print("--");
        }
        // 打印菜单名称
        System.out.println(name);
        // 打印子菜单或者子菜单项名称
        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }
}
