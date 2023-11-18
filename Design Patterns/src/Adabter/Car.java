package Adabter;

public class Car implements Vehicle {
    public void accelerate(){
        System.out.println("Car Start Moving");
    }
    public void pushBreak(){
        System.out.println("Car stopped");
    }
    public void sound(){
        System.out.println("Beeb Beeb...");
    }
}
