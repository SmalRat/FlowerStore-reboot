package ua.edu.ucu.apps.web.flowerBucket.groups;

import ua.edu.ucu.apps.web.flower.Flower;
import lombok.Getter;
@Getter
public class FlowerPack {
    private Flower flower;
    private int amount;
    public FlowerPack(Flower flower, int amount) {
        this.flower = flower;
        this.amount = amount;
    }

    public double getPrice() {
        return amount * flower.getPrice();
    }

    @Override
    public String toString() {
        return "FlowerPack {Flower: " + flower.toString() + ", amount: " + amount + "}";
    }
}
