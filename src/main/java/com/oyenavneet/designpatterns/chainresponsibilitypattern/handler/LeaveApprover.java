package com.oyenavneet.designpatterns.chainresponsibilitypattern.handler;

import com.oyenavneet.designpatterns.chainresponsibilitypattern.model.LeaveRequest;

public abstract class LeaveApprover {

    protected LeaveApprover nextApprover;

    public void setNextApprover(LeaveApprover nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void approveLeave(LeaveRequest leaveRequest);
}
