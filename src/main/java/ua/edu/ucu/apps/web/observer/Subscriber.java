package ua.edu.ucu.apps.web.observer;

import ua.edu.ucu.apps.web.appUsers.AppUser;

public interface Subscriber {

    void update(OrderContextInfo orderContextInfo);
}
