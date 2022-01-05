package com.lzw.pattern.组合模式;

/**
 * 菜单项
 * 叶子节点角色
 *
 * @author : lzw
 * @date : 2022/1/5
 * @since : 1.0
 */
public class MenuItem extends MenuComponent{

    public MenuItem(String name,int level) {
        super.name = name;
        super.level = level;
    }

    @Override
    public void print() {
        for (int i = 1; i < level; i++) {
            System.out.print("--");
        }
        // 菜单项名称
        System.out.println(name);
    }
}
