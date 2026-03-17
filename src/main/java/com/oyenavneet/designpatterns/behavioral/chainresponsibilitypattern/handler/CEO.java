package com.oyenavneet.designpatterns.chainresponsibilitypattern.handler;

import com.oyenavneet.designpatterns.chainresponsibilitypattern.model.LeaveRequest;

public class CEO extends LeaveApprover {


    @Override
    public void approveLeave(LeaveRequest leaveRequest) {
        System.out.println("CEO approved leave for "
                + leaveRequest.getEmployeeName());
    }
}
