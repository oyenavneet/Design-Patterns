package com.oyenavneet.designpatterns.statepattern.context;

import com.oyenavneet.designpatterns.statepattern.state.CreatedState;
import com.oyenavneet.designpatterns.statepattern.state.OrderState;

public class OrderContext {

    private OrderState currentState;

    public OrderContext(){
        currentState = new CreatedState();
    }

    public void setState(OrderState state){
        this.currentState = state;
    }

    public void nextState(){
        currentState.next(this);
    }

}
