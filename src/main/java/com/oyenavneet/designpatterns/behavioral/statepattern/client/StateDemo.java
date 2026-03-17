package com.oyenavneet.designpatterns.statepattern.client;

import com.oyenavneet.designpatterns.statepattern.context.OrderContext;

/*
    problems:
        - Many if-else
        - Hard to maintain
        - Violates Open/Closed Principle

    behavior of the order changes depending on the current state.

 */
public class StateDemo {

    public static void main(String[] args) {


        OrderContext order = new OrderContext();

        order.nextState(); // pay
        order.nextState(); // ship
        order.nextState(); // deliver
        order.nextState(); // success delivered

        /*
            output
            Order paid successfully
            Order Shipped
            Order delivered
            Order successfully Delivered

         */
    }
}
