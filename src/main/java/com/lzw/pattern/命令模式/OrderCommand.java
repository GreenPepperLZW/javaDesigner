package com.lzw.pattern.命令模式;

import java.util.Set;

/**
 * 具体命令类角色，具体的命令，实现命令接口；通常会持有接收者，并调用接收者的功能来完成命令要执行的操作。
 *
 * @author : lzw
 * @date : 2022/1/7
 * @since : 1.0
 */
public class OrderCommand implements Command {

    /**
     * 命令接收者对象
     */
    private SeniorChef receiver;

    /**
     * 订单对象，厨师需要知道要做什么菜
     */
    private Order order;

    public OrderCommand(SeniorChef reciver, Order order) {
        this.receiver = reciver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println("开始制作" + order.getDiningTabel() + "桌子订单");

        Set<String> keys = order.getFoodDir().keySet();
        for (String key : keys) {
            receiver.makeFood(key, order.getFoodDir().get(key));
        }
        System.out.println(order.getDiningTabel() + "桌的饭弄好了");
    }
}
