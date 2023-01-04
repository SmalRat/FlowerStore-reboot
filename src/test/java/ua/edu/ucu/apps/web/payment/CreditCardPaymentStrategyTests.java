package ua.edu.ucu.apps.web.payment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreditCardPaymentStrategyTests {
    private final long testPrice = 10;

    private Payment payment = new CreditCardPaymentStrategy();

    @Test
    public void testCreditCard(){
        Assertions.assertEquals(true, payment.pay(testPrice));
    }
}
