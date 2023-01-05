package ua.edu.ucu.apps.web.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private final List<Subscriber> subscribers;

    public Publisher() {
        this.subscribers = new ArrayList<>();
    }

    public void addUser(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void removeUser(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void notifyUsers(OrderContextInfo orderContextInfo){
        for (Subscriber subscriber: subscribers){
            subscriber.update(orderContextInfo);
        }
    }
}
