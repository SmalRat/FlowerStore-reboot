package ua.edu.ucu.apps.web.delivery;

import ua.edu.ucu.apps.web.items.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery{
    public String deliver(List<Item> items){
        // Here should be delivery logic
        StringBuilder itemsDescriptions = new StringBuilder();
        for (Item item: items){
            itemsDescriptions.append(item.getDescription() + ", ");
        }
        return "Successful delivery start with DHL! Items being delivered : " + itemsDescriptions;
    }
}
