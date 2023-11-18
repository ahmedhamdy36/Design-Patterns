package Factory;

public class Main {
    public static void main(String[] args) {
        Sandwich sandwich1 = SandwichFactory.createSandwich(SandwichFactory.CHEESE_BURGER);
        sandwich1.prepare();

        Sandwich sandwich2 = SandwichFactory.createSandwich(SandwichFactory.CHICKEN_BURGER);
        sandwich2.prepare();
    }
}
