package ua.edu.ucu.apps.web.delivery;

import ua.edu.ucu.apps.web.items.Item;

import java.util.List;

public interface Delivery {
    String deliver(List<Item> items);
}
