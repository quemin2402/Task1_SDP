package com.payment.test;

import com.payment.PaymentProcessor;
import com.payment.payments.BankTransferPayment;
import com.payment.payments.CreditCardPayment;
import com.payment.payments.PayPalPayment;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor creditCardProcessor = new PaymentProcessor(new CreditCardPayment());
        creditCardProcessor.executePayment(465.04);

        PaymentProcessor payPalProcessor = new PaymentProcessor(new PayPalPayment());
        payPalProcessor.executePayment(1024.02);

        PaymentProcessor bankTransferProcessor = new PaymentProcessor(new BankTransferPayment());
        bankTransferProcessor.executePayment(126.00);
    }
}
