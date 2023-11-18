package Observer;

import Singleton.Single;
import Singleton.Single_;

public class Main {
    public static void main(String[] args) {
        Student Ahmed = new Student("Ahmed");
        Student Ali = new Student("Ali");
        Student Medo = new Student("Medo");

        Course Java = new Course("Java");

        Java.subscriber(Ahmed);
        Java.subscriber(Ali);
        Java.subscriber(Medo);

        Java.setAvailability(true);
        Java.setAvailability(false);

        Java.unsubscriber(Medo);
        Java.setAvailability(true);
    }
}
