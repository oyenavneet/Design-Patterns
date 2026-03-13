package com.oyenavneet.designpatterns.chainresponsibilitypattern.client;

import com.oyenavneet.designpatterns.chainresponsibilitypattern.handler.CEO;
import com.oyenavneet.designpatterns.chainresponsibilitypattern.handler.Director;
import com.oyenavneet.designpatterns.chainresponsibilitypattern.handler.LeaveApprover;
import com.oyenavneet.designpatterns.chainresponsibilitypattern.handler.Manager;
import com.oyenavneet.designpatterns.chainresponsibilitypattern.model.LeaveRequest;

/*
    Each handler decides:
        - Handle OR Pass Forward

 */

public class ChainDemo {

    public static void main(String[] args) {
        LeaveApprover manager = new Manager();
        LeaveApprover director = new Director();
        LeaveApprover ceo =  new CEO();

        manager.setNextApprover(director);
        director.setNextApprover(ceo);

        LeaveRequest request =  new LeaveRequest("Navneet", 5);
        manager.approveLeave(request);
    }
}
