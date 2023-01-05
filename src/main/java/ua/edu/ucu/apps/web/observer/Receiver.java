package ua.edu.ucu.apps.web.observer;

import lombok.Getter;
import ua.edu.ucu.apps.web.appUsers.AppUser;

import java.util.HashMap;

@Getter
public class Receiver extends AppUser implements Subscriber{
    private static final HashMap<Event, String> descriptionCorrespondence= new HashMap<>(){{
        this.put(Event.Delivered, "The parcel you are waiting for has been successfully delivered!");
        this.put(Event.Sent, "Your parcel is already on the way to you!");
        this.put(Event.Accident, "Something bad happened with parcel you are waiting for... Please refer to the closest department for more info...");
    }};
    private Event deliveryStatus;
    private String deliveryDescription;
    @Override
    public void update(OrderContextInfo orderContextInfo) {
        deliveryStatus = orderContextInfo.getEvent();
        deliveryDescription = descriptionCorrespondence.get(deliveryStatus);
    }
}