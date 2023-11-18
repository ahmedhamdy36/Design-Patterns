package Observer;

public interface Subject {
    void subscriber(Observer observer);
    void unsubscriber(Observer observer);
    void notifyAllSubscribers();
}
