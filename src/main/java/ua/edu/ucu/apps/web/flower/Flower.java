package ua.edu.ucu.apps.web.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.edu.ucu.apps.web.items.Item;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Flower extends Item {
    @Id @GeneratedValue
    private int id;
    private final String name = "Flower";
    /**
     * Flower class
     */
    private double sepalLength;
    /**
     * Sepal length
     */
    private String color;

    /**
     * Color of the flower
     */
    private double price;
    /**
     * The price of flower
     */
    public Flower(String color, int price, int sepalLength){
        this.color = color;
        this.price = price;
        this.sepalLength = sepalLength;
    }
    @Override
    public String toString(){
        return name;
    }

    @Override
    public double price() {
        return price;
    }
}
