package theory.module2;
/*
* Object: An entity that holds data (attributes)
* can perform actions (methods)
* It is a reference data type
*/

import java.util.Random;
import java.util.Scanner;
public class Objects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); // declaring objects with classes

        Car car = new Car(); // same format as the above
        System.out.println(car); // prints the memory path to the object
        System.out.printf("The car is a %s made by %s.\nSold: %b\nPrice: %f\nYear: %d\n", car.model, car.make, car.isSold, car.price, car.year);
        car.sell();
        car.start();
        car.stop();
    }
}
