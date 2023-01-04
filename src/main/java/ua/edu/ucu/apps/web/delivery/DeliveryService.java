package ua.edu.ucu.apps.web.delivery;

import org.springframework.stereotype.Service;
import ua.edu.ucu.apps.web.items.Item;

import java.util.List;

@Service
public class DeliveryService {
    public String deliver(List<Item> items, Delivery delivery){
        return delivery.deliver(items);
    }
}
