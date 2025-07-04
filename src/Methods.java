// A method is a block of resuable code that is used when it is called
// In the main method             =>     calling method with 'name' and 'age' arguments
// In the happyBirthday method    =>     actually creating a new method that isn't standard

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert your name: ");
        String name = scanner.nextLine();

        System.out.print("Insert your age: ");
        int age = scanner.nextInt();

        happyBirthdaY(name, age);
        scanner.close();
    }
    //
    static void happyBirthdaY(String name, int age){
        System.out.println("Happy birthday to you!");
        System.out.printf("Happy birthday dear %s!\n", name);
        System.out.printf("You're %d years old...\n", age);
        System.out.println("Happy birthday to you!");
    }
}
