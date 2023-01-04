package ua.edu.ucu.apps.web.payment;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public String pay(long price, Payment payment){
        if (payment.pay(price)){
            return "Successful payment with " + payment.getName() + "!";
        }
        return "Error during payment with " + payment.getName()+ "!";
    }
}
