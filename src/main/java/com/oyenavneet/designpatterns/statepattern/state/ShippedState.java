package com.oyenavneet.designpatterns.statepattern.state;

import com.oyenavneet.designpatterns.statepattern.context.OrderContext;

public class ShippedState implements OrderState{


    @Override
    public void next(OrderContext context) {
        System.out.println("Order delivered");

        context.setState(new DeliveredState());
    }
}
