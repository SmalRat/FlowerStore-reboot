package ua.edu.ucu.apps.web.order;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.web.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.web.delivery.Delivery;
import ua.edu.ucu.apps.web.flower.Flower;
import ua.edu.ucu.apps.web.observer.Event;
import ua.edu.ucu.apps.web.observer.Receiver;
import ua.edu.ucu.apps.web.observer.Sender;
import ua.edu.ucu.apps.web.payment.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.web.payment.Payment;

public class OrderTest {
    @Test
    public void testOrderObserver(){
        Sender sender = new Sender();
        Receiver receiver = new Receiver();
        Payment payment = new CreditCardPaymentStrategy();
        Delivery delivery = new DHLDeliveryStrategy();

        Order order = new Order(sender, receiver, payment, delivery);

        order.addItem(new Flower("Blue", 15, 15));
        order.ProcessOrder();
        order.updateOrderStatus(0);
        Assertions.assertEquals(Event.Sent, sender.getDeliveryStatus());
        Assertions.assertEquals(Event.Sent, receiver.getDeliveryStatus());

        order.updateOrderStatus(1);
        Assertions.assertEquals(Event.Delivered, sender.getDeliveryStatus());
        Assertions.assertEquals(Event.Delivered, receiver.getDeliveryStatus());

        order.updateOrderStatus(2);
        Assertions.assertEquals(Event.Accident, sender.getDeliveryStatus());
        Assertions.assertEquals(Event.Accident, receiver.getDeliveryStatus());
    }
}
