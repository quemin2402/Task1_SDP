package com.payment;

import com.payment.payments.PaymentMethod;
import java.util.logging.Logger;

public class PaymentProcessor {
    private PaymentMethod paymentMethod;
    private static final Logger logger = Logger.getLogger(PaymentProcessor.class.getName());

    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void executePayment(double amount) {
        try {
            paymentMethod.processPayment(amount);
            logger.info("Payment processed successfully.");
        } catch (Exception e) {
            logger.severe("Payment failed: " + e.getMessage());
        }
    }
}
