package com.oyenavneet.designpatterns.statepattern.state;

import com.oyenavneet.designpatterns.statepattern.context.OrderContext;

public interface OrderState {

    void next(OrderContext context);
}
