package com.lzw.pattern.责任链模式;

import com.lzw.pattern.责任链模式.leader.GeneraManager;
import com.lzw.pattern.责任链模式.leader.GroupLeader;
import com.lzw.pattern.责任链模式.leader.Manager;

/**
 * 责任链模式：
 * 又名职责链模式，为了避免请求发送者与多个请求处理者耦合在一起，
 * 将所有请求的处理者通过前一对象记住其下一个对象的引用而连成一条链；当有请求发生时，可将请求沿着这条链传递，直到有对象处理它为止。
 * <p>
 * 主要包含的角色；
 * 抽象处理者（Handler）角色：定义一个处理请求的接口，包含抽象处理方法和一个后继连接。
 * 具体处理者（Concrete Handler）角色：实现抽象处理者的处理方法，判断能否处理本次请求，如果可以处理请求则处理，否则将该请求转给它的后继者。
 * 客户类（Client）角色：创建处理链，并向链头的具体处理者对象提交请求，它不关心处理细节和请求的传递过程。
 * <p>
 * 优点：
 * 降低了对象之间的耦合度，该模式降低了请求发送者和接收者的耦合度。
 * 责任链简化了对象之间的连接，一个对象只需保持一个指向其后继者的引用，不需保持其他所有处理者的引用，这避免了使用众多的 if 或者 if···else 语句。
 * 责任分担，每个类只需要处理自己该处理的工作，不能处理的传递给下一个对象完成，明确各类的责任范围，符合类的单一职责原则。
 * <p>
 * 缺点：
 * 不能保证每个请求一定被处理。由于一个请求没有明确的接收者，所以不能保证它一定会被处理，该请求可能一直传到链的末端都得不到处理。
 * 对比较长的职责链，请求的处理可能涉及多个处理对象，系统性能将受到一定影响。
 * 职责链建立的合理性要靠客户端来保证，增加了客户端的复杂性，可能会由于职责链的错误设置而导致系统出错，如可能会造成循环调用。
 *
 * @author : lzw
 * @date : 2022/1/11
 * @since : 1.0
 */
public class ClientTest {
    public static void main(String[] args) {
        // 创建一个请假条
        LeaveRequest leave = new LeaveRequest("小明", 3, "身体不适");

        // 创建各级领导
        // 小组长
        GroupLeader groupLeader = new GroupLeader();
        // 部门经理
        Manager manager = new Manager();
        // 总经理
        GeneraManager generaManager = new GeneraManager();

        // 设置处理者链
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generaManager);


        // 提交请假申请
        groupLeader.submit(leave);
    }
}
