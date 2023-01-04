package ua.edu.ucu.apps.web.items;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.web.flower.Flower;
import ua.edu.ucu.apps.web.flower.FlowerColor;

import java.util.Random;

public class BasketDecoratorTest {

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
        BasketDecorator basketDecorator = new BasketDecorator(flower);
        Assertions.assertEquals("Flower,(in basket)", basketDecorator.getDescription());
    }
}
