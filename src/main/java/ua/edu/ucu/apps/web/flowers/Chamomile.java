package ua.edu.ucu.apps.web.flowers;

import ua.edu.ucu.apps.web.flower.Flower;
import ua.edu.ucu.apps.web.flower.FlowerColor;

public class Chamomile extends Flower {
    private final String name = "Chamomile";
    public Chamomile(){
        super();
    }
    public Chamomile(String color, int price, int sepalLength) {
        super(color, price, sepalLength);
    }
}
