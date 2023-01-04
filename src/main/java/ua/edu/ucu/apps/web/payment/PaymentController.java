package ua.edu.ucu.apps.web.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/test-payment")
public class PaymentController {
    private final PaymentService paymentService;

    private final long testPrice = 10;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/PayPal")
    public String PayPalPayment(){
        return paymentService.pay(testPrice, new PayPalPaymentStrategy());
    }

    @GetMapping("/CreditCard")
    public String CreditCardPayment(){
        return paymentService.pay(testPrice, new CreditCardPaymentStrategy());
    }
}
