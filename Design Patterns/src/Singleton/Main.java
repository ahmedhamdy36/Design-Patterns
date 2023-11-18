package Singleton;

public class Main {
    public static void main(String[] args) {
        Single single1 = new Single();
        single1.printer();

        Single single2 = new Single();
        single2.printer();

        System.out.println("//____________After applying the Singleton____________//");

        Single_ single3 = Single_.getInstance();
        single1.printer();

        Single_ single4 = Single_.getInstance();
        single2.printer();
    }
}