package ua.edu.ucu.apps.web.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.web.flowerBucket.groups.FlowerBucket;
import ua.edu.ucu.apps.web.items.Item;
import ua.edu.ucu.apps.web.items.ItemDecorator;
import ua.edu.ucu.apps.web.items.PaperDecorator;

import java.util.List;

@RestController
@RequestMapping(path = "/test-delivery")
public class DeliveryController {
    private final DeliveryService deliveryService;
    private final List<Item> testItems = List.of(new FlowerBucket(), new PaperDecorator(new FlowerBucket()));

    @Autowired
    public DeliveryController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @GetMapping("/DHL")
    public String DHLDelivery(){
        return deliveryService.deliver(testItems, new DHLDeliveryStrategy());
    }

    @GetMapping("/Post")
    public String PostDelivery(){
        return deliveryService.deliver(testItems, new PostDeliveryStrategy());
    }
}
