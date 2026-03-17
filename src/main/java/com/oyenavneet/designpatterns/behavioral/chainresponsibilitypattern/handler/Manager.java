package com.oyenavneet.designpatterns.chainresponsibilitypattern.handler;

import com.oyenavneet.designpatterns.chainresponsibilitypattern.model.LeaveRequest;

public class Manager extends LeaveApprover {


    @Override
    public void approveLeave(LeaveRequest leaveRequest) {
        if (leaveRequest.getDays() <= 3) {
            System.out.println("Manager approved leave for " + leaveRequest.getEmployeeName());
        } else if (nextApprover != null) {
            nextApprover.approveLeave(leaveRequest);
        }
    }
}
