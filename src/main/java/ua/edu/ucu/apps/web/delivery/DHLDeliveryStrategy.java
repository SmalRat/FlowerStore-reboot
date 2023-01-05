package ua.edu.ucu.apps.web.delivery;

import lombok.Getter;
import ua.edu.ucu.apps.web.items.Item;
import ua.edu.ucu.apps.web.observer.Event;

import java.util.List;

@Getter
public class DHLDeliveryStrategy implements Delivery{
    private Event status;
    public String successfulDeliveryDescription(List<Item> items){
        // Here should be delivery logic
        StringBuilder itemsDescriptions = new StringBuilder();
        for (Item item: items){
            itemsDescriptions.append(item.getDescription() + ", ");
        }
        return "Successful delivery start with DHL! Items being delivered : " + itemsDescriptions;
    }

    @Override
    public Event updateDeliveryStatus(int code) {
        switch (code) {
            case 0 -> status = Event.Sent;
            case 1 -> status = Event.Delivered;
            default -> status = Event.Accident;
        }
        return status;
    }
}
