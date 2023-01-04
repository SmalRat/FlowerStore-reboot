package ua.edu.ucu.apps.web.order;

import ua.edu.ucu.apps.web.delivery.Delivery;
import ua.edu.ucu.apps.web.items.Item;
import ua.edu.ucu.apps.web.payment.Payment;

import java.util.LinkedList;

public class Order {
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;

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
            delivery.deliver(items);
            return "Order has been successfully processed!";
        }
        return "Error in order processing!";
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
