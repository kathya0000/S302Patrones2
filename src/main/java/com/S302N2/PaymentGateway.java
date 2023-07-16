package com.S302N2;

public class PaymentGateway {
    public void processPayment(PaymentCallback method, double amount) {
        method.pay(amount);
    }
}

