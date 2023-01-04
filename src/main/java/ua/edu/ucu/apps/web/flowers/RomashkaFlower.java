package ua.edu.ucu.apps.web.flowers;

import ua.edu.ucu.apps.web.flower.Flower;
import ua.edu.ucu.apps.web.flower.FlowerColor;

public class RomashkaFlower extends Flower {
    private final String name = "Romashka";
    public RomashkaFlower(){
        super();
    }
    public RomashkaFlower(String color, int price, int sepalLength) {
        super(color, price, sepalLength);
    }
}
