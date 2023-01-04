package ua.edu.ucu.apps.web.items;

public class ItemDiscount extends ItemDecorator{
    private final double discount;

    public ItemDiscount(Item item, double discount) {

        super(item, ", (discount: " + discount + ")");
        this.discount = discount/100;
    }

    @Override
    public double price() {
        return item.price() * (1 - discount);
    }
}

