package com.lzw.pattern.命令模式;

import java.util.HashMap;
import java.util.Map;

/**
 * 订单类
 *
 * @author : lzw
 * @date : 2022/1/7
 * @since : 1.0
 */
public class Order {

    /**
     * 餐桌号码
     */
    private Integer diningTabel;


    /**
     * 所下单的菜品和份数
     */
    private Map<String, Integer> foodDir = new HashMap<>();

    public Integer getDiningTabel() {
        return diningTabel;
    }

    public void setDiningTabel(Integer diningTabel) {
        this.diningTabel = diningTabel;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void setFood(String name ,Integer num) {
        this.foodDir.put(name, num);
    }
}
