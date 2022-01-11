package com.lzw.pattern.责任链模式.leader;

import com.lzw.pattern.责任链模式.Handler;
import com.lzw.pattern.责任链模式.LeaveRequest;

/**
 * 具体处理类
 * 部门经理类
 *
 * @author : lzw
 * @date : 2022/1/11
 * @since : 1.0
 */
public class Manager extends Handler {

    public Manager() {
        super(0, Handler.NUM_THREE);
    }

    @Override
    protected void handlerLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "天，" + leaveRequest.getContent() + ".");
        System.out.println("部门经理审批结果：同意");
    }
}
