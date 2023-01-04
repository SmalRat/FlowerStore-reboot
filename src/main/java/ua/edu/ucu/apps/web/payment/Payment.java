package ua.edu.ucu.apps.web.payment;

public interface Payment {
    String getName();
    boolean pay(double price);
}
