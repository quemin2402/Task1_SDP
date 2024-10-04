package com.payment.payments;

import java.util.logging.Logger;

public class BankTransferPayment implements PaymentMethod {
    private static final Logger logger = Logger.getLogger(BankTransferPayment.class.getName());

    @Override
    public void processPayment(double amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Invalid amount for bank transfer.");
        }
        logger.info("Processing bank transfer payment of $" + amount);
    }
}
