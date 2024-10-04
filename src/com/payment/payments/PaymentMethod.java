package com.payment.payments;

public interface PaymentMethod {
    default void processPayment(double amount) throws Exception {

    }
}
