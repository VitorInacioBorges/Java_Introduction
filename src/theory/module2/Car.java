package theory.module2;

public class Car {
    String make = "Ford";
    String model = "Mustang";
    int year = 2007;
    double price = 58000.99;
    boolean isSold = false;

    void sell() {
        isSold = !isSold;
        System.out.println("Sold");
    }
    void start() {
        System.out.println("Start");
    }
    void stop() {
        System.out.println("Stop");
    }
}
