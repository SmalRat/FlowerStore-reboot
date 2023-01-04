package ua.edu.ucu.apps.web.items;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.web.flower.Flower;
import ua.edu.ucu.apps.web.flower.FlowerColor;

import java.util.Random;

public class ItemDiscountTest {

    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower("blue", 100, 100);
    }

    @Test
    public void testDescription() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        ItemDiscount itemDiscount = new ItemDiscount(flower, 15);
        Assertions.assertEquals("Flower, (discount: 15.0)", itemDiscount.getDescription());
    }
    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        ItemDiscount itemDiscount = new ItemDiscount(flower, 15);
        Assertions.assertEquals(price*0.85, itemDiscount.price());
    }
}
