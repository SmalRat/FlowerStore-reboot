package ua.edu.ucu.apps.web.order;

import ua.edu.ucu.apps.web.delivery.Delivery;
import ua.edu.ucu.apps.web.items.Item;
import ua.edu.ucu.apps.web.observer.*;
import ua.edu.ucu.apps.web.payment.Payment;

import java.util.LinkedList;

public class Order {
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;

    private final Publisher orderManager;

    private boolean beingProcessed;

    protected Order(Sender sender, Receiver receiver, Payment payment, Delivery delivery) {
        this.orderManager = new Publisher();
        orderManager.addUser(receiver);
        orderManager.addUser(sender);
        this.payment = payment;
        this.delivery = delivery;
        beingProcessed = false;
    }

    public void setPaymentStrategy(Payment payment){
        this.payment = payment;
    }
    public void setDeliveryStrategy(Delivery delivery){
        this.delivery = delivery;
    }
    public double calculateTotalPrice(){
        double price = 0;
        for (Item item: items){
            price += item.price();
        }
        return price;
    }

    public String ProcessOrder() {
        if (payment.pay(calculateTotalPrice())){
            delivery.successfulDeliveryDescription(items);
            beingProcessed = true;
            return "Order has been successfully processed!";
        }
        return "Error in order processing!";
    }

    public void updateOrderStatus(int code){
        if (beingProcessed){
            delivery.updateDeliveryStatus(code);
            OrderContextInfo info;
            switch (delivery.getStatus()){
                case Sent -> info = OrderContextInfo.Sent;
                case Delivered -> info = OrderContextInfo.Delivered;
                default ->  info = OrderContextInfo.Accident;
            }
            orderManager.notifyUsers(info);
        }
    }

    public boolean addItem(Item item){
        items.add(item);
        return true;
    }
    public boolean removeItem(Item item){
        if (items.contains(item)){
            items.remove(item);
            return true;
        }
        return false;
    }

}
