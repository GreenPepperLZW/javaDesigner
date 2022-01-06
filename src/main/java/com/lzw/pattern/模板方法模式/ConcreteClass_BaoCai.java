package com.lzw.pattern.模板方法模式;

/**
 * 具体子类
 * 炒包菜
 *
 * @author : lzw
 * @date : 2022/1/5
 * @since : 1.0
 */
public class ConcreteClass_BaoCai extends AbstractClass {

    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是辣椒");
    }
}
