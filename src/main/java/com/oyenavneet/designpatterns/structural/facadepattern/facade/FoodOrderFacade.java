package com.oyenavneet.designpatterns.facadepattern.facade;

import com.oyenavneet.designpatterns.facadepattern.subsystem.DeliveryService;
import com.oyenavneet.designpatterns.facadepattern.subsystem.PaymentService;
import com.oyenavneet.designpatterns.facadepattern.subsystem.RestaurantService;

public class FoodOrderFacade {
    private RestaurantService restaurantService = new RestaurantService();
    private PaymentService paymentService = new PaymentService();
    private DeliveryService deliveryService = new DeliveryService();

    public void placeOrder(String item, double amount, String address) {
        paymentService.makePayment(amount);
        restaurantService.prepareFood(item);
        deliveryService.assignDelivery(address);
        System.out.println("Order placed successfully");
    }
}
