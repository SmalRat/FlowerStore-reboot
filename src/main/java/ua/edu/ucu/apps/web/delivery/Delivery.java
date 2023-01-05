package ua.edu.ucu.apps.web.delivery;

import lombok.Getter;
import ua.edu.ucu.apps.web.items.Item;
import ua.edu.ucu.apps.web.observer.Event;

import java.util.List;

public interface Delivery {
    Event getStatus();

    String successfulDeliveryDescription(List<Item> items);

    Event updateDeliveryStatus(int code);
}
