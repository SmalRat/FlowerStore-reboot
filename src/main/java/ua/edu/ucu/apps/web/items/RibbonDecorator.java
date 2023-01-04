package ua.edu.ucu.apps.web.items;

public class RibbonDecorator extends ItemDecorator{

    public RibbonDecorator(Item item){
        super(item, ",(with ribbon)");
    }
}
