package com.lzw.pattern.责任链模式.leader;

import com.lzw.pattern.责任链模式.Handler;
import com.lzw.pattern.责任链模式.LeaveRequest;

/**
 * 具体处理者类
 * 小组长
 * @author : lzw
 * @date : 2022/1/11
 * @since : 1.0
 */
public class GroupLeader extends Handler {


    public GroupLeader() {
        super(0,Handler.NUM_ONE);
    }

    @Override
    protected void handlerLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName()+"请假"+leaveRequest.getNum()+"天，"+leaveRequest.getContent()+".");
        System.out.println("小组长审批结果：同意");
    }
}
