package ua.edu.ucu.apps.web.items;

public abstract class ItemDecorator extends Item{
    private String modifier = "";
    protected Item item;

    protected ItemDecorator(Item item, String modifier){
        this.item = item;
        this.modifier = modifier;
    }
    public double price() {
        return item.price();
    }
    public String getDescription() {
        return item.getDescription() + modifier;
    }
}
