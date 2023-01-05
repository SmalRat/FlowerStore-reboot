package ua.edu.ucu.apps.web.observer;

import lombok.Getter;
import ua.edu.ucu.apps.web.appUsers.AppUser;

import java.util.HashMap;

@Getter
public class Sender extends AppUser implements Subscriber{
    private final static HashMap<Event, String> descriptionCorrespondence= new HashMap<>(){{
        this.put(Event.Delivered, "The parcel you sent has been successfully delivered!");
        this.put(Event.Sent, "Your parcel has been successfully sent!");
        this.put(Event.Accident, "Something bad happened with your parcel... Please refer to the closest department for more info...");
    }};
    private Event deliveryStatus;
    private String deliveryDescription;
    @Override
    public void update(OrderContextInfo orderContextInfo) {
        deliveryStatus = orderContextInfo.getEvent();
        deliveryDescription = descriptionCorrespondence.get(deliveryStatus);
    }
}