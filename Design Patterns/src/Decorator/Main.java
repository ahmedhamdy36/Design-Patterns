package Decorator;

public class Main {
    public static void main(String[] args) {
        Sandwich sandwich1 = new BasicSandwich();
        System.out.println("Basic Sandwich Cost: " + sandwich1.getCost());
        System.out.println("Basic Content Sandwich: " + sandwich1.getDescription());

        System.out.println("---------------------------");

        Sandwich sandwich2 = new Cheese(new BasicSandwich());
        System.out.println("Cheese Sandwich Cost: " + sandwich2.getCost());
        System.out.println("Cheese Content Sandwich: " + sandwich2.getDescription());

        System.out.println("---------------------------");

        Sandwich sandwich3 = new Beef(new Cheese(new BasicSandwich()));
        System.out.println("Cheese Beef Sandwich Cost: " + sandwich3.getCost());
        System.out.println("Cheese Beef Content Sandwich: " + sandwich3.getDescription());
    }
}
