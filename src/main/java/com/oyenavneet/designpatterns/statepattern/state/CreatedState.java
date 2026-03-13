package com.oyenavneet.designpatterns.statepattern.state;

import com.oyenavneet.designpatterns.statepattern.context.OrderContext;

public class CreatedState implements OrderState{


    @Override
    public void next(OrderContext context) {
        System.out.println("Order paid successfully");

        context.setState(new PaidState());
    }
}
