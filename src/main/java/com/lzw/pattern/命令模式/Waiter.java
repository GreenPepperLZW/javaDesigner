package com.lzw.pattern.命令模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务员类
 *
 * @author : lzw
 * @date : 2022/1/10
 * @since : 1.0
 */
public class Waiter {

    /**
     * 一个服务员可以发出多个命令
     */
    private List<Command> commands = new ArrayList<>();

    public void setCommand(Command cmd) {
        commands.add(cmd);
    }

    /**
     * 服务员发起命令
     */
    public void orderUp() {
        System.out.println("服务员说：订单来了");
        // 遍历commands集合
        for (Command cmd : commands) {
            if (cmd != null) {
                cmd.execute();
            }
        }
    }

}
