package com.lzw.principles.迪米特法则;

/**
 * 经济人类
 *
 * @author : lzw
 * @date : 2021/12/22
 * @since : 1.0
 */
public class Agent {

    private Star star;
    private Fans fans;
    private Company company;

    public Star getStar() {
        return star;
    }

    public Fans getFans() {
        return fans;
    }

    public Company getCompany() {
        return company;
    }

    /**
     * 和粉丝见面的方法
     */
    public void meeting() {
        System.out.println(star.getName() +"和粉丝"+fans.getName() + "见面");
    }

    /**
     * 和媒体公司洽谈的方法
     */
    public void bussiness() {
        System.out.println(star.getName() + "和" + company.getName() + "洽谈");
    }


}
