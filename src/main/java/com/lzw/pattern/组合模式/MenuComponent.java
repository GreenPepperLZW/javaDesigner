package com.lzw.pattern.组合模式;

/**
 * 菜单组件，无论时菜单还是菜单项，都应该继承该类
 * 抽象根节点角色
 * @author : lzw
 * @date : 2022/1/4
 * @since : 1.0
 */
public abstract class MenuComponent {

    /**
     * 菜单组件的名称
     */
    protected String name;

    /**
     * 菜单组件的层级
     */
    protected int level;

    /**
     * 添加菜单
     * @param menuComponent 菜单组件
     */
    public void add(MenuComponent menuComponent){
        // 菜单项下不允许再有子菜单
        throw new UnsupportedOperationException();
    }

    /**
     * 移除菜单
     * @param menuComponent 菜单组件
     */
    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    /**
     * 获取指定的子菜单
     * @param i 菜单节点
     * @return
     */
    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }

    /**
     * 获取菜单名称
     * @return
     */
    public String getName(){
        return name;
    }

    /**
     * 打印菜单名称
     */
    public abstract void print();


}
