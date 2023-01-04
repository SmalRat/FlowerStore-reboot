package ua.edu.ucu.apps.web.delivery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.web.flowerBucket.groups.FlowerBucket;
import ua.edu.ucu.apps.web.items.Item;
import ua.edu.ucu.apps.web.items.PaperDecorator;

import java.util.List;

public class PostDeliveryStrategyTests {
    private final List<Item> testItems = List.of(new FlowerBucket(), new PaperDecorator(new FlowerBucket()));

    private Delivery testDelivery = new PostDeliveryStrategy();

    @Test
    public void testPost(){
        Assertions.assertEquals("Successful delivery start with Post! Items being delivered : FlowerBucket{}, FlowerBucket{},(in paper), ", testDelivery.deliver(testItems));
    }
}
