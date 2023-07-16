package com.S302N2;

public class ShoeStore {
    private PaymentGateway paymentGateway;

    public ShoeStore() {
        this.paymentGateway = new PaymentGateway();
    }

    public void purchaseShoes(double amount, PaymentCallback paymentMethod) {
        paymentGateway.processPayment(paymentMethod, amount);
    }
}