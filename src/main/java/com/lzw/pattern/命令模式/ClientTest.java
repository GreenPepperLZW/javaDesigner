package com.lzw.pattern.命令模式;


/**
 * 命令模式：
 * <p>
 * 优点
 * 降低系统的耦合度。命令模式能将调用操作的对象与实现该操作的对象解耦。
 * 增加或删除命令非常方便。采用命令模式增加与删除命令不会影响其他类，它满足“开闭原则”，对扩展比较灵活。
 * 可以实现宏命令。命令模式可以与组合模式结合，将多个命令装配成一个组合命令，即宏命令。
 * <p>
 * 缺点：
 * 使用命令模式可能会导致某些系统有过多的具体命令类。
 * 系统结构更加复杂。
 * <p>
 * 使用场景
 * 系统需要将请求调用者和请求接收者解耦，使得调用者和接收者不直接交互。
 * 系统需要在不同的时间指定请求、将请求排队和执行请求。
 *
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
        order2.setDiningTabel(1);
        order2.setFood("羊蝎子", 1);

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
