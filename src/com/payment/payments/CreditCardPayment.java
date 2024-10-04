package com.payment.payments;

import java.util.logging.Logger;

public class CreditCardPayment implements PaymentMethod {
    private static final Logger logger = Logger.getLogger(CreditCardPayment.class.getName());

    @Override
    public void processPayment(double amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Invalid amount for credit card payment.");
        }
        logger.info("Processing credit card payment of $" + amount);
    }
}
