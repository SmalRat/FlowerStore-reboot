package ua.edu.ucu.apps.web.observer;

import lombok.Getter;

@Getter
public enum OrderContextInfo {
    Delivered(Event.Delivered, "Your order has been delivered!"), Sent(Event.Sent, "Your order has been sent!"), Accident(Event.Accident, "Something bad happened with your order!");

    private final Event event;

    private final String description;

    OrderContextInfo(Event event, String description) {
        this.event = event;
        this.description = description;
    }

}
