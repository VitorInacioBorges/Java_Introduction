package theory.module2;

public class Car {
    String owner;
    String make;
    String model;
    int year;
    double price;
    boolean isSold;

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

    void specifications(){
        System.out.printf("%s drives a %d %s %s", this.owner, this.year, this.make, this.model);
    }

    Car(String owner, String make, String model, int year){
        this.owner = owner;
        this.make = make;
        this.model = model;
        this.year = year;
        this.isSold = false;
        this.price = 0;
    }
}
