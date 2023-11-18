package Observer;

import java.util.ArrayList;

public class Course implements Subject {
    private String name;
    private String availability;
    private ArrayList<Observer> observerList;

    public Course(String name) {
        this.name = name;
        observerList = new ArrayList<>();
    }
    @Override
    public void subscriber(Observer observer) {
        observerList.add(observer);
    }
    @Override
    public void unsubscriber(Observer observer) {
        observerList.remove(observer);
    }
    @Override
    public void notifyAllSubscribers() {
        for (Observer observer : observerList) {
            observer.update(availability);
        }
    }
    public void setAvailability(boolean available) {
        availability = this.name + (available ? " Available" : " Not available");
        notifyAllSubscribers();
    }
}
