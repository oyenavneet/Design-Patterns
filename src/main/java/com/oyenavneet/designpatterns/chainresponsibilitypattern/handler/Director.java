package com.oyenavneet.designpatterns.chainresponsibilitypattern.handler;

import com.oyenavneet.designpatterns.chainresponsibilitypattern.model.LeaveRequest;

public class Director extends LeaveApprover {


    @Override
    public void approveLeave(LeaveRequest leaveRequest) {
        if (leaveRequest.getDays() <= 5) {
            System.out.println("Director approved leave for "
                    + leaveRequest.getEmployeeName());
        } else if (nextApprover != null) {
            nextApprover.approveLeave(leaveRequest);
        }
    }
}
