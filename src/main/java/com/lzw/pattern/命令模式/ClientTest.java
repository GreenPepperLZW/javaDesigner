package com.lzw.pattern.命令模式;


/**
 * @author : lzw
 * @date : 2022/1/7
 * @since : 1.0
 */
public class ClientTest {
    public static void main(String[] args) {
        // 创建订单
        Order order1 = new Order();
        order1.setDiningTabel(1);
        order1.setFood("干锅牛蛙", 1);

        // 创建订单
        Order order2 = new Order();
        order1.setDiningTabel(1);
        order1.setFood("羊蝎子", 1);

        // 创建厨师对象
        SeniorChef seniorChef = new SeniorChef();
        // 创建命令对象，传入对应的厨师和对应的订单
        OrderCommand cmd1 = new OrderCommand(seniorChef, order1);
        OrderCommand cmd2 = new OrderCommand(seniorChef, order2);

        // 创建调用者（服务员）
        Waiter invoke = new Waiter();
        // 传入要执行的命令
        invoke.setCommand(cmd1);
        invoke.setCommand(cmd2);
        // 发起命令
        invoke.orderUp();
    }
}
