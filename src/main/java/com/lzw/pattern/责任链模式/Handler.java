package com.lzw.pattern.责任链模式;

/**
 * 抽象处理者类
 *
 * @author : lzw
 * @date : 2022/1/11
 * @since : 1.0
 */
public abstract class Handler {

    /**
     * 请假天数
     */
    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SERVEN = 7;

    /**
     * 该领导处理的请假天数区间
     */
    private int numStart;
    private int numEnd;

    /**
     * 声明后继者，上一级领导
     */
    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    /**
     * 设置上级领导对象
     * @param nextHandler
     */
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 各级领导处理请假的方法
     * @param leaveRequest 请假条
     */
    protected abstract void handlerLeave(LeaveRequest leaveRequest);

    /**
     * 提交请假条
     * @param leaveRequest
     */
    public final void submit(LeaveRequest leaveRequest) {
        if (leaveRequest.getNum() > NUM_SERVEN) {
            System.out.println("请假天数过长，不准请！回去上班！");
            return;
        }
        // 该领导先进行审批，看是否通过
        handlerLeave(leaveRequest);
        // 是否有后继者，并且请假天数是否超过了自己的最大批准天数
        if (this.nextHandler != null && leaveRequest.getNum() > this.numEnd) {
            // 提交给上级领导进行审批
            this.nextHandler.submit(leaveRequest);
        } else {
            // 流程结束
            System.out.println("请假流程结束");
        }
    }


}
