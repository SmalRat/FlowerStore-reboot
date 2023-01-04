package ua.edu.ucu.apps.web.items;

import lombok.Getter;
import lombok.Setter;

public abstract class Item {
    private String description;

    public String getDescription(){
        if (description == null){
            description = this.toString();
        }
        return description;
    }

    public abstract double price();

}
