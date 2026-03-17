package com.oyenavneet.designpatterns.builderpattern.model;

public class Order {

    private String orderId;
    private String userId;
    private double totalAmount;
    private String shippingAddress;
    private String couponCode;
    private boolean giftWrap;
    private boolean expressDelivery;

    private Order(Builder builder) {
        this.orderId = builder.orderId;
        this.userId = builder.userId;
        this.totalAmount = builder.totalAmount;
        this.shippingAddress = builder.shippingAddress;
        this.couponCode = builder.couponCode;
        this.giftWrap = builder.giftWrap;
        this.expressDelivery = builder.expressDelivery;
    }

    public static class Builder {

        private String orderId;
        private String userId;
        private double totalAmount;
        private String shippingAddress;
        private String couponCode;
        private boolean giftWrap;
        private boolean expressDelivery;

        public Builder(String orderId, String userId) {
            this.orderId = orderId;
            this.userId = userId;
        }

        public Builder totalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        public Builder shippingAddress(String address) {
            this.shippingAddress = address;
            return this;
        }

        public Builder couponCode(String coupon) {
            this.couponCode = coupon;
            return this;
        }

        public Builder giftWrap(boolean giftWrap) {
            this.giftWrap = giftWrap;
            return this;
        }

        public Builder expressDelivery(boolean expressDelivery) {
            this.expressDelivery = expressDelivery;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
