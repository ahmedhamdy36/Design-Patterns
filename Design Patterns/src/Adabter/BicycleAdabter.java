package Adabter;

public class BicycleAdabter implements Vehicle {
    private Bicycle bike;

    public BicycleAdabter(Bicycle bike) {
        this.bike = bike;
    }
    @Override
    public void accelerate() {
        this.bike.pedal();
    }
    @Override
    public void pushBreak() {
        this.bike.stopped();
    }
    @Override
    public void sound() {
        this.bike.soundBell();
    }
}
