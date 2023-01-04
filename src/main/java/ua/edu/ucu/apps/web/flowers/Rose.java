package ua.edu.ucu.apps.web.flowers;

import ua.edu.ucu.apps.web.flower.Flower;
import ua.edu.ucu.apps.web.flower.FlowerColor;

public class Rose extends Flower {
    private final String name = "Rose";
    public Rose(){
        super();
    }
    public Rose(String color, int price, int sepalLength) {
        super(color, price, sepalLength);
    }
}
