package ua.edu.ucu.apps.web.payment;

import lombok.Getter;

@Getter
public class PayPalPaymentStrategy implements Payment{
    private final String name = "PayPal";
    @Override
    public boolean pay(double price) {
        // Here we should use PayPal API to process the payment
        return true; // Now we just assume that payment was successful
    }
}
