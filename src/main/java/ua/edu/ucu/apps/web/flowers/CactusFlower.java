package ua.edu.ucu.apps.web.flowers;

import ua.edu.ucu.apps.web.flower.Flower;
import ua.edu.ucu.apps.web.flower.FlowerColor;

public class CactusFlower extends Flower {
    private final String name = "Cactus";
    public CactusFlower(){
        super();
    }
    public CactusFlower(String color, int price, int sepalLength) {
        super(color, price, sepalLength);
    }
}
