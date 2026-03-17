package com.oyenavneet.designpatterns.facadepattern.client;

import com.oyenavneet.designpatterns.facadepattern.facade.FoodOrderFacade;

public class OrderController {

    public static void main(String[] args) {
        FoodOrderFacade orderFacade = new FoodOrderFacade();
        orderFacade.placeOrder("Cake", 1000, "Lucknow");
    }
}
