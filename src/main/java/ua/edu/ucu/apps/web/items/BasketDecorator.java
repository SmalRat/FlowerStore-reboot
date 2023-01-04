package ua.edu.ucu.apps.web.items;

public class BasketDecorator extends ItemDecorator{

    public BasketDecorator(Item item){
        super(item, ",(in basket)");
    }
}
