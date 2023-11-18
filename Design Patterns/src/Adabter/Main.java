package Adabter;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.accelerate();
        car.pushBreak();
        car.sound();

        Vehicle bike = new BicycleAdabter(new Bicycle());
        bike.accelerate();
        bike.pushBreak();
        bike.sound();
    }

}
