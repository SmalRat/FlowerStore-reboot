package ua.edu.ucu.apps.web.payment;

import lombok.Getter;

@Getter
public class CreditCardPaymentStrategy implements Payment{
    private final String name = "CreditCard";
    @Override
    public boolean pay(double price) {
        // Here we should use CreditCard API to process the payment
        return true; // Now we just assume that payment was successful
    }
}
