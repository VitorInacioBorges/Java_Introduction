package theory.module1;
// A method is a block of resuable code that is used when it is called
// In the main method             =>     calling method with 'name' and 'age' arguments
// In the happyBirthday method    =>     actually creating a new method that doesn't require a value returnment
// In the squareNumber method     =>     creating a method that returns a value of any type
// In the cubeNumber method       =>     creating a method that returns a value of any type

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert your name: ");
        String name = scanner.nextLine();

        System.out.print("Insert your age: ");
        int age = scanner.nextInt();
        happyBirthdaY(name, age);

        System.out.print("\n\nInsert a number: ");
        double number = scanner.nextDouble();
        System.out.print("You're number squared is: ");
        System.out.print(squareNumber(number));
        System.out.print("\nAnd you're number cubed is: ");
        System.out.print(cubeNumber(number));
        scanner.close();
    }
    static void happyBirthdaY(String name, int age){
        System.out.println("Happy birthday to you!");
        System.out.printf("Happy birthday dear %s!\n", name);
        System.out.printf("You're %d years old...\n", age);
        System.out.println("Happy birthday to you!");
    }
    static double squareNumber(double number){
        return number * number;
    }
    static double cubeNumber(double number){
        return number * number * number;
    }
}
