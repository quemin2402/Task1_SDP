package com.payment.payments;

import java.util.logging.Logger;

public class PayPalPayment implements PaymentMethod {
    private static final Logger logger = Logger.getLogger(PayPalPayment.class.getName());

    @Override
    public void processPayment(double amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Invalid amount for PayPal payment.");
        }
        logger.info("Processing PayPal payment of $" + amount);
    }
}
